package Confidential_Package;
import java.io.*;
import java.util.*;
public interface Imp_Vars{
    public static BufferedReader INP1=new BufferedReader(new InputStreamReader(System.in));
    public static DataInputStream INP2=new DataInputStream(System.in);
    public static Scanner INP3=new Scanner(System.in),INP3_COMM=new Scanner(System.in).useDelimiter(",");
    public static Date SYSDT=new Date();
    public static Random RND=new Random();
    public static Calendar SYSCAL=Calendar.getInstance();
}