package com.jpmorgan.currency.cutoff.start;

import com.jpmorgan.currency.cutoff.dao.CurrencyCutOffDao;
import com.jpmorgan.currency.cutoff.model.CurrencyCutOff;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DataSetUpConfig {



    @Bean
    public CommandLineRunner setUpData(CurrencyCutOffDao cutOffDao){
        return (args)-> {

            for (int i =0;i<10;i++) {
                CurrencyCutOff co = new CurrencyCutOff();
                co.setBranch(RandomStringUtils.randomNumeric(3));
                co.setCurrencyCode(RandomStringUtils.randomAlphabetic(3));
                co.setCurrencyId(i);
                co.setName(RandomStringUtils.randomAlphabetic(5));
                co.setCutoffHour(RandomStringUtils.randomNumeric(2));
                co.setCutOffMin(RandomStringUtils.randomNumeric(2));
                cutOffDao.save(co);
            }

        };
    }



}
