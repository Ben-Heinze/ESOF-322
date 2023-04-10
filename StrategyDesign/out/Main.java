import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("age discount:");
        String response = sc.nextLine();

        String discount="no";
        String[] list = response.split(" ");

        //checks for index-out-of-bounds
        if(list.length >1){ discount=list[1]; }


        //child ticket
        if(Integer.valueOf(list[0]) < 16){
            ChildTicket x = new ChildTicket();
            x.displayPrice();
        }
        //senior ticket
        else if(Integer.valueOf(list[0]) > 64){
            SeniorTicket x = new SeniorTicket(discount);
            x.displayPrice();
        }
        //adult ticket
        else{
            AdultTicket x = new AdultTicket(discount);
            x.displayPrice();
        }

    }//main
}//class