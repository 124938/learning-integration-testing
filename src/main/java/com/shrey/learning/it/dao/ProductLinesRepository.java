package com.shrey.learning.it.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductLinesRepository extends JpaRepository<ProductLines, String> {

}
