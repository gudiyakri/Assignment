import java.util.Scanner;  // Import the Scanner class
public class englishSentence {
    public static void main(String[] args){
        String str;
        Scanner sc=new Scanner(System.in); //Create Scanner object
        System.out.println("Enter any English sentence");
         str= sc.nextLine();  //reads string
        boolean result = str.matches("[a-zA-Z]+");
        if(result){
        System. out.println("Display:"+str);//Display  output
        }
        else{
            System.out.println("Please Enter only English Sentence");//Display  output
        }
        sc.close(); // Close object
    }
}