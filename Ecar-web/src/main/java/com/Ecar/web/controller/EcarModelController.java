package com.Ecar.web.controller;

import com.Ecar.dal.model.EcarModelDo;
import com.Ecar.service.IEcarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
