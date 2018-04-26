package com.experience.service;

import java.util.List;

import com.experience.model.VenueMaster;

public interface VenueService {
	
	public List<VenueMaster> getAllVenues();
	public VenueMaster saveVenue(VenueMaster master);
	public VenueMaster updateVenue(VenueMaster venueMaster);
	public VenueMaster getVenue(Integer Id);
	public void deleteVenue(Integer Id);
	public void deleteVenueByObject(VenueMaster venueMaster);

}
