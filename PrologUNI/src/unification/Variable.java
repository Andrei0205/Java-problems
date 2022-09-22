package unification;

public class Variable implements Term, VariableRole {
	
	private String name;
	private ResultsFactory resultsFactory;
	
	@Override
	public UnificationResult unify(Term secondTerm) {
		return resultsFactory.buildPositiveResponse(this,secondTerm);
	}

	@Override
	public UnificationResult unifyWithPredicate(PredicateRole predicate) {

		return unify(predicate);
	}

	@Override
	public UnificationResult unifyWithConstant(Constant numericConstant) {
		return unify(numericConstant);
	}

	@Override
	public Term apply(Substitution substitution) {
		if(substitution.hasTheSameName(name)) {
			return substitution.getTerm();
		}
		return this;
	}

	@Override
	public boolean hasTheSameName(String name) {
		return this.name.equals(name);
	}
	
}
