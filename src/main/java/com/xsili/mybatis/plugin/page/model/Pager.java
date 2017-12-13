package com.xsili.mybatis.plugin.page.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class Pager<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 数据集合 */
    private List<T> rows;

    /** 当前页码 */
    private int page;

    /** 总页数 */
    private int totalPage;

    /** 总记录数 */
    private int totalCount;

    public Pager() {
    }

    public Pager(List<T> rows, int page, int totalPage, int totalCount) {
        this.rows = rows;
        this.page = page;
        this.totalPage = totalPage;
        this.totalCount = totalCount;
    }

    public List<T> getRows() {
        if (rows == null) {
            return new ArrayList<T>();
        }
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

}
