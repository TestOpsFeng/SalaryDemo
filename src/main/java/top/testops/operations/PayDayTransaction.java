package top.testops.operations;

import top.testops.command.Payday;

import java.sql.Timestamp;

/**
  * @ClassName PayDayTransaction
  * @Description TODO
  * @author carson
  * @date 2020/4/23
**/
public class PayDayTransaction implements Payday {
    public Timestamp date;
    public PayDayTransaction(Timestamp date) {
        this.date = date;
    }

    @Override
    public void pay() {

    }
}
