package com.kodilla.good.patterns.orders;

public class Application {
    public static void main(String[] args){
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new BooksOrderService(),
                new BooksOrderRepository());
        orderProcessor.process(orderRequest);
        System.out.println(orderRequest);
    }
}
