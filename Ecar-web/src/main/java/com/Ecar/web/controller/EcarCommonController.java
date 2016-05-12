package com.Ecar.web.controller;

import com.Ecar.common.utils.BizResult;
import com.Ecar.common.utils.CommonUtil;
import com.Ecar.common.utils.FileUtil;
import com.Ecar.common.utils.JsonResult;
import com.Ecar.dal.model.EcarRegionDo;
import com.Ecar.dal.model.EcarUserDo;
import com.Ecar.dto.Common.AdminLoginForm;
import com.Ecar.dto.Common.UpLoadForm;
import com.Ecar.service.ICommonService;

import com.Ecar.service.IEcarUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by xiaohei on 16/5/11.
 */
@Controller
@RequestMapping("/admin/common")
public class EcarCommonController {

    @Autowired
    private ICommonService commonService;
    @Autowired
    private IEcarUserService userService;

    @RequestMapping("/city")
    @ResponseBody
    public Object getCityByProvince(String regId){
        JsonResult jsonResult=new JsonResult();
        BizResult bizResult=commonService.getCityByProvinceRegId(regId);
        CommonUtil.buildJsonResult(bizResult,jsonResult);

        return jsonResult.getMap();
    }

    @RequestMapping("/upload")
    @ResponseBody
    public Object upLoad(UpLoadForm form, HttpServletRequest request) throws IOException {
        String basePath=request.getServletContext().getRealPath("/upload");
        String model="car-pic";

        String relativePath=FileUtil.getFileUploadURL(form.getFile(),basePath,model);

        System.out.println(relativePath);

        JsonResult jsonResult=new JsonResult();
        jsonResult.setKey("relativePath",relativePath);

        jsonResult.success();

        return jsonResult.getMap();

    }

    @RequestMapping("/adminLogin")
    public String adminLogin(AdminLoginForm form, Model model, HttpSession session){
        BizResult<EcarUserDo> bizResult=userService.getUserByTel(form.getMobile());
        //对象不存在或者不成功,返回原来页面
        if(!bizResult.isSuccess()||bizResult.getData()==null){
            model.addAttribute("errMsg","密码或用户名错误");
            return "admin/login";
        }
        EcarUserDo ecarUserDo=bizResult.getData();
        //相等,将用户信息存入session中,不存在,返回登录页面
        if(ecarUserDo.getLoginPwd().equals(form.getPassword())){
            session.setAttribute("user",ecarUserDo);

        }else{
            model.addAttribute("errMsg","密码或用户名错误");
            return "admin/login";
        }


        return "redirect:"+session.getServletContext().getContextPath()+"/admin/index.jsp";
    }

    @RequestMapping("/adminLogOut")
    public String adminLogout(HttpSession session){
        session.invalidate();


        return "redirect:"+session.getServletContext().getContextPath()+"/admin/login.jsp";
    }
}
