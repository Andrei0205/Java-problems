package unification;

import java.util.ArrayList;

public class Predicate implements PredicateRole {
	private ResultsFactory resultsFactory;
	private String name;
	private ArrayList<Term> arguments;

	public UnificationResult unifyWithPredicate(PredicateRole predicate) {
		if (predicate.notTheSameName(name)) {
			return resultsFactory.buildNegativeResponse();
		}
		if (predicate.notTheSameNoOfArguments(arguments.size())) {
			return resultsFactory.buildNegativeResponse();
		}
		return predicate.unify(arguments);

	}

	@Override
	public boolean notTheSameName(String name) {
		if (this.name.equals(name))
			return false;
		return true;
	}

	@Override
	public boolean notTheSameNoOfArguments(int size) {
		if (arguments.size() == size)
			return false;
		return true;
	}

	@Override
	public UnificationResult unify(ArrayList<Term> arguments) {
		UnificationResult result = resultsFactory.buildPositiveResponse();
		for (int i = 0; i < arguments.size(); i++) {
			Term firstTerm = arguments.get(i);
			Term secondTerm = this.arguments.get(i);

			firstTerm=result.applySubstitutionsTo(firstTerm);
			secondTerm=result.applySubstitutionsTo(secondTerm);
			
			UnificationResult tempResult = firstTerm.unify(secondTerm);

			if (tempResult.isUnifing()) {
				tempResult.addTo(result);
				continue;
			}

			return resultsFactory.buildNegativeResponse();
		}
		return result;
	}

	@Override
	public UnificationResult unify(Term secondTerm) {

		return secondTerm.unifyWithPredicate(this);
	}

	@Override
	public UnificationResult unifyWithConstant(Constant numericConstant) {

		return numericConstant.unifyWithPredicate(this);
	}

	@Override
	public Term apply(Substitution substitution) {
		ArrayList<Term> subtitutedArguments= new ArrayList<Term>();
		
		for (Term term : arguments) {
			Term substitutedTerm = term.apply(substitution);
			subtitutedArguments.add(substitutedTerm);
		}
		return new Predicate(name,subtitutedArguments);
	}
}

// _ variable implementation
// MGU for the substitution list 
