package chong.xie.homework05;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public void save() {
        System.out.println("UserServiceImpl --> save()");
    }
}
