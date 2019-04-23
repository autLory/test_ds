import lombok.extern.slf4j.Slf4j;
import org.demo.test.Application;
import org.demo.test.persistence.mapper.ds0.TestMapper;
import org.demo.test.persistence.mapper.ds1.TestMapper2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author luoli
 * create on 2019/4/19
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class TestClass {


    @Resource
    private TestMapper testMapper;

    @Test
    public void test3() {
    }

    @Resource
    private TestMapper2 testMapper2;

    @Test
    public void test4() {
    }

}
