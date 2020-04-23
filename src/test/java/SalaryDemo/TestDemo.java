package SalaryDemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.testops.SalaryApplication;
import top.testops.dao.Employee;
import top.testops.dao.PayrollDatabase;
import top.testops.operations.AddHourlyEmployeeTransaction;
import top.testops.operations.AddSalaryEmployeeTransaction;
import top.testops.others.TimeCard;
import top.testops.others.classification.HourlyClassification;
import top.testops.others.classification.PaymentClassification;
import top.testops.others.classification.SalariedClassification;
import top.testops.others.method.HoldMethod;
import top.testops.others.method.PaymentMethod;
import top.testops.others.schedule.MonthlySchedule;
import top.testops.others.schedule.PaymentSchedule;
import top.testops.others.schedule.WeeklySchedule;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author carson
 * @ClassName TestDemo
 * @Description TODO
 * @date 2020/4/22
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SalaryApplication.class)
public class TestDemo {

    private Timestamp string2Timestamp(String dateStr) {
        return Timestamp.valueOf(dateStr);
    }

    private String timestamp2String(Timestamp timestamp) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(timestamp);
    }

    //测试钟点工
    @Test
    public void TestAddHourlyEmployee() {
        int empId = 3;
        String dateStr = "2018-05-06 10:30:40";
        Timestamp timestamp = string2Timestamp(dateStr);
        AddHourlyEmployeeTransaction hourlyEmployeeTransaction = new AddHourlyEmployeeTransaction(empId, "HourlyEmp",
                "EveryAddress", 100, new TimeCard(empId, timestamp, 10));
        hourlyEmployeeTransaction.execute();

        //获取Employee成功
        Employee e = PayrollDatabase.getEmployee(empId);
        Assert.assertEquals("HourlyEmp", e.name);

        //获取支付分类
        PaymentClassification pc = e.classification;
        Assert.assertTrue(pc instanceof HourlyClassification);
        HourlyClassification hc = (HourlyClassification) pc;

        //获取支付时间
        PaymentSchedule ps = e.schedule;
        Assert.assertTrue(ps instanceof WeeklySchedule);

        //测试薪水
        Assert.assertEquals("1000.00f", hc.calculatePay(timestamp));

        //测试支付方式
        PaymentMethod pm = e.paymentMethod;
        Assert.assertTrue(pm instanceof HoldMethod);

    }
    //测试月薪工人
    @Test
    public void TestAddSalariedEmployee() {
        //创建数据
        int empId = 2;
        AddSalaryEmployeeTransaction salaryEmployee = new AddSalaryEmployeeTransaction(empId, "carson", "Company", 3000);
        salaryEmployee.execute();

        //获取Employee成功
        Employee e = PayrollDatabase.getEmployee(empId);
        Assert.assertEquals("carson", e.name);

        //获取支付分类
        PaymentClassification pc = e.classification;
        Assert.assertTrue(pc instanceof SalariedClassification);
        SalariedClassification sc = (SalariedClassification) pc;
//
        //获取支付时间
        PaymentSchedule ps = e.schedule;
        Assert.assertTrue(ps instanceof MonthlySchedule);

        //测试薪水
        Assert.assertEquals("1000.00f", sc);

        //测试支付方式
        PaymentMethod pm = e.paymentMethod;
        Assert.assertTrue(pm instanceof HoldMethod);


    }
}
