package com.cjc.serviceI;

import com.cjc.model.Account;

public interface HomeServiceI {

public	void saveData(Account a);

public	Account logincheck(String un, String ps);

public Iterable<Account> displayAllData();

public Account withdraw(int ac, int am);



public Account deposit(int ac, int am);



}
