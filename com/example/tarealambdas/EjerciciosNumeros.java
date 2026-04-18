package com.example.tarealambdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class EjerciciosNumeros {
    public static void ElMultiplicador(ArrayList<Integer> Numeros, int factor) {
        if (Numeros != null) {
            Numeros.replaceAll(n -> n * factor);
        }
    }

    public static HashSet<Integer> CuadradosUnicos(ArrayList<Integer> numeros) {
        if (numeros != null) {
            return numeros.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * n)
                    .collect(Collectors.toCollection(HashSet::new));
        }
        return null;
    }

    public static void ModificadorInventario(HashMap<String, Double> inventario) {
        if (inventario != null) {
            inventario.forEach((producto, precio) -> {
                double precioConDescuento = precio * 0.90;
                System.out.println("Producto: " + producto + " | Precio Original: $" + precio + " | Con 10%: $" + precioConDescuento);
            });
        }
    }
}