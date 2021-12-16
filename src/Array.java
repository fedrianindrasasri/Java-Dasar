public class Array {
    public static void main(String[] args) {
        String[] stringArray = new String[3];
        stringArray[0] = "Fedrian";
        stringArray[1] = "Indra";
        stringArray[2] = "Sasri";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        int[] newInt = {10, 20, 30, 40};
        for (int i = 0; i < newInt.length; i++) {
            System.out.println(newInt[i]);
        }

        String [][] members = {
                {"A", "B"},
                {"C","D"},
                {"E"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
