package kalkulator_ccdp;

import java.util.Scanner;
/**
 * Kelas Kalkulator untuk operasi dasar seperti penjumlahan,
 * pengurangan, perkalian, dan pembagian.
 * 
 * @author Nurul
 * @since 2024
 */
public class Kalkulator_ccdp {

    /**
     * Penjumlahan dua bilangan.
     *
     * @param bilangan1 bilangan pertama untuk ditambahkan
     * @param bilangan2 bilangan kedua untuk ditambahkan
     * @return hasil penjumlahan bilangan1 dan bilangan2
     */
    private static int operasiTambah(int bilangan1, int bilangan2) {
        return bilangan1 + bilangan2;
    }

    /**
     * Pengurangan dua bilangan bulat
     *
     * @param bilangan1 bilangan pertama
     * @param bilangan2 bilangan yang akan dikurangkan dari bilangan pertama
     * @return hasil pengurangan bilangan1 dengan bilangan2
     */
    private static int operasiKurang(int bilangan1, int bilangan2) {
        return bilangan1 - bilangan2;
    }

    /**
     * Pengkalian dua bilangan.
     *
     * @param bilangan1 bilangan pertama untuk dikalikan
     * @param bilangan2 bilangan kedua untuk dikalikan
     * @return hasil perkalian bilangan1 dan bilangan2
     */
    private static int operasiKali(int bilangan1, int bilangan2) {
        return bilangan1 * bilangan2;
    }

    /**
     * Pembagian dua bilangan.
     *
     * @param bilangan1 bilangan yang akan dibagi
     * @param bilangan2 bilangan pembagi
     * @return hasil pembagian bilangan1 dengan bilangan2
     * @throws ArithmeticException jika bilangan2 adalah 0
     */
    private static int operasiBagi(int bilangan1, int bilangan2) {
        if (bilangan2 == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol");
        }
        return bilangan1 / bilangan2;
    }
    /**
    * Metode utama untuk menjalankan program kalkulator sederhana.
    * Meminta pengguna untuk memasukkan dua bilangan dan memilih operasi.
    * Kemudian, mencetak hasil perhitungan.
    *
    * @param args argumen baris perintah (tidak digunakan dalam program ini)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ambil input bilangan pertama
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();
        
        // Ambil input bilangan kedua
        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();
        
        // Ambil input operasi
        System.out.print("Pilih operasi (+, -, *, /): ");
        char operasi = scanner.next().charAt(0);

        int hasil;
        try {
            switch (operasi) {
                case '+':
                    hasil = operasiTambah(bilangan1, bilangan2);
                    break;
                case '-':
                    hasil = operasiKurang(bilangan1, bilangan2);
                    break;
                case '*':
                    hasil = operasiKali(bilangan1, bilangan2);
                    break;
                case '/':
                    hasil = operasiBagi(bilangan1, bilangan2);
                    break;
                default:
                    System.out.println("Operasi tidak valid");
                    return;
            }
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }

        scanner.close();
    }
}
