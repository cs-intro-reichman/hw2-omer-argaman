// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String Cheer = args[0].toUpperCase();
                int num = Integer.parseInt(args[1]);       
                int length = Cheer.length();
                String SpecialLetters = "AaEeFfHhIiLlMmNnOoRrSsXx";
                String Indicator = "";
                for (int i = 0; i < length; i++) {
                        if (SpecialLetters.indexOf(Cheer.charAt(i)) != -1) {
                                Indicator = "an";
                        }else { 
                                Indicator = "a ";
                        }
                        System.out.println("Give me " + Indicator + " " + Cheer.charAt(i) + ": " + Cheer.charAt(i) + "!");
                }
                System.out.println("What does that spell?");
                for (int i = 0; i < num; i++) {
                        System.out.println(Cheer + "!!!");
                }
        }
}

