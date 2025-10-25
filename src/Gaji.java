import java.util.Scanner;

/**
 * Kelas utama untuk Aplikasi Perhitungan Gaji.
 * Kelas ini menangani interaksi dengan pengguna, mengambil input untuk detail karyawan,
 * membuat objek Karyawan, dan menampilkan slip gaji yang dihasilkan.
 *
 * @author Zaki
 */
public class Gaji {
    /**
     * Titik awal eksekusi aplikasi.
     * Mengambil input dari pengguna dan menampilkan slip gaji karyawan.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Aplikasi Perhitungan Gaji Karyawan ---");

        String nama = inputNama(scanner, "Masukkan Nama Karyawan: ");

        double gajiPokok = inputAngka(scanner, "Masukkan Gaji Pokok: ");
        double tunjangan = inputAngka(scanner, "Masukkan Tunjangan: ");
        double potongan  = inputAngka(scanner, "Masukkan Potongan (misal: BPJS, angsuran, dll): ");

        Karyawan karyawan1 = new Karyawan(nama, gajiPokok, tunjangan, potongan);
        karyawan1.tampilkanSlipGaji();

        scanner.close();
    }
    /**
     * Meminta input angka dari pengguna dan memvalidasi agar tidak crash.
     *
     * @param scanner objek {@link Scanner} untuk membaca input dari pengguna
     * @param pesan pesan yang ditampilkan sebelum pengguna memasukkan angka
     * @return nilai numerik yang dimasukkan oleh pengguna
     */
    public static double inputAngka(Scanner scanner, String pesan) {
        while (true) {
            System.out.print(pesan);
            try {
                double angka = scanner.nextDouble();
                scanner.nextLine(); // buang newline setelah input angka
                return angka;
            } catch (java.util.InputMismatchException e) {
                System.out.println("❌ Input tidak valid! Harus berupa angka. Coba lagi.\n");
                scanner.nextLine(); // hapus input yang salah
            }
        }
    }
    /**
     * Meminta input nama dari pengguna dan memastikan tidak mengandung angka atau simbol.
     *
     * @param scanner objek {@link Scanner} untuk membaca input dari pengguna
     * @param pesan pesan yang ditampilkan sebelum pengguna memasukkan nama
     * @return nama yang valid (hanya huruf dan spasi)
     */
    public static String inputNama(Scanner scanner, String pesan) {
        while (true) {
            System.out.print(pesan);
            String input = scanner.nextLine().trim();

            // Regex: hanya huruf (a–z, A–Z), spasi, dan huruf dengan aksen (seperti é, ñ, dll)
            if (input.matches("^[a-zA-Z\\s]+$")) {
                return input;
            } else {
                System.out.println("❌ Nama tidak valid! Nama hanya boleh mengandung huruf Coba lagi.\n");
            }
        }
    }
}