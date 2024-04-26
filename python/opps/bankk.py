class BankAccount:
    def __init__(self, title, balance, account_no):
        self.__title = title
        self.__balance = balance
        self.__account_no = account_no
    
    def deposit(self, amount):
        self.balance += amount
        print(f"Deposited {amount} into {self.title}. New balance: {self.balance}")
    
    def withdraw(self, amount):
        if amount <= self.balance:
            self.balance -= amount
            print(f"Withdrew {amount} from {self.title}. New balance: {self.balance}")
        else:
            print("Insufficient funds.")
    
    def display(self):
        print(f"Account Title: {self.title}")
        print(f"Account Number: {self.account_no}")
        print(f"Current Balance: {self.balance}")


class SavingsAccount(BankAccount):
    def init(self, title, balance, account_no, interest_rate):
        super().init(title, balance, account_no)
        self.interest_rate = interest_rate
    
    def calculate_interest(self):
        interest = self.balance * (self.interest_rate / 100)
        print(f"Interest earned: {interest}")
        return interest
    
    def display_with_interest(self):
        self.display()
        self.calculate_interest()


class CurrentAccount(BankAccount):
    def init(self, title, balance, account_no, overdraft_limit):
        super().init(title, balance, account_no)
        self.overdraft_limit = overdraft_limit
    
    def calculate_overdraft_fee(self):
        if self.balance < 0:
            fee = abs(self.balance) * 0.05  # Assuming 5% overdraft fee
            print(f"Overdraft fee charged: {fee}")
            return fee
        else:
            print("No overdraft fee charged.")
            return 0
    
    def display_with_overdraft_fee(self):
        self.display()
        self.calculate_overdraft_fee()


# Example usage
savings_acc = SavingsAccount("Savings", 1000, "SA123", 2.5)
savings_acc.display_with_interest()  # Display with interest
savings_acc.deposit(500)
savings_acc.withdraw(200)
print()

current_acc = CurrentAccount("Current", 2000, "CA456", 1000)
current_acc.display_with_overdraft_fee()  # Display with overdraft fee
current_acc.deposit(300)
current_acc.withdraw(2500)