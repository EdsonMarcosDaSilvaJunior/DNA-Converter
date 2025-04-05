package org.example;

import java.util.HashMap;
import java.util.Map;

public class DNAConverter {
    public static String converteProteina(String dna) {

        Map<String, String> mapa = new HashMap<>();
        mapa.put("AUG", "M"); // Início da tradução (Metionina)
        mapa.put("GCU", "A");
        mapa.put("GCC", "A");
        mapa.put("GCA", "A");
        mapa.put("GCG", "A");
        mapa.put("UGU", "C");
        mapa.put("UGC", "C");
        mapa.put("GAU", "D");
        mapa.put("GAC", "D");
        mapa.put("GAA", "E");
        mapa.put("GAG", "E");
        mapa.put("UUU", "F");
        mapa.put("UUC", "F");
        mapa.put("GGA", "G");
        mapa.put("GGG", "G");
        mapa.put("GGU", "G");
        mapa.put("GGC", "G");
        mapa.put("CAU", "H");
        mapa.put("CAC", "H");
        mapa.put("AUA", "I");
        mapa.put("AUC", "I");
        mapa.put("AUU", "I");
        mapa.put("AAA", "K");
        mapa.put("AAG", "K");
        mapa.put("UUA", "L");
        mapa.put("UUG", "L");
        mapa.put("CUU", "L");
        mapa.put("CUC", "L");
        mapa.put("CUA", "L");
        mapa.put("CUG", "L");
        mapa.put("AUG", "M");
        mapa.put("AAU", "N");
        mapa.put("AAC", "N");
        mapa.put("CCU", "P");
        mapa.put("CCC", "P");
        mapa.put("CCA", "P");
        mapa.put("CCG", "P");
        mapa.put("CAA", "Q");
        mapa.put("CAG", "Q");
        mapa.put("CGU", "R");
        mapa.put("CGC", "R");
        mapa.put("CGA", "R");
        mapa.put("CGG", "R");
        mapa.put("AGU", "S");
        mapa.put("AGC", "S");
        mapa.put("UCU", "S");
        mapa.put("UCC", "S");
        mapa.put("UCA", "S");
        mapa.put("UCG", "S");
        mapa.put("ACU", "T");
        mapa.put("ACC", "T");
        mapa.put("ACA", "T");
        mapa.put("ACG", "T");
        mapa.put("GUU", "V");
        mapa.put("GUC", "V");
        mapa.put("GUA", "V");
        mapa.put("GUG", "V");
        mapa.put("UGG", "W");
        mapa.put("UAU", "Y");
        mapa.put("UAC", "Y");
        mapa.put("UAA", "*"); // Código de parada
        mapa.put("UAG", "*"); // Código de parada
        mapa.put("UGA", "*"); // Código de parada


        dna = dna.toUpperCase();
        String rna = dna.replace('T', 'U');

        StringBuilder proteina = new StringBuilder();

        for (int i = 0; i < rna.length(); i += 3) {
            String codon = rna.substring(i, Math.min(i + 3, rna.length()));
            String aminoAcido = mapa.getOrDefault(codon, "");


            if (aminoAcido.equals("*")) {
                proteina.append("*");
                break;
            }

            proteina.append(aminoAcido);
        }

        return proteina.toString();
    }
}
