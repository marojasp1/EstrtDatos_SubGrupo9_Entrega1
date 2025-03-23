import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicios {


    public void ejercicio1(){

        //Metodo que realiza el primer ejercicio por medio de la entrada usando el teclado de 
        //
        //

        //int TamanioLista1 , ElementosLista1;

        Scanner EntradaLista = new Scanner(System.in);
        System.out.print("Ingrese el tamanio de la lista A: ");     
        int TamanioListaA = EntradaLista.nextInt();

        System.out.print("Ingrese el tamanio de la lista B: ");
        int TamanioListaB = EntradaLista.nextInt();

        ArrayList<Integer> ListaA = new ArrayList<>(TamanioListaA);
        System.out.println("A continuacion ingrese los elementos para la lista A");

        for (int i = 0; i < TamanioListaA; i++){
            System.out.print("Elemento N." + (i + 1) + ": ");
            int ElementoListaA = EntradaLista.nextInt();
            ListaA.add(ElementoListaA);
        }
        System.out.println("El tamanio de la lista A es: " + ListaA.size());

        ArrayList<Integer> ListaB = new ArrayList<>(TamanioListaB);
        System.out.println("A continuacion ingrese los elementos para la lista B");

        for (int i=0; i < TamanioListaB; i++){
            System.out.print("Elemento N." + (i + 1) + ": ");
            int ElementoListaB = EntradaLista.nextInt();
            ListaB.add(ElementoListaB);
        }
        System.out.println("El tamanio de la lista B es: " + ListaB.size());



        ArrayList<Integer> ElementosComunes = EncontrarEComunes(ListaA, ListaB);

        System.out.println("Los elementos en comun son:" + ElementosComunes);
         
    }
                
}

private ArrayList<Integer> EncontrarEComunes (ArrayList<Integer>ListaA, ArrayList<Integer>ListaB){
    ArrayList<Integer> Comunes = new ArrayList<>();
    for (Integer num: ListaA) {
    if (ListaB.contains(num)){
        Comunes.add(num);
    }
    else{
        System.out.println("No hay elementos en comun");
    }
}

return Comunes;     
 
}





        
      
                
    

  

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

  




