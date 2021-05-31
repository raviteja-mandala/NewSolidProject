package com.zemoso.WithSolid;

public class Rectangle extends Shape implements ShapeWithArea{
    public Integer length;
    public Integer breadth;
    public Rectangle(int length,int breadth){
        super(2,"Closed", "Rectangle");
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public int getSurfaceArea() {
        return length*breadth;
    }
}
