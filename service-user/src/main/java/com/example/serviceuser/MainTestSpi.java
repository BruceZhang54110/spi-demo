package com.example.serviceuser;

import com.example.service.Perform;

import java.util.ServiceLoader;

public class MainTestSpi {
    public static void main(String[] args) {
        ServiceLoader<Perform> load = ServiceLoader.load(Perform.class);
        for (Perform perform : load) {
            System.out.println("遍历 start");
            perform.show();
        }
    }
}
