package com.kodilla.good.patterns.orders;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getClient(), orderRequest.getOrderDate());

        if(isOrdered) {
            informationService.inform(orderRequest.getClient());
            orderRepository.createOrderRecord(orderRequest.getClient(), orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getClient(), true);
        } else {
            return new OrderDto(orderRequest.getClient(), false);
        }
    }
}
