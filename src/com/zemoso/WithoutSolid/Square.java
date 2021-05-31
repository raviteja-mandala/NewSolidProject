package com.zemoso.WithoutSolid;

public  class Square implements Shape{
    public Integer side;
    public Integer dimension;
    public String shapeType;
    public String shapeName;
    public Square(int side){
        this.side=side;
        this.dimension=2;
        this.shapeName="Square";
        this.shapeType="Closed";
    }

    @Override
    public int getSurfaceArea() {
        return side*side;
    }

    @Override
    public int getVolume() {
        return 0;
    }
}
