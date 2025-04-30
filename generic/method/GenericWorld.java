package generic.method;

public class GenericWorld<T extends Number> {
    private T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    //전달되는 상황에 따라 달라질 수 있기 떄문에 (T에 따라 안될수도 있어서!) doubleValue를 못씀
    public double transDouble() {
        return this.number.doubleValue();
    }

    @Override
    public String toString() {
        return "GenericWorld{" +
                "number=" + number +
                '}';
    }
}
