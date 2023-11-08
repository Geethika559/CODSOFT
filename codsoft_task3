import java.util.*;
//User's bank account
class UserBank{
    private double balance;

    public UserBank(double initial){
        this.balance=initial;
    }
    //Withdraw
    public void withdraw(double amt){
        if(amt>balance){
            System.out.println("Insufficient balance.\nTransaction Failed");
        }else if(amt==0){
            System.out.println("Invalid amount");
        }else{
            balance-=amt;
            System.out.println("Withdraw Successful");
        }
    }

    //Deposit
    public void deposit(double amt){
        if(amt!=0){
            balance +=amt;
            System.out.println(amt+" deposited successfully");
        }else{
            System.out.println("Enter valid amount");
        }
    }

    public void check_balance(){
        System.out.println("Balance: "+balance);
    }
}

public class AtmMachine{
    private static UserBank user=new UserBank(5000.00);

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println( "\n1.Withdraw \n2.Deposit\n3.Check Balance");
        int choice=sc.nextInt();
        switch(choice){
            case 1 :
                    System.out.println("Enter the amount you want to withdraw: ");
                    double withdraw_amount =sc.nextDouble();
                    user.withdraw(withdraw_amount);
                    break;
            
            case 2 :
                    System.out.println("Enter the amount you want to deposit");
                    double deposit_amount=sc.nextInt();
                    user.deposit(deposit_amount);
                    break;
        
            case 3 :
                user.check_balance();
                break;
            default:
                    System.out.println("Enter valid option");
        }
        System.out.println("Do you want to continue transaction?(yes/no)");
        if(sc.next().equalsIgnoreCase("yes")){
            main(args);
        }
        else{
            System.exit(0);
        }
       
        sc.close();
    }
}
    
    

