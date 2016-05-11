package com.Ecar.common.utils;

import org.apache.commons.lang.StringUtils;

/**
 * Created by xiaohei on 16/5/11.
 */
public class CommonUtil {
    /**
     * JsonResult转化
     * @param bizResult
     * @param jsonResult
     */
    public static void buildJsonResult(BizResult bizResult,JsonResult jsonResult){
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
}
