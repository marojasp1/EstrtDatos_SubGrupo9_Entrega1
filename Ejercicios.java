import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicios {


    public void ejercicio1(){
/**
     * Metodo que realiza el primer ejercicio.
     *
     * Este metodo lee dos arreglos de enteros desde la entrada del usuario,
     * encuentra la intersección de los dos arreglos y la imprime.
     */
        Scanner scanner = new Scanner(System.in);

        // Leer y validar el tamaño de los arreglos
        System.out.print("Ingrese el tamaño de los arreglos: ");
        int size = readValidInteger(scanner);

        // Leer y validar los elementos del primer arreglo
        int[] a = new int[size];
        System.out.println("Ingrese los elementos para el primer arreglo:");
        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " (restantes: " + (size - i - 1) + "): ");
            a[i] = readValidInteger(scanner);
        }

        // Leer y validar los elementos del segundo arreglo
        int[] b = new int[size];
        System.out.println("Ingrese los elementos para el segundo arreglo:");
        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " (restantes: " + (size - i - 1) + "): ");
            b[i] = readValidInteger(scanner);
        }

        // Encontrar la intersección de los dos arreglos
        ArrayList<Integer> intersection = findIntersection(a, b);

        // Imprimir el resultado
        if (intersection.isEmpty()) {
            System.out.println("No se encontró intersección.");
        } else {
            System.out.println("La intersección de los arreglos " + Arrays.toString(a) + " y " + Arrays.toString(b) + " es: " + intersection);
        }
    }


    public void ejercicio2(){
       /**
            * Metodo que realiza el segundo ejercicio.
            *
            * Este metodo lee 10 números enteros desde la entrada del usuario,
            * encuentra el segundo número más grande y lo imprime.
            */
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int[] numbers = new int[size];

        // Leer y validar los elementos del arreglo
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " (restantes: " + (size - i - 1) + "): ");
            numbers[i] = readValidInteger(scanner);
        }

        // Encontrar el segundo número más grande
        int secondLargest = findSecondLargest(numbers);

        // Imprimir el resultado
        System.out.println("El segundo número más grande del arreglo es: " + secondLargest);
    }

    public void ejercicio3(){
        /**
             * Metodo que realiza el tercer ejercicio por medio de...
             *
             * Este metodo lee un arreglo de Strings desde la entrada del usuario,
             * encuentra la cadena mas larga y la imprime junto con su indice.
             */

        Scanner scanner = new Scanner(System.in);

        // Leer y validar el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo de Strings: ");
        int size = readValidInteger(scanner);

        // Leer y validar los elementos del arreglo
        String[] strings = new String[size];
        System.out.println("Ingrese los Strings:");
        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese el String " + (i + 1) + " (restantes: " + (size - i - 1) + "): ");
            strings[i] = scanner.next();
        }

        // Verificar si los arreglos son iguales
        if (areAllStringsSameLength(strings)) {
            System.out.println("La longitud de los arreglos es igual.");
        } else {
            // Encontrar la cadena más larga
            int longestIndex = findLongestStringIndex(strings);

            // Imprimir el resultado
            System.out.println("La cadena más larga es: \"" + strings[longestIndex] + "\" en el índice " + longestIndex);
        }
    }

    public void imprimirListaString (ArrayList<String> lista){
        System.out.println("tamanio de la lista"+lista.size());
        int i;
        for (i = 0; i < lista.size() ; i++){
            System.out.println("Elemento:"+lista.get(i));
            System.out.println("Tamanio del String"+lista.get(i).length());
        }
    }

    public int readValidInteger(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Por favor, ingrese un número entero: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public int findSecondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public ArrayList<Integer> findIntersection(int[] a, int[] b) {
        HashSet<Integer> setA = new HashSet<>();
        for (int num : a) {
            setA.add(num);
        }

        ArrayList<Integer> intersection = new ArrayList<>();
        for (int num : b) {
            if (setA.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection;
    }

    public int findLongestStringIndex(String[] strings) {
        int longestIndex = 0;
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > strings[longestIndex].length()) {
                longestIndex = i;
            }
        }
        return longestIndex;
    }

    public boolean areAllStringsSameLength(String[] strings) {
        if (strings.length == 0) {
            return true; // Consideramos que un arreglo vacío tiene todos sus elementos iguales
        }

        int length = strings[0].length();
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() != length) {
                return false;
            }
        }
        return true;
    }


}