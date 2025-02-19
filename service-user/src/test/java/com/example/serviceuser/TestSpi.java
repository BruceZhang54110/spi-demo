package com.example.serviceuser;

import com.example.service.Perform;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ServiceLoader;

@SpringBootTest
public class TestSpi {
    public static void main(String[] args) {
        ServiceLoader<Perform> load = ServiceLoader.load(Perform.class);
        for (Perform perform : load) {
            perform.show();
        }
    }

}
