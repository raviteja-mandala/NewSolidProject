package com.zemoso.WithSolid;

public class Cuboid extends Shape implements ShapeWithArea,ShapeWithVolume{
    public Integer length;
    public Integer breadth;
    public Integer height;

    public Cuboid(int length,int breadth,int height){
        super(3,"Closed","Cuboid");
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    @Override
    public int getSurfaceArea() {
        return 2*(length*breadth+breadth*height+height*length);
    }

    @Override
    public int getVolume() {
        return length*breadth*height;
    }

   /* public void isNotPerfectCuboid() throws Exception{
        if(length==breadth && breadth==height && height==length) {
            throw new Exception();
        }
    }*/
}
