package Entities;

	import java.sql.Date;

import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	@Table(name="item")
	
	
	public class Orders {
		
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="item_id")
		private int item_id;
		
			
		@Column(name="name")
		private String name;
		
		
		@Column(name="price")
		private int price;
		 
		@Column(name="quantity")
		private String quantity;
		
		@Column(name="order_date")
		private Date order_date;
		
		@Column(name="order_id")
		private String order_id;

		public void setItem_id(int item_id) {
			this.item_id = item_id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public void setOrder_date(Date order_date) {
			this.order_date = order_date;
		}

		public void setOrder_id(String order_id) {
			this.order_id = order_id;
		}

		public int getItem_id() {
			return item_id;
		}

		public String getName() {
			return name;
		}

		public int getPrice() {
			return price;
		}

		public String getQuantity() {
			return quantity;
		}

		public Date getOrder_date() {
			return order_date;
		}

		public String getOrder_id() {
			return order_id;
		}
		

}
