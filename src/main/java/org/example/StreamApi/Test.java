package org.example.StreamApi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<CreditScoreSystem> customers = List.of(
                new CreditScoreSystem("John", 70000, 20000, 8),
                new CreditScoreSystem("Jane", 50000, 10000, 6),
                new CreditScoreSystem("Bob", 5000, 30000, 4)

        );



        List<CreditScoreSystem> highCreditScoreCustomers = customers.stream()
                .filter(customer -> customer.getIncome() >= 50000 && customer.getPaymentHistory() >= 5)
                .collect(Collectors.toList());

        List<CreditScoreSystem> sortedCustomers = customers.stream()
                .sorted(Comparator.comparingInt(customer -> (int) (customer.getIncome() - customer.getDebt() + customer.getPaymentHistory())))
                .collect(Collectors.toList());

        List<CreditScoreSystem> highRiskCustomers = customers.stream()
                .filter(customer -> customer.getDebt() > customer.getIncome())
                .collect(Collectors.toList());







        // Generate credit reports
        generateCreditReport("High Credit Score Customers", highCreditScoreCustomers);
        generateCreditReport("Average-Risk Customers", sortedCustomers);
        generateCreditReport("High-Risk Customers", highRiskCustomers);
    }

    private static void generateCreditReport(String title, List<CreditScoreSystem> customers) {
        System.out.println(title + ":");
        customers.forEach(customer -> System.out.println(customer.toString()));
        System.out.println("\n");
    }
    }

