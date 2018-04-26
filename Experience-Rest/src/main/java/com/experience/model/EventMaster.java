/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.experience.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author YogeshL
 */
@Entity
@Table(name = "event_master")
public class EventMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "event_name")
    private String eventName;
    @Column(name = "oraganizer_name")
    private String oraganizerName;
    @Column(name = "venue")
    private String venue;
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Column(name = "event_status")
    private Short eventStatus;
    @Column(name = "no_of_seats")
    private Integer noOfSeats;
    @Column(name = "no_of_seats_sold")
    private Integer noOfSeatsSold;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private Double amount;
    @Column(name = "tax_amount")
    private Double taxAmount;
    
    @Column(name = "comments")
    private String comments;
    @Column(name = "other_details")
    private String otherDetails;
    
    @JoinColumn(name = "eventtype_id", referencedColumnName = "id")
    @ManyToOne
    private EventCategory eventcategory;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "event_venue_mapping",
    	joinColumns = @JoinColumn(name = "event_id", referencedColumnName = "id"),
    	inverseJoinColumns = @JoinColumn(name = "venue_id", referencedColumnName = "id"))
    private Set<VenueMaster> venueMasters = new HashSet<VenueMaster>();
    

    public EventMaster() {
    }

    public EventMaster(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getOraganizerName() {
        return oraganizerName;
    }

    public void setOraganizerName(String oraganizerName) {
        this.oraganizerName = oraganizerName;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Short getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(Short eventStatus) {
        this.eventStatus = eventStatus;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Integer getNoOfSeatsSold() {
        return noOfSeatsSold;
    }

    public void setNoOfSeatsSold(Integer noOfSeatsSold) {
        this.noOfSeatsSold = noOfSeatsSold;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }
    
    public EventCategory getEventcategory() {
		return eventcategory;
	}

	public void setEventcategory(EventCategory eventcategory) {
		this.eventcategory = eventcategory;
	}

	public Set<VenueMaster> getVenueMasters() {
		return venueMasters;
	}

	public void setVenueMasters(Set<VenueMaster> venueMasters) {
		this.venueMasters = venueMasters;
	}



   
    
}
