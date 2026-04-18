package com.example.tarealambdas;

import java.util.*;
import java.util.stream.Collectors;

public class EjerciciosString {
    public static void ElFiltroSelectivo(ArrayList<String> palabras, String letra, int longitud){
        if (palabras != null) {
            palabras.removeIf( s -> s.startsWith(letra) || s.length() < longitud);
        }
    }

    public static ArrayList<String> ConversorMayusculas (ArrayList<String> palabras){
        if (palabras != null) {
            return palabras.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toCollection(ArrayList::new));
        }
        return null;
    }

    public static HashMap<String, Integer> MapaDeLongitudes(ArrayList<String> palabras) {
        if (palabras != null) {
            return palabras.stream()
                    .collect(Collectors.toMap(
                            s -> s,
                            s -> s.length(),
                            (existente, reemplazo) -> existente, // Si hay duplicados, se queda con el primero
                            HashMap::new //Se mete en un hashmap
                    ));
        }
        return null;
    }

    public static HashMap<String, Integer> ContadorFrecuencias(ArrayList<String> palabras) {
        if (palabras != null) {
            HashMap<String, Integer> mapaFrecuencias = new HashMap<>();
            for (String p : palabras) {
                // 1: el valor inicial si no existe
                // (viejo, nuevo) -> viejo + nuevo: la lambda que suma si ya existe
                mapaFrecuencias.merge(p, 1, (valorActual, valorNuevo) -> valorActual + valorNuevo);
            }
            return mapaFrecuencias;
        }
        return null;
    }

    public static ArrayList<String> ClasificadorPalabras(HashMap<String, Integer> mapa, int minFrecuencia) {
        if (mapa != null) {
            return mapa.entrySet().stream()
                    .filter(entrada -> entrada.getValue() >= minFrecuencia)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toCollection(ArrayList::new));
        }
        return null;
    }

    public static HashSet<String> DeduplicacionPalabras(String frase, int n) {
        if (frase != null) {
            return Arrays.stream(frase.split(" "))
                    .filter(s -> s.length() >= n)
                    .map(String::toLowerCase)
                    .collect(Collectors.toCollection(HashSet::new));
        }
        return null;
    }

    public static void ElTopeDeFrecuencias(HashMap<String, Integer> mapa, int tope) {
        if (mapa != null) {
            mapa.replaceAll((k, v) -> v > tope ? tope : v);
        }
    }
}
