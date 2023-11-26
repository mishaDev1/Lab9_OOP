package com.example.demo.Packing;


public class PlasticPacking extends AbstractDecorator {

    public PlasticPacking(PackingInterface flower) {
        super(flower);
    }
    @Override
    public void set_packing_description(String packing_desc) {
        String new_desc = packing_desc+"+ Plastic Packing ";
        flower.set_packing_description(new_desc);
    }
    @Override
    public String get_packing_description() {
       return flower.get_packing_description();
    }
}
