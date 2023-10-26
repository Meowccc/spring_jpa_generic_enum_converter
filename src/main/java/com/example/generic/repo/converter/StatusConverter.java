package com.example.generic.repo.converter;

import com.example.generic.enums.StatusEnum;
import jakarta.persistence.AttributeConverter;

import java.util.Optional;

/**
 * @author meow
 */
public class StatusConverter implements AttributeConverter<StatusEnum, String> {

    @Override
    public String convertToDatabaseColumn(StatusEnum statusEnum) {
        return statusEnum.getValue();
    }

    @Override
    public StatusEnum convertToEntityAttribute(String s) {


        return Optional.of(StatusEnum.ENUMS.get(s)).orElse(null);
    }
}
