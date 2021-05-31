package com.zemoso.WithoutSolid;

public class ExecutableWithoutSolid {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(2, 3), new Square(4), new Cuboid(1, 5, 7)};
        CalculateTotalAreaAndVolume cav = new CalculateTotalAreaAndVolume(shapes);
        System.out.println("Total area is "+cav.calculateTotalArea());
        System.out.println("Total volume is "+cav.calculateTotalVolume());

        //LISKOV substitution principle violated.
        Cuboid cbd=new Cuboid(2,3,4);
        try {
            cbd.isPerfectCuboid();
        }
        catch(Exception e){
            System.out.println(e.getStackTrace());
        }
        cbd=new Cube(5);
        try {
            cbd.isPerfectCuboid();
        }
        catch(Exception e){
            System.out.println(e.getStackTrace());
        }
    }

}
