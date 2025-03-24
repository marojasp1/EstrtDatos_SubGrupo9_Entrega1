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

        ArrayList<Integer> ListaA = new ArrayList<>(TamanioListaA);
        System.out.println("A continuacion ingrese los elementos para la lista A");

        for (int i = 0; i < TamanioListaA; i++){//Este bucle solicita el ingreso de los elementos de la listaA y numera sus posiciones
            System.out.print("Elemento N." + (i + 1) + ": ");
            int ElementoListaA = EntradaLista.nextInt();
            ListaA.add(ElementoListaA);
        }
        System.out.println("El tamanio de la lista A es: " + ListaA.size());//Aqui se devuelve el tamano anteriormente ingresado de la ListaA

        ArrayList<Integer> ListaB = new ArrayList<>(TamanioListaB);
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
        ArrayList<Integer> Lista2 = new ArrayList<Integer>();

        Scanner EntradaElementos = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.print("Ingrese el elemento N." + (i + 1) + ": ");
            int ElementoLista = EntradaElementos.nextInt();
            Lista2.add(ElementoLista);
        }

        Integer SegundoNum = EncontrarSegundoNum(Lista2);

        if (SegundoNum != null){
            System.out.println("El segundo numero mas grande es:" + SegundoNum);
        }
        else{
            System.err.println("No se encuentra ningun segundo numero mas grande en esta lista");
        }

    }

    public static Integer EncontrarSegundoNum(List<Integer>Lista2){
        List<Integer> RevisarLista = new ArrayList<>(Lista2);
        Collections.sort(RevisarLista, Collections.reverseOrder());
        
        return RevisarLista.get(1);


    }
     
 
}





        
      
                
    
/* 
  

    public void ejercicio2(){
        
        //Metodo que realiza el segundo ejercicio por medio de..
        //
        //

        ArrayList<String> luchito = new ArrayList<String>();
        luchito.add("Golazo!");
        luchito.add("del");
        luchito.add("Lucho");
        luchito.add("Brasil sucks!");
        System.out.println("El string que esta en la posicion 3 es:" + luchito.get(3));
        imprimirListaString(luchito);        
    }

    //Metodo que realiza el tercer ejercicio por medio de..
    //
    //

    public void ejercicio3(){
               
    }

    public void imprimirListaString (ArrayList<String> lista){
        System.out.println("tamanio de la lista"+lista.size());
        int i;
        for (i = 0; i < lista.size() ; i++){
            System.out.println("Elemento:"+lista.get(i));
            System.out.println("Tamanio del String"+lista.get(i).length());
        }
    }

*/
  




