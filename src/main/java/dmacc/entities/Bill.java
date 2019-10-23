package dmacc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="billno")
	private long billNo;
	private String name;
	private String phone;
	private String device;
	private double amount;
	@Autowired
	private Address address;

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(String name) {
		super();
		this.name = name;
	}

	public Bill(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public Bill(String name, String phone, String device) {
		super();
		this.name = name;
		this.phone = phone;
		this.device = device;
	}

	public Bill(String name, String phone, String device, double amount) {
		super();
		this.name = name;
		this.phone = phone;
		this.device = device;
		this.amount = amount;
	}

	public Bill(long billNo, String name, String phone, String device, double amount) {
		super();
		this.billNo = billNo;
		this.name = name;
		this.phone = phone;
		this.device = device;
		this.amount = amount;
	}

	/**
	 * @return the billNo
	 */
	public long getBillNo() {
		return billNo;
	}

	/**
	 * @param billNo the billNo to set
	 */
	public void setBillNo(long billNo) {
		this.billNo = billNo;
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

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the device
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * @param device the device to set
	 */
	public void setDevice(String device) {
		this.device = device;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", name=" + name + ", phone=" + phone + ", device=" + device + ", amount="
				+ amount + ", address=" + address + "]";
	}

}
