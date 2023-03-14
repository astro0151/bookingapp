/*
 * entity class 
 *  src/main/java-->/com.sagarpathlab.registermodule/com.sagarpathlab.registermodule.entity
 */
package com.sagarpathlab.registermodule.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order_details")
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

	private String gender;
	private String address;
	private String dob;
	
//	    @Column(name = "Mob_number")
	    private String mo_number;
	    private String name;
		/**
		 * @return the order_id
		 */
		public int getOrder_id() {
			return order_id;
		}
		/**
		 * @param order_id the order_id to set
		 */
		public void setOrder_id(int order_id) {
			this.order_id = order_id;
		}
		/**
		 * @return the gender
		 */
		public String getGender() {
			return gender;
		}
		/**
		 * @param gender the gender to set
		 */
		public void setGender(String gender) {
			this.gender = gender;
		}
		/**
		 * @return the address
		 */
		public String getAddress() {
			return address;
		}
		/**
		 * @param address the address to set
		 */
		public void setAddress(String address) {
			this.address = address;
		}
		/**
		 * @return the dob
		 */
		public String getDob() {
			return dob;
		}
		/**
		 * @param dob the dob to set
		 */
		public void setDob(String dob) {
			this.dob = dob;
		}
		/**
		 * @return the mo_number
		 */
		public String getMo_number() {
			return mo_number;
		}
		/**
		 * @param mo_number the mo_number to set
		 */
		public void setMo_number(String mo_number) {
			this.mo_number = mo_number;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "CustomerDetails [order_id=" + order_id + ", gender=" + gender + ", address=" + address + ", dob="
					+ dob + ", mo_number=" + mo_number + ", name=" + name + "]";
		}
	    
	    
	


	
	
	
	
	
	
	
	 
	
}
