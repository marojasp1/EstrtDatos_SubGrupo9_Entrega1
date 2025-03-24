import java.util.ArrayList; // Importar la clase ArrayList para manejar listas dinámicas
import java.util.HashSet; // Importar la clase HashSet para almacenar elementos únicos
import java.util.Scanner; // Importar la clase Scanner para la entrada de datos

public class Ejercicios {

    // Método para realizar el primer ejercicio: Intersección de dos arreglos
    public void ejercicio1() {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        
        // Solicitar el tamaño del arreglo A
        System.out.print("Ingrese el tamaño del arreglo A: ");
        int tamanoA = scanner.nextInt(); // Leer el tamaño del arreglo A
        ArrayList<Integer> arregloA = new ArrayList<>(); // Crear una lista para almacenar los elementos del arreglo A

        // Leer los elementos del arreglo A
        System.out.println("Ingrese los elementos del arreglo A:");
        for (int i = 0; i < tamanoA; i++) {
            arregloA.add(scanner.nextInt()); // Agregar cada elemento ingresado a la lista arregloA
        }

        // Solicitar el tamaño del arreglo B
        System.out.print("Ingrese el tamaño del arreglo B: ");
        int tamanoB = scanner.nextInt(); // Leer el tamaño del arreglo B
        ArrayList<Integer> arregloB = new ArrayList<>(); // Crear una lista para almacenar los elementos del arreglo B

        // Leer los elementos del arreglo B
        System.out.println("Ingrese los elementos del arreglo B:");
        for (int i = 0; i < tamanoB; i++) {
            arregloB.add(scanner.nextInt()); // Agregar cada elemento ingresado a la lista arregloB
        }

        // Calcular la intersección utilizando un HashSet
        HashSet<Integer> interseccion = new HashSet<>(arregloA); // Crear un HashSet a partir de arregloA
        interseccion.retainAll(arregloB); // Retener solo los elementos que están en ambos conjuntos (intersección)

        // Mostrar resultados
        if (!interseccion.isEmpty()) { // Verificar si la intersección no está vacía
            System.out.println("La intersección de los arreglos es: " + interseccion); // Imprimir la intersección
        } else {
            System.out.println("No hay intersección entre los dos arreglos."); // Mensaje si no hay intersección
        }
    }

    // Método para realizar el segundo ejercicio: Encontrar el segundo número más grande
    public void ejercicio2() {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        ArrayList<Integer> numeros = new ArrayList<>(); // Crear una lista para almacenar números

        // Leer 10 números
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros.add(scanner.nextInt()); // Agregar cada número ingresado a la lista numeros
        }

        // Encontrar el segundo número más grande
        HashSet<Integer> numerosUnicos = new HashSet<>(numeros); // Eliminar duplicados utilizando HashSet
        ArrayList<Integer> listaNumerosUnicos = new ArrayList<>(numerosUnicos); // Convertir el HashSet de nuevo a ArrayList
        listaNumerosUnicos.sort((a, b) -> b - a); // Ordenar la lista de mayor a menor

        // Verificar si hay al menos dos números distintos
        if (listaNumerosUnicos.size() < 2) { // Si hay menos de dos elementos únicos
            System.out.println("No hay suficientes números distintos para determinar el segundo más grande."); // Mensaje de error
        } else {
            System.out.println("El segundo número más grande es: " + listaNumerosUnicos.get(1)); // Imprimir el segundo número más grande
        }
    }

    // Método para realizar el tercer ejercicio: Encontrar la cadena más larga
    public void ejercicio3() {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        // Solicitar el tamaño del arreglo de cadenas
        System.out.print("Ingrese el tamaño del arreglo de cadenas: ");
        int tamano = scanner.nextInt(); // Leer el tamaño del arreglo de cadenas
        scanner.nextLine(); // Consumir el salto de línea restante
        ArrayList<String> cadenas = new ArrayList<>(); // Crear una lista para almacenar cadenas

        // Leer las cadenas
        System.out.println("Ingrese las cadenas:");
        for (int i = 0; i < tamano; i++) {
            cadenas.add(scanner.nextLine()); // Agregar cada cadena ingresada a la lista cadenas
        }

        // Encontrar la cadena más larga
        String cadenaLarga = ""; // Inicializar la variable para la cadena más larga
        int indice = -1; // Inicializar el índice de la cadena más larga

        // Recorrer la lista de cadenas para encontrar la más larga
        for (int i = 0; i < cadenas.size(); i++) {
            if (cadenas.get(i).length() > cadenaLarga.length()) { // Si la longitud de la cadena actual es mayor que la más larga
                cadenaLarga = cadenas.get(i); // Actualizar la cadena más larga
                indice = i; // Guardar el índice de la cadena más larga
            }
        }

        // Mostrar resultados
        System.out.println("La cadena más larga es: '" + cadenaLarga + "' en el índice " + indice + "."); // Imprimir la cadena más larga y su índice
    }

    // Método para imprimir una lista de cadenas
    public void imprimirListaString(ArrayList<String> lista) {
        System.out.println("Tamaño de la lista: " + lista.size()); // Imprimir el tamaño de la lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento: " + lista.get(i)); // Imprimir cada elemento de la lista
            System.out.println("Tamaño del String: " + lista.get(i).length()); // Imprimir el tamaño de cada cadena
        }
    }

    // Método principal para ejecutar los ejercicios
    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios(); // Crear una instancia de la clase Ejercicios
        
        // Ejecutar el primer ejercicio
        ejercicios.ejercicio1(); 
        
        // Ejecutar el segundo ejercicio
        ejercicios.ejercicio2(); 
        
        // Ejecutar el tercer ejercicio
        ejercicios.ejercicio3(); 
    }
}
