package com.cru.jc.util.common;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cru
 * @ClassName PageUtils
 * @Description 分页工具类
 * @date 2022/10/9 23:34
 */

public class PageUtil<T> {
    /**
     * 实体类列表
     */
    private List<T> content;
    /**
     * 是否首页
     */
    private boolean first;
    /**
     * 是否尾页
     */
    private boolean last;
    /**
     * 总记录数
     */
    private Integer totalCount;
    /**
     * 总页数
     */
    private Integer totalPages;
    /**
     * 当前页记录数
     */
    private Integer count;
    /**
     * 每页记录数
     */
    private Integer pageSize;
    /**
     * 当前页
     */
    private Integer pageNum;

    @Override
    public String toString() {
        return "PageUtil{" +
                "content=" + content +
                ", first=" + first +
                ", last=" + last +
                ", totalCount=" + totalCount +
                ", totalPages=" + totalPages +
                ", count=" + count +
                ", pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                '}';
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public void setLast(boolean last) {
        this.last = last;
    }


    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }


    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public List<T> getContent() {
        return content;
    }

    public boolean isFirst() {
        return first;
    }

    public boolean isLast() {
        return last;
    }


    public Integer getTotalPages() {
        return totalPages;
    }


    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void pageUtil(Integer page, Integer size, List<T> list) {
        page = page <= 0 ? 1 : page;
        List<T> list1 = list.stream().skip((page - 1) * size).limit(size).collect(Collectors.toList());
        int length = list.size();
        //是否第一页
        this.first = (page == 1);
        //是否最后一页
        this.last = (page == (length - 1) / size);
        //总页数
        this.totalPages = ((length - 1) / size + 1);
        //总elements
        this.totalCount = (length);
        //每页多少elements
        this.pageSize = (size);
        //内容
        this.content = (list1);
        //当前页数据量
        this.count = (list1.size());
        //当前页数，第一页是1
        this.pageNum = (page);
    }
}

