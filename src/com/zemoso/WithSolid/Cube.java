package com.zemoso.WithSolid;

public class Cube extends Cuboid{
    public Cube(int length) {
        super(length,length,length);
        this.breadth=length;
        this.length=length;
        this.height=height;
        setCommonVariables();
    }
    public void setCommonVariables(){
        this.dimension=3;
        this.shapeName="Cube";
        this.shapeType="Closed";
    }
}
