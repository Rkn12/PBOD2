public class coertion {
    public static void main(String[] args) {
        //1
        int output1 = 'a';
        System.err.println("1. " + output1); //97

        // 2
        double x = 15.5;
        // int output2 = x; // Error
        int output2 = x;
        System.out.println("2. " + output2); // 15

        // 3
        int y = 25;
        double output3 = y;
        System.out.println("3. " + output3); // 25.0

        // 4
        int z = 78;
        char output4 = (char) z;
        System.out.println("4. " + output4); // N

        // 5
        char a = 'a';
        double output5 = a;
        System.out.println("5. " + output5); // 97.0
    }
}
