package pbo1.nim10118017;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : User memasukkan nilai kemudian hasil operasi aritmatikanya ditampilkan di layar.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instansiasi objek
        Kalkulator kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        DecimalFormatSymbols formatSymbols = DecimalFormatSymbols.getInstance();
        DecimalFormat decimalFormat = new DecimalFormat();
        
        //Proses persiapan untuk memformat desimal
        formatSymbols.setDecimalSeparator(',');
        decimalFormat.setDecimalFormatSymbols(formatSymbols);
        decimalFormat.setMaximumFractionDigits(2);
        
        //User memasukkan nilainya
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scanner.nextDouble();
        
        //Menampilkan hasil
        System.out.println("\nHasil Pertambahan : " + kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + decimalFormat.format(kalkulator.bagiBilangan()));
        System.out.println("Hasil Sisa : " + kalkulator.sisaBilangan());
        System.out.println("\nDeveloped by : Agung Nurhamidan");
    }
    
}
