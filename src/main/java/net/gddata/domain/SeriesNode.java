package net.gddata.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by gddev3 on 16/5/27.
 */
@Data
public class SeriesNode {
    private Integer id;
    private String category;
    private String pn;
    private String en;
    private String sname;
    private String publisher;
    private String collector;
    private Date collectTime;
    private String inspector;
    private Date inspectTime;
    private Integer version;
}
