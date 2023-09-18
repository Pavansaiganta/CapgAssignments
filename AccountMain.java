package mapBasicAssignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import mapBasicAssignment2.Account;

public class AccountMain {

	public static void main(String[] args) {
		
		  Account a1 = new Account(1, "abc", 10000, "Mumbai");
		  Account a2 = new Account(2, "xyz", 10500, "Hyderabad");
		  Account a3 = new Account(3, "ghj", 20000, "Pune");
 		  Account a4 = new Account(4, "jkl", 5000, "Mumbai");
		  Account a5 = new Account(5, "pqr", 35000, "Bangalore");
		  
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
		  
		  Map<String,List<Account>> locAccount = new HashMap<>();
		  List<Account> accountList = new ArrayList<>();
		  for(Map.Entry<Integer, Account> accMap : accountMap.entrySet()) {
			  if(accMap.getValue().getLocation().equals(loc)) {

				  accountList.add(accMap.getValue());
				 
			  }
		  }
		  
		  locAccount.put(loc, accountList);
		  
		  System.out.println(locAccount);
		  
		  
	}
		
		
	}


