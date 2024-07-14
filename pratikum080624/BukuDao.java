/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum080624;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rechardo Abdeekusuma
 */
public class BukuDao {
    private List<Buku> data = new ArrayList();
    
   public BukuDao() {
        data.add(new Buku("A001", "Cerita rakyat nusantara", "Tim Erlangga for kids", "Erlangga", 2023));
        data.add(new Buku("B002", "Kisah pembentukan karakter", "Bhuana", "Gramedia Widiasarana Indonesia", 2019));
    }
    public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    public List<Buku> getAll(){
        return data;
    } 
}
