package me.dio.domain.model;

import java.util.List;

public class User {

    private Long id;
    private String name;
    private Account account;
    private CreditCard creditCard;
    private List<Loan> loans;
    private List<InvestimentFund> investimentFunds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public List<InvestimentFund> getInvestimentFunds() {
        return investimentFunds;
    }

    public void setInvestimentFunds(List<InvestimentFund> investimentFunds) {
        this.investimentFunds = investimentFunds;
    }
}
