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
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave(){

        //Given
        Invoice invoice1 = new Invoice("234");

        Product product1 = new Product("Sunny juice");
        Product product2 = new Product("Lego");
        Product product3 = new Product("Toys for cats");

        Item item1 = new Item(new BigDecimal("300"),3, new BigDecimal("300"),product1);
        Item item2 = new Item(new BigDecimal("200"),2, new BigDecimal("200"), product2);
        Item item3 = new Item(new BigDecimal("100"),1, new BigDecimal("100"), product3);


        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);


        //When
        invoiceDao.save(invoice1);
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        int invoice1Id = invoice1.getId();
        int product1Id = product1.getId();
        int product2Id = product2.getId();
        int product3Id = product3.getId();
        int item1ID = item1.getId();
        int item2ID = item2.getId();
        int item3ID = item3.getId();

        //Then
        Assert.assertNotEquals(0,invoice1Id);
        Assert.assertNotEquals(0,product1Id);
        Assert.assertNotEquals(0,product2Id);
        Assert.assertNotEquals(0,product3Id);
        Assert.assertNotEquals(0,item1ID);
        Assert.assertNotEquals(0,item2ID);
        Assert.assertNotEquals(0,item3ID);

        //CleanUp
        itemDao.deleteById(item1ID);
        itemDao.deleteById(item2ID);
        itemDao.deleteById(item3ID);
        invoiceDao.deleteById(invoice1Id);
        productDao.deleteById(product1Id);
        productDao.deleteById(product2Id);
        productDao.deleteById(product3Id);



    }
}
