public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "B";
        switch (nilai) {
            case "A":
                System.out.println("Wow Anda Lulus dengan Sangat Baik");
                break;
            case "B":
            case "C":
                System.out.println("Wow Anda Lulus");
                break;
            case "D":
                System.out.println("Wow Anda Hampir Gagal");
                break;
            default:
                System.out.println("Anda Tidak Lulus");
        }


        //        Switch Lambda -> Jalan Di Java 14 Keatas
        switch (nilai) {
            case "A" -> System.out.println("Wow Anda Lulus dengan Baik");
            case "B", "C" -> System.out.println("Wow Anda Lulus");
            case "D" -> System.out.println("Wow Anda Hampir Gagal");
            default -> System.out.println("Anda Gagal");
        }

//        Nilai Yield -> Java 14 Keatas
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow Anda Lulus dengan Baik";
            case "B", "C" -> ucapan = "Wow Anda Lulus";
            case "D" -> ucapan = "Wow Anda Hampir Gagal";
            default -> ucapan = "Anda Gagal";
        }

        System.out.println(ucapan);

        String ucapan2 = switch (nilai) {
            case "A":
                yield "Wow Anda Lulus dengan Baik";
            case "B", "C":
                yield "Wow Anda Lulus";
            case "D":
                yield "Wow Anda Hampir Gagal";
            default:
                yield "Anda Gagal";
        };

        System.out.println(ucapan2);
    }
}
