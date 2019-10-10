import java.util.*;

class Account
{
    Account(){}
    Scanner s = new Scanner(System.in);
    String cusname;
    int acc_no;
    void input1()
    {
        System.out.println("\n Enter Customer name:");
        cusname = s.nextline();
        System.out.println("Enter Customer Account Number:");
        acc_no = s.nextInt();
    }
}
class savings extends Account //10.124.6.15
{
    savings(){}
    double bal=0,ci,dep,t;
    int ch1;
    void SA()
    {
        System.out.println(" 1.Deposit 2.Withdraw 3.View Compound Interest 4.Go back");
        ch1 = s.nextInt();
        
        switch(ch1)
        {
            case 1: System.out.println("Enter the amount to be deposited:");
                    dep = nextDouble();
                    bal = bal + dep;
                    break;
            case 2: System.out.println("Enter the amount to be withdraw:");
                    dep = nextDouble();
                    if(bal == 0)
                    {
                        System.out.println("LOW BALANCE");
                    }
                    else{
                        bal = bal - dep;
                    }
                    break;
            case 3: System.out.println("Enter the Time :");
                    t = nextDouble();
                    ci = bal*Math.pow(1+0.05,t) - bal;  
                    
            
        }
    }
}

class current extends Account
{
    current(){}
}


class Bank
{
    int type;
}
