package com.cybertek.tests;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello Selenium");
        System.out.println("Hello Selenium");
        System.out.println("Hello Selenium");

        Faker faker=new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.backToTheFuture().character());

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
        System.out.println(simpleDateFormat.get2DigitYearStart());
    }

}
