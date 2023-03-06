package Main;
import java.util.Scanner;
 
public class Operator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Volume balok
        int panjang, lebar, tinggi, hasil;
        System.out.println("Program Menghitung Volume Balok");
        System.out.println("=============================");
 
        // logic
        System.out.print("Masukan Panjang Balok: ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar balok: ");
        lebar = input.nextInt();
        System.out.print("Masukan Tinggi Balok: ");
        tinggi = input.nextInt();
 
        // hitung volume balok;
        hasil = panjang * lebar * tinggi;
 
        System.out.println("Volume Balok tersebut adalah: " + hasil);

        //Luas Lingkaran
        //Deklarasi variabel
       double luas, phi=3.14;
       int r;

       //Input nilai jari-jari
       System.out.print("Masukan Jari-jari : ");
       r=input.nextInt();

       //Menghitung luas lingkaran
       luas=phi*r*r;

       //Tampilkan hasil
       System.out.println("Luas Lingkaran = "+luas);
 
 
    }
}