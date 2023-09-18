package mapBasicAssignment2;

import java.util.*;


public class AccountAssignmet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Account a1 = new Account(1, "abc", 10000, "Hyderabad");
		  Account a2 = new Account(2, "xyz", 10050, "Hyderabad");
		  Account a3 = new Account(3, "ghj", 20000, "Pune");
 		  Account a4 = new Account(4, "jkl", 5000, "Mumbai");
		  Account a5 = new Account(5, "pqr", 30500, "Bangalore");
		  
		  Map<Integer,Account> accountMap = new HashMap<>();
		  
		  accountMap.put(a1.getAccountNumber(), a1);
		  accountMap.put(a2.getAccountNumber(), a2);
		  accountMap.put(a3.getAccountNumber(), a3);
		  accountMap.put(a4.getAccountNumber(), a4);
		  accountMap.put(a5.getAccountNumber(), a5);

		  Scanner sc = new Scanner(System.in);
		  System.out.println("please enter key to get account info");
		  int key = sc.nextInt();
		 Account acc = accountMap.get(key);
		  System.out.println(acc.toString());
		  
		  System.out.println("please enter location to get account info");

		  String loc = sc.next();
		  
		  for(Map.Entry<Integer, Account> accMap : accountMap.entrySet()) {
			  if(accMap.getValue().getLocation().equals(loc)) {
			  System.out.println(accMap);
	  
			  }
		  }
			  
			  
			  System.out.println("enter the balance range");
			     int i =sc.nextInt();
			     System.out.println("enter the second value ");
			     int j = sc.nextInt();
			     
			     for(Map.Entry<Integer, Account> accrange : accountMap.entrySet()) {
			  		if(accrange.getValue().getBalance()>i && accrange.getValue().getBalance()<j){
			  		  System.out.println(accrange);
			  			
			  			
			  		}
			  			  
			  			  
			     }
			  			  
			  			
			  	
			  			  
			  
			  
			  
		  }
		  
		 
		  


	}


