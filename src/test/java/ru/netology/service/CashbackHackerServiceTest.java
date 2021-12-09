package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerServiceTest {

    @Test
    public void shouldCash500() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 500;

        int actual = cashbackHackerService.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

}