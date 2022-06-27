package monads;

import java.util.function.Function;

public class Wrap<T> {

  private final T value;

  public Wrap(T value) {
    this.value = value;
  }

//  public <T> T getValue() {
//    return (T) value;
//  }

  public T getValue() {
    return value;
  }

  public static <T> Wrap<T> of(T value) {
    return new Wrap<>(value);
  }

  public <O> Wrap<O> map(Function<T, O> mapper) {
    return Wrap.of(mapper.apply(value));
  }

  public <R> Wrap<R> flatMap(Function<T, Wrap<R>> mapper) {
    return mapper.apply(value);
  }
}
