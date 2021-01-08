package lesson210105;

@FunctionalInterface
public interface MyFunction<T,U,V,R> {
	
	R apply(T t, U u, V v);
	
	default void print() {}

}
