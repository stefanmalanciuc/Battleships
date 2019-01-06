package com.company.ship;

public class Ship {
    private String name;
    private int size;

    /*final static int boat =2;
    final static int frigate =3;
    final static int destroyer =4;
    final static int carrier =5;*/

    public Ship (String name, int size){
        this.name=name;
        this.size=size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
