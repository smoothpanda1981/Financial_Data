package com.yan.wang.financialdata.itemreader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

/**
 * Created by ywang on 08.05.16.
 */
public class StockItemReader implements ItemReader<String> {

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        String finalResult = "";

        try {
            Calendar from = Calendar.getInstance();
            Calendar to = Calendar.getInstance();
            from.add(Calendar.YEAR, -1); // from 1 year ago
            Stock google = YahooFinance.get("GOOG");
            List<HistoricalQuote> googleHistQuotes = google.getHistory(from, to, Interval.DAILY);

            for (HistoricalQuote historicalQuote : googleHistQuotes) {
                finalResult = finalResult + " " + historicalQuote.getSymbol() + " - " + historicalQuote.getOpen()
                        + " - " + historicalQuote.getClose() + " - " + historicalQuote.getDate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return finalResult;
    }
}
