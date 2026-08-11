import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        char[] char1 = word1.toCharArray();
        Arrays.sort(char1);
        String newWord1 = new String(char1);
        char[] char2 = word2.toCharArray();
        Arrays.sort(char2);
        String newWord2 = new String(char2);
        if (newWord1.equals(newWord2))
        {
            System.out.println("Yes");
        } else
        {
            System.out.println("No");
        }
        // Please write your code here.
    }
}