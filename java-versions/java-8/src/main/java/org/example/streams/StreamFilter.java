package org.example.streams;

import java.util.stream.Stream;

public class StreamFilter {

  public static void main(String[] args){

    Stream<String> myStream = Stream.of("Tom", "Ben", "Artur", "John");
    myStream.filter(x -> x.startsWith("A"))
        .forEach(System.out::println);
  }
}
