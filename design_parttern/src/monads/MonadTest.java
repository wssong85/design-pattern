package monads;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MonadTest {

  private void test() {

    // 1
    Wrap<Integer> a = Wrap.of(1);
    System.out.println("a = " + a.getValue());
    // 10
    Wrap<Integer> b = a.map(i -> i + 9);
    System.out.println("b = " + b.getValue());
    // 110
    Wrap<Integer> c = b.map(i -> i * 11);
    System.out.println("c = " + c.getValue());
    // 21
    Wrap<Integer> d = a.map(i -> i * 10).map(i -> i + 11);
    System.out.println("d = " + d.getValue());
  }

  private void test2() {
    Wrap<Integer> a = Wrap.of(1);
    Wrap<Wrap<Integer>> b = a.map(this::inc);
    System.out.println("b = " + b.getValue().getValue());
    Wrap<Integer> c = a.flatMap(this::inc).flatMap(this::inc);
    System.out.println("c = " + c.getValue());
  }

  private void optionalTet() {
    Wrap<Integer> a = Wrap.of(1);
    Wrap<Wrap<Integer>> b = a.map(this::inc);

//    System.out.println("a = " + a.getValue());
//    System.out.println("b = " + b.getValue());
  }

  Wrap<Integer> inc(Integer x) {
//    System.out.println("x = " + x);
    Wrap<Integer> xof = Wrap.of(x + 1);
//    System.out.println("xof = " + xof.getValue());
    return Wrap.of(x + 1);
  }

  private static void optionalTest() {

    Optional<Integer> a = Optional.of(13);
    Optional<Integer> b = Optional.of(42);
    Optional<Integer> c = add(a, b);// Optional[55]
    System.out.println("c.get() = " + c.get());
    Optional<Integer> d = add(a, Optional.empty());// Optional.empty
    System.out.println("d.get() = " + d.isEmpty());
    Optional<Integer> e = add(Optional.empty(), b);// Optional.empty
    System.out.println("e.get() = " + e.isEmpty());
  }

  private static void optionalTest2() {

    Optional<Integer> a = Optional.of(13);
    Optional<Integer> b = Optional.of(42);

    BiFunction<Integer, Integer, Integer> plus = (x, y) -> x + y;
    BiFunction<Integer, Integer, Integer> times = (x, y) -> x * y;

    //Optional[55]
    Optional<Integer> plusResult = compute(plus, a, b);
    System.out.println("plusResult.get() = " + plusResult.get());

    //Optional[546]
    Optional<Integer> timesResult = compute(times, a, b);
    System.out.println("timesResult.get() = " + timesResult.get());

    Stream<Optional<Integer>> stream2 = Stream.of(1, 2, 3, 4).map(Optional::of);
//    System.out.println("stream2.toString() = " + stream2.collect(Collectors.toList()));
    //Optional[Optional[24]]
    Optional<Optional<Integer>> productResult3 = stream2.reduce((acc, elem) -> compute(times, acc, elem));
    System.out.println("productResult3.get() = " + productResult3.get().get());
    Optional<Integer> productResult4 = productResult3.flatMap(o -> o);
    System.out.println("productResult4.get() = " + productResult4.get());
  }

  static Optional<Integer> add(Optional<Integer> oa, Optional<Integer> ob) {
    return oa.flatMap(a -> ob.map(b -> a + b));
  }

  static <A, B, R> Optional<R> compute(BiFunction<A, B, R> operation, Optional<A> oa, Optional<B> ob) {
    return oa.flatMap(a -> ob.map(b -> operation.apply(a, b)));
  }

  public static class Test {

    public static void main(String[] args) {

//      MonadTest monadTest = new MonadTest();
//      monadTest.test();
//      monadTest.optionalTet();
//      monadTest.test2();

//      Optional<Integer> oa = Optional.of(10);
//      Optional<Integer> ob = Optional.of(11);
//      Optional<Integer> add = add(oa, ob);
//      Integer integer = add.get();
//      System.out.println("integer = " + integer);
//      optionalTest();
      optionalTest2();
    }
  }
}
