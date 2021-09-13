package shop.tripn.oracle.publisher.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.publisher.domain.PublisherDto;

@Component
public interface PublisherService {
	public List<PublisherDto> findAll();
	public List<PublisherDto> findPubId(int pubId);
	public List<PublisherDto> findPubName(String pubName);
	public List<PublisherDto> findMgrName(String MgrName);
	public List<PublisherDto> findPhone(String Phone);
	public void save(PublisherDto publisher);
}
