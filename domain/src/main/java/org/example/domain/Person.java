package org.example.domain;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor(staticName = "personStaticConstructor")
public class Person {

    @NonNull
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    @Getter(lazy = true)
    private final Integer myField = someComplicatedMethod();


    public Integer someComplicatedMethod() {
        return 5;
    }


}
