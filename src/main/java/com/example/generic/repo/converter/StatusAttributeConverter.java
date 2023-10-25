package com.example.generic.repo.converter;

import com.example.generic.enums.StatusEnum;
import jakarta.persistence.Converter;

/**
 * @author Meow
 */
@Converter(autoApply = true)
public class StatusAttributeConverter extends BaseDatabaseEnumAttributeConverter<StatusEnum, String>{

    public StatusAttributeConverter() {
        super(StatusEnum.class);
    }
}
