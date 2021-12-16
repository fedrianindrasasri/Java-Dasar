public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Fedrian", "Indra", "Sasri"
        };

//        for biasa
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

//        foreach
        for (var name: names){
            System.out.println(name);
        }
    }
}
