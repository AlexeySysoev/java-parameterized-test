package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)

public class CheckPowerRange {
    private final String typeOfTransport;
    private final int horsePower;
    private final int result;

    public CheckPowerRange(String typeOfTransport, int horsePower, int result){
        this.typeOfTransport = typeOfTransport;
        this.horsePower = horsePower;
        this.result = result;
    }

    @Parameterized.Parameters

    public static Object[][] getTransportData() {
        return new Object[][] {
                { "Truck", 499, 100},
                { "Truck", 500, 200},
                { "Truck", 501, 200},
                { "Car", 249, 10},
                { "Car", 250, 40},
                { "Car", 251, 40},
                { "Bicycle", 0, 0}

        };
    }

    @Test
    public void CheckPowerRangeDiff(){
        Program transport = new Program();
        int actual = transport.powerRange(typeOfTransport, horsePower);
        assertEquals("Здесь ошибка, должен быть" + result + "а вышло:" +actual+" :", result, actual);

    }

}
