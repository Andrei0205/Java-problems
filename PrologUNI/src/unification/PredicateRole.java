package unification;

import java.util.ArrayList;

public interface PredicateRole extends Term {

	boolean notTheSameName(String name);

	boolean notTheSameNoOfArguments(int size);

	UnificationResult unify(ArrayList<Term> arguments);

}
