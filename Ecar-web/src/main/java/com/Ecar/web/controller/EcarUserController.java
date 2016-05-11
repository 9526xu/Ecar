package com.Ecar.web.controller;

import com.Ecar.common.utils.BizResult;
import com.Ecar.common.utils.CommonUtil;
import com.Ecar.common.utils.JsonResult;
import com.Ecar.dal.model.EcarUserDo;
import com.Ecar.service.IEcarUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaohei on 16/5/11.
 */
@Controller
@RequestMapping("/admin/user")
public class EcarUserController {

    @Autowired
    private IEcarUserService userService;

    /**
     *根据手机号查找用户,如果不存在,创建用户id
     * @return
     */
    @RequestMapping("/findUserByTel.do")
    @ResponseBody
    public Object getUserByTel(String mobile){
        JsonResult jsonResult=new JsonResult();

        BizResult<EcarUserDo>bizResult=userService.getUserByTel(mobile);
        EcarUserDo ecarUserDo=bizResult.getData();
        if(ecarUserDo!=null){
            CommonUtil.buildJsonResult(bizResult,jsonResult);
            return jsonResult.getMap();

        }
        //用户不存在,创建用户
        EcarUserDo userDo=new EcarUserDo();
        userDo.setMobile(mobile);
        userDo.setUserName(mobile);
        userDo.setLoginPwd(mobile);
        BizResult bizResult1=userService.saveUser(userDo);

        CommonUtil.buildJsonResult(bizResult1,jsonResult);
        jsonResult.setKey("add","1");


        return jsonResult.getMap();

    }


}
