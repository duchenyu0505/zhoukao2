package com.dcy.entity;

public class Conditions {
	
		private Integer id;
		private String desc;
		private String name;
		private String keyword;
		private String address;
		private Integer maxMen;
		private Integer minMen;
		private String bmin;
		private String bmax;
		private String ymin;
		private String ymax;
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
		public Integer getMaxMen() {
			return maxMen;
		}
		public void setMaxMen(Integer maxMen) {
			this.maxMen = maxMen;
		}
		public Integer getMinMen() {
			return minMen;
		}
		public void setMinMen(Integer minMen) {
			this.minMen = minMen;
		}
		public String getBmin() {
			return bmin;
		}
		public void setBmin(String bmin) {
			this.bmin = bmin;
		}
		public String getBmax() {
			return bmax;
		}
		public void setBmax(String bmax) {
			this.bmax = bmax;
		}
		public String getYmin() {
			return ymin;
		}
		public void setYmin(String ymin) {
			this.ymin = ymin;
		}
		public String getYmax() {
			return ymax;
		}
		public void setYmax(String ymax) {
			this.ymax = ymax;
		}
		public Conditions(Integer id, String desc, String name, String keyword, String address, Integer maxMen,
				Integer minMen, String bmin, String bmax, String ymin, String ymax) {
			super();
			this.id = id;
			this.desc = desc;
			this.name = name;
			this.keyword = keyword;
			this.address = address;
			this.maxMen = maxMen;
			this.minMen = minMen;
			this.bmin = bmin;
			this.bmax = bmax;
			this.ymin = ymin;
			this.ymax = ymax;
		}
		public Conditions() {
			super();
		}
		@Override
		public String toString() {
			return "Conditions [id=" + id + ", desc=" + desc + ", name=" + name + ", keyword=" + keyword + ", address="
					+ address + ", maxMen=" + maxMen + ", minMen=" + minMen + ", bmin=" + bmin + ", bmax=" + bmax
					+ ", ymin=" + ymin + ", ymax=" + ymax + "]";
		}
		
		
		
}
