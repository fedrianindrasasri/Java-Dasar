public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
//            Menghentikan Perulangan saat ini dan melanjutkan ke yang berikutnya
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan ganjil " + i);

        }
    }
}
