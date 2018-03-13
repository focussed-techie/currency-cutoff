package com.jpmorgan.currency.cutoff.controller;

import com.jpmorgan.currency.cutoff.model.CurrencyCutOff;
import com.jpmorgan.currency.cutoff.service.CurrencyCutOffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class CurrencyCutOffController {


    @Autowired
    private CurrencyCutOffService currencyCutOffService;

    @RequestMapping(value = "/dashboard",method = RequestMethod.GET)
    public List<CurrencyCutOff> getDashobard(HttpSession session){

        return currencyCutOffService.getAllCurrencyCuff();
    }
}
