package com.danovska01.shoppinglist.repository;

import com.danovska01.shoppinglist.model.entity.Category;
import com.danovska01.shoppinglist.model.entity.enums.CategoryName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

    Optional<Category> findByName(CategoryName name);
}
