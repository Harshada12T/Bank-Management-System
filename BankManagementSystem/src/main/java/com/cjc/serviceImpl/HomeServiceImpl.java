package com.cjc.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Account;
import com.cjc.repository.HomeRepository;
import com.cjc.serviceI.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI {
@Autowired
HomeRepository hr;

	@Override
	public void saveData(Account a) {
		
		hr.save(a);
	}
	@Override
	public Account logincheck(String un, String ps) {
		return hr.findByUnameAndPass(un,ps);
	
	}
	@Override
	public Iterable<Account> displayAllData() {
		return hr.findAll();
	
	}
	@Override
	public Account withdraw(int ac, int am) {
Account account=hr.findById(ac);
		if(account !=null)
		{
			account.setBalance(account.getBalance() - am);
			hr.save(account);
		}
		return account;
	}
	@Override
	public Account deposit(int ac, int am) {
		Account account=hr.findById(ac);
		if(account !=null)
		{
			account.setBalance(account.getBalance() + am);
			hr.save(account);
		}
		return account;
	}

}
