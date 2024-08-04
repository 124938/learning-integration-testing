package com.shrey.learning.it.controller;

import com.shrey.learning.it.dao.ProductLines;
import com.shrey.learning.it.dao.ProductLinesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("product-lines")
@RequiredArgsConstructor
@Slf4j
public class ProductLinesController {

    @Autowired
    private ProductLinesRepository productLinesRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/",
            produces = {"application/json"}
    )
    public List<ProductLines> fetchAllProductLines() {
        log.info("Fetching all product lines from database");
        return this.productLinesRepository.findAll();
    }
}
