package root.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import root.mybatis.mapper.bean.Stu;
import root.mybatis.mapper.dao.StuDao;

/**
 * Created by m on 2016/10/29.
 */
@SpringBootApplication
public class MybatisApplication implements CommandLineRunner {
    @Autowired
    private StuDao stuDao;

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Stu shjh = stuDao.findByName("Rupert");
        System.out.println(shjh.getAge());
    }
}
