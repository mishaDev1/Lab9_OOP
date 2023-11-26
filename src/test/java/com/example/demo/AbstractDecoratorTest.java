package com.example.demo;


import java.util.concurrent.Flow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.demo.Delivery.DHLDeliveryStrategy;
import com.example.demo.Entities.Flower;
import com.example.demo.Entities.FlowerType;
import com.example.demo.Entities.Order;
import com.example.demo.Packing.CartonPacking;
import com.example.demo.Packing.PackingInterface;
import com.example.demo.Packing.PlasticPacking;
import com.example.demo.Payment.PayPalPaymentStrategy;

import jakarta.activation.FileDataSource;

@SpringBootTest
class AbstractDecoratorTest {

	@Test
	void contextLoads() {
		PackingInterface rose = new Flower(FlowerType.ROSE);
        rose = new CartonPacking(rose);
        rose = new PlasticPacking(rose);
        rose.set_packing_description("");
        Assertions.assertEquals(rose.get_packing_description(),"+ Plastic Packing + Carton Packing ");
	}

}
