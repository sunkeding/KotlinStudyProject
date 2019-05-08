package com.sunkeding.java.staticjava;

import com.sunkeding.kotlin.statickt.Location;

public class StaticJava {
    public static void main(String[] args){
        //java调用kt的静态方法
        Location lat = Location.Companion.getLat(0.9);

        Location lng = Location.getLng(0.8);
        System.out.println(Location.TAG);
    }
}
