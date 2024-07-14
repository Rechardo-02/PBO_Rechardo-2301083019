/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum230424;

/**
 *
 * @author Rechardo Abdeekusuma
 */
public class Student extends Person {
    public Student(){
        super();
        //super("Rechardo", "Padang");
        super.name = "Rechardo";
        super.address = "Padang";
        System.out.println("Inside Student Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
}
