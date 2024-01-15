package com.example.FastFood.Service;

import com.example.FastFood.DTO.userDTO;
import com.example.FastFood.Reponsetory.UserInterface;
import com.example.FastFood.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LoginService {
    @Autowired
    UserInterface userInterface;
    public List<userDTO> getAllUser(){
        List<Users> listUser = userInterface.findAll();
        List<userDTO> userDTOList = new ArrayList<>();
        for(Users user : listUser){
            userDTO userDTO = new userDTO();
            userDTO.setId(user.getId());
            userDTO.setUser_name(user.getUser_name());
            userDTO.setFullname(user.getFullname());
            userDTO.setPassword(user.getPassword());
            userDTOList.add(userDTO);
            System.out.println(user.getFullname());
        }
        return userDTOList;
    }
}
