package me.dio.domain.model;

import java.math.BigDecimal;
import java.util.Date;

public class InvestimentFund {

    private Long id;
    private String number;
    private Date investimentDate;
    private BigDecimal InvestimentValue;
    private int interestRate;
    private BigDecimal monthlyPayment;
    private BigDecimal incomes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getInvestimentDate() {
        return investimentDate;
    }

    public void setInvestimentDate(Date investimentDate) {
        this.investimentDate = investimentDate;
    }

    public BigDecimal getInvestimentValue() {
        return InvestimentValue;
    }

    public void setInvestimentValue(BigDecimal investimentValue) {
        InvestimentValue = investimentValue;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(BigDecimal monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public BigDecimal getIncomes() {
        return incomes;
    }

    public void setIncomes(BigDecimal incomes) {
        this.incomes = incomes;
    }
}
