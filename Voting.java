import java.util.Scanner;
class Voting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current age: ");
        int age = sc.nextInt();
        
       if(age < 18){
           System.out.println("You're not eligible to vote");
       
       }
       else{
           System.out.println("You're eligible for Voting");
       }
   }
}