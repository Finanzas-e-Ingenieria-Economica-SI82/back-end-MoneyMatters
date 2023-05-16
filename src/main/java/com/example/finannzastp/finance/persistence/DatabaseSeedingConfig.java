package com.example.finannzastp.finance.persistence;

import com.example.finannzastp.finance.domain.service.AdditionalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class DatabaseSeedingConfig {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseSeedingConfig.class);

    @Autowired
    private AdditionalService additionalService;

    @EventListener
    public void onApplicationReady(ApplicationReadyEvent event) {
        String name = event.getApplicationContext().getId();
        logger.info("Starting Database Seeding Process for {} at {}",
                name,
                new Timestamp(System.currentTimeMillis()));
        additionalService.seed();
        logger.info("Finished Database Seeding Process for {} at {}",
                name,
                new Timestamp(System.currentTimeMillis()));

    }
}
