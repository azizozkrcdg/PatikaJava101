public class Main {
    public static void main(String[] args) {
        int[] list = {44, 69, 1, 23, 69, -100, -56, 63, 82};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
    }
}
