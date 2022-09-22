package unification;

public class Substitution {
	
	private VariableRole variable;
	private Term term;
	
	public boolean hasTheSameName(String name) {
		
		return variable.hasTheSameName(name);
	}

	public Term getTerm() {
		return term;
	}
	

}
