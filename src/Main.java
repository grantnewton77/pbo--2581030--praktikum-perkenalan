
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM : ");
        Integer nim = input.nextInt();

        System.out.print("Masukkan Umur : ");
        Integer umur = input.nextInt();

        System.out.print("Masukkan Tinggi : ");
        Double tinggi = input.nextDouble();

        input.nextLine();



        System.out.println();

        System.out.println("Halo! Nama sasya " + nama + " (NIM " + nim + "), umur " + umur + " tahun, ");
        System.out.println("tinggi " + tinggi + " cm");
        }



    }
