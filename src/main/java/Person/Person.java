package Person;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {
    private final String name;
    private final String email;
    private final String currentAddress;
    private final String permanentAddress;
}
