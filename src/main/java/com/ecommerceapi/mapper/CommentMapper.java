package com.ecommerceapi.mapper;

import com.ecommerceapi.dto.CommentDTO;
import com.ecommerceapi.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    @Mapping(target = "userId", source = "user.id")
    CommentDTO toDTO(Comment comment);

    @Mapping(target = "user.id", source = "userId")
    Comment toEntity(CommentDTO commentDTO);
}
