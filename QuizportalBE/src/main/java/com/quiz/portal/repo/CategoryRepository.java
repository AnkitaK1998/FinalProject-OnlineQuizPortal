package com.quiz.portal.repo;

import com.quiz.portal.model.quiz.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
