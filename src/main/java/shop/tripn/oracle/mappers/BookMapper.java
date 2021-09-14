package shop.tripn.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.book.domain.BookDto;
import shop.tripn.oracle.common.GenericInterface;

@Repository
public interface BookMapper extends GenericInterface<BookDto, Integer> {
	public List<BookDto> findByPubId(int pubId);
	public List<BookDto> findByBookTitle(String bookTitle);
	public List<BookDto> findByPrice(int price);
}
