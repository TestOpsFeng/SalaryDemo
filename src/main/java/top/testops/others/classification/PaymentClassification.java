package top.testops.others.classification;

import java.sql.Timestamp;

/**
 * @author carson
 * @ClassName PaymentClassification
 * @Description TODO
 * @date 2020/4/23
 **/
public interface PaymentClassification {
    double calculatePay(Timestamp date);
}
