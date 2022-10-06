package com.tarea1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("***************************************************");
        System.out.println("Ingresa un año para validar si es bisiesto o no");
        System.out.println("***************************************************");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int anno = Integer.parseInt(reader.readLine());
        isLeapYear(anno);
        System.out.println(anno);
    }

    public static void isLeapYear(int anno){
        GregorianCalendar calendar = new GregorianCalendar();
        if (calendar.isLeapYear(anno)) {
            System.out.println("El año " + anno + " es bisiesto");
        } else {
            System.out.println("El año " + anno + " no es bisiesto");
        }
    }
}
