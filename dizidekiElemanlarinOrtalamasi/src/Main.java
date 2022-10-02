public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double total = 0.0;

        for (int i : list) {
            total += i;
        }

        double avarage = total / list.length;
        System.out.println(avarage);
    }
}
