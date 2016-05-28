package net.gddata.dao;

import net.gddata.cb.tables.records.SeriesNodeRecord;
import net.gddata.dao.jooq.BaseDao;
import net.gddata.domain.SeriesNode;
import org.springframework.stereotype.Component;

import static net.gddata.cb.tables.SeriesNode.SERIES_NODE;

/**
 * Created by gddev3 on 16/5/27.
 */
@Component
public class SeriesNodeDao extends BaseDao<SeriesNodeRecord, SeriesNode, Integer> {

    protected SeriesNodeDao() {
        super(SERIES_NODE, SeriesNode.class);
    }

    @Override
    protected Integer getId(SeriesNode seriesNode) {
        return seriesNode.getId();
    }

}
