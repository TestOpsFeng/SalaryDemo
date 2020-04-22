package SalaryDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import top.testops.SalaryApplication;
import top.testops.command.Impl.AddSalariedEmployee;
import top.testops.dao.EmployeeDao;
import top.testops.dao.been.Employee;

/**
  * @ClassName TestDemo
  * @Description TODO
  * @author carson
  * @date 2020/4/22
**/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SalaryApplication.class)
public class TestDemo {

    @Autowired
    private AddSalariedEmployee addSalariedEmployee;
//    @Autowired
//    private EmployeeDao employeeDao;

    @Test
    public void TestAddSalariedEmployee(){
        //创建数据
        int empId = 1;
        addSalariedEmployee = new AddSalariedEmployee();
        addSalariedEmployee.execute();

//        //获取Employee成功
//        Employee e = PayrollDatabase.getEmployee(empId);
//        Assert.assertEquals("Bob",e.name);
//
//        //获取支付分类
//        PaymentClassification pc = e.classification;
//        Assert.assertTrue(pc instanceof SalariedClassification);
//        SalariedClassification sc = (SalariedClassification) pc;
//
//        //获取支付时间
//        PaymentSchedule ps = e.schedule;
//        Assert.assertTrue(ps instanceof MonthlySchedule);
//
//        //测试薪水
//        Assert.assertEquals("1000.00f",sc.salary);
//
//        //测试支付方式
//        PaymentMethod pm = e.method;
//        Assert.assertTrue(pm instanceof HoldMethod);


    }
}
