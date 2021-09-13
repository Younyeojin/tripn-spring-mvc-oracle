package shop.tripn.oracle.publisher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.mappers.PublisherMapper;
import shop.tripn.oracle.publisher.domain.PublisherDto;

@Service
public class PublisherServiceImpl implements PublisherService{
	@Autowired PublisherMapper pubmapper;
	@Override
	public List<PublisherDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PublisherDto> findPubId(int pubId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PublisherDto> findPubName(String pubName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PublisherDto> findMgrName(String MgrName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PublisherDto> findPhone(String Phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(PublisherDto publisher) {
		// TODO Auto-generated method stub
		pubmapper.save(publisher);
	}
	
}
