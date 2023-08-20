package Confidential_Package;
public class CheckVal{
    public static boolean check(long x){                     // Checks positive.
        if(x<=0){
            System.out.println("Invalid Input!!!!");
            return true;    }
        else
        return false;
        }
    public static boolean check(long lr,long ur){             // Checks range & positivity.
        if(lr>=ur || lr<=0 || ur<=0){
            System.out.println("Invalid Input!!!!");
            return true;    }
        else
        return false;
        }
    public static boolean check(long x,byte nod){             // Checks proper no. of digits. 
        if(x<=0 || (byte)(Long.toString(x).length())!=nod){
            System.out.println("Invalid input!!!!");
            return true;    }
        else
        return false;
        }
    public static boolean check(char ch, char Available_Choices[]){ // Checks correct choice in a menu.
        for(int ind=0;ind<=Available_Choices.length;ind++)
        if(ch==Available_Choices[ind])
            return false;
        System.out.println("Invalid input!!!!");
        return true;
    }
}
            