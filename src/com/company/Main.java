package com.company;

import java.util.Scanner;

public class Main {
    public String[] lentele;

    public void zodziuIrasymas() {
        Scanner sc = new Scanner(System.in);

        lentele = new String[5];

        System.out.println("Irasyk penkis zodzius: ");

        for (int i = 0; i < lentele.length; i++) {
            lentele[i] = sc.next();

        }
    }

    public void zodziuparodymas() {
        for (int i = 0; i < lentele.length; i++) {
            System.out.println(lentele[i]);
        }
    }

    public static void main (String[]args){
            Main objektas = new Main();
            objektas.zodziuIrasymas();
            objektas.zodziuparodymas();
        }
    }
