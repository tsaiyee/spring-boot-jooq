package net.gddata.service;

import net.gddata.api.SeriesNodeInterface;
import net.gddata.dao.SeriesNodeDao;
import net.gddata.domain.SeriesNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gddev3 on 16/5/28.
 */
@Service
public class SeriesNodeService implements SeriesNodeInterface {
    @Autowired
    SeriesNodeDao seriesNodeDao;

    @Override
    public SeriesNode findById(Integer id) {
        return seriesNodeDao.findById(1);
    }
}
