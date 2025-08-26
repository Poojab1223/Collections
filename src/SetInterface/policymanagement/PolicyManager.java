package SetInterface.policymanagement;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PolicyManager {
	private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    // 1. Add Policy
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // 2. Get All Unique Policies
    public Set<Policy> getAllUniquePolicies() {
        return new HashSet<>(hashSet);
    }

    // 3. Get Policies Expiring Soon (within 30 days)
    public Set<Policy> getPoliciesExpiringSoon() {
        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);

        Set<Policy> expiringSoon = new TreeSet<>();
        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isBefore(now) && !p.getExpiryDate().isAfter(limit)) {
                expiringSoon.add(p);
            }
        }
        return expiringSoon;
    }

    // 4. Get Policies by Coverage Type
    public Set<Policy> getPoliciesByCoverage(String coverageType) {
        Set<Policy> result = new HashSet<>();
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(coverageType)) {
                result.add(p);
            }
        }
        return result;
    }

    // 5. Find Duplicate Policies (based on policy number)
    public Set<Policy> findDuplicatePolicies(List<Policy> policies) {
        Set<String> seen = new HashSet<>();
        Set<Policy> duplicates = new HashSet<>();

        for (Policy p : policies) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p);
            }
        }
        return duplicates;
    }

    // 6. Performance Comparison
    public void comparePerformance(List<Policy> policies) {
        // HashSet
        long start = System.nanoTime();
        Set<Policy> hSet = new HashSet<>(policies);
        long end = System.nanoTime();
        System.out.println("HashSet add time: " + (end - start) + " ns");

        // LinkedHashSet
        start = System.nanoTime();
        Set<Policy> lhSet = new LinkedHashSet<>(policies);
        end = System.nanoTime();
        System.out.println("LinkedHashSet add time: " + (end - start) + " ns");

        // TreeSet
        start = System.nanoTime();
        Set<Policy> tSet = new TreeSet<>(policies);
        end = System.nanoTime();
        System.out.println("TreeSet add time: " + (end - start) + " ns");
    }

}
