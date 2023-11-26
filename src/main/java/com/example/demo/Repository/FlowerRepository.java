package com.example.demo.Repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entities.Flower;
public interface FlowerRepository extends CrudRepository<Flower, Long> {
    List<Flower> findAll();
    Flower save(Flower entity);

}
