package lab10;

public class Pair<T> {

    public Pair() {
        first = null;
        second = null;
    }

    public Pair (T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public void setFirst (T newValue) {
        first = newValue;
    }
    public void setSecond (T newValue) {
        second = newValue;
    }

    public void swap(){
        T temp = this.first;
        this.first = this.second;
        this.second = temp;
    }

    private T first;
    private T second;
}
