package shop.tripn.oracle.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestMapping;


import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	@Autowired BookMapper bookMapper;
	@Override
	public void save(BookDto t) {
		// TODO Auto-generated method stub
		bookMapper.save(t);
	}

	@Override
	public BookDto findById(Integer id) {
		// TODO Auto-generated method stub
		return bookMapper.findById(id);
	}

	@Override
	public List<BookDto> findAll() {
		// TODO Auto-generated method stub
		return bookMapper.findAll();
	}

	@Override
	public void update(BookDto t) {
		bookMapper.update(t);

	}

	@Override
	public void delete(Integer id) {
		bookMapper.delete(id);

	}

	@Override
	public List<BookDto> findByBookTitle(String bookTitle) {
		// TODO Auto-generated method stub
		return bookMapper.findByBookTitle(bookTitle);
	}

	@Override
	public List<BookDto> findByPrice(int price) {
		// TODO Auto-generated method stub
		return bookMapper.findByPrice(price);
	}

	@Override
	public List<BookDto> findByPubId(int pubId) {
		// TODO Auto-generated method stub
		return bookMapper.findByPubId(pubId);
	}
	
	
	

}
