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
        - application: Application
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
        - loanDuration: Integer
        - interestRate: BigDecimal
        - monthlyPayment: BigDecimal
    }

    class InvestimentFund {
        - id: Long
        - number: String
        - investimentValue: BigDecimal
        - deadline: Int
        - interestRate: BigDecimal
    }

    class CreditCard {
        - id: Long
        - number: String
        - limit: BigDecimal
    }

    User "1" *-- "1" Account : has
    User "1" *-- "N" Loan : has
    User "1" *-- "N" InvestimentFund : has
    User "1" *-- "1" CreditCard : has
```
