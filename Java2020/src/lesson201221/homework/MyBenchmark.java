package lesson201221.homework;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class MyBenchmark {

	
	private static final int KK = 1_000_000;
	
	public static void main(String[] args) throws RunnerException {
		Options opt = new OptionsBuilder()
				.include(MyBenchmark.class.getSimpleName())
				.forks(1)
				.build();
		new Runner(opt).run();
	}
	
	
	@State(Scope.Thread)
	public static class MyState {		
		Set<Integer> sortedSet;
		
		public MyState() {}
		
		@Setup(Level.Invocation)
		public void treeSetUp() {
			sortedSet = new TreeSet<>();
		}
		
		
		@TearDown
		public void tearDown() {
			System.out.println("TearDown");
		}
	}
	
	
	@Benchmark
	@BenchmarkMode(Mode.AverageTime)
	@OutputTimeUnit(TimeUnit.SECONDS)
	public Set<Integer> testMillionTreeSet(MyState myState) {
		
		for (int i = 0; i < KK; i++) {
			int nextInt = new Random().nextInt(KK+1);
			myState.sortedSet.add(nextInt);
		}
		
		return myState.sortedSet;
	}
}
