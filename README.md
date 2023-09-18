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
        - balance: Double
        - limit: Double
    }

    class Loan {
        - id: Long
        - number: String
        - loanValue: Double
        - loanDuration: Integer
        - interestRate: BigDecimal
        - monthlyPayment: BigDecimal
    }

    class InvestimentFund {
        - id: Long
        - number: String
        - investimentValue: Double
        - deadline: Int
        - interestRate: Double
        - incomes: Double
    }

    class CreditCard {
        - id: Long
        - number: String
        - limit: Double
    }

    User "1" *-- "1" Account : has
    User "1" *-- "N" Loan : has
    User "1" *-- "N" InvestimentFund : has
    User "1" *-- "1" CreditCard : has
```
