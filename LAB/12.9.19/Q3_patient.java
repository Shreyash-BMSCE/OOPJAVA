import java.util.*;
class patient
{
    Scanner s = new Scanner(System.in);
    String pt_id,doc,pt_name;
    int pt_age;
    patient(){}
    void input()
    {
        System.out.println("\n Enter the patient Name:");
        pt_name = s.next();
        System.out.println("\n Enter the patient ID:");
        pt_id = s.next();
        System.out.println("\n Enter the patient Age:");
        pt_age = s.nextInt();
        System.out.println("\n Enter the Doctor's Name:");
        doc = s.next();
    }
    void disp()
    {
        System.out.println("\n Name:" + pt_name + "\n Age:"+ pt_age + "\n Doctor's Name:" + doc);
    }
    void disp_v2()
    {
        System.out.println("\n Name:" + pt_name);
    }
}

class pt_main
{
    public static void main(String xx[])
    {
        Scanner s = new Scanner(System.in);
        int ch = 1;
        System.out.println("\n Enter the no. of Patients:");
        int n = s.nextInt();
        patient p1[] = new patient [n];
        for(int i =0; i<n; i++)
        {
            System.out.println("\nPatients " + (i+1) + ":");
            p1[i] = new patient();
            p1[i].input();
        }
        while(ch == 1)
        {
            System.out.println("\n Enter choice \n 1. Accept a patient id and display his/her details \n 2.Accept the name of the doctor and display the names of all the patients treated by him/her.");
            int k = s.nextInt();
            switch(k)
            {
                case 1: System.out.println("\n Enter ID:");
                        String s1 = s.next();
                        for(int i =0; i<n; i++)
                        {
                            if(!(p1[i].pt_id == s1))
                            {
                                p1[i].disp();
                            }
                        }
                        break;
                case 2: System.out.println("\n Enter Doc's Name:");
                        s1 = s.next();
                        for(int i =0; i<n; i++)
                        {
                            if(!(p1[i].doc == s1))
                            {
                                p1[i].disp_v2();
                            }
                        }
                        break;   
                default: System.out.println("\n Wrong Input!!!");
            }           
            System.out.println("\n Enter 1 to continue:");
            ch = s.nextInt();
        }
    }
}
