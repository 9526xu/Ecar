package com.Ecar.common.utils;

import java.util.List;

/**
 * Created by xiaohei on 16/5/11.
 */
public class PageResult<T> {
    private int pageNo=BasePageForm.DEFAULT_PAGENO;
    private int pageSize=BasePageForm.DEFAULT_PAGESIZE;
    private int totalCount;
    private int totalPage;
    private List<T> result;


    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        if(pageNo<1){
            this.pageNo=BasePageForm.DEFAULT_PAGENO;
        }
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        if(pageSize<1){
            this.pageSize=BasePageForm.DEFAULT_PAGESIZE;
        }
        this.pageSize = pageSize;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {


        return totalCount/pageSize+(totalCount%pageSize==0?0:1);
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
