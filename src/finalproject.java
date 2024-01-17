import java.util.Scanner;
public class finalproject{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // nama pemesan
            System.out.print("Nama Pemesan: ");
            String namapemesan = scanner.nextLine();

            //  menu
            System.out.println("Pilihan:");
            System.out.println("1. Nasi Goreng (Rp.15.000,00)");
            System.out.println("2. Mie Ayam (Rp.10.000,00)");
            System.out.println("3. Bakso (Rp.13.000,00)");

            // pilihan menu
            System.out.print("Masukkan pilihan: ");
            int pilihanmenu = scanner.nextInt();
            scanner.nextLine(); // Membaca newline setelah angka

            //  jumlah pesanan
            System.out.print("jumlah pesanan: ");
            int jumlahpesanan = scanner.nextInt();
            scanner.nextLine(); // Membaca newline setelah angka

            // total bayar
            int hargasatuan = 0;
            String namamenu = "";

            switch (pilihanmenu) {
                case 1:
                    hargasatuan = 15000;
                    namamenu = "Nasi Goreng";
                    break;
                case 2:
                    hargasatuan = 10000;
                    namamenu = "Mie Ayam";
                    break;
                case 3:
                    hargasatuan = 13000;
                    namamenu = "Bakso";
                    break;
                default:
                    System.out.println("===========================");
                    System.out.println("Salah pilih :)");
                    System.out.println("===========================");
                    continue; // Melanjutkan iterasi loop tanpa mengeksekusi kode di bawahnya
            }

            int totalBayar = hargasatuan * jumlahpesanan;

            //  ringkasan pesanan
            System.out.println("===========================");
            System.out.println("Nama Pemesanan: " + namapemesan);
            System.out.println("Pesanan: " + namamenu);
            System.out.println("Jumlah Pesan: " + jumlahpesanan);
            System.out.println("Total Bayar: Rp." + totalBayar + ",00");
            System.out.println("===========================");

        }

    }
}
