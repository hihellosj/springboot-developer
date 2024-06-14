package me.leesoojeong.springbootdeveloper.repository;

import me.leesoojeong.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
