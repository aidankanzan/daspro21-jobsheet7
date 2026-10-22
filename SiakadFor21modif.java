import java.util.Scanner;
public class SiakadFor21modif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int tertinggi = 0;
        int terendah = 100;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            int nilai = sc.nextInt();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus (>= 60)     : " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus (< 60): " + jumlahTidakLulus);
        sc.close();
    }
}