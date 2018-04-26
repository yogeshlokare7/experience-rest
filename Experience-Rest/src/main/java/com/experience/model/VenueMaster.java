/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experience.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author YogeshL
 */
@Entity
@Table(name = "venue_master")
public class VenueMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "venuename")
    private String venuename;
    @Column(name = "streetno")
    private String streetno;
    @Column(name = "streetname")
    private String streetname;
    @Column(name = "city")
    private String city;
    @Column(name = "postalcode")
    private String postalcode;
    @Column(name = "province")
    private String province;
    @Column(name = "country")
    private String country;
    @Column(name = "landmark")
    private String landmark;
    @Column(name = "capacity")
    private String capacity;
    @Column(name = "available")
    private String available;
    @Column(name = "otherdetails")
    private String otherdetails;
    @Column(name = "contactno")
    private String contactno;
    @Column(name = "altercontact")
    private String altercontact;
//    @Column(name = "latitude")
//    private String latitude;
//    @Column(name = "longitude")
//    private String longitude;
    
//    @ManyToMany
//	@JoinTable(name = "event_venue_mapping", 
//		joinColumns = @JoinColumn(name = "venue_id", referencedColumnName = "id"), 
//		inverseJoinColumns = @JoinColumn(name = "event_id", referencedColumnName = "id"))
//	private Set<EventMaster> eventMasters = new HashSet<EventMaster>();

    public VenueMaster() {
    }

    public VenueMaster(Integer id) {
        this.id = id;
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

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VenueMaster)) {
            return false;
        }
        VenueMaster other = (VenueMaster) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "VenueMaster [id=" + id + ", venuename=" + venuename + ", streetno=" + streetno + ", streetname="
				+ streetname + ", city=" + city + ", postalcode=" + postalcode + ", province=" + province + ", country="
				+ country + ", landmark=" + landmark + ", capacity=" + capacity + ", available=" + available
				+ ", otherdetails=" + otherdetails + ", contactno=" + contactno + ", altercontact=" + altercontact
				+ "]";
	}
}
