package com.campusdual.classroom;

public class Exercise02 {


    public static void main(String[] args) {
        double r = 15;
        double a,l;
        // TODO: ↓ Fórmula del área de un círculoS: a = radio * radio * Número PI
        double pi = 3.14159265359;// <--1º intento, area
        a = r * r * pi;



        System.out.println("Area: " + a);

        // TODO: ↓ Fórmula de la longitud de una circunferencia: l = 2 * radio * Número PI
        l = 2 * r * pi;


        System.out.println("Longitud:  " + l);

    }
}
