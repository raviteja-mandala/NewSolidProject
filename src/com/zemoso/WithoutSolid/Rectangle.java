package com.zemoso.WithoutSolid;

public class Rectangle implements Shape{
    public Integer length;
    public Integer breadth;
    public Integer dimension;
    public String shapeType;
    public String shapeName;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        this.dimension=2;
        this.shapeName="Rectangle";
        this.shapeType="Closed";
    }

    @Override
    public int getSurfaceArea() {
        return length*breadth;
    }

    @Override
    public int getVolume() {
        return 0;
    }
}
