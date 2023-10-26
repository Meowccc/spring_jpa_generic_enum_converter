package com.example.generic.dto;

import com.example.generic.enums.StatusEnum;
import com.example.generic.enums.TypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author meow
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private String id;

    private StatusEnum status;

    private TypeEnum type;

    private String typeText;
}
