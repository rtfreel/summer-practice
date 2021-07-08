package ru.example.bookreview.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.example.bookreview.entity.Review;
import ru.example.bookreview.service.ReviewService;

import java.util.List;

@RestController
@Slf4j
public class ReviewController {
    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/review")
    public List<Review> getReviews() {
        return reviewService.getReviews();
    }

    @GetMapping("/review/{id}")
    public List<Review> getReviewByBookId(@PathVariable Long id) {
        return reviewService.getReviewByBookId(id);
    }
}
