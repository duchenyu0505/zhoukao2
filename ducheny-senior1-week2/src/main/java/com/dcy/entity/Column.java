package com.dcy.entity;

public class Column {
		
		private Integer id;
		private String desc;
		private String name;
		private String keyword;
		private String address;
		private Integer money;
		private String birth;
		private String year;
		private String status;
		private String bz;
		
		public Integer getMoney() {
			return money;
		}
		public void setMoney(Integer money) {
			this.money = money;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getKeyword() {
			return keyword;
		}
		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getBirth() {
			return birth;
		}
		public void setBirth(String birth) {
			this.birth = birth;
		}
		public String getYear() {
			return year;
		}
		public void setYear(String year) {
			this.year = year;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getBz() {
			return bz;
		}
		public void setBz(String bz) {
			this.bz = bz;
		}
		
		public Column(Integer id, String desc, String name, String keyword, String address, Integer money, String birth,
				String year, String status, String bz) {
			super();
			this.id = id;
			this.desc = desc;
			this.name = name;
			this.keyword = keyword;
			this.address = address;
			this.money = money;
			this.birth = birth;
			this.year = year;
			this.status = status;
			this.bz = bz;
		}
		public Column() {
			super();
		}
		@Override
		public String toString() {
			return "Column [id=" + id + ", desc=" + desc + ", name=" + name + ", keyword=" + keyword + ", address="
					+ address + ", money=" + money + ", birth=" + birth + ", year=" + year + ", status=" + status
					+ ", bz=" + bz + "]";
		}
		
		
		
}
