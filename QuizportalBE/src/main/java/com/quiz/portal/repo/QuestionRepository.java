package com.quiz.portal.repo;

import com.quiz.portal.model.quiz.Question;
import com.quiz.portal.model.quiz.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Set<Question> findByQuiz(Quiz quiz);
}
