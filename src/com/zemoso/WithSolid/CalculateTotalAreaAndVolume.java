package com.zemoso.WithSolid;

public class CalculateTotalAreaAndVolume {
    public Shape[] shapes;
    public CalculateTotalAreaAndVolume(Shape[] shapes){
        this.shapes=shapes;
    }
    public int calculateTotalArea(){
        int totalArea=0;
        for(Shape shape : shapes){
            if(shape instanceof ShapeWithArea){
                totalArea+=((ShapeWithArea) shape).getSurfaceArea();
            }
        }
        return totalArea;
    }

    public int calculateTotalVolume(){
        int totalVolume=0;
        for(Shape shape : shapes){
            if(shape instanceof ShapeWithVolume){
                totalVolume+=((ShapeWithVolume) shape).getVolume();
            }
        }
        return totalVolume;
    }
}
