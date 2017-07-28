package com.huitu.api.hnsl.util;

/**
 * Created by 3119 on 2015/11/23.
 */
public class Page {
    private String id;
    private String field;//����
    private int size;//ҳ����ʾ����
    private int pageNum;//��ǰҳ��
    private int min;//
    private int max;//
    private int count;
    private int total;
    private String tableName;
    public Page() {
    }

    public Page(String id, String field, int size, int pageNum, int min, int max, int count, String tableName) {
        this.id = id;
        this.field = field;
        this.size = size;
        this.pageNum = pageNum;
        this.min = min;
        this.max = max;
        this.count = count;
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
