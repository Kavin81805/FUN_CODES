import java.util.Scanner;

public class reverse {

    public static void main(String[] argu){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Sentence :");
        String sen = scan.nextLine();

        String[] word = sen.split(" ");
        
        for(int i=0;i < word.length;i++){
            
            word[i] = new StringBuilder(word[i]).reverse().toString();   
        }
        
        String op = String.join(" ", word);
        System.out.println("REVERSED SENTENCE : "+op);
    }
}
