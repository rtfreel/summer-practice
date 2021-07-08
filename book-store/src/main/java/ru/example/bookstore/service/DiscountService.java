package ru.example.bookstore.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DiscountService {

    public Integer getDiscountByGenre(String genre) {
        Integer response = 0;
        String url = "http://localhost:8081/discount/" + genre;
        try{
            response = new RestTemplate().getForEntity
                (url, Integer.class).getBody();
        }catch(Exception e){}
        return response;
    }
}
