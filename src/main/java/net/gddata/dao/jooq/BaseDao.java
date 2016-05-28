package net.gddata.dao.jooq;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import org.jooq.impl.DAOImpl;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by gddev3 on 16/5/27.
 */
public abstract class BaseDao<R extends UpdatableRecord<R>, P, T> extends DAOImpl<R, P, T> {
    private DSLContext dslContext;

    @Resource
    public void init(Configuration configuration) {
        setConfiguration(configuration);
    }

    @Resource
    public void initDslContext(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    protected BaseDao(Table<R> table, Class<P> type) {
        super(table, type);
    }

    @PostConstruct
    public void init() {
        System.out.println("JOOQ init");
    }

    protected DSLContext create() {
        return dslContext;
    }

    public void save(P p) {
        insert(p);
    }

}
