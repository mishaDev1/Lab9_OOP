package com.example.demo.Controllers;

import java.util.List;
import java.util.concurrent.Flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Delivery.DHLDeliveryStrategy;
import com.example.demo.Delivery.DeliveryInterface;
import com.example.demo.Delivery.PostDeliveryStrategy;
import com.example.demo.Entities.Flower;
import com.example.demo.Entities.FlowerType;
import com.example.demo.Entities.Order;
import com.example.demo.Payment.CreditCardPaymentStrategy;
import com.example.demo.Payment.PayPalPaymentStrategy;
import com.example.demo.Payment.PaymentInterface;
import com.example.demo.Service.FlowerService;
@RequestMapping("/api/v1")
@RestController
public class OrderController {
	FlowerService flowerService;
	@Autowired
	public OrderController(FlowerService flowerService){
		this.flowerService=flowerService;
	}
	    @GetMapping("/all")
	public List<Flower> getAll() {
		return flowerService.getAllFlowers();
	}
	@PostMapping("/flower")
	public void save(@RequestBody Flower flower) {
		flowerService.save(flower);
		System.out.println(flower);
	}
}
