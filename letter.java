import java.util.Scanner; //Import the Scanner class
public class letter {
    public static void main(String[] args){
        char ch;
        System.out.println("Enter letter between A to Z");
        Scanner sc = new Scanner(System.in);//Create Scanner object
       ch=sc.next().charAt(0);// Character input
       if((ch>='a' && ch<='z')  || (ch>='A' && ch<='Z')){
        System.out.println("The given character is alphabet");
       }else{ 
         System.out.println("The given number is not alphabet"); 
         }
sc.close();
    }
}
 