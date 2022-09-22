package unification;

public interface ResultsFactory {

	UnificationResult buildNegativeResponse();

	UnificationResult buildPositiveResponse();

	UnificationResult buildPositiveResponse(VariableRole variable, Term secondTerm);

}
