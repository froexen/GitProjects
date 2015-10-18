import java.util.Scanner //Esta línea siempre va si se piensa usar el método Scanner

public class Example{ //Aquí se está declarando la clase. Debe llevar el mismo nombre del archivo de la clase

//En el main, es donde se hará todo (funciones, operaciones, etc...)

public void mostrarDatos(){ //Función básica que mostrará una línea de texto
  
  System.out.println("Hola mundo");
  
}
  
  public static void main(String[] args){ //Es la clase main/principal. Sin ésta, el programa no corre
    
    Example ss = new Example(); //Se creó un objeto (ss) para llamar a la función mostrarDatos(); Mostrará lo que tiene.
    
    ss.mostrarDatos(); //Se pega el objeto ss a la función mostrarDatos para que la llame y muestre
    
  } //Llave que cierra el main
  
}//Llave que cierra la clase

