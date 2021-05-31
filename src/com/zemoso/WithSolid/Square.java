package com.zemoso.WithSolid;

public class Square extends Shape implements ShapeWithArea{
    public Integer side;
    public Square(int side){
        super(2,"Closed","Square");
        this.side=side;
    }

    @Override
    public int getSurfaceArea() {
        return side*side;
    }
}
