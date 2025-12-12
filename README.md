# Bankonit1 

Bank-on-it-Pt-I

Start the program.

Set up accounts:

Create a CheckingAccount with $100.

Create a SavingsAccount with $200.

Set up the user (Customer):

Make a Customer named "Alice" with PIN "1111".

Give Alice both the checking and savings accounts.

Ask the user to log in:

Prompt: "Enter username:"

Prompt: "Enter PIN:"

Check if the input matches Alice's username and PIN.

If it matches: show "Login Successful".

If not: show "Login failed." and stop there.

If login is successful:

Show the Customer Menu:

Customer Menu

Checking Account
Savings Account
Quit Ask the user to pick an option (1–3).
Keep looping this menu until the user picks 3 (Quit).

If user picks Checking or Savings account:

Show the Account Menu:

Account menu 0) quit

check balance
make a deposit
make a withdrawal Ask the user to choose an option (0–3).
Repeat the account menu until the user chooses 0 (to go back to the Customer Menu).

What each account option does:

Option 1 – Check Balance:

Print the balance (formatted like $100.00).

Option 2 – Deposit:

Ask for the deposit amount.

Add that amount to the account balance.

Show “Deposit successful.”

Option 3 – Withdrawal:

Ask for the withdrawal amount.

If there’s enough money:

Subtract it from the balance.

Show “Withdrawal successful.”

If not enough money:

Show “Insufficient funds.”

Quit:

If the user picks "3" from the customer menu, or "0" from the account menu, go back or exit.

End the program.
