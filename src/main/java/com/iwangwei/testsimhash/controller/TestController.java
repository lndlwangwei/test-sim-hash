package com.iwangwei.testsimhash.controller;

import com.iwangwei.testsimhash.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    TestDao testDao;

    @GetMapping
    public List<Map<String, Object>> test() {
        return testDao.getAll();
    }
}
