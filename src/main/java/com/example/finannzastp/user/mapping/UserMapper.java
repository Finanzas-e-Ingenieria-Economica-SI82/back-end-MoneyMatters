package com.example.finannzastp.user.mapping;


import com.example.finannzastp.shared.mapping.EnhancedModelMapper;
import com.example.finannzastp.user.domain.model.entity.User;
import com.example.finannzastp.user.resource.CreateUserResource;
import com.example.finannzastp.user.resource.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class UserMapper implements Serializable {
    @Autowired
    EnhancedModelMapper modelMapper;

    public Page<UserResource> modelListPage(List<UserResource> modelList, Pageable pageable) {
        return new PageImpl<>(modelMapper.mapList(modelList, UserResource.class), pageable, modelList.size());
    }

    public User toModel(CreateUserResource resource) {
        return modelMapper.map(resource, User.class);
    }

    public UserResource toResource(User user) {
        return new UserResource(user.getId(), user.getUsername());
    }

    public List<UserResource> toResourceList(List<User> modelList){
        return modelList.stream().map(this::toResource).collect(Collectors.toList());

}

}

