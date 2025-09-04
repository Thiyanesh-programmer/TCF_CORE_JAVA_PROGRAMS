package com.TCF.encapsulationjava;

public class encapsulation {
		private int cId;
		private String name;
		private String address;
		public int getcId() {
			return cId;
		}
		public void setcId(int cId) {
			this.cId = cId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Class: demoEncapsulation ; Values:[cId=" + cId + ", name=" + name + ", address=" + address + "]";
		}
		
	}