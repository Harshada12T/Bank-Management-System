package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Account;
import com.cjc.serviceI.HomeServiceI;

@Controller
public class HomeController {
	@Autowired
	HomeServiceI hs;
@RequestMapping("/")
public String prehome()
{
	return "home";
}
@RequestMapping("/register")
public String reg()
{
	return "register";
}
@RequestMapping("/regData")
public String register(@ModelAttribute Account a,Model m)
{
	hs.saveData(a);
	return "success";
}
@RequestMapping("/login")
public String log()
{
	return "login";
}
@RequestMapping("/log")
public String logincheck(@RequestParam("uname")String un,@RequestParam("pass")String ps,Model m)
{
	Account a=hs.logincheck(un,ps);
	Iterable<Account> al=hs.displayAllData();
	m.addAttribute("data",al);
	return "success";
}
@RequestMapping("/deposit")
public String deposit(@RequestParam("accountno")int ac,@RequestParam("amount")int am,Model m )
{
	Account a=hs.deposit(ac,am);
	Iterable<Account> al=hs.displayAllData();
	m.addAttribute("data",al);
	return "success";
}
@RequestMapping("/withdraw")
public String withdraw(@RequestParam("accountno")int ac,@RequestParam("amount")int am,Model m )
{
	Account a=hs.withdraw(ac,am);
	Iterable<Account> al=hs.displayAllData();
	m.addAttribute("data",al);
	return "success";
}
}
