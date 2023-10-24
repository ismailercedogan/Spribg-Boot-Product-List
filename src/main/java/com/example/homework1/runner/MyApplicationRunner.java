package com.example.homework1.runner;

import com.example.homework1.beans.ProductBean;
import com.example.homework1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MyApplicationRunner implements ApplicationRunner {
    private final ProductBean productBean;
    @Autowired
    public MyApplicationRunner(ProductBean productBean) {
        this.productBean = productBean;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"All-new Amazon Fire TV Stick 4K streaming device, includes support for Wi-Fi 6, Dolby Vision/Atmos, free & live TV",50));
        products.add(new Product(2,"Apple AirPods Pro (2nd Generation) Wireless Ear Buds with USB-C Charging, Up to 2X More Active Noise Cancelling Bluetooth Headphones, Transparency Mode, Adaptive Audio, Personalized Spatial Audio",270));
        products.add(new Product(3,"NSIGNIA 32-inch Class F20 Series Smart HD 720p Fire TV with Alexa Voice Remote (NS-32F201NA23, 2022 Model)",80));
        products.add(new Product(4,"Kindle Paperwhite (8 GB) – Now with a 6.8\" display and adjustable warm light – Black",140));
        productBean.setProductList(products);
    }
}
