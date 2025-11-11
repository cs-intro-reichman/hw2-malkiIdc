public class Cheers {
        public static void main(String[] args) {
            String word = args[0];
            int repeats = Integer.parseInt(args[1]);
            word = word.toUpperCase();
    
            String anLetters = "AEFHILMNORSX";
    
            // Part 1: cheer each letter
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (anLetters.indexOf(ch) >= 0) {
                    System.out.println("Give me an " + ch + ": " + ch + "!");
                } else {
                    System.out.println("Give me a " + ch + ": " + ch + "!");
                }
            }
    
            // Part 2: final chant
            System.out.println("What does that spell?");
            for (int i = 0; i < repeats; i++) {
                System.out.println(word + "!!!");
            }
        }
    }
    