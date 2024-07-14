/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum230424;

/**
 *
 * @author Rechardo Abdeekusuma
 */
public class StudentExample {
    public static void main(String[] args) {
        Person ref;
        Student Abdeekusuma = new Student();
        Abdeekusuma.setName("Abdeekusuma");
        Abdeekusuma.setAddress("Padang");
        Employee Budi = new Employee();
        Budi.setName("Budi");
        Budi.setAddress("Batusangkar");
        
        printInformation(Abdeekusuma);
        printInformation(Budi);

    }
    
    public static void printInformation(Person p){
        if(p instanceof Student){
            System.out.println("Nama Mahasiswa :"+p.getName());
            System.out.println("Alamat         :"+p.getAddress());
        }
        if(p instanceof Employee){
            System.out.println("Nama Karyawan  :"+p.getName());
            System.out.println("Alamat         :"+p.getAddress());
        }
    }
}
