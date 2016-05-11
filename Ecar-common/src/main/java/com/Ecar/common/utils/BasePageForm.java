package com.Ecar.common.utils;

/**
 * Created by xiaohei on 16/5/11.
 * 基本分页
 */
public class BasePageForm {
    public static final int DEFAULT_PAGENO=1;
    public static final int DEFAULT_PAGESIZE=10;


    protected int pageNo=DEFAULT_PAGENO;
    protected int pageSize=DEFAULT_PAGESIZE;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
