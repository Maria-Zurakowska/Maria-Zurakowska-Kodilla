package com.kodilla.stream.invoice.simple;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class SimpleInvoice {
    private final List<SimpleItem> items = new ArrayList<>(); //po lewej typ ogólny

    public void addItem(SimpleItem item){  //dodaję coś -> void
        items.add(item);
    }
    public boolean removeItem(SimpleItem item){ //usuwam, czyli sprawdzam czy TRUE czy usunęło sie
        return items.remove(item);
    }
    public double getValueToPay(){
        return items.stream()

// .summingDouble ->oblicza sumę obiektów w strumieniu
                .collect(Collectors.summingDouble(SimpleItem::getValue));
    }

}
