package lpj.dubbo.provide;

import lpj.dubbo.api.DubboLoginService;

/**
 * @author LiPengJu
 * @date 2018/7/29
 */
public class DubboLoginServiceImpl implements DubboLoginService {
    public String login(String userName) {
        return "login is success , userName is " + userName;
    }
}
