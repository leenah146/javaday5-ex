import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Scanner sc=new Scanner(System.in);
//System.out.println("please Enter your first number");
//int inputnumber= sc.nextInt();
//
//
//System.out.println("please Enter your second number");
//int inputnumber2= sc.nextInt();
//
//System.out.println("please chose your operation " +
//        "1-(+)" +
//        "2-(-)" +
//        "3-(/)" +
//        "4-(*)" +
//        "5-(%)");
//String operation= sc.next();
//        int result;
//switch (operation){
//
//    case "1":
//        result=inputnumber+inputnumber2;
//        System.out.println(inputnumber+"+"+inputnumber2+"="+result);
//        break;
//
//    case "2":
//        result=inputnumber-inputnumber2;
//        System.out.println(inputnumber+"-"+inputnumber2+"="+result);
//        break;
//
//    case "3":
//        result=inputnumber/inputnumber2;
//        System.out.println(inputnumber+"/"+inputnumber2+"="+result);
//        break;
//    case "4":
//        result=inputnumber*inputnumber2;
//        System.out.println(inputnumber+"*"+inputnumber2+"="+result);
//        break;
//
//    case "5":
//        result=inputnumber%inputnumber2;
//        System.out.println(inputnumber+"%"+inputnumber2+"="+result);
//        break;
//
//
//}

//        Scanner in=new Scanner(System.in);
//
//        System.out.println("please chose (R)ock ,(P)aper or (S)cissor");
//        String pChoice=in.next();
//
//        String cChoice=comChoice();
//
//        System.out.println(cChoice);
//
//        if(pChoice.equals(cChoice)){
//            System.out.println("Draw");
//
//        }else if(pChoice.equals("S")&&cChoice.equals("P")){
//
//            System.out.println("win");
//
//        }
//        else if(pChoice.equals("R")&&cChoice.equals("S")){
//
//            System.out.println("win");
//
//        }
//        else if(pChoice.equals("p")&&cChoice.equals("R")){
//
//            System.out.println("win");
//
//        }else {
//            System.out.println("lose");
//        }
//
// Test constructor and toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);



    }


    public static String comChoice(){
        Random c= new Random();
       String choice="R";
         int R=c.nextInt(3);
          if(R==1){
            choice= "P";
         }

         else if(R==2){
             choice= "S";
         }else{
             choice="R";
          }
         return choice;


    }

}