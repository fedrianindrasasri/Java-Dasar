public class MethodVariableArguments {
    public static void main(String[] args) {
        int[] values = {80, 80, 80, 80, 80};

        sayCongrats("Fedrian", values);

        sayCongrats2("Fedrian Indra Sasri", 70,90,80,65,89,90);
    }

//    Menggunakan Array
    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValues = total / values.length;

        if (finalValues >= 75) {
            System.out.println("Selamat " + name + " Anda Lulus");
        } else {
            System.out.println("Selamat " + name + " Anda Tidak Lulus");
        }
    }

//    Menggunakan Variable Arguments
static void sayCongrats2(String name, int... values) {
    var total = 0;
    for (var value : values) {
        total += value;
    }

    var finalValues = total / values.length;

    if (finalValues >= 75) {
        System.out.println("Selamat " + name + " Anda Lulus");
    } else {
        System.out.println("Selamat " + name + " Anda Tidak Lulus");
    }
}
}
