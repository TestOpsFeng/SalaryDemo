package top.testops.others.classification;

import java.sql.Timestamp;

/**
  * @ClassName SalariedClassification
  * @Description TODO
  * @author carson
  * @date 2020/4/23
**/
public class SalariedClassification implements PaymentClassification {
    public int salary;
    public SalariedClassification(int salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay(Timestamp date) {
        return 0;
    }
}
