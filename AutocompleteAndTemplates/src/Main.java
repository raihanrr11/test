public class Main {
    public static void main(String[] args) {
        // Masukkan nilai kecepatan (dalam m/s) dan waktu (dalam detik)
        double kecepatan = 20.0; // Contoh kecepatan 20 m/s
        double waktu = 5.0; // Contoh waktu 5 detik

        // Hitung jarak
        double jarakMeter = kecepatan * waktu;

        // Tampilkan hasil perhitungan
        System.out.println("Kecepatan: " + kecepatan + " m/s");
        System.out.println("Waktu: " + waktu + " detik");
        System.out.println("Jarak: " + jarakMeter + " meter");
    }
}