import java.util.Scanner;
public class userlogin{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the choice from the user:");
        int choice=sc.nextInt();
        

        long dpin=12345;
        
        while(true){

            if(choice==1){
                System.out.println("Enter a pin or password:");
              long userpin=sc.nextLong();
      
                 if(userpin==dpin){
            System.out.println("correct password!\n1.Deposit\n2.withdraw\n3.BalanceCheck\n4.Exit");
            break;
        }
        else{
            System.out.println("Invalid pin or password");
            System.out.println("...............................................");
        }
            }
            else if(choice==2){
                break;
            }

        }

       

    }
}