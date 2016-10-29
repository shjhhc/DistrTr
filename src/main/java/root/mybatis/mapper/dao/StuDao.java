package root.mybatis.mapper.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import root.mybatis.mapper.bean.Stu;

/**
 * Created by m on 2016/10/29.
 */
@Mapper
public interface StuDao {
    @Select("SELECT * FROM stu WHERE name = #{name}")
    Stu findByName(@Param("name") String name);
    @Insert("INSERT INTO stu(name, age, occupation) VALUE(#{name}, #{age}, #{occupation})")
    int insert(@Param("name") String name, @Param("age") Integer age, @Param("occupation") String occupation);
}
