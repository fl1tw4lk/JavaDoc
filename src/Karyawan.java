import java.text.NumberFormat;
import java.util.Locale;

/**
 * Mewakili seorang karyawan dan komponen-komponen gajinya.
 * Kelas ini menyimpan nama karyawan, gaji pokok, tunjangan, dan potongan,
 * serta menyediakan metode untuk menghitung gaji bersih dan menampilkan slip gaji.
 *
 * @author Zaki
 * @version 1.1
 * @since 2025-10
 */
public class Karyawan {
    private String nama;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;

    /**
     * Membuat objek Karyawan baru dengan detail yang ditentukan.
     *
     * @param nama nama dari karyawan
     * @param gajiPokok gaji pokok karyawan
     * @param tunjangan total tunjangan karyawan
     * @param potongan total potongan karyawan
     */
    public Karyawan(String nama, double gajiPokok, double tunjangan, double potongan) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
    }

    /**
     * Menghitung gaji bersih dari karyawan.
     * Rumus: (gaji pokok + tunjangan) - potongan
     *
     * @return gaji bersih yang sudah dihitung
     */
    public double hitungGajiBersih() {
        return (gajiPokok + tunjangan) - potongan;
    }

    /**
     * Mencetak slip gaji yang diformat ke konsol.
     * Menampilkan nama, komponen gaji, dan gaji bersih.
     */
    public void tampilkanSlipGaji() {
        System.out.println("\n========== SLIP GAJI ==========");
        System.out.println("Nama Karyawan    : " + nama);
        System.out.println("---------------------------------");
        System.out.println("Gaji Pokok       : Rp " + formatUang(gajiPokok));
        System.out.println("Tunjangan        : Rp " + formatUang(tunjangan));
        System.out.println("Potongan         : Rp " + formatUang(potongan));
        System.out.println("---------------------------------");
        System.out.println("Gaji Bersih      : Rp " + formatUang(hitungGajiBersih()));
        System.out.println("=================================");
    }

    private String formatUang(double jumlah) {
        NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));
        return formatter.format(jumlah);
    }
}
