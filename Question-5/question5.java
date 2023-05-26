import java.io.*;
class accounts{
    int ac_no;
    String name,ac_name;
    double balance;
    void withdrawl(double money){
        if(balance<money){
            System.out.println("Not enough money!!");
        }
        else{
            balance-=money;
            System.out.println("Collect money!!");
        }
    }
    void deposit(double money){
        balance+=money;
        System.out.println("Successfully deposit!!");
    }
    void display(){
        
        System.out.println("Account number: "+ac_no);
        System.out.println("Account Name: "+ac_name);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
        System.out.println("-----------------------------------\n");
    }
    accounts(int ac_no, String name, String ac_name, double balance){
        this.ac_name=ac_name;
        this.name=name;
        this.ac_no=ac_no;
        this.balance=balance;
    }
}

class question5{
    public static void main(String args[]){
        accounts cust1=new accounts(272980,"Amit Singh","Amit_Singh_27",20000);
        cust1.display();
        cust1.deposit(10000);
        cust1.display();
        cust1.withdrawl(1000);
        cust1.display();
    }
}
