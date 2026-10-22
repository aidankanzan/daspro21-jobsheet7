import java.util.Scanner;
public class PenjualanTiketBioskop21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        double HARGA_TIKET = 50000;

        System.out.println("PROGRAM PERHITUNGAN PENJUALAN TIKET BIOSKOP");
        System.out.println("Ketik '0' atau masukkan jumlah tiket negatif untuk mengakhiri transaksi harian.");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan (atau 0 untuk selesai): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Peringatan: Jumlah tiket tidak valid (negatif)! Silakan masukkan ulang.");
                continue;
            }
            double hargaTotal = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalHargaDiskon = hargaTotal - (hargaTotal * diskon);

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalHargaDiskon;

            System.out.println("-> Pembelian berhasil! Diskon: " + (int)(diskon * 100) + "% | Total bayar: Rp " + (long)totalHargaDiskon);
            System.out.println("--------------------------------------------------");
        }

        System.out.println("================================================");
        System.out.println("          REKAPITULASI PENJUALAN HARI INI       ");
        System.out.println("================================================");
        System.out.println("Total seluruh tiket terjual : " + totalTiketTerjual + " tiket");
        System.out.println("Total pendapatan kotor      : Rp " + (long)totalPendapatan);
        System.out.println("================================================");
        sc.close();
    } 
}
