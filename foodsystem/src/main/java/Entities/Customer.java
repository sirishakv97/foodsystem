package Entities;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="product")
	public class Customer
	{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="Cust_id")
		private int Cust_id;
		
			
		@Column(name="Cust_name")
		private String Cust_name;
		
		
		@Column(name="Cust_email")
		private String Cust_email;
		
		
		@Column(name="Password")
		private String password;
		
			
		@Column(name="Phone")
			private int phone;
			
				
		@Column(name="Address")
			private String Address;


		public int getCust_id() {
			return Cust_id;
		}


		public String getCust_name() {
			return Cust_name;
		}


		public String getCust_email() {
			return Cust_email;
		}


		public String getPassword() {
			return password;
		}


		public int getPhn_num() {
			return phone;
		}


		public String getAddress() {
			return Address;
		}
			
			
		
			
		
		
	
	
	
	}


