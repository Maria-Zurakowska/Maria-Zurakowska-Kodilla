package com.kodilla.testing.weather.mock;
import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithMock(){

        //Given -> mock to sztuczna klasa

        Temperatures temperaturesMock = mock(Temperatures.class);
// tworzę Mapę z wartościami temperatur
        HashMap<Integer,Double> temperaturesMap = new HashMap<Integer,Double>();
        temperaturesMap.put(0,25.5);
        temperaturesMap.put(1,26.2);
        temperaturesMap.put(2,24.8);
        temperaturesMap.put(3,25.2);
        temperaturesMap.put(4,26.1);
// when - wywoluje metode, ktora zwraca HashMap temperatur,
//thenReturn - to zwroc utworzona wyzej HashMap z wartościami temperatur
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
// gdy tworzę mock to klasa jest pusta, więc żeby exptected 5 tutaj w teście
// nie wyrzuciło błędu to trzeba dodać te 5 elementów.
        Assert.assertEquals(5, quantityOfSensors);
    }
}
