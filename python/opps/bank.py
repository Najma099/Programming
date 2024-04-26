class bank_account:
    def __init__(self,title,balance,ac_no):
        self.__title=title
        self.__balance=balance
        self.___ac_no=ac_no

    def getbalance(self):
        return self.__balance
    def setbalance(self,new_balance):
        self.__balance= new_balance

    def gettitle(self):
        return self.__title
    def settitle(self,new_title):
        self.__balance= new_title
    
T=bank_account("Najma",5600,987765443234356)
print (T.balance)