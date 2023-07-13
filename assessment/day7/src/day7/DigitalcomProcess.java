package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\n1. RegisterUser");
			System.out.println("2. ViewGames");
			System.out.println("3. SearchByName");
			System.out.println("4. Exit\n");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				
			case 1 : 
				System.out.println("Enter user id");
				String userid = sc.next();
				System.out.println("Enter user password");
				String password = sc.next();
				User u1 = new User();
				u1.addUser(userid,password);
				break;
				
			case 2 :
				GameService gs = new GameService();
				List<Game> li = new ArrayList<Game>();
				li = gs.viewAll();
				System.out.println("Games name are : ");
				for(Game g : li)
					System.out.println(g.getGameName());
				break;
			
			case 3 :
				System.out.println("Enter author name");
				String author = sc.next();
				GameService gs1 = new GameService();
				System.out.println("Author's game " + gs1.authorSearch(author));
				break;
			
			default :
				sc.close();
				System.exit(0);
				
			}
		}
	}

}
