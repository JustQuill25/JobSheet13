import java.util.Scanner;

public class UcapanTerimaKasih_01Modif {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih(String nama) {
        System.out.println("Thank you " + nama + " for being the best teacher in the world.");
    }

    public static void UcapanTambahan(String nama, String ucapanTambahan) {
        System.out.println("And also, " + ucapanTambahan);
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        UcapanTerimaKasih(nama);
        UcapanTambahan(nama, "I hope you have a great day!");
    }
}