package unification;

public interface Term {

	UnificationResult unify(Term secondTerm);

	UnificationResult unifyWithPredicate(PredicateRole predicate);

	UnificationResult unifyWithConstant(Constant numericConstant);

	Term apply(Substitution substitution);

}
