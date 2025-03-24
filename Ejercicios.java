import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicios {

    //EJERCICIO 1
    public void ejercicio1(){

        //Metodo donde la consola solicita ingresar el tamano y los elementos de dos listas diferentes y encuentra los elementos en comum entre ambas listas.
             
        Scanner EntradaLista = new Scanner(System.in);//Una sola funcion scanner sera usada para ejercicio 1

        System.out.print("Ingrese el tamanio de la lista A: ");//Se pide ingresar el tamano de la listaA usando teclado     
        int TamanioListaA = EntradaLista.nextInt();

        System.out.print("Ingrese el tamanio de la lista B: ");//Se pide ingresar el tamano de la listaB usando teclado
        int TamanioListaB = EntradaLista.nextInt();

        ArrayList<Integer> ListaA = new ArrayList<>(TamanioListaA);//Funcion de inicia la ListaA de acuerdo al tamano a ingresar usando el teclado
        System.out.println("A continuacion ingrese los elementos para la lista A");

        for (int i = 0; i < TamanioListaA; i++){//Este bucle solicita el ingreso de los elementos de la listaA y numera sus posiciones
            System.out.print("Elemento N." + (i + 1) + ": ");
            int ElementoListaA = EntradaLista.nextInt();
            ListaA.add(ElementoListaA);
        }
        System.out.println("El tamanio de la lista A es: " + ListaA.size());//Aqui se devuelve el tamano anteriormente ingresado de la ListaA

        ArrayList<Integer> ListaB = new ArrayList<>(TamanioListaB);//Funcion de inicia la ListaB de acuerdo al tamano a ingresar usando el teclado
        System.out.println("A continuacion ingrese los elementos para la lista B");

        for (int i=0; i < TamanioListaB; i++){//Este bucle solicita el ingreso de los elementos de la listaB y numera sus posiciones
            System.out.print("Elemento N." + (i + 1) + ": ");
            int ElementoListaB = EntradaLista.nextInt();
            ListaB.add(ElementoListaB);
        }
        System.out.println("El tamanio de la lista B es: " + ListaB.size());//Aqui se devuelve el tamano anteriormente ingresado de la ListaB

        List<Integer> ElementosComunes = EncontrarEComunes(ListaA, ListaB);//Esta funcion instancia un metodo para crear una lista alterna con elementos comunes entre ListaA y ListaB

        System.out.println("Los elementos en comun son:" + ElementosComunes);
         
    }

    //Metodo usado para crear lista alterna que almacenara los datos en comun de ListA y ListaB
    public static List<Integer> EncontrarEComunes (ArrayList<Integer>ListaA, ArrayList<Integer>ListaB){
        ArrayList<Integer> Comunes = new ArrayList<>();
        for (Integer num: ListaA) {//Esta funcion compara los datos entre ambas listas
            if (ListaB.contains(num)){
                Comunes.add(num);//Aqui los elementos en comun son agregados a la lista alterna llamada Comunes
                System.out.println("Los elementos en comun son" + Comunes);
            }
                else{
                    System.out.println("No hay elementos en comun");
                }   
        }
    
    return Comunes;
            
    }

    //EJERCICIO 2

    public void ejercicio2(){
        ArrayList<Integer> Lista2 = new ArrayList<Integer>();//Funcion que inicia la Lista2

        Scanner EntradaElementos = new Scanner(System.in);

        for(int i = 0; i < 10; i++){//Este bucle solicita el ingreso de los 10 elementos, numerando las posiciones desde el 1 hasta el 10
            System.out.print("Ingrese el elemento N." + (i + 1) + ": ");
            int ElementoLista = EntradaElementos.nextInt();
            Lista2.add(ElementoLista);//Los elementos capturados se almacenan el la Lista2 a traves de esta funcion
        }

        Integer SegundoNum = EncontrarSegundoNum(Lista2);//Esta funcion llama el metodo EncontrarSegundoNum que se encarga de almacenar temporalmente el segundo numero mas grande

        if (SegundoNum != null){
            System.out.println("El segundo numero mas grande es:" + SegundoNum);
        }
        else{
            System.err.println("No se encuentra ningun segundo numero mas grande en esta lista");
        }

    }

    public static Integer EncontrarSegundoNum(List<Integer>Lista2){//Este metodo crea una lista alterna para buscar y almacenar el segundo numero mas grande
        List<Integer> RevisarLista = new ArrayList<>(Lista2);
        Collections.sort(RevisarLista, Collections.reverseOrder());
        
        return RevisarLista.get(1);


    }

    //EJERCICIO3

    public void ejercicio3(){

        Scanner IngresoTeclado = new Scanner(System.in);

        System.out.print("Ingrese el tamanio del Listado: ");//Se pide ingresar el tamano del Listado de palabras usando teclado     
        int TamanioListado = IngresoTeclado.nextInt();
        IngresoTeclado.nextLine();

        ArrayList<String> ListaPalabras = new ArrayList<String>(TamanioListado);
         
        System.out.println("A continuacion ingrese la lista de palabras");//Funcion de inicia la solicitud del listado usando el teclado
    
        for (int i = 0; i < TamanioListado; i++){//Este bucle solicita el ingreso de los elementos del Listado y numera sus posiciones
            System.out.print("Palabra N." + (i + 1) + ": ");
            String Palabra = IngresoTeclado.nextLine();
            ListaPalabras.add(Palabra);//Las palabras ingresadas se almacenan el la Lista de palabras a traves de esta funcion
        }
        
        PalabraMasLarga(ListaPalabras);
        EncontrarPosicion(ListaPalabras, ListaPalabras);

        List <String> PalabraMasLarga = PalabraMasLarga(ListaPalabras);
        List <Integer> Lugar = EncontrarPosicion(ListaPalabras, PalabraMasLarga);
        System.out.println("La palabra mas larga es:" + (PalabraMasLarga) + " y esta en la posicion N.: " + (Lugar));
                

    }

    public List<String> PalabraMasLarga(ArrayList<String> PalabraLarga){//Este metodo se encarga de encontrar la posicion donde la palabra mas larga se aloja

        int PosicionEncontrada;
        int PalabraMasLarga = 0;//Se inicia desde la primera posicion

        for (String str : PalabraLarga){
            PalabraMasLarga = Math.max(PalabraMasLarga, str.length());//Math se encarga de comparar el tamaño de las palabras
        }

        List<String> CadenaMasLarga = new ArrayList<>();
        for (String str : PalabraLarga) {//Aqui se recorre el contenido de la variable PalabraLarga en la variable str para determinar la palabra mas larga de la lista
            if (str.length() == PalabraMasLarga) {
                CadenaMasLarga.add(str);
            }
        }

        return CadenaMasLarga;//Resultado de la palabra mas larga
  
    }

    public static List<Integer> EncontrarPosicion (List<String> PalabraLarga, List<String> CadenaMasLarga){//Aqui se crea una lista alterna para encontrar la posicion de la palabra mas larga
        List<Integer> Lugar = new ArrayList<>();
            if (PalabraLarga != null && CadenaMasLarga != null ){
                for (String CadenaMLarga : CadenaMasLarga){
                    for (int i = 0; i < PalabraLarga.size(); i++ ){
                        if (CadenaMLarga.equals(PalabraLarga.get(i))){
                            Lugar.add(i);
                        }
                    }
                }
            }

            return Lugar;
    }    
}