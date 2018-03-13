package com.jpmorgan.currency.cutoff.service;


import com.jpmorgan.currency.cutoff.dao.CurrencyCutOffDao;
import com.jpmorgan.currency.cutoff.model.CurrencyCutOff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyCutOffService {

    @Autowired
    private CurrencyCutOffDao currencyCutOffDao;

    public List<CurrencyCutOff> getAllCurrencyCuff(){
        return currencyCutOffDao.findAll();
    }

}
