import java.util.*;
class customer
{
    Scanner s = new Scanner(System.in);
    private int customer_no,qty,price;
    private String customer_name;
    private double discount,TotalPrice,NetPrice;
    customer()
    {
        qty=0;
        price=0;
        discount=0;
        TotalPrice=0;
        customer_no=0;
        customer_name="Shreyash";
    }
    void input()
    {
        System.out.println("\n Enter Customer Name:");
        customer_name = s.next();
        System.out.println("\n Enter Customer No:");
        customer_no = s.nextInt();
        System.out.println("\n Enter the product quantity:");
        qty = s.nextInt();
        System.out.println("\n Enter the price:");
        price = s.nextInt();
        caldiscount();
    }
    void caldiscount()
    {
        TotalPrice = qty*price;
        if(TotalPrice >= 50000)
        {
            discount = 0.25*TotalPrice;
        }
        else if(TotalPrice >=25000)
        {
            discount = 0.1*TotalPrice;
        }
        NetPrice = TotalPrice- discount;
    }
    void show()
    {
        System.out.println("\n The Total price is:" + TotalPrice + "\n The Discount given is:"+ discount + "\n The Netpirce is:" + NetPrice);
    }
}

class cusmain
{
    public static void main(String xx[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\n Enter the no. of customers:");
        int n = s.nextInt();
        customer c1[] = new customer[n];
        for(int i=0; i<n ; i++)
        {
            c1[i] = new customer();
            c1[i].input();
            c1[i].caldiscount();
            c1[i].show();
        } 
    }
}  
