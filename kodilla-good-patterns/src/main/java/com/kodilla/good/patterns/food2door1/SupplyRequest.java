package com.kodilla.good.patterns.food2door1;

public class SupplyRequest {
    private String supplierName;
    private String productName;
    private int productQuantity;

    public SupplyRequest(String supplierName, String productName, int productQuantity) {
        this.supplierName = supplierName;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "SupplyRequest{" +
                "supplierName='" + supplierName + '\'' +
                ", productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
