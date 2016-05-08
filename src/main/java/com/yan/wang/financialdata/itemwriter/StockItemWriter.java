package com.yan.wang.financialdata.itemwriter;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by ywang on 08.05.16.
 */
public class StockItemWriter implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> list) throws Exception {
        System.out.println("Test");
        for (String s : list) {
            System.out.println("Writer : " + s);
        }
    }
}
