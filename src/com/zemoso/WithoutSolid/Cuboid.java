package com.zemoso.WithoutSolid;

public class Cuboid implements Shape {
    public Integer length;
    public Integer breadth;
    public Integer height;
    public Integer dimension;
    public String shapeType;
    public String shapeName;
    public Cuboid(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        this.dimension=3;
        this.shapeName="Cuboid";
        this.shapeType="Closed";
    }

    @Override
    public int getSurfaceArea() {
        return 2*(length*breadth+breadth*height+height*length);
    }

    @Override
    public int getVolume() {
        return length*breadth*height;
    }

    public void isPerfectCuboid() throws Exception{
        if(length==breadth && breadth==height && height==length) {
            throw new Exception();
        }
    }
}
