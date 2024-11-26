

public class TicketPrice {

    public void printTicketPrice(int age){
        if(age <=3 || age >= 100){
        System.out.println("the Price of ticket is:" + 0);
    } else if(age <=13 || age >= 60){
        System.out.println("the price of ticket is:" + 5);

    } else{
        System.out.println("the price ticket is:" + 10);
    }
}

    public static void main(String[] args) {
      
        
      

        TicketPrice ticket = new TicketPrice();
       
        ticket.printTicketPrice(25);
        
    }
}

