package ru.netology.service;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void purchaseAmount999() {

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);

    }

    @Test
    public void purchaseAmount1000() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    public void purchaseAmount1001() {

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);

    }
}
