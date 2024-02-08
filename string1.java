//strings
import java.util.*;
public class string1{
    public static void main(String args[]){
        char arr[] ={'a','b','c','d'};
        //syntax
        String str = "abcd";
        //or
        String str2 = new String("xyz@123");

        //input in string
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("enter name");
        name = s.next(); // only word before space will be printed
        System.out.println("enter full name/ line");
        String namef = sc.nextLine();// whole line
        System.out.println(name);
        System.out.println(namef);

        //to find length
        String fullname = "Jiya Chowdhury";
        System.out.println("length of ur name is "+ fullname.length());

        //concadination .. to add
        String firstname = "Jiya";
        String lastname = "Chowdhury";
        String fullnamee = firstname +" "+lastname;
        System.out.println("tera pura naam "+fullnamee);
        //to find a character at a given index
        System.out.println(fullnamee.charAt(0));
    }
}