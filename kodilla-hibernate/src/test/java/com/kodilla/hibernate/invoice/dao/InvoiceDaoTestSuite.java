package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Product1");
        Invoice invoice = new Invoice("FA1");
        Item item = new Item(product, new BigDecimal(120), 2, new BigDecimal(240), invoice);
        invoice.getItems().add(item);

        //When
        productDao.save(product);
        invoiceDao.save(invoice);
        itemDao.save(item);

        //Then
        int id = invoice.getId();
        Invoice result = invoiceDao.findOne(id);
        Assert.assertEquals("FA1", result.getNumber());

        //CleanUp
        itemDao.delete(item.getId());
        invoiceDao.delete(id);
        productDao.delete(product.getId());
    }
}
