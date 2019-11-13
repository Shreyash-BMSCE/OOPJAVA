import java.util.*;

class otoexception extends Exception
{
    String speak;
    otoexception(String _speak)
    {
        speak = _speak;
    }
    public String toString()
    {
        return speak;
    }
}

/*class otoexception extends Exception
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
} */

class father
{
    int fa;
    father(int fa) throws otoexception      
    {
        this.fa=fa;
        
            if(fa<0){
                throw new otoexception("NegativeFatherException"); 
            }
        
    }
}

class son extends father 
{
    int sa;
    son(int sa,int fa) throws otoexception 
    {
        super(fa);
        this.sa=sa;
          if(sa<0){ 
                throw new otoexception("NegativeSonException"); 
            }
        if(fa<sa)
            throw new otoexception("Father's age is less than or equal to son's age");
            
        
    }
}


class except{
	public static void main(String args[]){
		int f=0, flag, s=0;
        Scanner vs = new Scanner(System.in);
        
        do{
            
			try{
                System.out.println("Enter fathers age");
                f = vs.nextInt();
                father ob = new father(f);
                flag=0;
            }
            catch(otoexception e)
            {
                flag=1;
                System.out.println(e);
            }
        }    while(flag==1);
            // THIS IS SON
            try
            {	
                System.out.println("Enter Sons age");
		        s = vs.nextInt();
                son obj = new son(s, f);

            }
            catch(otoexception e)
            {
                System.out.println(e);
            }
	}
}
  
