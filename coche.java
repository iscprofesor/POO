import java.io.*;
class Coche
  {
  
   // Atributos
   String color;
   String marca;
   int km;
  
   // Método
   public static void main(String[] args)
    {
     Coche coche1 = new Coche();
     coche1.color = "Rojo";
     coche1.marca = "Mitsubishi";
     coche1.km = 0;
     System.out.println("El color del coche es: "+coche1.color);
     System.out.println("La marca del coche es: "+coche1.marca);
     System.out.println("El km del coche es: "+coche1.km);
    }
  }
