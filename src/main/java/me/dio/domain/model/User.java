package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private CreditCard creditCard;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Loan> loans;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
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
