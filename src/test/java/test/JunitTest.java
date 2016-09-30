package test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/9/30.
 */
@ContextConfiguration(locations = {"classpath:conf/spring.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class JunitTest {
}
