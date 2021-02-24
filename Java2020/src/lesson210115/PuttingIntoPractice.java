package lesson210115;


import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import lesson210115.data.Trader;
import lesson210115.data.Transaction;

public class PuttingIntoPractice {

  public static void main(String... args) {
    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");

    List<Transaction> transactions = Arrays.asList(
        new Transaction(brian, 2011, 300),
        new Transaction(raoul, 2012, 1000),
        new Transaction(raoul, 2011, 400),
        new Transaction(mario, 2012, 710),
        new Transaction(mario, 2012, 700),
        new Transaction(alan, 2012, 950)
    );

    // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
//    q1(transactions);
    
    List<Transaction> sortedTransactionsFrom2011 = transactions.stream()
    	.filter(t -> t.getYear() == 2011)
    	.sorted(comparing(Transaction::getValue))
    	.collect(Collectors.toList());
    System.out.println(sortedTransactionsFrom2011);

    // Query 2: What are all the unique cities where the traders work?
//    q2(transactions);
    
    List<String> uniqueCities = transactions.stream()
    	.map(t -> t.getTrader().getCity())
    	.distinct()
    	.collect(toList());
    
    System.out.println(uniqueCities);

    // Query 3: Find all traders from Cambridge and sort them by name.
//    q3(transactions);
    
    List<Trader> tradersFromCambridge = transactions.stream()
    	.map(Transaction::getTrader)
    	.filter(t -> t.getCity().equals("Cambridge"))
    	.distinct()
    	.sorted(comparing(Trader::getName))
    	.collect(toList());
    
    System.out.println(tradersFromCambridge);

    // Query 4: Return a string of all traders' names sorted alphabetically.
//    q4(transactions);
    
    String names = transactions.stream()
    	.map(t -> t.getTrader().getName())
    	.distinct()
    	.sorted()
//    	.collect(Collectors.joining(", "));
    	.reduce("", (s1, s2) -> s1 + s2);
    
    System.out.println(names);

    // Query 5: Are there any trader based in Milan?
//    q5(transactions);

    boolean anyoneFromMilano = transactions.stream()
    	.anyMatch(t -> t.getTrader().getCity().equals("Milan"));
    
    System.out.println(anyoneFromMilano);
    
    // Query 6: Print all transactions' values from the traders living in Cambridge.
//    q6(transactions);
    
    transactions.stream()
    	.filter(t -> t.getTrader().getCity().equals("Cambridge"))
    	.map(Transaction::getValue)
    	.forEach(System.out::println);

    // Query 7: What's the highest value in all the transactions?
//    q7(transactions);
    
    Optional<Integer> max = transactions.stream().map(Transaction::getValue).max((t1,t2) -> t1 - t2);
    
    max.ifPresent(System.out::println);

    // Find the transaction with the smallest value
//    q8(transactions);
    
    
    Optional<Transaction> reduce = transactions.stream()
    	.reduce((t1,t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
    reduce.ifPresent(System.out::println);
    
  }

private static void q8(List<Transaction> transactions) {
	Optional<Transaction> smallestTransaction = transactions.stream()
        .min(comparing(Transaction::getValue));
    // Here I cheat a bit by converting the found Transaction (if any) to a String
    // so that I can use a default String if no transactions are found (i.e. the Stream is empty).
    System.out.println(smallestTransaction.map(String::valueOf).orElse("No transactions found"));
}

private static void q7(List<Transaction> transactions) {
	int highestValue = transactions.stream()
        .map(Transaction::getValue)
        .reduce(0, Integer::max);
    System.out.println(highestValue);
}

private static void q6(List<Transaction> transactions) {
	transactions.stream()
        .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
        .map(Transaction::getValue)
        .forEach(System.out::println);
}

private static void q5(List<Transaction> transactions) {
	boolean milanBased = transactions.stream()
        .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
    System.out.println(milanBased);
}

private static void q4(List<Transaction> transactions) {
	String traderStr = transactions.stream()
        .map(transaction -> transaction.getTrader().getName())
        .distinct()
        .sorted()
        .reduce("", (n1, n2) -> n1 + n2);
    System.out.println(traderStr);
}

private static void q3(List<Transaction> transactions) {
	List<Trader> traders = transactions.stream()
        .map(Transaction::getTrader)
        .filter(trader -> trader.getCity().equals("Cambridge"))
        .distinct()
        .sorted(comparing(Trader::getName))
        .collect(toList());
    System.out.println(traders);
}

private static void q2(List<Transaction> transactions) {
	List<String> cities = transactions.stream()
        .map(transaction -> transaction.getTrader().getCity())
        .distinct()
        .collect(toList());
    System.out.println(cities);
}

private static void q1(List<Transaction> transactions) {
	List<Transaction> tr2011 = transactions.stream()
        .filter(transaction -> transaction.getYear() == 2011)
        .sorted(comparing(Transaction::getValue))
        .collect(toList());
    System.out.println(tr2011);
}

}
