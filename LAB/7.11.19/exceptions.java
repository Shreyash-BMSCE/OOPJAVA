import java.util.*;

class otoexception extends Expection
{
    String speak;
    otoexception(String speak)
    {
        this.speak=speak;
    }
    public String ToString()
    {
        return speak;
    }
}

class kodomoexception extends Expection
{
    String speak;
    otoexception(String speak)
    {
        this.speak=speak;
    }
    public String ToString()
    {
        return speak;
    }
}

class father
{
    int fa;
    father(int fa)          
    {
        this.fa=fa
        try
        {
            if(fa<0)
                Throw new otoexception("NegativeFatherException");
        }
        catch(otoexception e)
        {
            System.out.println(e);
        }
    }
}

class son extends father
{
    int sa;
    son(int sa,int fa)
    {
        this.sa=sa;
        try{
            if(fa<sa)
                Throw new otoexception("SmolFatherException");
            if(sa<0)
                Throw new kodomoexception("NegativeSonException");
        }
        catch(kodomoexception e)
        {
            System.out.println(e);
        }
        catch(otoexception e)
        {
            System.out.println(e);
        }
    }
}


class except{
	public static void main(String args[]){
		int f=0, flag = 0, s=0;
		Scanner vs = new Scanner(System.in);
		
		
		do{
			flag = 0;
				System.out.println("Enter fathers age");
				f = vs.nextInt();
                father ob = new b(f);
			}
		}while(flag == 1);
		
		do{
			
			flag = 0;
			// THIS IS US
			try{
				System.out.println("Enter Sons age");
				s = vs.nextInt();
				if(s<0){
					throw new WrongAgeException("Sons AGE LESS THAN 0");
				}		
			}
			catch(WrongAgeException sa2){
				System.out.println(sa2);
				flag = 1;
				continue;
			}
		}while(flag == 1);
			
			
			//This is us
			
			try{
				Son obj = new Son(f, s);
			}
			catch(WrongAgeException wa){
				System.out.println(wa);
			}		
		
	}
}