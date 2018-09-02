package com.beercafeguy.lombok;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor @Getter @Setter
@EqualsAndHashCode
@ToString
public class Person {
    @NonNull private String firstName;
    private String lastName;
    private LocalDate currentTime;
}
