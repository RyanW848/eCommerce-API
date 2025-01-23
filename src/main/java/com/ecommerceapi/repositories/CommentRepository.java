package com.ecommerceapi.repositories;

import com.ecommerceapi.model.Cart;
import com.ecommerceapi.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByProductId(Long productId);
}
