package SetInterface.policymanagement;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Policy implements Comparable<Policy>{

	 private String policyNumber;   // unique identifier
	    private String policyHolderName;
	    private LocalDate expiryDate;
	    private String coverageType;
	    private double premiumAmount;

	    public Policy(String policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
	        this.policyNumber = policyNumber;
	        this.policyHolderName = policyHolderName;
	        this.expiryDate = expiryDate;
	        this.coverageType = coverageType;
	        this.premiumAmount = premiumAmount;
	    }

	    public String getPolicyNumber() { return policyNumber; }
	    public String getPolicyHolderName() { return policyHolderName; }
	    public LocalDate getExpiryDate() { return expiryDate; }
	    public String getCoverageType() { return coverageType; }
	    public double getPremiumAmount() { return premiumAmount; }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Policy)) return false;
	        Policy policy = (Policy) o;
	        return Objects.equals(policyNumber, policy.policyNumber);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(policyNumber);
	    }

	    @Override
	    public int compareTo(Policy other) {
	        return this.expiryDate.compareTo(other.expiryDate); // Sorted by expiryDate
	    }

	    @Override
	    public String toString() {
	        return String.format("Policy[%s, %s, Expiry=%s, Coverage=%s, Premium=%.2f]",
	                policyNumber, policyHolderName, expiryDate, coverageType, premiumAmount);
	    }
}
