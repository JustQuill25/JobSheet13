public class ExamplePercobaan5Soal3 {

    public static void main(String[] args) {
        // Memanggil fungsi tampil() dengan dua argumen varargs
        tampil(10, 20, "Bard", "Bot");
    }

    static void tampil(int... angka, String... nama) {
        // Mencetak jumlah argumen angka
        System.out.println("Jumlah argumen angka: " + angka.length);

        // Mencetak semua argumen angka
        for (int i : angka) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Mencetak jumlah argumen nama
        System.out.println("Jumlah argumen nama: " + nama.length);

        // Mencetak semua argumen nama
        for (String nama1 : nama) {
            System.out.print(nama1 + " ");
        }

        System.out.println();
    }
}