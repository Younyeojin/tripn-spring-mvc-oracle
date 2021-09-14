package shop.tripn.oracle.common;

import java.util.List;

//import org.springframework.web.bind.annotation.RequestBody;

public interface GenericInterface<T,U> {
	void save(T t); //C
	T findById(U id); //R
	List<T> findAll();
	void update(T t); //수정
	void delete(U id); //삭제
} 








