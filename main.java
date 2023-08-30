package com.company;

public class Main {
    public static void main(String[] args) {


        printConversion(958);
    }

    public static long toMilesPerHour(double kilometersPerHour){


        if (kilometersPerHour<0){
            return -1;

        } else{
            return Math.round(kilometersPerHour/1.609);
        }
    }

    public static void printConversion(double kilometersPerHour){
        long miles=0;
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");

        }else{

            miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+" km/h = " +miles+" mi/h");
        }
    }







}
