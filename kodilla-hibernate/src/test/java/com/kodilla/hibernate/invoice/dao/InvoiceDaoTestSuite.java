package com.kodilla.hibernate.invoice.dao;

//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//    @Autowired
//    private InvoiceDao invoiceDao;
//
////    @Test
////    public void testInvoiceDaoSave() {
////        //Given
////        Item item1 = new Item(new Product("Product1"), new BigDecimal(100),
////                33, new BigDecimal(3300));
////        Item item2 = new Item(new Product("Product2"), new BigDecimal(1000),
////                5, new BigDecimal(5000));
////        ArrayList<Item> items = new ArrayList<>();
////        items.add(item1);
////        items.add(item2);
////
////        Invoice invoice = new Invoice("FA1");
////        invoice.getItems().add(item1);
////        invoice.getItems().add(item2);
////
////        //When
////        invoiceDao.save(invoice);
////        int id = invoice.getId();
////
////        //Then
////        Assert.assertEquals(2, items.size());
////        Assert.assertEquals(id, invoiceDao.findOne(id));
//
//        //CleanUp
////        invoiceDao.delete(id);
////    }
//}
