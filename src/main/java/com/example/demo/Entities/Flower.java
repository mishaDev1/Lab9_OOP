package com.example.demo.Entities;

import com.example.demo.Packing.PackingInterface;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @NoArgsConstructor
@Entity
public class Flower extends Thing implements PackingInterface{
    @Getter
    @Id
    private int id = 0;
    private double sepalLength = 0;
    private FlowerColor color = FlowerColor.BLUE;
    @Getter
    private FlowerType flowerType = FlowerType.ROSE;
    @Getter
    private String packing_descriptions = "";
    
    public Flower(FlowerType flowerType){
        setPrice(flowerType.price);
        this.flowerType = flowerType;
        this.sepalLength = flowerType.sepal_length;
        this.color = flowerType.color;
    }
    public Flower(Flower flower){
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        setPrice(flower.getPrice());
        this.flowerType = flower.flowerType;
    }
    public Flower(int id){
       this.id = id;
    }
    public String toString(){
        return flowerType.toString();
    }
    public String getColor() {
        return color.toString();
    }
    @Override
    public void set_packing_description(String packing_desc) {
       this.packing_descriptions+=packing_desc;
    }
    @Override
    public String get_packing_description() {
       return this.packing_descriptions;
    }
    
}
