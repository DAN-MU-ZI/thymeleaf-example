package com.example.thymeleafexample.web.conversion;

import com.example.thymeleafexample.business.entities.Variety;
import com.example.thymeleafexample.business.services.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class VarietyFormatter implements Formatter<Variety> {
    @Autowired
    private VarietyService varietyService;


    public VarietyFormatter() {
        super();
    }


    @Override
    public Variety parse(final String text, final Locale locale) throws ParseException {
        final Integer varietyId = Integer.valueOf(text);
        return varietyService.findById(varietyId);
    }

    @Override
    public String print(final Variety object, final Locale locale) {
        return (object != null ? object.getId().toString() : "");
    }
}
