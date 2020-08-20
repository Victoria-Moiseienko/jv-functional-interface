package core.basesyntax;

import java.util.function.Function;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements Function<Integer, AutoType> {
    public static final int MIN_TRUCK_WEIGHT = 1500;

    @Override
    public AutoType apply(Integer weightCar) {
        return weightCar >= MIN_TRUCK_WEIGHT ? AutoType.TRUCK : AutoType.CAR;
    }
}
