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
public enum TypeEnum implements DatabaseEnumType<String> {

    IN("in"),
    OUT("out"),
    ;

    @JsonValue
    private final String value;

    private static final Map<String, TypeEnum> ENUMS = Arrays.stream(TypeEnum.values()).collect(Collectors.toUnmodifiableMap(TypeEnum::getValue, Function.identity()));

    public static Optional<TypeEnum> findByValue(final String value) {
        return Optional.ofNullable(ENUMS.get(value));
    }
}
