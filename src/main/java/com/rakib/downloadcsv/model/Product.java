package com.rakib.downloadcsv.model;

public class Product {
    private int id;
    private String productName;
    private String batchName;

    public Product() {
    }

    public Product(int id, String productName, String batchName) {
        this.id = id;
        this.productName = productName;
        this.batchName = batchName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
}
