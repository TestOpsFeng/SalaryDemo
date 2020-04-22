package top.testops.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.testops.dao.been.Employee;

/**
  * @ClassName EmployeeDao
  * @Description TODO
  * @author carson
  * @date 2020/4/22
**/
@Mapper
@Repository
public interface EmployeeDao {
    int saveEmployee(Employee salariedEmployee);
    int select();
}
