package MapInterface.policymanagement;

import java.time.LocalDate;

public class MainClass {
	public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P101", "Alice", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P102", "Bob", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P103", "Alice", LocalDate.now().minusDays(5)));
        manager.addPolicy(new Policy("P104", "Charlie", LocalDate.now().plusDays(25)));

        System.out.println(" Retrieve by Number: " + manager.getPolicyByNumber("P101"));

        System.out.println("\n Policies expiring in 30 days:");
        System.out.println(manager.getPoliciesExpiringIn30Days());

        System.out.println("\n Policies for Alice:");
        System.out.println(manager.getPoliciesByHolder("Alice"));

        System.out.println("\n Removing expired...");
        manager.removeExpiredPolicies();

        System.out.println("\nRemaining Policies:");
        System.out.println(manager.linkedHashMap.values());
    }

}
