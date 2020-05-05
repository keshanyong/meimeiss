package com.example.meimeiss.service.Impl;

import com.example.meimeiss.UtilsOrConstant.FieldUtils;
import com.example.meimeiss.UtilsOrConstant.RedisUtils;
import com.example.meimeiss.UtilsOrConstant.TokenConstant;
import com.example.meimeiss.dao.UserDataMapper;
import com.example.meimeiss.model.UserData;
import com.example.meimeiss.model.publicModel.ResultVO;
import com.example.meimeiss.service.LoginService;
import com.example.meimeiss.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    UserDataMapper userDataMapper;

    @Autowired
    TokenService tokenService;

    @Autowired
    RedisUtils redisUtils;

    @Override
    public ResultVO userLogin(UserData userData) {
        ResultVO resultVO = new ResultVO();

        UserData userData1 = userDataMapper.getUserData(userData);
        if (Objects.nonNull(userData1)) {
            Map<String, Object> map = new HashMap<>();
            //将token写入缓存
            String token = tokenService.generate(userData1.getId().toString(), userData1.getUserName(), userData1.getPassword());
            redisUtils.set(token, userData1.getUserName(), TokenConstant.TOKEN_EXPIRE_TIME_10_MIN);
            map.put("userData", userData1);
            map.put("token", token);
            resultVO.setCode(FieldUtils.SUCCESS);
            resultVO.setResultData(map);
        } else {
            resultVO.setCode(FieldUtils.ERROR);
            resultVO.setMessage("登录失败,请重新尝试！");
        }
        return resultVO;
    }

    @Override
    public ResultVO getUserInfo(UserData userData) {
        ResultVO resultVO = new ResultVO();
        UserData ud = userDataMapper.selectByPrimaryKey(userData.getId());
        resultVO.setCode(FieldUtils.SUCCESS);
        resultVO.setResultData(ud);
        return resultVO;
    }
}
