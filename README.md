# 💰 Aplikasi Perhitungan Gaji Karyawan Sederhana

[![Java Version](https://img.shields.io/badge/Java-21-orange)](https://www.oracle.com/java/) 
[![License](https://img.shields.io/badge/License-MIT-green)](LICENSE)
[![Build](https://img.shields.io/badge/Build-Pass-brightgreen)](#)
[![Status](https://img.shields.io/badge/Status-Active-brightgreen)](#)
[![Documentation](https://img.shields.io/badge/Docs-JavaDoc-blue)](#)

> 🚀 Proyek **Java Console App** ini menghitung *gaji karyawan* secara otomatis, menampilkan slip gaji dengan format profesional, serta dilengkapi dokumentasi **Javadoc** lengkap.  
> Cocok untuk latihan clean code, portofolio, dan pembelajaran dokumentasi profesional.

---

## 📝 Deskripsi

Aplikasi ini untuk menghitung **gaji bersih karyawan** dengan memperhitungkan:

- 💵 Gaji Pokok  
- 🎁 Tunjangan  
- ⚙️ Potongan (BPJS, pinjaman, pajak, dll)

Selain itu, seluruh kode dilengkapi **Javadoc** agar mudah dipahami dan dikembangkan oleh developer lain.

---

## ⚡ Fitur Utama

✅ **Validasi Input Pintar**  
- Nama hanya boleh berisi huruf  
- Gaji, tunjangan, dan potongan harus berupa angka  

🧾 **Slip Gaji Otomatis & Terformat**  
- Format Rupiah  
- Output rapih dan mudah dibaca di terminal  

📘 **Dokumentasi Javadoc Profesional**  
- Semua kelas & metode terdokumentasi  
- Dapat diakses melalui HTML interaktif  

🧩 **Struktur Folder Rapi & Clean Code**  
- Mudah dibaca dan dipelihara  
- Cocok untuk latihan & showcase GitHub  

---

## 🗂 Struktur Folder

```text
JavaDoc/
│
├─ src/
│  ├─ Gaji.java         # Kelas utama aplikasi
│  ├─ Karyawan.java     # Kelas model karyawan
│
├─ doc/                 # Dokumentasi Javadoc (hasil generate)
├─ lib/                 # Library tambahan (jika ada)
├─ README.md
```

---

## 🚀 Cara Menjalankan

### 1️⃣ Kompilasi Kode
```bash
javac -d out src/*.java
```

### 2️⃣ Jalankan Aplikasi
```bash
java -cp out Gaji
```

---

## 💬 Contoh Interaksi

```
--- Aplikasi Perhitungan Gaji Karyawan ---
Masukkan Nama Karyawan: Zaki
Masukkan Gaji Pokok: 5000000
Masukkan Tunjangan: 1500000
Masukkan Potongan (misal: BPJS, angsuran, dll):: 500000

========== SLIP GAJI ==========
Nama Karyawan    : Zaki
---------------------------------
Gaji Pokok       : Rp 5.000.000
Tunjangan        : Rp 1.500.000
Potongan         : Rp 500.000
---------------------------------
Gaji Bersih      : Rp 6.000.000
===============================
```

---

## 📚 Implementasi Javadoc

Semua kelas menggunakan dokumentasi profesional seperti berikut:

```java
/**
 * Mewakili seorang karyawan dan komponen gajinya.
 */
public class Karyawan {
    private String nama;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;

    /**
     * Membuat objek Karyawan baru dengan detail yang ditentukan.
     * @param nama Nama karyawan
     * @param gajiPokok Gaji pokok
     * @param tunjangan Total tunjangan
     * @param potongan Total potongan
     */
    public Karyawan(String nama, double gajiPokok, double tunjangan, double potongan) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
    }
}
```

### 🔧 Generate Dokumentasi Javadoc

```bash
javadoc -d doc src/Karyawan.java src/Gaji.java
```

📁 Hasilnya akan muncul di folder `doc/` sebagai **HTML interaktif** yang bisa dibuka di browser.

---

## 💡 Tips & Catatan

- 🧠 Validasi input mencegah crash karena kesalahan pengguna  
- 🗂 Struktur folder rapi → mudah di-maintain  
- 🧾 Javadoc menambah nilai profesional proyek  
- 💻 Bisa dikembangkan menjadi versi GUI atau berbasis database  

---

## 🛠 Teknologi yang Digunakan

| Komponen | Deskripsi |
|-----------|------------|
| ☕ **Java 21** | Bahasa utama untuk aplikasi |
| 📘 **Javadoc** | Untuk dokumentasi kelas & metode |
| 💻 **Terminal / CMD** | Menjalankan aplikasi berbasis console |

✨ *Dibuat dengan semangat clean code & dokumentasi profesional oleh Zaki Fawwaz*
