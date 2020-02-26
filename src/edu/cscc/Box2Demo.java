package edu.cscc;

public class Box2Demo {
    public static void main (String args[]){
        //These two objects are created
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();

        double vol;
        //Object attribute values set for myBox1
        mybox1.width= 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        //Object attribute values set for myBox2
        mybox2.width= 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //compute volume of box

        vol = mybox1.width * mybox1.height * mybox1.depth;

        System.out.println("Volume is " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;

        System.out.println("Volume is " + vol);
    }
}

