package com.trng.d09;

class Student {
	int aadhar, phone, parentPhone;
	String name, addresss;

	public Student(String name, int aadhar, int phone) {
		this(name, aadhar, phone, null, 0);
	}

	public Student(String name, int aadhar, int phone, String address) {
		this(name, aadhar, phone, address, 0);

	}

	public Student(String name, int aadhar, int phone, String address, int parentPhone) {
		this.name = name;
		this.aadhar = aadhar;
		this.phone = phone;
		this.addresss = address;
		this.parentPhone = parentPhone;
	}

	@Override
	public String toString() {
		return "Student [aadhar=" + aadhar + ", phone=" + phone + ", parentPhone=" + parentPhone + ", name=" + name
				+ ", addresss=" + addresss + "]";
	}

}

public class StudentClassAssignment {
	public static void main(String[] args) {
		Student s1 = new Student("xyz", 121212, 1212121212);
		Student s2 = new Student("xyz", 121212, 1212121212, "india");
		Student s3 = new Student("xyz", 121212, 1212121212, "india", 123123);
		System.out.println(s1 + "\n" + s2 + "\n" + s3);
	}
}
