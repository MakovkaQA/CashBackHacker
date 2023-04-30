package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test

    public void purchaseAmount999() {

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void purchaseAmount1000() {

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void purchaseAmount1001() {

        int expected = 999;
        int actual = service.remain(1001);

        Assert.assertEquals(expected, actual);

    }
}
