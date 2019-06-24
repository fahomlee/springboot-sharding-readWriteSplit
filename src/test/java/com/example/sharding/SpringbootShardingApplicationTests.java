package com.example.sharding;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.sharding.entity.TUser;
import com.example.sharding.mapper.service.TUserService;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringbootShardingApplicationTests {

    @Autowired
    private TUserService tUserService;

    @Test
    public void testTUser() {
        //主库插入
        TUser tUser = new TUser();
        tUser.setId(1L);
        tUser.setUserId("22");
        tUserService.insertTUser(tUser);
    }
    
    @Test
    public void testQueryTUser() {
        //查询从库
        log.info(tUserService.queryTuser(1L).getUserId() + "xxxxxxxxxxxxx");
    }


    @Test
    public void testSid() {
        // sid主键  190614CYZXRGXZTC 190614CZ946P57HH 190614CZBZGWFBHH
        log.info(Sid.nextShort() + "....SID主键AAAAAAAAAAAAAAAAAAAAAAAAAAAA");

    }
 

}
