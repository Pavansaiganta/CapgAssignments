package streamApiAssignment;




import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;




public class StreamApi1 {
	
	
	

	static List<Account> allAccounts;
	static Collection<Account> list;

	public static void main(String[] args) {
		
		  Account a1 = new Account(1,"abc", 35000, "Chennai");
		  Account a2 = new Account(2,"def", 14500, "Hyderabad");
		  Account a3 = new Account(3,"ghi", 3000, "Mumbai");
		  Account a4 = new Account(4,"jkl", 8000, "Mumbai");
		  Account a5 = new Account(5,"mno", 3000, "Bangalore");
		  
		  allAccounts = Arrays.asList(a1,a2,a3,a4,a5);
		 
//		  list.stream().forEach(e->System.out.println(e));
		  
		  System.out.println(getAccountOfMinBalance());
		  System.out.println(getAccountOfMaxBalance());
		  

	}//end main
	
	public static Account getAccountOfMaxBalance() {
		Comparator<Account> com1 = (a1,a2)->{
			return (a1.getBalance() + a2.getBalance());
		};
		
		Account a = 
				allAccounts.stream().max(com1).get();
		return a;
	}

	public static Account getAccountOfMinBalance()
	{
		
		Comparator<Account> com = (a1,a2)->{
			return (a1.getBalance() - a2.getBalance());
		};
		
		Account a = 
				allAccounts.stream().min(com).get();
		return a;
		
	}
	

	
//	public static List<Account> makeSomeChanges()
//	{
//		List<Account> outputList = 
//			allAccounts.stream().
//			filter((emp)->{
//			if(emp.getBalance()>1500) return true;
//			else return false;
//		    }).
//			map(emp->{
//				double oldSalary = emp.getBalance();
//				double newSalary = oldSalary*1.2;
//				emp.setBalance(newSalary);
//				return emp;
//			}).collect(Collectors.toList());
//		
//		return outputList;
//		
//		
//	}
//	
		
	
	
	
	
	
	
	
	
	

}
