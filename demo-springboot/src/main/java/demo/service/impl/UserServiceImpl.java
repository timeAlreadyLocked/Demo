package demo.service.impl;

import demo.data.AcUserMapper;
import demo.entity.AcUser;
import demo.entity.AcUserExample;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiPengJu
 * @date 2018/8/7
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AcUserMapper userMapper;

    @Override
    public List<AcUser> listUser() {
//        AcUserExample userExample=new AcUserExample();
//        userExample.createCriteria().andIdEqualTo(1L);
        return userMapper.list();
    }
}
