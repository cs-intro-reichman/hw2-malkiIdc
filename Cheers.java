public class Cheers {
        public static void main(String[] args) {
            String word = args[0].toUpperCase();
            int n = Integer.parseInt(args[1]);
    
            String anLetters = "AEFHILMNORSX";
    
            // For each letter
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (anLetters.indexOf(ch) >= 0) {
                    System.out.println("Give me an " + ch + ": " + ch + "!");
                } else {
                    System.out.println("Give me a  " + ch + ": " + ch + "!"); // double space after 'a'
                }
            }
    
            System.out.println("What does that spell?");
            for (int i = 0; i < n; i++) {
                System.out.println(word + "!!!");
            }
        }
    }
    