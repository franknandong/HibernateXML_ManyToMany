package com.fndong.role;
// Generated Mar 15, 2016 5:55:09 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Transactions generated by hbm2java
 */
public class Transactions implements java.io.Serializable {

	private Integer transactionId;
	private String transactionName;
	private Set<Role> roles = new HashSet<Role>(0);

	public Transactions() {
	}

	public Transactions(String transactionName) {
		this.transactionName = transactionName;
	}

	public Transactions(String transactionName, Set<Role> roles) {
		this.transactionName = transactionName;
		this.roles = roles;
	}

	public Integer getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionName() {
		return this.transactionName;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
