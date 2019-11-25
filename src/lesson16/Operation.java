package lesson16;
@FunctionalInterface
public interface Operation {
    double execute(double a, double b);
    // функциональный интерфейс  может содержать только один абстракнтый метод и любое количество default методов
}
