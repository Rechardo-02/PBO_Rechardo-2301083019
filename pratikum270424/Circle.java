/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum270424;

/**
 *
 * @author Rechardo Abdeekusuma
 */
public class Circle extends Shape{
   private int jari;
   private static float phi = 3.14f;
   
   public Circle(){
   }
   
   public int jari(){
       return jari;
   }
   
   public void serJari(int jari){
       this.jari = jari;
   } 
   
   public String getName(){
       return("Circle");
   }
   
   public float getArea(){
       return phi*jari*jari;
   }
}
