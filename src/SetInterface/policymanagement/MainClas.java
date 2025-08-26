package SetInterface.policymanagement;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class MainClas {
	public static void main(String[] args) {
		PolicyManager manager = new PolicyManager();

        // Sample Policies
        List<Policy> policies = Arrays.asList(
                new Policy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000),
                new Policy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 3000),
                new Policy("P003", "Charlie", LocalDate.now().plusDays(20), "Home", 4500),
                new Policy("P004", "David", LocalDate.now().plusDays(5), "Health", 6000),
                new Policy("P001", "Alice Duplicate", LocalDate.now().plusDays(15), "Health", 5200) // duplicate
        );

        // Add Policies
        for (Policy p : policies) {
            manager.addPolicy(p);
        }

        // Display Results
        System.out.println("\nAll Unique Policies:");
        System.out.println(manager.getAllUniquePolicies());

        System.out.println("\nPolicies Expiring Soon (30 days):");
        System.out.println(manager.getPoliciesExpiringSoon());

        System.out.println("\nPolicies with Coverage = Health:");
        System.out.println(manager.getPoliciesByCoverage("Health"));

        System.out.println("\nDuplicate Policies:");
        System.out.println(manager.findDuplicatePolicies(policies));

        System.out.println("\nPerformance Comparison:");
        manager.comparePerformance(policies);
        
	}
}
