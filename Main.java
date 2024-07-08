import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//*****************Q1*********************************
       /*Scanner input=new Scanner(System.in);
        System.out.println("input frist number :");
        int num1=input.nextInt();
        System.out.println("input second number :");
        int num2=input.nextInt();
        System.out.println("input third number :");
        int num3=input.nextInt();
        System.out.println("The smallest value is "+smallestNumber( num1,num2,num3));*/

        //*************Q2******************************
        /*Scanner input=new Scanner(System.in);
        System.out.println("inter number to check :");
        int number=input.nextInt();
        check(number);*/

        //*************Q3******************************
       /* Scanner input=new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters. \n" +
                "2. A password consists of only letters and digits. \n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): " );
        String pass=input.nextLine();
        if (checkPass(pass)) {
            System.out.println("Password is valid: " + pass);
        } else {
            System.out.println("Password is invalid: " + pass);
        }*/
       //System.out.println("Password is valid:"+checkPass(pass)) ;هنا تطبع صح ولالا بس

    }
//method Q1:
  /* public static int smallestNumber(int num1,int num2,int num3){
       if(num1<num2&&num1<num3){
          // System.out.println("The smallest value is "+num1);
         return num1;
       } else if (num2<num1&&num2<num3) {
           //System.out.println("The smallest value is "+num2);
         return num2;
       }else {
        //System.out.println("The smallest value is "+num3);
           return num3;
       }

   }*/

 //method Q2:

    /*public static void check(int num){
        if(num>0){
            System.out.println(" positive");
        } else if (num<0) {
            System.out.println("negative");

        }else {
            System.out.println("zero");
        }
    }*/

    //method Q3:
  /*public static boolean checkPass(String pass) {
    if (pass.length() < 10) {
        return false;
    }
    int countD = 0;
    int countL = 0;

    for (int i = 0; i < pass.length(); i++) {
        char ch = pass.charAt(i);
        if (!Character.isLetterOrDigit(ch)) {
            return false;
        }
        if (Character.isDigit(ch)) {
            countD++;
        }
        if (Character.isLetter(ch)) {
            countL++;
        }
    }
    if (countL < 8) {
        return false;
    }
    if (countD < 2) {
        return false;
    }
    return true;
  }*/


}