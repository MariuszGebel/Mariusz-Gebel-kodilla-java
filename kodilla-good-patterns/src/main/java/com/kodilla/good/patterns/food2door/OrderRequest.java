package com.kodilla.good.patterns.food2door;

public class OrderRequest {

    public SupplyContractor retriveSupply() {
        Product product = new Product("Gluten Free Pasta", 10.2);
        String supplierName = "Gluten Free Shop";
        return new SupplyContractor(supplierName, product.getProductName(), product.getProductPrice());
    }
}
