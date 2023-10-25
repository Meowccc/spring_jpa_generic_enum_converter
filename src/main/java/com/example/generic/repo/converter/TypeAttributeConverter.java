package com.example.generic.repo.converter;

import com.example.generic.enums.TypeEnum;
import jakarta.persistence.Converter;

/**
 * @author Meow
 */
@Converter(autoApply = true)
public class TypeAttributeConverter extends BaseDatabaseEnumAttributeConverter<TypeEnum, String>{

    public TypeAttributeConverter() {
        super(TypeEnum.class);
    }
}
