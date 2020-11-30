package com.example.mapper;

import com.example.entity.User;
import org.springframework.stereotype.Component;


@Component
public interface UserMapper {

    User Sel(int id);
}
