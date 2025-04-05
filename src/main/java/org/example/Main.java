package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //psvm
    public static void main(String[] args) {
        //codigo DNA = ATGATTATTGATACAGTTTTTGTACTATATTGGTACGGGAAGGTTCCAACTTGA

        //sout
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o código o DNA? ");
        String codigoDna = leitor.nextLine();

        System.out.println(DNAConverter.converteProteina(codigoDna));
    }
}

