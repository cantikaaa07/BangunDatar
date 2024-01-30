
package belajar_inheritance;
import java.util.Scanner;


public class Belajar_inheritance {

  
    public static void main(String[] args) {
        Scanner Scanner =new Scanner (System.in);
        bangunDatar bangunDatar = new bangunDatar();
        
            Persegi persegi = new Persegi();
            System.out.println("masukkan sisi");
            persegi.sisi = Scanner.nextFloat();
            
            Lingkaran Lingkaran = new Lingkaran ();
            System.out.println("masukkan r");
            Lingkaran.r = Scanner.nextFloat();
            
            persegiPanjang persegiPanjang = new persegiPanjang();
            System.out.println("masukkan panjang");
            persegiPanjang.panjang = Scanner.nextFloat();
            System.out.println("masukkan lebar");
            persegiPanjang.lebar = Scanner.nextFloat();
            
            Segitiga Segitiga = new Segitiga ();
            System.out.println("masukkan alas");
            Segitiga.alas = Scanner.nextFloat();
            System.out.println("masukkan tinggi");
            Segitiga.tinggi = Scanner.nextFloat();
            
            bangunDatar.luas();
            bangunDatar.keliling();
            
            persegi.luas();
            persegi.keliling();
            
            Lingkaran.luas ();
            Lingkaran.keliling();
            
            persegiPanjang.luas();
            persegiPanjang.keliling();
            
            Segitiga.luas();
            Segitiga.keliling();

    }
    
}
