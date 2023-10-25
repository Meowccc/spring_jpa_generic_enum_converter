package com.example.generic.entity;

import com.example.generic.enums.StatusEnum;
import com.example.generic.enums.TypeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author Meow
 */
@Setter
@Getter
@Entity
@Table(name = "book")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDO {

    @Id
    @GeneratedValue(generator = "uuid2", strategy = GenerationType.AUTO)
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    private StatusEnum status;

    private TypeEnum type;
}
