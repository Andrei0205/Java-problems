package reverse;

import java.util.Map;

import commands.Command;

public class Processor {
	
	
	
	private Input input;
	private Map<Integer,Command> commandMap;
	
	public void process() {
		
		while(input.hasData()) {
			
			int commandCode=input.getInt();
			Command command = commandMap.get(commandCode);
			command.process();
	
		}
		
	}
}
