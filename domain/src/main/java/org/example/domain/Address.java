package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;


@AllArgsConstructor
@Data
public class Address {

    @NonNull
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private Integer houseNumber;

    private Integer flatNumber;


}
