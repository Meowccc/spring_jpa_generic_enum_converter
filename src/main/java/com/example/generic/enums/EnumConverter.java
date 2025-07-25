package com.example.generic.enums;

/**
 * @author meow
 */
public final class EnumConverter {

    public static <E extends Enum<E> & BaseEnum<T>, T> E fromValue(T value, Class<E> enumClass) {
        return BaseEnum.getEnumByValue(value, enumClass);
    }

    public static <E extends Enum<E> & BaseEnum<T>, T> E fromName(String name, Class<E> enumClass) {
        return BaseEnum.getEnumByName(name, enumClass);
    }

    public static <E extends Enum<E> & BaseEnum<T>, T> T getValueByName(String name, Class<E> enumClass) {
        return BaseEnum.getValueByName(name, enumClass);
    }
}
