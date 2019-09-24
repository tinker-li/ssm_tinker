package com.li.ssm_tinker.dao;


import com.li.ssm_tinker.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookDao {
    List<Book> listAll();
}