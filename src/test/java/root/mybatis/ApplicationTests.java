package root.mybatis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import root.mybatis.mapper.bean.Stu;
import root.mybatis.mapper.dao.StuDao;

/**
 * Created by m on 2016/10/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MybatisApplication.class})
public class ApplicationTests {
    @Autowired
    private StuDao stuDao;

    @Test
    @Rollback
    public void findByName() throws Exception {
        stuDao.insert("springboot", 23, "springboot");
        Stu stu = stuDao.findByName("springboot");
        Assert.assertEquals(23, stu.getAge().intValue());
    }
}
