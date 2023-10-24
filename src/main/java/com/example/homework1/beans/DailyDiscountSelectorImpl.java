package com.example.homework1.beans;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DailyDiscountSelectorImpl implements DailyDiscountSelector{
    @Override
    public int getDailyDiscountRate() {
        Random rnd = new Random();
        return rnd.nextInt(4)*5+15;

    }
}
