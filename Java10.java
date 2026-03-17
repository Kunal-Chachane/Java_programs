// program to find type of website from url

import java.util.Scanner;
public class Java10{
    public static void main(String[] args){
        Scanner url = new Scanner(System.in);
        System.out.println("Enter URL: ");
        String website = url.nextLine();
        if(website.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organization Website");
        }
        else if(website.endsWith(".edu")){
            System.out.println("Educational Website");
        }
        else{
            System.out.println("Unknown Website Type");
        }
    }
}
