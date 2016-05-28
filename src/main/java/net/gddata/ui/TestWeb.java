package net.gddata.ui;

import net.gddata.api.SeriesNodeInterface;
import net.gddata.domain.SeriesNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by gddev3 on 16/5/26.
 */
@RestController
public class TestWeb {
    @RequestMapping("/h")
    public String home() {
        System.out.println("Hello");
        return "Hello World!";
    }

    @RequestMapping("/date")
    public Date getDate() {
        System.out.println("date");
        return new Date();
    }

    @Autowired
    SeriesNodeInterface seriesNodeInterface;

    @RequestMapping("/")
    public SeriesNode getStus() {
        return seriesNodeInterface.findById(1);
    }
}
