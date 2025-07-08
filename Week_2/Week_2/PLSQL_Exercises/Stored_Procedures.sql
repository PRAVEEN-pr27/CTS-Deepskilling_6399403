-- Exercise 3: Stored Procedures

-- Scenario 1: ProcessMonthlyInterest
-- Description: This procedure applies 1% interest to all savings accounts.

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  FOR acc IN (SELECT AccountID, Balance FROM Accounts WHERE AccountType = 'Savings') LOOP
    UPDATE Accounts
    SET Balance = Balance + (acc.Balance * 0.01)
    WHERE AccountID = acc.AccountID;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 2: UpdateEmployeeBonus
-- Description: This procedure gives a percentage bonus to employees in a specified department.

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  dept_name IN VARCHAR2,
  bonus_percent IN NUMBER
) IS
BEGIN
  FOR emp IN (SELECT EmployeeID, Salary FROM Employees WHERE Department = dept_name) LOOP
    UPDATE Employees
    SET Salary = Salary + (emp.Salary * bonus_percent / 100)
    WHERE EmployeeID = emp.EmployeeID;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 3: TransferFunds
-- Description: This procedure transfers a specified amount from one account to another.

CREATE OR REPLACE PROCEDURE TransferFunds (
  from_acc IN NUMBER,
  to_acc IN NUMBER,
  amount IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance
  FROM Accounts
  WHERE AccountID = from_acc FOR UPDATE;

  IF v_balance >= amount THEN
    UPDATE Accounts
    SET Balance = Balance - amount
    WHERE AccountID = from_acc;

    UPDATE Accounts
    SET Balance = Balance + amount
    WHERE AccountID = to_acc;

    COMMIT;
  ELSE
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance for transfer');
  END IF;
END;
/
