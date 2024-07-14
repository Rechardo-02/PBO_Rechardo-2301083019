
package pratikum260324;

public class studentRecordExample {
    public static void main(String[] args){
        StudentRecord ref;
        Student chardo = new Student();
        chardo.setName("chardo");
//        chardo.setAge(20);
        chardo.setAddres("Padang");
//        chardo.setMathGrade(90);
//        chardo.setEnglishGrade(80);
//        chardo.setScienceGrade(85);
        
        Employee Dedy = new Employee();
        Dedy.setName("Dedy");
//       chardo.setAge(20);
        Dedy.setAddres("batusangkar");
//        chardo.setMathGrade(90);
//        chardo.setEnglishGrade(80);
//        chardo.setScienceGrade(85);
        
        printInformation(chardo);
        printInformation(Dedy);
//        System.out.println("Nama             :"+chardo.getName());
//        System.out.println("Umur             :"+chardo.getAge());
//        System.out.println("Alamat           :"+chardo.getAddress());
//        System.out.println("Nilai Mtk        :"+chardo.getMathGrade());
//        System.out.println("Nilai B.inggris  :"+chardo.getEnglishGrade());
//        System.out.println("Nilai Ipa        :"+chardo.getScienceGrade());
//        System.out.println("Rata-rata        :"+chardo.getAverage());
        //menampilkan jumlah siswa
//        System.out.println("Banyak siswa     :"+StudentRecord.getStudentCount());
//        //contoh pemanggilan methos overload
//        System.out.println("==================");
//        student1.print(student1.getName());
//        System.out.println("==================");
//        student1.print(student1.getEnglishGrade(), student1.getMathGrade(), student1.getScienceGrade());
//        
//        StudentRecord annaRecord = new StudentRecord("anna");
//        StudentRecord aliRecord = new StudentRecord("ali","Padang");
//        StudentRecord akbarRecord = new StudentRecord(90,80,70);
//        
//        System.out.println("==================");
//        annaRecord.print(annaRecord.getName());
//        System.out.println("==================");
//        aliRecord.print(aliRecord.getName());
//        System.out.println("==================");
//        DedyRecord.print(DedyRecord.getEnglishGrade(), DedyRecord.getMathGrade(), DedyRecord.getScienceGrade());
//        
//        System.out.println("Banyak Siswa    :"+StudentRecord.getStudentCount());
    }
    
    public static void printInformation(StudentRecord p){
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
