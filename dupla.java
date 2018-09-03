import java.util.*;

public class dupla
{
  static Scanner teclado = new Scanner (System.in);
  
  private static int a;
  private static int b;
  
  public dupla()
  {
    this.a = 12; 
    this.b = 32; 
  }

    
  public void guardar (int a2, int b2)
  {
      this.a = a2;
      this.b = b2; 
      
    }
    
    public void cambiarNumero1(int x)
    {
        this.a = x;
    }
    
    public void cambiarNumero2(int y)
    {
        this.b = y;
    }
    
  public void lee ()
  {
      System.out.println("Ingrese el primer par: "); 
      int x = teclado.nextInt(); 
      System.out.println("Ingrese segundo par: " ); 
      int y = teclado.nextInt(); 
      
      cambiarNumero1(x); 
      cambiarNumero2(y);
  }
  
  public void mostrar ()
  {
      System.out.println(this.a + " , " + this.b);
    }
    
  public static void main (String [] args){
      dupla primerPar = new dupla();
      int opcion = 0; 
      do { 
          System.out.println("1. MOSTRAR DUPLA."); 
          System.out.println("2. CAMBIAR DUPLA.");
          System.out.println("3. SALIR.");
          opcion = teclado.nextInt(); 
          System.out.println();
       
      switch (opcion)
      {
          case 1: 
          primerPar.mostrar();
          System.out.println();
          
          break;
          
          case 2: 
          primerPar.lee(); 
          System.out.println();
          
          break;
          
          case 3:
          System.out.println("GRACIAS!");
          System.out.println();
          
          break;
      }  
     }while (opcion != 3);
  }
}