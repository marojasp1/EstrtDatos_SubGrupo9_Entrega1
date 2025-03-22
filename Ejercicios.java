import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicios {
    
    private Scanner scanner = new Scanner(System.in); // Usamos un único Scanner para todo el programa

    // ======================= EJERCICIO 1 =======================
    public void ejercicio1() {
        // Se solicita el tamaño del primer arreglo
        int n = leerTamaño("Ingrese el tamaño del primer arreglo: ");
        Arreglo arregloA = new Arreglo(n);

        // Se solicita el tamaño del segundo arreglo
        int m = leerTamaño("Ingrese el tamaño del segundo arreglo: ");
        Arreglo arregloB = new Arreglo(m);

        // Se calcula la intersección de los arreglos
        Set<Integer> interseccion = CalculadoraInterseccion.obtenerInterseccion(arregloA.getElementos(), arregloB.getElementos());

        // Se muestra el resultado
        if (interseccion.isEmpty()) {
            System.out.println("No hay elementos en común entre los arreglos.");
        } else {
            System.out.println("Intersección de los arreglos: " + interseccion);
        }
    }

    // Método que solicita al usuario un tamaño de arreglo
    private int leerTamaño(String mensaje) {
        int tamaño;
        while (true) {
            try {
                System.out.print(mensaje);
                tamaño = Integer.parseInt(scanner.nextLine());
                if (tamaño > 0) {
                    break;
                } else {
                    System.out.println("El tamaño debe ser un número entero positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número entero válido.");
            }
        }
        return tamaño;
    }

    // Clase que representa un arreglo de enteros
    class Arreglo {
        private int[] elementos;

        public Arreglo(int tamaño) {
            this.elementos = new int[tamaño];
            leerElementos();
        }

        private void leerElementos() {
            System.out.println("Ingrese los elementos del arreglo:");
            for (int i = 0; i < elementos.length; i++) {
                while (true) {
                    try {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        elementos[i] = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida. Ingrese un número entero.");
                    }
                }
            }
        }

        public int[] getElementos() {
            return elementos;
        }
    }

    // Clase para calcular la intersección entre dos arreglos
    static class CalculadoraInterseccion {
        public static Set<Integer> obtenerInterseccion(int[] a, int[] b) {
            Set<Integer> setA = new HashSet<>();
            Set<Integer> interseccion = new HashSet<>();

            for (int num : a) {
                setA.add(num);
            }

            for (int num : b) {
                if (setA.contains(num)) {
                    interseccion.add(num);
                }
            }

            return interseccion;
        }
    }

    // ======================= EJERCICIO 2 =======================
    public void ejercicio2() {
        int[] numeros = new int[10];

        // Leer los 10 números desde la consola
        System.out.println("\nIngrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Ingrese un número entero.");
                }
            }
        }

        // Encontrar el segundo número más grande
        int segundoMayor = calcularSegundoMayor(numeros);
        System.out.println("El segundo número más grande es: " + segundoMayor);
    }

    // Método para encontrar el segundo número más grande en un arreglo
    private int calcularSegundoMayor(int[] arr) {
        Arrays.sort(arr);
        int mayor = arr[arr.length - 1];
        int segundoMayor = Integer.MIN_VALUE;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < mayor) {
                segundoMayor = arr[i];
                break;
            }
        }

        return segundoMayor;
    }

    // ======================= EJERCICIO 3 =======================
    public void ejercicio3() {
        int tamaño = leerTamaño("Ingrese el tamaño del arreglo de palabras: ");
        String[] palabras = new String[tamaño];

        // Leer las palabras del usuario
        System.out.println("\nIngrese " + tamaño + " palabras o frases:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
        }

        // Buscar la palabra más larga y su índice
        int indiceMasLargo = 0;
        int longitudMaxima = palabras[0].length();

        for (int i = 1; i < palabras.length; i++) {
            if (palabras[i].length() > longitudMaxima) {
                longitudMaxima = palabras[i].length();
                indiceMasLargo = i;
            }
        }

        // Mostrar el resultado
        System.out.println("\nLa palabra más larga es: \"" + palabras[indiceMasLargo] + "\"");
        System.out.println("Se encuentra en la posición: " + indiceMasLargo);
    }

    // ======================= MÉTODO PRINCIPAL =======================
    public static void main(String[] args) {
        Ejercicios programa = new Ejercicios();

        programa.ejercicio1();
        programa.ejercicio2();
        programa.ejercicio3();

        programa.scanner.close(); // Cerramos Scanner al final del programa
    }
}
