package unification;

public interface UnificationResult {

	boolean isUnifing();

	void addTo(UnificationResult result);

	Term applySubstitutionsTo(Term firstTerm);

}
