package com.alkemy.ong.service;

import com.alkemy.ong.models.request.UserUpdateRequest;
import com.alkemy.ong.models.response.UserDetailsResponse;

import java.io.IOException;
import java.util.List;

public interface UserService {

    UserDetailsResponse updateBasicUser(UserUpdateRequest request, String token) throws IOException;
    UserDetailsResponse updateUserForAdmin(Long id, UserUpdateRequest request) throws IOException;
    List<UserDetailsResponse> getUsers() throws IOException;

    //UsersPaginationResponse getPaginationUsers(Integer page);
    void deleteUserForAdmin(Long id);

    void deleteBasicUser(String token);

}
