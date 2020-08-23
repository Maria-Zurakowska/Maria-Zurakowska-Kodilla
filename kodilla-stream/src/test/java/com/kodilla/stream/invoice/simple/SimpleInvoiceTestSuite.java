package com.kodilla.stream.invoice.simple;

import org.junit.Test;
import org.junit.Assert;

public class SimpleInvoiceTestSuite {

    @Test
    public void testGetValueToPay(){
        //Given
        SimpleInvoice invoice = new SimpleInvoice();
        //When

//.addItem(SimpleItem item), a więc argum. jest obiekt klasy SimpleItem
// nowy obiekt klasy SimpleItem(final SimpleProduct product, final double quantity)
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.49), 5.0));

        //Then

//108.975, bo 17,28x2 +...
// Dla asercji operujących na liczbach zmiennoprzecinkowych podaje się również trzeci parametr delta
// określający dopuszczalny błąd, czyli maksymalną różnicę pomiędzy oczekiwanym wynikiem
        Assert.assertEquals(108.975,invoice.getValueToPay(),0.001);


    }
}
