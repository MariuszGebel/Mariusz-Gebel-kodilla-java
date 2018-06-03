package com.kodilla.good.patterns.food2door;

public class SupplyContractor {
    private String supplierName;
    private String productName;
    private double productPrice;

    public SupplyContractor(String supplierName, String productName, double productPrice) {
        this.supplierName = supplierName;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "SupplyRequest{" +
                "supplierName='" + supplierName + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
