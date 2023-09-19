package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "tb_investimentFund")
public class InvestimentFund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    private Date investimentDate;

    @Column(precision = 13, scale = 2)
    private BigDecimal InvestimentValue;

    @Column(precision = 13, scale = 2)
    private BigDecimal interestRate;

//    @Column(precision = 13, scale = 2)
//    private BigDecimal incomes;

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

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

}
