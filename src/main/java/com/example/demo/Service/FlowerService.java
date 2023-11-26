package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Flower;
import com.example.demo.Repository.FlowerRepository;

@Service
public class FlowerService {
    FlowerRepository flowerRepository;
    	@Autowired
	    public FlowerService(FlowerRepository flowerRepository){
		this.flowerRepository=flowerRepository;
	}

    public List<Flower> getAllFlowers(){
        return flowerRepository.findAll();
        
    }
     public void save(Flower flower){
        flowerRepository.save(flower);
    }
}
