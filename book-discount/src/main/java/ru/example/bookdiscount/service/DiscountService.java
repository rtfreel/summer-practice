package ru.example.bookdiscount.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

import ru.example.bookdiscount.entity.Discount;
import ru.example.bookdiscount.repository.DiscountRepository;

@Service
@Slf4j
public class DiscountService {
    private final DiscountRepository discountRepository;

    @Autowired
    public DiscountService(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    public List<Discount> getDiscounts() {
        return discountRepository.findAll().stream().collect(Collectors.toList());
    }

    public List<Discount> getDiscountByGenre(String genre) {
        return discountRepository.findByGenre(genre).stream().collect(Collectors.toList());
    }
}
