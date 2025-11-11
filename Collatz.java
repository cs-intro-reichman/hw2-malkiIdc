public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        
        for (int seed = 1; seed <= N; seed++) {
            int n = seed;
            int steps = 1;
            String sequence = "" + n;

            // Continue until reaching 1
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                sequence += " " + n;
                steps++;
            }

            // Special case: for seed 1, continue 1 → 4 → 2 → 1
            if (seed == 1) {
                sequence = "1 4 2 1";
                steps = 4;
            }

            if (mode.equals("v")) {
                System.out.println(sequence + " (" + steps + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
