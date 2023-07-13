package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameService {

	private static List<Game> games = new ArrayList<Game>();
	
	public GameService() {
		Game g1 = new Game("SnowBird","Danny",300);
		games.add(g1);
		games.add(new Game("FreshFood","Ram",450));
		games.add(new Game("Batsman","Kate",400));
		games.add(new Game("Pokiman","Steeve",600));
		games.add(new Game("YammyTommy","Narayan",350));
	}
	
	
	public List<Game> viewAll() {
		return games;
	}
	
	public String authorSearch(String author) {
		
		for(Game g : games)
		{
			if(g.getAuthorName().equals(author))
				return g.getGameName();

		}
		
		System.out.println("Author is not found");
		return null;
		
	}
}
