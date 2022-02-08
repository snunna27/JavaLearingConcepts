package com.dxc.java.inheritance;
 class Vehicle{
    public int wheels;
    public String breaks;

    public Vehicle(int wheels,String breaks){
        this.wheels=wheels;
        this.breaks=breaks;
    }
    public void start() {
        System.out.println("starting");
    }
    public void stop()
    {
        System.out.println("stop");
    }
    public void move()
    {
        System.out.println("moving");
    }


}

 class Car extends Vehicle {
     public Car(int wheels, String breaks) {
         super(wheels, breaks);
     }

     public void drive(){
    System.out.println("driving");
}
     public String toString()
     {
         return ("how many wheels " + wheels+ "\n"
                 + "how to use" + breaks);
     }

}














public class TestInherit {

    public TestInherit(int wheels, String breaks) {
    }

    public static void main(String args[])

    {
        Car c= new Car(4,"press");
        System.out.println(c.toString());
        c.move();
        c.start();
        c.stop();
        c.drive();
    }
}
