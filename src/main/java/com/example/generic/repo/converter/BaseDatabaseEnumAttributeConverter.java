package com.example.generic.repo.converter;

import com.example.generic.enums.DatabaseEnumType;
import jakarta.persistence.AttributeConverter;

/**
 * @author Meow
 */
public abstract class BaseDatabaseEnumAttributeConverter<E extends DatabaseEnumType<V>, V> implements AttributeConverter<E, V> {

    private final Class<E> type;

    public BaseDatabaseEnumAttributeConverter(Class<E> type) {
        this.type = type;
    }

    @Override
    public V convertToDatabaseColumn(E e) {
        return e.getValue();
    }

    @Override
    public E convertToEntityAttribute(V v) {
        if (v == null) {
            return null;
        }
        for (E enumConstant : type.getEnumConstants()) {
            if (enumConstant.getValue().equals(v)) {
                return enumConstant;
            }
        }
        return null;
    }
}
