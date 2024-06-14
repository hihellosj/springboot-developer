package me.leesoojeong.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.leesoojeong.springbootdeveloper.domain.Article;
import me.leesoojeong.springbootdeveloper.dto.AddArticleRequest;
import me.leesoojeong.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

}
