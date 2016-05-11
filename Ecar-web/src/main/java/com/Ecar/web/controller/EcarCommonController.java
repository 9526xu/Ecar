package com.Ecar.web.controller;

import com.Ecar.common.utils.BizResult;
import com.Ecar.common.utils.CommonUtil;
import com.Ecar.common.utils.JsonResult;
import com.Ecar.dal.model.EcarRegionDo;
import com.Ecar.dto.Common.UpLoadForm;
import com.Ecar.service.ICommonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaohei on 16/5/11.
 */
@Controller
@RequestMapping("/admin/common")
public class EcarCommonController {

    @Autowired
    private ICommonService commonService;

    @RequestMapping("/city")
    @ResponseBody
    public Object getCityByProvince(String regId){
        JsonResult jsonResult=new JsonResult();
        BizResult bizResult=commonService.getCityByProvinceRegId(regId);
        CommonUtil.buildJsonResult(bizResult,jsonResult);

        return jsonResult.getMap();
    }

    @RequestMapping("/upload")
    public void upLoad(UpLoadForm form){
        System.out.println(form);
    }
}
