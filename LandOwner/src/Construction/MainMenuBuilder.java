package Construction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import UI.DisplayTotalArea;
import UI.Exit;
import UI.Input;
import UI.KeyboardInput;
import UI.Menu;
import UI.MenuRole;
import UI.Option;
import data.LandOwner;

public class MainMenuBuilder {
	
	private LandOwner landOwner;

	MenuRole build() {
		Scanner scanner = new Scanner(System.in);
		Input input = new KeyboardInput(scanner);
		Map<Integer, Option> map = new HashMap<Integer,Option>();
		ArrayList<Option> options = new ArrayList<Option>();
		
		Option displayTotalArea = new DisplayTotalArea(landOwner, "Display area -> 1");
		map.put(1, displayTotalArea);
		options.add(displayTotalArea);
		
		Option exit = new Exit("Exit program -> 3");
		map.put(3, exit);
		options.add(exit);
		
		
		Menu menu = new Menu(input, map, options);
		return menu;
	}}
