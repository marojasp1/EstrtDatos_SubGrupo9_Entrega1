import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios {


    public void ejercicio1(){

        //Metodo que realiza el primer ejercicio por medio de la entrada usando el teclado de 
        //
        //

        //int TamanioLista1 , ElementosLista1;

        Scanner EntradaLista1 = new Scanner(System.in);
        System.out.print("Ingrese el tamanio de la lista 1: ");
        
        int TamanioLista1 = EntradaLista1.nextInt();

        ArrayList<Integer> Lista1 = new ArrayList<>(TamanioLista1);
        System.out.println("A continuacion ingrese los elementos para la lista 1");

        for (int i = 0; i < TamanioLista1; i++){
            System.out.print("Elemento N." + (i + 1) + ": ");
            int ElementoLista1 = EntradaLista1.nextInt();
            Lista1.add(ElementoLista1);
        }
        System.out.println("El tamanio de la lista 1 es: " + Lista1.size());

    }

}




    /*    
        lista.add(3);
        lista.add(4);
        for (int i=0 ; i<3 ; i++){
            lista.add(i * 2); //Agrego tres elementos mas a la lista
        }
        if(lista.contains(6)){
            System.out.println("La lista contiene el numero 6");
        }
        else{
            System.out.println("NO esta el numero 6");
        }
    */
        
      
                
    

  
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




