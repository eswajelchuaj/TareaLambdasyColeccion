package com.example.tarealambdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Este array es para los casos extremos, está vacío
        ArrayList<Integer> extremoInt = null;
        ArrayList<String> extremoString = null;

        //Ejercicio 1. El Mulitplicador
        System.out.println("Ejercicio 1: ");
        //Crea el ArrayList de numeros 1 al 10
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i < 11; i++){
            numeros.add(i);
        }
        //Valores originales
        System.out.println("Original: " + numeros);
        //Valores multiplicados por el factor (5)
        EjerciciosNumeros.ElMultiplicador(numeros,5);
        System.out.println("Modificado: " + numeros);
        //Caso extreme
        EjerciciosNumeros.ElMultiplicador(extremoInt,5);
        System.out.println("Extremo: " + extremoInt);

        //Ejercicio 2. El Filtro Selectivo
        System.out.println("------------------------");
        System.out.println("Ejercicio 2: ");
        ArrayList<String> Palabras = new ArrayList<>(List.of("Palabra","Hola","Loco","Homero","De"));
        //Valores originales
        System.out.println("Original: " + Palabras);
        //Mostrar palabras que no contengan la inicial indicada o sean menor al numero indicado
        EjerciciosString.ElFiltroSelectivo(Palabras,"H",3);
        System.out.println("Modificado: " + Palabras);
        //Caso extreme
        EjerciciosString.ElFiltroSelectivo(extremoString,"H", 3);
        System.out.println("Extremo: " + extremoString);

        //Ejercicio 3. Conversor de Mayúsculas
        System.out.println("------------------------");
        Palabras = new ArrayList<>(List.of("Palabra","Hola","Loco","Homero","De"));
        //Original
        System.out.println("Ejercicio 3: ");
        System.out.println("Original: " + Palabras);
        //Modificado con las palabras en mayúsculas
        ArrayList<String> Conversor = EjerciciosString.ConversorMayusculas(Palabras);
        System.out.println("Modificado: " + Conversor);
        //Usa el ArrayList del Ejercicio 2 y los pasa a mayúsculas.
        ArrayList<String> ConversorExtremo = EjerciciosString.ConversorMayusculas(extremoString);
        System.out.println("Extremo: " + extremoString);

        // Ejercicio 4. Cuadrados Únicos
        System.out.println("------------------------");
        System.out.println("Ejercicio 4: ");
        ArrayList<Integer> numerosDuplicados = new ArrayList<>(List.of(2, 4, 2, 6, 8, 4, 1, 3));
        System.out.println("Original: " + numerosDuplicados);
        //Aquí hacemos que el Array de numerosDuplicados
        //elimine los numeros duplicados,
        //y los convierta en numeros cuadrados
        HashSet<Integer> resultadoHashSet = EjerciciosNumeros.CuadradosUnicos(numerosDuplicados);
        System.out.println("Modificado: " + resultadoHashSet);
        // Caso extreme
        HashSet<Integer> hashSetExtremo = EjerciciosNumeros.CuadradosUnicos(extremoInt);
        System.out.println("Extremo: " + hashSetExtremo);

        // Ejercicio 5. Mapa de Longitudes
        System.out.println("------------------------");
        System.out.println("Ejercicio 5: ");
        Palabras = new ArrayList<>(List.of("Palabra","Hola","Loco","Homero","De"));
        // Valores originales
        System.out.println("Original: " + Palabras);
        // Creamos el HashMap para guardar el resultado
        HashMap<String, Integer> mapaResultante = EjerciciosString.MapaDeLongitudes(Palabras);
        System.out.println("Modificado: " + mapaResultante);
        // Caso extreme
        HashMap<String, Integer> mapaExtremo = EjerciciosString.MapaDeLongitudes(extremoString);
        System.out.println("Extremo: " + mapaExtremo);

        // Ejercicio 6. Modificador de Inventario (HashMap)
        System.out.println("------------------------");
        System.out.println("Ejercicio 6: ");
        // Creamos un mapa de prueba
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("Laptop", 15000.0);
        productos.put("Mouse", 500.0);
        productos.put("Teclado", 1200.0);
        // Valores originales (impresión normal del mapa)
        System.out.println("Original: " + productos);
        //Aplicamos descuentos
        System.out.println("--- Catálogo con Descuento ---");
        EjerciciosNumeros.ModificadorInventario(productos);
        // Caso extreme
        System.out.print("Extremo: ");
        HashMap<String, Double> inventarioExtremo = null;
        EjerciciosNumeros.ModificadorInventario(inventarioExtremo);
        System.out.println(inventarioExtremo);

        // Ejercicio 7. Contador de Frecuencias
        System.out.println("------------------------");
        System.out.println("Ejercicio 7: ");
        // Creamos una lista con palabras repetidas
        ArrayList<String> listaRepetida = new ArrayList<>(List.of("Hola", "Loco", "Hola", "Homero", "Hola", "Loco"));
        // Valores originales
        System.out.println("Original: " + listaRepetida);
        // Obtenemos el mapa de frecuencias
        HashMap<String, Integer> frecuencias = EjerciciosString.ContadorFrecuencias(listaRepetida);
        System.out.println("Modificado: " + frecuencias);
        // Caso extreme
        HashMap<String, Integer> frecExtremo = EjerciciosString.ContadorFrecuencias(extremoString);
        System.out.println("Extremo: " + frecExtremo);

        // Ejercicio 8. Clasificador de Palabras
        System.out.println("------------------------");
        System.out.println("Ejercicio 8: ");
        // Usamos el mapa de frecuencias del Ejercicio 7
        System.out.println("Original: " + frecuencias);
        //Obtenemos las palabras que hayan tenido una frecuencia mayor o igual a 2
        ArrayList<String> clasificadas = EjerciciosString.ClasificadorPalabras(frecuencias, 2);
        System.out.println("Modificado: " + clasificadas);
        // Caso extreme
        HashMap<String, Integer> mapaNulo = null;
        ArrayList<String> clasificadoExtremo = EjerciciosString.ClasificadorPalabras(mapaNulo, 2);
        System.out.println("Extremo: " + clasificadoExtremo);

        // Ejercicio 9. Deduplicación de Palabras
        System.out.println("------------------------");
        System.out.println("Ejercicio 9: ");
        String miFrase = "Esta no es una frase larga";
        // Valores originales
        System.out.println("Original: " + miFrase + "");
        // Eliminamos palabras con menos de 3 letras
        HashSet<String> fraseLimpia = EjerciciosString.DeduplicacionPalabras(miFrase, 3);
        System.out.println("Modificado: " + fraseLimpia);
        // Caso extreme
        String fraseNula = null;
        HashSet<String> deduplicacionExtrema = EjerciciosString.DeduplicacionPalabras(fraseNula, 3);
        System.out.println("Extremo: " + deduplicacionExtrema);

        // Ejercicio 10. El Tope de Frecuencias
        System.out.println("------------------------");
        System.out.println("Ejercicio 10: ");
        //Usando el mapa 'frecuencias' del Ejercicio 7
        //El maximo de frecuencias es 1
        System.out.println("Original: " + frecuencias);
        int topeMaximo = 1;
        EjerciciosString.ElTopeDeFrecuencias(frecuencias, topeMaximo);
        System.out.println("Modificado: " + frecuencias);
        // Caso extreme
        HashMap<String, Integer> mapaExtremo10 = null;
        EjerciciosString.ElTopeDeFrecuencias(mapaExtremo10, 1);
        System.out.println("Extremo: " + mapaExtremo10);
    }
}
