package com.rahul.rest.webservices.restfulwebservices;

import com.rahul.rest.webservices.restfulwebservices.user.Post;
import com.rahul.rest.webservices.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {

}
