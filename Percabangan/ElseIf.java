package Percabangan;
public class ElseIf {
    public static void main(String[] args) {
        int nilai = 90;
        int absen = 60;
        if(nilai >=80 && absen >=80){
            System.out.println("nilai A");
        }
        else if(nilai >=70 && absen >=70){
            System.out.println("nilai B");
        }
        else if(nilai >=60 && absen >=60){
            System.out.println("nilai C");
        }
        else if(nilai >=50 && absen >=50){
            System.out.println("nilai D");
        }
        else{
            System.out.println("Nilai E");
        }
    }
}
