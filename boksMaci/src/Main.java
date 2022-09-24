public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Muhammed Ali", 18, 120, 100, 100);
        Fighter f2 = new Fighter("Mike Tyson", 17, 85, 85, 50);

        Match match = new Match(f1, f2, 85, 100);
        match.run();

    }
}
