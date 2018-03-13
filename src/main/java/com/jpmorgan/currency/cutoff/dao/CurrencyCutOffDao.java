package com.jpmorgan.currency.cutoff.dao;

import com.jpmorgan.currency.cutoff.model.CurrencyCutOff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyCutOffDao extends JpaRepository<CurrencyCutOff,Long> {
}
