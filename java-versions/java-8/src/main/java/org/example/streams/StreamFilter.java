package org.example.streams;

import java.util.stream.Stream;

public class StreamFilter {

  public static void main(String[] args){

    Stream<String> myStream = Stream.of("Tom", "Ben", "Artur", "John");
    myStream.filter(x -> x.startsWith("A"))
        .forEach(System.out::println);

    Integer[] myArray = new Integer[] { 1, 4, 5, 7, 9, 10 };
    Stream.of(myArray)
        .filter(x -> x % 2 == 0)
        .forEach(System.out::println);
  }
}
