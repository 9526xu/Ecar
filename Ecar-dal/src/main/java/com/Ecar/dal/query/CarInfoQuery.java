package com.Ecar.dal.query;

/**
 * Created by xiaohei on 16/5/11.
 */
public class CarInfoQuery {
    protected int pageNo;
    protected int pageSize;

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
