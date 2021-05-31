package com.zemoso.WithSolid;

public class PerfectCuboid extends Cuboid{
    public PerfectCuboid(int length, int breadth, int height) {
        super(length, breadth, height);
    }

    public void isPerfectCuboid() throws Exception{
        if(length==breadth && breadth==height && height==length) {
            throw new Exception();
        }
    }
}
