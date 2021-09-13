package shop.tripn.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.tripn.oracle.publisher.domain.PublisherDto;
import shop.tripn.oracle.publisher.service.PublisherService;

@Controller
@RequestMapping("/pubs")
public class PublisherController {
	@Autowired PublisherService publisherService;
	@Autowired PublisherDto publisher;
	@RequestMapping(value="/pub", method= {RequestMethod.POST})
	public String pubs(
			@RequestParam("pubId") int pubId,
			@RequestParam("pubName") String pubName,
			@RequestParam("mgrName") String mgrName,
			@RequestParam("phone") String phone) {
		System.out.println("pubId : "+pubId);
		System.out.println("pubName : "+pubName);
		System.out.println("mgrName : "+mgrName);
		System.out.println("phone : "+phone);
		publisher.setPubId(pubId);
		publisher.setPubName(pubName);
		publisher.setMgrName(mgrName);
		publisher.setPhone(phone);
		publisherService.save(publisher);
		return "publisher/publisher";
	}
	@RequestMapping("/publishers")
	public void findAll() {
		List<PublisherDto> pubs = publisherService.findAll();
		for(PublisherDto pub : pubs) {
			System.out.println(pub.toString());
		}
	}
	@RequestMapping("/publishers/{pubId}")
	public void findPubId(@PathVariable int pubId) {
		List<PublisherDto> pubs = publisherService.findPubId(pubId);
		for(PublisherDto pub : pubs) {
			System.out.println(pub.toString());
		}
	}
	@RequestMapping("/publishers/{pubName}")
	public void findPubName(@PathVariable String pubName) {
		List<PublisherDto> pubs = publisherService.findPubName(pubName);
		for(PublisherDto pub : pubs) {
			System.out.println(pub.toString());
		}
	}
	@RequestMapping("/publishers/{mgrName}")
	public void findMgrName(@PathVariable String MgrName) {
		List<PublisherDto> pubs = publisherService.findMgrName(MgrName);
		for(PublisherDto pub : pubs) {
			System.out.println(pub.toString());
		}
	}
	@RequestMapping("/publishers/{phone}")
	public void findPhone(@PathVariable String Phone) {
		List<PublisherDto> pubs = publisherService.findPhone(Phone);
		for(PublisherDto pub : pubs) {
			System.out.println(pub.toString());
		}
	}
}
