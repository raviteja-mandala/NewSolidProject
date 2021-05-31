package com.zemoso.WithoutSolid;
import com.zemoso.WithoutSolid.Shape;

public class CalculateTotalAreaAndVolume {
    public Shape[] shapes;
    public CalculateTotalAreaAndVolume(Shape[] shapes){
        this.shapes=shapes;
    }
    public int calculateTotalArea(){
        int totalArea=0;
        for(Shape shape : shapes){

                totalArea+= shape.getSurfaceArea();

        }
        return totalArea;
    }

    public int calculateTotalVolume(){
        int totalVolume=0;
        for(Shape shape : shapes){

                totalVolume+= shape.getVolume();

        }
        return totalVolume;
    }
}
