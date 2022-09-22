package unification;

public interface Constant extends Term {

	boolean hasTheSameValue(Number value);

	UnificationResult unifyWithPredicate(PredicateRole predicate);

}
