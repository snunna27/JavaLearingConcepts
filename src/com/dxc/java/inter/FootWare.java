package com.dxc.java.inter;


interface FootWare {
    public void runningshoes();
    public void formalshoes();

}
class Puma implements FootWare {
    public void runningshoes() {
        System.out.println("puma running shoes start at 1000rs");
    }

    public void formalshoes() {
        System.out.println("puma formal shoe start at 2000rs");

    }

    public static void main(String[] args) {
        Puma f = new Puma();
        f.formalshoes();
        f.runningshoes();

    }
}
