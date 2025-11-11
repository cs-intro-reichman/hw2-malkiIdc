public class TestRandom {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        int countGreater = 0;
        int countLessOrEqual = 0;

        for (int i = 0; i < N; i++) {
            double r = Math.random();
            if (r > 0.5) {
                countGreater++;
            } else {
                countLessOrEqual++;
            }
        }

        System.out.println("> 0.5: " + countGreater + " times");
        System.out.println("<= 0.5: " + countLessOrEqual + " times");

        if (countGreater != 0 && countLessOrEqual != 0) {
            if ( countGreater>countLessOrEqual)
            {  double ratio = (double) countLessOrEqual/countGreater ;
                System.out.println("Ratio: " + ratio);
            }
            else if ( countGreater<countLessOrEqual)
            {  double ratio = (double) countGreater / countLessOrEqual;
                System.out.println("Ratio: " + ratio);
            }
          
          
         
        }
    }
}
