import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("## Program java Biodata Mahasiswa");
        System.out.println("=================================");
        System.out.println(" ");

        String nama, nim, fakultas, jurusan, kota_asal,alamat;

        System.out.print("Nama Mahasiswa :");
        nama =scanner.nextLine();

        System.out.print("NIM :");
        nim =scanner.nextLine();

        System.out.print("Fakultas :");
        fakultas =scanner.nextLine();

        System.out.print("Jurusan :");
        jurusan =scanner.nextLine();

        System.out.print("Kota asal:");
        kota_asal =scanner.nextLine();

        System.out.print("Alamat:");
        alamat =scanner.nextLine();


        System.out.println();

        System.out.println("# Data Mahasiswa #");
        System.out.println("==================");
        System.out.println("Nama " + nama);
        System.out.println("NIM " + nim);
        System.out.println("Fakultas " + fakultas);
        System.out.println("Jurusan " + jurusan);
        System.out.println("Kota asal " + kota_asal);
        System.out.println("Alamat " + alamat);

    }
}
