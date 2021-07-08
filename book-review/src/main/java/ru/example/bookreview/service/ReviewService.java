package ru.example.bookreview.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.bookreview.entity.Review;
import ru.example.bookreview.repository.ReviewRepository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ReviewService {
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getReviews() {
        return reviewRepository.findAll().stream().collect(Collectors.toList());
    }

    public List<Review> getReviewByBookId(Long id) {
        return reviewRepository.findByBookId(id).stream().collect(Collectors.toList());
    }
}
