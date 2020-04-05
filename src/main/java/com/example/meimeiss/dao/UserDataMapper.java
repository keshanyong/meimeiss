package com.example.meimeiss.dao;

import com.example.meimeiss.model.UserData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDataMapper {

    List<UserData> getUserDataList();
}
