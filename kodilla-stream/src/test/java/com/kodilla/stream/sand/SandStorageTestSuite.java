package com.kodilla.stream.sand;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {

    @Test
    public void testGetSandBeansQuantity(){
        //Given
// tworzę listę obiektów klas, które implementują interfejs
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe()); //albo new obiekt, albo osobno tworzę i tu nazwe zmiennej
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigDecimal totalSand = BigDecimal.ZERO; // lub new BigDecimal("0");
// Każde kolejne przypisanie do zmiennej totalSand i tak tworzy nowy obiekt, możemy więc pozostawić taki właśnie zapis
        for(SandStorage continent : continents){

// for-each, obliczamy sumę ziaren piasku na wszystkich kontynentach w kolekcji
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }
        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand,totalSand); //wartość sumy porównujemy z wartością oczekiwaną

    }
    @Test
    public void testGetSandBeansQuantityWithReduce(){
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigDecimal totalSand = continents.stream() //uruchamiamy strumien na kolekcji continents i przyposujemy do zmiennej
                .map(SandStorage::getSandBeansQuantity) //

// .reduce (wartość początkowa, dla każdej liczby w kolekcji robi
// (sum, current) -> sum = sum.add(current)
// sum - wynik pośredni uzyskany dla poprzedniego obiektu w kolekcji (na pocz.mamy BigDecimal.ZERO)
// wyrażenie lambda do zmiennej sum przypisuje nową wartość będącą sumą dotychczasowych obliczeń
// i wartości current (bieżący obiekt w strumieniu)

                .reduce(BigDecimal.ZERO,(sum, current) -> sum = sum.add(current));
        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand,totalSand);
    }
}
