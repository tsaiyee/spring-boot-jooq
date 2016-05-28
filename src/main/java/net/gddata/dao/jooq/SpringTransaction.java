package net.gddata.dao.jooq;

import org.jooq.Transaction;
import org.springframework.transaction.TransactionStatus;

/**
 * Created by gddev3 on 16/5/26.
 */
public class SpringTransaction implements Transaction {
    final TransactionStatus tx;

    SpringTransaction(TransactionStatus tx) {
        this.tx = tx;
    }
}
