package com.Ecar.web.controller;

import com.Ecar.common.utils.PageResult;
import com.Ecar.dal.model.EcarCarinfoDo;
import com.Ecar.dal.model.EcarModelDo;
import com.Ecar.dal.model.EcarRegionDo;
import com.Ecar.dto.carInfo.CarInfoQueryForm;
import com.Ecar.service.ICommonService;
import com.Ecar.service.IEcarCarInfoService;
import com.Ecar.service.IEcarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by xiaohei on 16/5/11.
 */
@RequestMapping("/admin/carInfo")
@Controller
public class EcarCarInfoController {

    @Autowired
    private IEcarCarInfoService carInfoService;
    @Autowired
    private IEcarModelService modelService;

    @Autowired
    private ICommonService commonService;
    /**
     * 车辆列表首页
     * @return
     */
    @RequestMapping("/listHome.do")
    public String toListHome(Model model){


        return queryCar(new CarInfoQueryForm(),model);
    }

    /**
     * 分页查询
     * @return
     */
    @RequestMapping("/query.do")
    public String queryCar(CarInfoQueryForm form, Model model){
        PageResult<EcarCarinfoDo> result=carInfoService.queryCarInfo(form);

        model.addAttribute("pageResult",result);


        return "admin/car_list";
    }

    /**
     * 车辆增加首页
     * @return
     */
    @RequestMapping("/addHomde.do")
    public String toAddHome(Model model){

        //品牌数据
        List<EcarModelDo>modelList=modelService.getAllBrand();
        model.addAttribute("modelList",modelList);
        //省数据
        List<EcarRegionDo> regionList=commonService.getProvinces();
        model.addAttribute("provinceList",regionList);
        return "admin/car_add";
    }
}
