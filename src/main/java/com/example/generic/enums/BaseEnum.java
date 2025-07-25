package com.example.generic.enums;

import java.util.EnumSet;

/**
 * @author meow
 */
public interface BaseEnum<T> {

    /**
     * get value
     */
    T getValue();

    /**
     * get name
     */
    String getName();

    /**
     * Get enum by value
     *
     * @param value     the value to search for
     * @param enumClass the class of the enum type
     * @param <E>       the type of the enum
     * @return the enum constant with the specified value, or null if not found
     */
    default <E extends Enum<E> & BaseEnum<T>> E getEnumByValue(T value, Class<E> enumClass) {
        return EnumSet.allOf(enumClass).stream()
                .filter(e -> e.getValue().equals(value))
                .findFirst()
                .orElse(null);
    }

    /**
     * Get enum by name
     *
     * @param name      the name to search for
     * @param enumClass the class of the enum type
     * @param <E>       the type of the enum
     * @return the enum constant with the specified name, or null if not found
     */
    default <E extends Enum<E> & BaseEnum<T>> E getEnumByName(String name, Class<E> enumClass) {
        return EnumSet.allOf(enumClass).stream()
                .filter(e -> e.getName().equals(name))
                .findFirst()
                .orElse(null);
    }


    /**
     * get value by name
     */
    default <E extends Enum<E> & BaseEnum<T>> T getValueByName(String name, Class<E> enumClass) {
        return getEnums(enumClass).stream()
                .filter(e -> e.getName().equals(name))
                .map(BaseEnum::getValue)
                .findFirst()
                .orElse(null);
    }


    /**
     * Get all enums of the specified type
     *
     * @param enumClass the class of the enum type
     * @param <E>       the type of the enum
     * @param <T>       the type of the value
     * @return an EnumSet containing all enum constants of the specified type
     */
    default <E extends Enum<E> & BaseEnum<T>, T> EnumSet<E> getEnums(Class<E> enumClass) {
        return EnumSet.allOf(enumClass);
    }
}
