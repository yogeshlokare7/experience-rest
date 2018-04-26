package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.experience.model.VenueMaster;
import com.experience.repository.VenueRepository;
import com.experience.service.VenueService;

@Service
public class VenueServiceImpl implements VenueService{
	
	@Autowired
	private VenueRepository repo;

	@Override
	public List<VenueMaster> getAllVenues() {
		return repo.findAll();
	}

	@Override
	public VenueMaster saveVenue(VenueMaster master) {
		return repo.save(master);
	}

	@Override
	public VenueMaster updateVenue(VenueMaster venueMaster) {
		return repo.save(venueMaster);
	}

	@Override
	public VenueMaster getVenue(Integer Id) {
		return repo.findOne(Id);
	}

	@Override
	public void deleteVenue(Integer Id) {
		repo.delete(Id);
	}

	@Override
	public void deleteVenueByObject(VenueMaster venueMaster) {
		repo.delete(venueMaster);
	}

}
