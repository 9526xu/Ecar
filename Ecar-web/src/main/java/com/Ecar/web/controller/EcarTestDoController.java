package com.Ecar.web.controller;

import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.service.IEcarTestDoService;
import com.Ecar.web.dto.EcarTestForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaohei on 16/4/25.
 */
@RequestMapping("/test")
@Controller
public class EcarTestDoController {
    @Autowired
    private IEcarTestDoService service;

    @RequestMapping("/add")
    public String save(EcarTestDo ecarTestDo){
        service.save(ecarTestDo);

        return "success";
    }

}
