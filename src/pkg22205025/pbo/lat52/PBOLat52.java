/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205025.pbo.lat52;


/**
 *
 * @author Lenovo
 * Nama :Ma'rifatu Khirzah
 * Nim :22205025
 * Prodi :Teknik Informatika
 * Deskripsi :Pemrograman berorientasi 1
 */
class manusia {

    // Method siapakamu() 
    public void siapakamu() {
        // menampilkan teks "Saya manusia"
        System.out.println("Saya manusia");
    }
}
// Kelas Dosen 

class Dosen extends manusia {
    // Method mengajarApa()

    public void mengajarApa() {
        // menampikan teks "Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar matakuliah PBO"
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar mata kuliah PBO");
    }

    // method siapakamu
    @Override
    public void siapakamu() {
        // Menampilkan teks "Saya Dosen"
        System.out.println("Saya Dosen");
    }
}
// Kelas mahasiswa 

class Mahasiswa extends manusia {
    // method kelasApa() 

    public void kelasApa() {
        // menampilkan teks " Saya Nindi umur 17 tahun sedang belajar di kelas PBO2"
        System.out.println("Saya Nindi umur 17 tahun sedang belajar di kelas PBO2");
    }

    // Method siapakamu()
    @Override
    public void siapakamu() {
        // Menampilkan teks "saya mahasiswa"
        System.out.println("saya mahasiswa");
    }
}
// main class 

public class PBOLat52 {
    // Method main ()

    public static void main(String[] args) {
        // Membuat objek dosen
        Dosen dosen = new Dosen();

        //menampilkan NIP dosen
        System.out.println("NIP DOSEN: 41227829930");
        // Memangil method siapakamu() pada objek dosen 
        dosen.siapakamu();
        dosen.mengajarApa();

        // membuat objek mahasiswa 
        Mahasiswa mahasiswa = new Mahasiswa();
        // Menampilkan Nim mahasiswa 
        System.out.println("\nNIM mahasiswa : 10110269" );
        // Memanggil method siapakamu() pada objek mahasiswa
        mahasiswa.siapakamu();
        mahasiswa.kelasApa();

    }
}