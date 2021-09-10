package shop.tripn.oracle.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	@Autowired BookMapper bookMapper;

	@Override
	public List<BookDto> findAll() {
		// TODO Auto-generated method stub
		return bookMapper.findAll();
	}

	@Override
	public BookDto findById(int bookId) {
		// TODO Auto-generated method stub
		return bookMapper.findById(bookId);
	}

	

}