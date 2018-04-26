package com.experience.dto;

import java.util.List;

import com.experience.model.Person;
import com.experience.model.VenueMaster;

public class VenueDto {

	    private Integer id;
	    private String venuename;
	    private String streetno;
	    private String streetname;
	    private String city;
	    private String postalcode;
	    private String province;
	    private String country;
	    private String landmark;
	    private String capacity;
	    private String available;
	    private String otherdetails;
	    private String contactno;
	    private String altercontact;
	    private List<Person> venueContacts; 
		
		public VenueDto() {
		}
		
		public VenueDto(Integer id, String venuename, String streetno, String streetname, String city,
				String postalcode, String province, String country, String landmark, String capacity, String available,
				String otherdetails, String contactno, String altercontact, List<Person> venueContacts) {
			this.id = id;
			this.venuename = venuename;
			this.streetno = streetno;
			this.streetname = streetname;
			this.city = city;
			this.postalcode = postalcode;
			this.province = province;
			this.country = country;
			this.landmark = landmark;
			this.capacity = capacity;
			this.available = available;
			this.otherdetails = otherdetails;
			this.contactno = contactno;
			this.altercontact = altercontact;
			this.venueContacts = venueContacts;
		}
		
		public VenueMaster getModelFromDTO() {
			VenueMaster venueMaster = new VenueMaster();
			venueMaster.setId(getId());
			venueMaster.setVenuename(getVenuename());
			venueMaster.setStreetno(getStreetno());
			venueMaster.setStreetname(getStreetname());
			venueMaster.setPostalcode(getPostalcode());
			venueMaster.setProvince(getProvince());
			venueMaster.setCountry(getCountry());
			venueMaster.setLandmark(getLandmark());
			venueMaster.setCapacity(getCapacity());
			venueMaster.setAvailable(getAvailable());
			venueMaster.setOtherdetails(getOtherdetails());
			venueMaster.setAltercontact(getAltercontact());
			venueMaster.setContactno(getContactno());
			venueMaster.setCity(getCity());
			return venueMaster;
		}

		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getVenuename() {
			return venuename;
		}
		public void setVenuename(String venuename) {
			this.venuename = venuename;
		}
		public String getStreetno() {
			return streetno;
		}
		public void setStreetno(String streetno) {
			this.streetno = streetno;
		}
		public String getStreetname() {
			return streetname;
		}
		public void setStreetname(String streetname) {
			this.streetname = streetname;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getPostalcode() {
			return postalcode;
		}
		public void setPostalcode(String postalcode) {
			this.postalcode = postalcode;
		}
		public String getProvince() {
			return province;
		}
		public void setProvince(String province) {
			this.province = province;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getLandmark() {
			return landmark;
		}
		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}
		public String getCapacity() {
			return capacity;
		}
		public void setCapacity(String capacity) {
			this.capacity = capacity;
		}
		public String getAvailable() {
			return available;
		}
		public void setAvailable(String available) {
			this.available = available;
		}
		public String getOtherdetails() {
			return otherdetails;
		}
		public void setOtherdetails(String otherdetails) {
			this.otherdetails = otherdetails;
		}
		public String getContactno() {
			return contactno;
		}
		public void setContactno(String contactno) {
			this.contactno = contactno;
		}
		public String getAltercontact() {
			return altercontact;
		}
		public void setAltercontact(String altercontact) {
			this.altercontact = altercontact;
		}
		public List<Person> getVenueContacts() {
			return venueContacts;
		}
		public void setVenueContacts(List<Person> venueContacts) {
			this.venueContacts = venueContacts;
		}
		@Override
		public String toString() {
			return "VenueDto [id=" + id + ", venuename=" + venuename + ", streetno=" + streetno + ", streetname="
					+ streetname + ", city=" + city + ", postalcode=" + postalcode + ", province=" + province
					+ ", country=" + country + ", landmark=" + landmark + ", capacity=" + capacity + ", available="
					+ available + ", otherdetails=" + otherdetails + ", contactno=" + contactno + ", altercontact="
					+ altercontact + ", venueContacts=" + venueContacts + "]";
		}

}
