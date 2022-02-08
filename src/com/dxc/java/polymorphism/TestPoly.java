package com.dxc.java.polymorphism;

class Vehicle {

    void Print()
    {

        System.out.println("Vehicle");
    }
}


class Car extends Vehicle {


    void Print()
    { System.out.println("car"); }
}

class Bus extends Vehicle {


    void Print()
    {
        System.out.println("Bus");
    }
}

class TestPoly {

    public static void main(String[] args)
    {

    Vehicle    v = new Car();
        v.Print();

        Vehicle v1 = new Bus();
        v1.Print();

    }
}