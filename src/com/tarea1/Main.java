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
        String num = reader.readLine();
        int year = 0;
        System.out.println("Validando si el año ingresado es valido");
        System.out.println("...");
        System.out.println("Desea continuar?");
        System.out.println("1. Si");
        System.out.println("2. No");
        String answer = reader.readLine();
        try{
            if (answer != null && answer !="" && answer == "1"){
                if(num != ""){
                    year = Integer.parseInt(num);
                }
                if(year != 0 && year > 0){
                    isLeapYear(year);
                }else{
                    System.out.println("El valor ingresado no es valido");
                }
            }else{
                System.out.println("Hasta luego");
            }
        }catch (Exception e){
            System.out.println("Solicitud invalida");
        }
    }

    public static void isLeapYear(int year){
        GregorianCalendar calendar = new GregorianCalendar();
        if (calendar.isLeapYear(year)) {
            System.out.println("El año " + year + " es bisiesto");
        } else {
            System.out.println("El año " + year + " no es bisiesto");
        }
    }
}
