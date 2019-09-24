package com.li.ssm_tinker.service;

import com.li.ssm_tinker.dao.IBookDao;
import com.li.ssm_tinker.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceTemp implements BookService {

    //    使用 dao 中的接口
    @Autowired
    private IBookDao bookDao;

    @Override
    public List<Book> listAll() {
        return bookDao.listAll();
    }
}
