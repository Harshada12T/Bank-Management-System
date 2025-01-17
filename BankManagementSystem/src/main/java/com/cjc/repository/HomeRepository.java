package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.cjc.model.Account;
@Repository
public interface HomeRepository extends CrudRepository<Account,Integer> {

public	Account findByUnameAndPass(String un, String ps);

public Account findById( int ac);

	


}
