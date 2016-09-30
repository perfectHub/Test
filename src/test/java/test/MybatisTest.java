package test;

import com.chen.test.model.UserEntity;
import com.chen.test.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/9/30.
 */
public class MybatisTest extends JunitTest {

    @Autowired
    private IUserService userService;

    @Test
    public void selectUserById(){
       UserEntity userEntity =  userService .selectUserById(1);
        System.out.println(userEntity.getUsername()+"--"+userEntity.getPassword());
    }

    @Test
    public void insertUser(){//添加
        UserEntity entity = new UserEntity();
        entity.setUsername("root");
        entity.setPassword("123456");
        userService.insertUser(entity);
    }

    @Test
    public void updateUser(){//修改
        UserEntity entity  = userService.selectUserById(4);
        entity.setPassword("admin");
        userService.updateUser(entity);
    }

    @Test
    public void deleteUser(){
       int i =  userService.deleteUser(4);
        System.out.println(i);
    }
}
