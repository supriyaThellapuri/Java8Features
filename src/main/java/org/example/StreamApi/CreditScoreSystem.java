package org.example.StreamApi;

public class CreditScoreSystem {
    private String name;
    private double income;
    private double debt;
    private int paymentHistory;// Assuming a scale from 1 to 10, 10 being the best

    public CreditScoreSystem(String name, double income, double debt, int paymentHistory) {
        this.name = name;
        this.income = income;
        this.debt = debt;
        this.paymentHistory = paymentHistory;
    }

   /*public String getName() {
        return name;
   }

   public double getIncome() {
        return income;
   }
   public double getDebt() {
        return debt;
   }
   public int getPaymentHistory() {
        return paymentHistory;
   }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public int getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(int paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    @Override
    public String toString() {
        return "CreditScoreSystem{" +
                "name='" + name + '\'' +
                ", income=" + income +
                ", debt=" + debt +
                ", paymentHistory=" + paymentHistory +
                '}';
    }
}



