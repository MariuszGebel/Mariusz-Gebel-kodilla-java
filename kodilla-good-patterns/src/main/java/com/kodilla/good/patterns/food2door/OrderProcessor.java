package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    private SupplyContractor supplyContractor;
    private OrderRequest orderRequest;

    public OrderProcessor(SupplyContractor supplyContractor, OrderRequest orderRequest) {
        this.supplyContractor = supplyContractor;
        this.orderRequest = orderRequest;
    }

    public void processSupply(final SupplyContractor supplyContractor) {
        boolean isRequested = Order.supply(supplyContractor.getSupplierName(),
                supplyContractor.getProductName(), supplyContractor.getProductPrice());

        if (isRequested) {
            System.out.println(supplyContractor.getSupplierName() + "\n" + supplyContractor.getProductName()
            + "\n" + supplyContractor.getProductPrice());
        }
    }
}
