import java.util.Scanner;

public class Ucapan_01 {
    public static String PenerimaanUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda berikan ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;

    }
    public static void main(String[] args) {
        String nama = PenerimaanUcapan();
        System.out.println("Thank you " +nama+ "\nMay the force be with you");
    }
}