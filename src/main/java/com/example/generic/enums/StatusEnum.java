package com.example.generic.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Meow
 */
@Getter
@RequiredArgsConstructor
public enum StatusEnum implements DatabaseEnumType<String> {

    ACTIVE("active", "啟用"),
    INACTIVE("inactive", "停用"),
    ;

    private final String value;
    @JsonValue
    private final String text;

    public static final Map<String, StatusEnum> ENUMS = Arrays.stream(StatusEnum.values()).collect(Collectors.toUnmodifiableMap(StatusEnum::getValue, Function.identity()));

    public static Optional<StatusEnum> findByValue(final String value) {
        return Optional.ofNullable(ENUMS.get(value));
    }
}
