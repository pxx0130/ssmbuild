package com.pxx.dao;

import com.pxx.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addbook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookId") int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBook(@Param("bookId") int id);
    //查询全部书
    List<Books> queryAllBook();

    Books queryBookByName(@Param("bookName") String bookName);
}
