/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum260324;

/**
 *
 * @author Rechardo Abdeekusuma
 */
public class Student extends StudentRecord{
    public Student(){
        super();
        super.name = "Dedy";
        super.address = "Batusangkar";
//        super.age = "25";
//        super.mathGrade = "75";
//        super.englishGrade = "85";
//        super.scienceGrade = "95";
//        super.average = "90";
        System.out.println("Student Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
}