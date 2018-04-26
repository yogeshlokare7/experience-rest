package com.experience.dto;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.experience.model.EventCategory;
import com.experience.model.VenueMaster;

public class EventDto {
	 private Integer id;
	    private String eventName;
	    private String oraganizerName;
	    private String venue;
	    private Date startDate;
	    private Date endDate;
	    private Short eventStatus;
	    private Integer noOfSeats;
	    private Integer noOfSeatsSold;
	    private Double amount;
	    private Double taxAmount;
	    private Double extraPaid;
	    private String comments;
	    private String otherDetails;
	    private EventCategory eventcategory;
	    private List<VenueMaster> venueMasters;
	    private Integer venueIds[];

		public EventDto(Integer id, String eventName, String oraganizerName, String venue, Date startDate, Date endDate,
				Short eventStatus, Integer noOfSeats, Integer noOfSeatsSold, Double amount, Double taxAmount,
				Double extraPaid, String comments, String otherDetails, EventCategory eventcategory,
				List<VenueMaster> venueMasters, Integer[] venueIds) {
			this.id = id;
			this.eventName = eventName;
			this.oraganizerName = oraganizerName;
			this.venue = venue;
			this.startDate = startDate;
			this.endDate = endDate;
			this.eventStatus = eventStatus;
			this.noOfSeats = noOfSeats;
			this.noOfSeatsSold = noOfSeatsSold;
			this.amount = amount;
			this.taxAmount = taxAmount;
			this.extraPaid = extraPaid;
			this.comments = comments;
			this.otherDetails = otherDetails;
			this.eventcategory = eventcategory;
			this.venueMasters = venueMasters;
			this.venueIds = venueIds;
		}


		public EventDto(Integer id) {
			this.id = id;
		}

		public EventDto() {
			super();
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
		public Double getExtraPaid() {
			return extraPaid;
		}
		public void setExtraPaid(Double extraPaid) {
			this.extraPaid = extraPaid;
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


		public List<VenueMaster> getVenueMasters() {
			return venueMasters;
		}

		public void setVenueMasters(List<VenueMaster> venueMasters) {
			this.venueMasters = venueMasters;
		}

		public Integer[] getVenueIds() {
			return venueIds;
		}

		public void setVenueIds(Integer[] venueIds) {
			this.venueIds = venueIds;
		}
		
		@Override
		public String toString() {
			return "EventDto [id=" + id + ", eventName=" + eventName + ", oraganizerName=" + oraganizerName + ", venue="
					+ venue + ", startDate=" + startDate + ", endDate=" + endDate + ", eventStatus=" + eventStatus
					+ ", noOfSeats=" + noOfSeats + ", noOfSeatsSold=" + noOfSeatsSold + ", amount=" + amount
					+ ", taxAmount=" + taxAmount + ", extraPaid=" + extraPaid + ", comments=" + comments
					+ ", otherDetails=" + otherDetails + ", eventcategory=" + eventcategory + ", venueMasters="
					+ venueMasters + ", venueIds=" + Arrays.toString(venueIds) + "]";
		}
}
