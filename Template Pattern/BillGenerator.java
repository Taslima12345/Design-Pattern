package templateDesign;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BillGenerator{
	public static void main(String[] args){

		Scanner reader = new Scanner(System.in);

		ZoneId zoneId = ZoneId.of("Asia/Dhaka");
       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while(true){
            System.out.println("Choose operator.\n 1.Airtel\n 2.Robi\n 3.Telitalk\n 4.Quit\n");
            
            int value = reader.nextInt();
            MobileOperator customer;

            if(value == 1){  
            	
            	customer = new Airtel();           	
            }
            else if(value == 2){
            	customer = new Robi();
            }
            else if(value == 3){
            	customer = new Telitalk();
            }
            else{
                break;
            }
            
            System.out.println("To start time counting insert 1.\n");
            int input;
            input = reader.nextInt();
            LocalTime localTime = LocalTime.now(zoneId);
            customer.myStartingTime = localTime.format(formatter);
            System.out.println("start time: "+ customer.myStartingTime);


            System.out.println("To finish time counting insert 0.\n");
            input = reader.nextInt();
            localTime = LocalTime.now(zoneId);
            customer.myEndingTime = localTime.format(formatter);
            System.out.println("finish time: "+ customer.myEndingTime);

            customer.BillTheCustomer();
        }

    }

}

