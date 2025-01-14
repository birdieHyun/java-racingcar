package study.racing.domain;

import java.util.Objects;

public class Car {

    private static final String DELIMITER = " : ";
    private static final int NEXT_POSITION = 1;
    private static final int STANDARD_NUMBER = 4;
    private final Name name;
    private Position position;

    public Car(Name name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String move(int randomNumber) {

        if (randomNumber >= STANDARD_NUMBER) {
            this.position = new Position(position.getValue() + NEXT_POSITION);
        }
        return name.getValue() + DELIMITER + position.getDash();
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public int position() {

        return position.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
