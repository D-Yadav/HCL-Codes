package com.hcl.Project2;

import java.util.ArrayList;
import java.util.List;
public class CustomerDAO {
	static List<Customer> LstCustomer = null;
	static {
		LstCustomer  = new ArrayList<Customer>();
	}
	private int custid;
	public String addCustomerDAO(Customer customer){
		LstCustomer.add(customer);
		return "Customer Created Successfully...";
	}
	public List<Customer> showCustomerDAO(){
		return LstCustomer;
		
	}
	public Customer searchCustomerDAO(int custid){
		Customer objCustomer=null;
		for (Customer customer : LstCustomer) {
			if(customer.getCustId()==custid){
				objCustomer=customer;
			}
		}
		return objCustomer;
	}
	public String deleteCustomerDAO(int custid){
		String result="";
		Customer customer=searchCustomerDAO(custid);
		if(customer!=null){
			LstCustomer.remove(customer);
			result="Customer record deleted Successfully...";
			
	}else{
		result ="Customer Record Not Found!...";
	  }
		return result;
	  }
	public String updateCustomerDAO(Customer objCustomer){
		Customer customer=searchCustomerDAO(objCustomer.getCustId());
		String result="";
		if(customer!=null){
			for(Customer s : LstCustomer){
				if(s.getCustId()==objCustomer.getCustId()){
					s.setCustName(objCustomer.getCustName());
					s.setAnnualPremium(objCustomer.getAnnualPremium());
					s.setModalPremium(objCustomer.getModalPremium());
					s.setPaymentMode(objCustomer.getPaymentMode());
				}
			}
			result="Customer record updated...";
		}else{
			result="Customer Record Not Found!...";
		}
		return null;
}
}