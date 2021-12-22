package Entities;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	@Table(name="item")
	
	
	public class items {
		
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="item_id")
		private int item_id;
		
			
		@Column(name="Description")
		private String Description;
		
		
		@Column(name="price")
		private int price;
		 
		@Column(name="Image")
		private String Image;
		
		@Column(name="Status")
		private String Status;

		public void setItem_id(int item_id) {
			this.item_id = item_id;
		}

		public void setDescription(String description) {
			Description = description;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public void setImage(String image) {
			Image = image;
		}

		public void setStatus(String status) {
			Status = status;
		}

		public int getItem_id() {
			return item_id;
		}

		public String getDescription() {
			return Description;
		}

		public int getPrice() {
			return price;
		}

		public String getImage() {
			return Image;
		}

		public String getStatus() {
			return Status;
		}
		 
		 
		

}
