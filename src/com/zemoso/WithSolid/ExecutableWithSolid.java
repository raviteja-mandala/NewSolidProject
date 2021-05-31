package com.zemoso.WithSolid;

public class ExecutableWithSolid {
    public static void main(String[] args){
        Shape[] shapes={new Rectangle(2,3), new Square(4), new Cuboid(1,5,7)};
        CalculateTotalAreaAndVolume cav=new CalculateTotalAreaAndVolume(shapes);
        System.out.println("total area is "+cav.calculateTotalArea());
        System.out.println("total volume is "+cav.calculateTotalVolume());

        //Liskov substitution principle not violated.
        Cuboid cbd=new PerfectCuboid(2,4,6);
        Cuboid x= new Cube(4);


    }
}
