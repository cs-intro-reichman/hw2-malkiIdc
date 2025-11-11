public class CalcPi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += 1.0 / (2 * i + 1);
            } else {
                sum -= 1.0 / (2 * i + 1);
            }
        }

        double piApprox = 4 * sum;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + piApprox); // <-- 5 spaces after colon
    }
}
