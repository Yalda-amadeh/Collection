package account;
import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainAccount {

	public static void main(String[] args) {
		
		Account ac1 = new Account("zahra",001,200);
		Account ac2 = new Account("hamed",001,100);
		Account ac3 = new Account("yalda",002,80);
		Account ac4 = new Account("maryam",002,150);
		Account ac5 = new Account("ahmad",001,70);
		Account ac6 = new Account("ali",002,30);
		
		//Create List of Accounts		
		List<Account> accounts = Arrays.asList(ac1,ac2,ac3,ac4,ac5,ac6);
		
		//Print Accounts
		accounts.forEach(t -> System.out.println(t));

		System.out.println("\n");
		//Sort Accounts by balance
		accounts.sort((p1, p2) -> p1.getBalance() - p2.getBalance());
		Collections.sort( accounts );	
		accounts.forEach(s -> System.out.println(s));

		System.out.println("\n");

		//reverse sort Accounts
		Collections.sort(accounts, Collections.reverseOrder());
		accounts.forEach(v -> System.out.println(v));

		
		//Map
		   Map<Integer, List<Account>> groupBranch = 
			       accounts.stream().collect(Collectors.groupingBy(Account::getBranch));
		   for (Map.Entry<Integer, List<Account>> entry : groupBranch.entrySet()) {
		      Integer key = entry.getKey();
		      List val = entry.getValue();
		      
		    }
		   
		   
		System.out.println("\n");
		//display Map
		   for (Map.Entry<Integer, List<Account>> entry : groupBranch.entrySet()) {
			   System.out.println("Branch : " + entry.getKey()+ "\n" + "Account : " + entry.getValue() );
			   
			
		}
		   
		System.out.println("\n");
		//Remove Branch = 1
		groupBranch.remove(1);
		for (Map.Entry<Integer, List<Account>> entry : groupBranch.entrySet()) {
			   System.out.println("Branch : " + entry.getKey()+ "\n" + "Account : " + entry.getValue() );}
		System.out.println("-----------------------------------------------------------------------");

//Use Lambda --------------------------------------------------------------------------------------------------------------------
		
		//print account which name = "A"
		List<Account> filtername = 
				accounts.stream()
				.filter(p -> p.getName().startsWith("a"))
				.collect(Collectors.toList());
		System.out.println(filtername);

		System.out.println("\n");

		//return accounts which have balance>50 and name = a
		List<Account> filterbalance = 
				accounts.stream()
				.filter(p -> p.getName().startsWith("a"))
				.filter(p -> p.getBalance()>50)
				.collect(Collectors.toList());
		System.out.println(filterbalance);


	

		
		
			  
	}

}
