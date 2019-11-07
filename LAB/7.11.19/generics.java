import java.util.*;
class Test<T, U>{
    
    T obj;
    U obju;
    
    Test(T obj, U obju){
        this.obj = obj;
        this.obju = obju;
    }
    
    T print1(){
        return obj;
        
    }
    U print2(){
        return obju;
    }
    
}

class Main{
    
    public static void main (String[] args) {
        Test<Integer, String> obj = new Test<Integer, String>(99, "World");
        int x = obj.print1();
        String y = obj.print2();
        System.out.println(x +" "+y);
        
        
        Test<String, Character> obj2 = new Test<String,Character >("Heelo",'w' );
        String xx = obj2.print1();
        Character yy = obj2.print2();
        System.out.println(xx+yy);
    }
}