import java.util.*;

import javax.script.ScriptEngine;

class Account
{
    Account(){}
    Scanner s = new Scanner(System.in);
    String cusname;
    int acc_no;
    void input1()
    {
        System.out.println("\n Enter Customer name:");
        cusname = s.next();
        System.out.println("Enter Customer Account Number:");
        acc_no = s.nextInt();
    }
}
class savings extends Account //10.124.6.15
{
    double bal=0,ci=0,dep=0,t=0;
    savings(double bal)
    {
        this.bal = bal;
    }
    int ch1;
    int SA()
    {
        int i=0;
        super.input1();
        while(i==0)
        {
            System.out.println(" 1.Deposit 2.Withdraw 3.View Compound Interest 4.View Profile 5.Go back");
            ch1 = s.nextInt();
            switch(ch1)
            {
                case 1: System.out.println("Enter the amount to be deposited:");
                        dep = s.nextDouble();
                        bal = bal + dep;
                        break;
                case 2: System.out.println("Enter the amount to be withdraw:");
                        dep = s.nextDouble();
                        if(bal == 0)
                        {
                            System.out.println("LOW BALANCE");
                        }
                        else{
                            bal = bal - dep;
                        }
                        break;
                case 3: System.out.println("Enter the Interest Time :");
                        t = s.nextDouble();
                        ci = bal*Math.pow(1+0.05,t) - bal;  
                        System.out.println("The Interest is:" + ci);
                        break;
                case 4: System.out.println("\t\t:::::CUSTOMER DETAILS:::::\t\t ");
                        System.out.println("\tCUSTOMER NAME: " + cusname);
                        System.out.println("\tCUSTOMER ID: " + acc_no);
                        System.out.println("\tBALANCE: " + bal);
                        System.out.println("\tINTEREST AMOUNT: "+ ci);
                        break;
                case 5: i=1;
                        break;
            }
        }
        return 0;
    }
   
}

class current extends Account
{
    double bal=0,dep,schar=0;
    current(double bal){
        this.bal = bal;
    }
    int ch2,i=0;
    int CA()
    {
        int i=0;
        while(i==0)
        {
            super.input1();
            System.out.println("1.Deposit with Cheque 2.WithDraw with Cheque 3.View profile 4.Go back ");
            ch2 = s.nextInt();
                switch(ch2)
                {
                    case 1: System.out.println("Enter the amount to be deposited:");
                            dep = s.nextDouble();
                            bal = bal + dep;
                            break;
                    case 2: System.out.println("Enter the amount to be withdraw:");
                            dep = s.nextDouble();
                            if(bal == 0)
                            {
                                System.out.println("LOW BALANCE");
                            }
                            else{
                                bal = bal - dep;
                            }
                            if(bal<10000)
                            {
                                schar = schar + 0.1*bal;
                                System.out.println("YOU HAVE TO PAY A SERVICE CHARGE OF Rs:" + schar);
                            }
                            break;
                    case 3: System.out.println("\t\t:::::CUSTOMER DETAILS:::::\t\t ");
                            System.out.println("\tCUSTOMER NAME: " + cusname);
                            System.out.println("\tCUSTOMER ID: " + acc_no);
                            System.out.println("\tBALANCE: " + bal);
                            System.out.println("\tSERVICE CHARGE: "+ schar);
                            break;
                    case 4: i=1;
                }
        }
        return 0;
    }
}


class Bank
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        double sal;
        int junk,type,n,i=1;
        System.out.println("Enter your Salary PA:");
        sal = s.nextDouble();
        while(true)
        {
                System.out.println("\n\t\t :::PICK AN OPTION::: \n\t 1.SAVINGS ACCOUNT \t 2.CURRENT ACCOUNT \t3.EXIT ");
                type = s.nextInt();
                switch (type)
                {
                    case 1: System.out.println("\nEnter the number of accounts you want to open:");
                            n = s.nextInt();
                            savings ac1[] = new savings[n];
                            for(i=0;i<n;i++)
                            {
                                ac1[i] = new savings(sal);
                                junk = ac1[i].SA();
                            }
                            break;
                    case 2: System.out.println("\nEnter the number of accounts you want to open:");
                            n = s.nextInt();
                            current ac2[] = new current[n];
                            for(i=0;i<n;i++)
                            {
                                ac2[i] = new current(sal);
                                junk = ac2[i].CA();
                            }
                            break;
                    case 3:System.exit(0);
                }
        }
    }   
}
