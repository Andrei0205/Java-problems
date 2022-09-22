package unification;
	
public class NumericConstant implements Constant{
	private Number value;
	
	private ResultsFactory resultsFactory;

	@Override
	public UnificationResult unify(Term secondTerm) {
		return secondTerm.unifyWithConstant(this);
	}

	@Override
	public UnificationResult unifyWithPredicate(PredicateRole predicate) {
		return resultsFactory.buildNegativeResponse();
	}

	@Override
	public UnificationResult unifyWithConstant(Constant numericConstant) {
		if(numericConstant.hasTheSameValue(value))
			return resultsFactory.buildPositiveResponse();
		return resultsFactory.buildNegativeResponse();
	}

	@Override
	public boolean hasTheSameValue(Number value) {
		return value.equals(this.value);
	}

	@Override
	public Term apply(Substitution substitution) {
		return this;
	}
	
}
