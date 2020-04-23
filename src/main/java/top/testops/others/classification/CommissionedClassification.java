package top.testops.others.classification;

import top.testops.others.SalesReceipt;

import java.sql.Timestamp;

/**
 * @author carson
 * @ClassName SalariedClassification
 * @Description TODO
 * @date 2020/4/23
 **/
public class CommissionedClassification implements PaymentClassification {
    public int salary;
    public float commissionPercentage;
    public SalesReceipt salesReceipt;

    public CommissionedClassification(int salary, float commissionPercentage, SalesReceipt salesReceipt) {
        this.salary = salary;
        this.commissionPercentage = commissionPercentage;
        this.salesReceipt = salesReceipt;
    }

    @Override
    public int calculatePay(Timestamp date) {
        return 0;
    }
}
