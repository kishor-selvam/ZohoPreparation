package Program;

public class VowelsOrNot {
    static void Vowels(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ){
                System.out.println(s.charAt(i)+" Vowel Occurs Index "+i);
            }
        }
    }

    public static void main(String[] args) {
        String s=new String("kishor");
        Vowels(s);
    }
}
