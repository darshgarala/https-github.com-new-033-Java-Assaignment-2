public class P_4 {
    public static void main(String[] args)
    {
        Account account = new Account(111, 200,"06-04-2003");
        System.out.println("simple account");
        System.out.println(account);
        System.out.println("--------------------------------------------------------------------------------------");
       
        CheckingAccount checkingAccount = new CheckingAccount(112, 250,"01-04-2003");
        System.out.println("Checking account");
        System.out.println(account);
        System.out.println("Enter ammount for withdrawing in checking account  :");
        
        Scanner s = new Scanner(System.in);
        double ammount = s.nextDouble();
        
        checkingAccount.withdraw(ammount);
        System.out.println(checkingAccount);
        
        SavingsAccount savingsAccount = new SavingsAccount(113, 10000,"02-04-2003");
        
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Saving account");
        System.out.println(account);
        System.out.println("Enter ammount for withdrawing in saving account  :");
        
        double ammounts = s.nextDouble();
        savingsAccount.withdraw(ammounts);
        System.out.println(savingsAccount);
    }
    
}
