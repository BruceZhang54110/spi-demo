package com.example.serviceuser;

import com.example.service.Perform;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainTestSpi {
    public static void main(String[] args) {
        ServiceLoader<Perform> serviceLoader = ServiceLoader.load(Perform.class);
        Iterator<Perform> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            Perform perform = iterator.next();
            perform.show();
        }

    }
}
