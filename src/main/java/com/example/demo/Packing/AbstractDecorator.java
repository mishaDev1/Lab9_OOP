package com.example.demo.Packing;

public class AbstractDecorator implements PackingInterface{
    protected PackingInterface flower;
    AbstractDecorator(PackingInterface flower){
        this.flower = flower;
    }
    @Override
    public void set_packing_description(String packing_desc) {
       flower.set_packing_description(packing_desc);
    }
    @Override
    public String get_packing_description() {
       return flower.get_packing_description();
    }
}
