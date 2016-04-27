package com.Ecar.web.controller;

import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.service.IEcarTestDoService;
import com.Ecar.web.dto.EcarTestForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by xiaohei on 16/4/25.
 */
@RequestMapping("/test")
@Controller("ecar")
public class EcarTestDoController {
    @Autowired
    private IEcarTestDoService service;

    @RequestMapping("/add")
    public String save(@Valid @ModelAttribute EcarTestForm form, Errors errors, Model model){

        if(errors.hasErrors()){
            for (ObjectError objectError : errors.getAllErrors()) {
                System.out.println(objectError.getDefaultMessage());
            }
        }
        System.out.println(model);


        return "success";
    }

}
