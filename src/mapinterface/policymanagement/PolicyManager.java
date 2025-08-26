package MapInterface.policymanagement;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
	private Map<String, Policy> hashMap = new HashMap<>();          // Fast lookup by ID
    public Map<String, Policy> linkedHashMap = new LinkedHashMap<>(); // Keeps insertion order
    private TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>(); // Sorted by expiry date

    // Add a policy
    public void addPolicy(Policy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);

        // Group policies by expiry date inside TreeMap
        treeMap.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }

    // Retrieve by policy number
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    // List policies expiring in next 30 days
    public List<Policy> getPoliciesExpiringIn30Days() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        List<Policy> result = new ArrayList<>();
        for (Map.Entry<LocalDate, List<Policy>> entry : treeMap.subMap(today, true, limit, true).entrySet()) {
            result.addAll(entry.getValue());
        }
        return result;
    }

    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String holderName) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : hashMap.values()) {
            if (policy.getPolicyHolderName().equalsIgnoreCase(holderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        // Remove from hashMap + linkedHashMap
        hashMap.values().removeIf(p -> p.getExpiryDate().isBefore(today));
        linkedHashMap.values().removeIf(p -> p.getExpiryDate().isBefore(today));

        // Remove from treeMap
        treeMap.headMap(today, false).clear();
    }

}
