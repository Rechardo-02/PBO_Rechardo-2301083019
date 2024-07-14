package pratikum020424;

import java.util.Scanner;

public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    
    // Constructor
    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    
    public Balok() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        this.panjang = scanner.nextInt();
        System.out.print("Masukkan lebar: ");
        this.lebar = scanner.nextInt();
        System.out.print("Masukkan tinggi: ");
        this.tinggi = scanner.nextInt();
    }

    Balok(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public double LuasAlas(){
        return panjang * lebar;
    }
    
   
    public double Permukaan(){
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    
    public double hitungVolume(){
        return panjang * lebar * tinggi;
    }
    
    
    public double hitungVolumeA(){
        return LuasAlas() * tinggi;
    }
    
    public static void main(String[] args) {
       
        Balok balok1 = new Balok(5, 4, 3);
        System.out.println("Luas Alas: " + balok1.LuasAlas());
        System.out.println("Luas Permukaan: " + balok1.Permukaan());
        System.out.println("Volume (rumus panjang * lebar * tinggi): " + balok1.hitungVolume());
        System.out.println("Volume (rumus Luas Alas * tinggi): " + balok1.hitungVolumeA());
        
       
        Balok balok2 = new Balok();
        System.out.println("Luas Alas: " + balok2.LuasAlas());
        System.out.println("Luas Permukaan: " + balok2.Permukaan());
        System.out.println("Volume (rumus panjang * lebar * tinggi): " + balok2.hitungVolume());
        System.out.println("Volume (rumus Luas Alas * tinggi): " + balok2.hitungVolumeA());
    }

    void setPanjang(int p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setLebar(int l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setTinggi(int t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int hitungLA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void printBalok() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
