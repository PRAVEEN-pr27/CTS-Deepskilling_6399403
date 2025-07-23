-- Exercise 1: Control Structures
-- Scenario 1: Apply 1% discount for customers above 60

BEGIN
  FOR rec IN (SELECT CustomerID, Age, InterestRate FROM Customers) LOOP
    IF rec.Age > 60 THEN
      UPDATE Customers
      SET InterestRate = InterestRate - 1
      WHERE CustomerID = rec.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 2: Set IsVIP to TRUE for customers with balance > 10000

BEGIN
  FOR cust IN (SELECT CustomerID, Balance FROM Customers) LOOP
    IF cust.Balance > 10000 THEN
      UPDATE Customers
      SET IsVIP = 'TRUE'
      WHERE CustomerID = cust.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 3: Send reminders for loans due in next 30 days

DECLARE
  CURSOR loan_cur IS
    SELECT LoanID, CustomerID, DueDate
    FROM Loans
    WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
  FOR loan_rec IN loan_cur LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan ' || loan_rec.LoanID ||
      ' for Customer ' || loan_rec.CustomerID ||
      ' is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY')
    );
  END LOOP;
END;
/




