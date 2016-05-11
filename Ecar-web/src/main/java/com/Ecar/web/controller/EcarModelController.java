package com.Ecar.web.controller;

import com.Ecar.common.utils.BizResult;
import com.Ecar.common.utils.JsonFormValidator;
import com.Ecar.common.utils.JsonResult;
import com.Ecar.common.utils.PageResult;
import com.Ecar.dal.model.EcarModelDo;
import com.Ecar.dto.model.ModelForm;
import com.Ecar.dto.model.ModelListForm;
import com.Ecar.dto.model.ModelPageForm;
import com.Ecar.dto.model.ModelUpdateForm;
import com.Ecar.service.IEcarModelService;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by xiaohei on 16/5/9.
 */
@RequestMapping("/admin/model")
@Controller
public class EcarModelController {

    @Autowired
    private IEcarModelService modelService;

    @RequestMapping("/home")
    public String home(Model model){
        List<EcarModelDo> list=modelService.getAllBrand();

        model.addAttribute("brandList",list);
        return "admin/car_model";
    }
    @RequestMapping("/list.do")
    @ResponseBody
    public Object modelList(ModelListForm form, Model model){

        List<EcarModelDo> list=modelService.getModelsByBrand(form.getBrand());
        //model.addAttribute("modelList",list);

        return list;
    }
    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    @ResponseBody
    public Object addModel(@Valid   ModelForm form, Errors errors){
        JsonResult jsonResult = JsonFormValidator.validate(errors);
        if (!jsonResult.isSuccess()) {
            return jsonResult.getMap();
        }

        BizResult bizResult=modelService.addModel(form);
        buildJsonResult(bizResult,jsonResult);
        return jsonResult.getMap();

    }
    @RequestMapping("/toEdit.do")
    @ResponseBody
    public Object toEditModel(Integer modelId){
        JsonResult jsonResult=new JsonResult();
        BizResult<EcarModelDo> bizResult=modelService.getModelById(modelId);

        buildJsonResult(bizResult,jsonResult);

        return  jsonResult.getMap();

    }

    /**
     * JsonResult转化
     * @param bizResult
     * @param jsonResult
     */
    private void buildJsonResult(BizResult bizResult,JsonResult jsonResult){
        //JsonResult jsonResult=new JsonResult();
        if (bizResult.isSuccess()) {
            if (bizResult.getData() != null) {
                jsonResult.setResult(bizResult.getData());
            }
        } else {
            if (!StringUtils.isBlank(bizResult.getErrMsg())) {
                jsonResult.setErrMsg(bizResult.getErrMsg());
            }
        }
        //return jsonResult;
    }
    @RequestMapping("/update.do")
    @ResponseBody
    public Object updateModel(@Valid ModelUpdateForm form,Errors errors){
        JsonResult jsonResult = JsonFormValidator.validate(errors);
        if (!jsonResult.isSuccess()) {
            return jsonResult.getMap();
        }
        BizResult bizResult=modelService.updateModel(form);
        buildJsonResult(bizResult,jsonResult);

        return jsonResult.getMap();

    }

    @RequestMapping("/delete.do")
    @ResponseBody
    public Object deleteModel(Integer modelId){
        JsonResult jsonResult=new JsonResult();

        BizResult bizResult=modelService.deleteModel(modelId);
        buildJsonResult(bizResult,jsonResult);

        return jsonResult.getMap();
    }

    @RequestMapping("/listPage.do")
    public String modelListByPage(ModelPageForm form,Model model){
        PageResult<EcarModelDo> pageResult=modelService.getModelsByBrandWithPage(form);
        model.addAttribute("pageResult",pageResult);
        return "admin/model_list";

    }

}
