package com.huitu.api.hnsl.util;

/**
 * Created by 3119 on 2016/1/13.
 */
public class Paging {
    private long count;//��ҳ��
    private long total;//������
    private boolean finale;//�Ƿ��ѵ����һҳ
    private int index;//��ǰҳ��
    private String id;
    private String tableName;

    public Paging(int count, int total, boolean finale, int index, String id, String tableName) {
        this.count = count;
        this.total = total;
        this.finale = finale;
        this.index = index;
        this.id = id;
        this.tableName = tableName;
    }

    public Paging() {
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public boolean isFinale() {
        return finale;
    }

    public void setFinale(boolean finale) {
        this.finale = finale;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
