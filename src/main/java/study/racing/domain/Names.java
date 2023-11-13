package study.racing.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Names {

    private final List<Name> value;

    public Names(List<String> names) {

        this.value = names.stream()
                .map(Name::new)
                .collect(Collectors.toList());
    }

    public List<Name> getValue() {
        return value;
    }
}