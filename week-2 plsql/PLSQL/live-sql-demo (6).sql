CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  UPDATE Accounts
  SET Balance = Balance + (Balance * 0.01),
      LastModified = SYSDATE
  WHERE AccountType = 'Savings';
  
  DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');
END;
/
BEGIN
  ProcessMonthlyInterest;
END;
/
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  p_department IN VARCHAR2,
  p_bonus_percent IN NUMBER
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * (p_bonus_percent / 100))
  WHERE Department = p_department;

  DBMS_OUTPUT.PUT_LINE('Bonus applied to department: ' || p_department);
END;
/
BEGIN
  UpdateEmployeeBonus('IT', 10); -- Adds 10% bonus to IT department
END;
/
CREATE OR REPLACE PROCEDURE TransferFunds(
  p_from_account IN NUMBER,
  p_to_account IN NUMBER,
  p_amount IN NUMBER
) AS
  v_balance NUMBER;
BEGIN
  -- Get current balance of the source account
  SELECT Balance INTO v_balance
  FROM Accounts
  WHERE AccountID = p_from_account;

  -- Check if balance is sufficient
  IF v_balance < p_amount THEN
    DBMS_OUTPUT.PUT_LINE('Insufficient balance in source account.');
  ELSE
    -- Deduct from source
    UPDATE Accounts
    SET Balance = Balance - p_amount,
        LastModified = SYSDATE
    WHERE AccountID = p_from_account;

    -- Add to destination
    UPDATE Accounts
    SET Balance = Balance + p_amount,
        LastModified = SYSDATE
    WHERE AccountID = p_to_account;

    DBMS_OUTPUT.PUT_LINE('Transfer successful: ' || p_amount || ' transferred.');
  END IF;
END;
/
BEGIN
  TransferFunds(1, 2, 500); -- Transfers 500 from AccountID 1 to 2
END;
/