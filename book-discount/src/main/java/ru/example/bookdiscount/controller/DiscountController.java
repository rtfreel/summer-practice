package ru.example.bookdiscount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import ru.example.bookdiscount.service.DiscountService;
import ru.example.bookdiscount.entity.Discount;

@RestController
public class DiscountController {
    private final DiscountService discountService;

    @Autowired
    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping("/discount")
    public List<Discount> getDiscount() {
        return discountService.getDiscounts();
    }

    @GetMapping("/discount/{genre}")
    public Integer getDiscount(@PathVariable String genre) {
        return discountService.getDiscountByGenre(genre).get(0).getPercent();
    }
}
