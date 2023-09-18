# Santander Operacoes-2023
Java RESTful API criada para desafio de projeto para o Bootcamp Santander.

## Diagrama de Calsses

```mermaid
classDiagram
    class User {
        - id: Long
        - name: String
        - account: Account
        - loans: Loan
        - investimentFund: InvestimentFund
        - creditCard: CreditCard
    }

    class Account {
        - id: Long
        - number: String
        - agency: String
        - balance: BigDecimal
        - limit: BigDecimal
    }

    class Loan {
        - id: Long
        - number: String
        - loanValue: BigDecimal
        - loanDuration: Int
        - interestRate: BigDecimal
        - monthlyPayment: BigDecimal
    }

    class InvestimentFund{
        - id: Long
        - number: String
        - investimentDate: Date
        - InvestimentValue: Double
        - interestRate: BigDecimal
        - incomes: BigDecimal
    }

    class CreditCard {
        - id: Long
        - number: String
        - limit: BigDecimal
    }

    User "1" *-- "1" Account : has
    User "1" *-- "N" Loan : has
    User "1" *-- "N" Application : has
    User "1" *-- "1" CreditCard : has
```
