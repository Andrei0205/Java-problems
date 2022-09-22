package unification;

import java.util.ArrayList;

public class PostiveUnificationResult implements UnificationResult {

	private ArrayList<Substitution> substitutions;

	@Override
	public boolean isUnifing() {
		return true;
	}

	@Override
	public void addTo(UnificationResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public Term applySubstitutionsTo(Term firstTerm) {
		
		Term result=firstTerm;
		for (Substitution substitution : substitutions) {
			result = result.apply(substitution);
		}
		return result;
	}

}

// Daca unificam p(X,1) cu p(Z,Z)
// X se substituie cu Z
// Z se substituie cu 1