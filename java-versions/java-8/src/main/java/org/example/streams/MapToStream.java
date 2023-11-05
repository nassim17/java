package org.example.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapToStream {

  public static void main(String[] args){
    Map<Integer, String> map = new HashMap<>();

    map.put(1, "Tom");
    map.put(2, "Ben");
    map.put(3, "Lisa");

    Stream<Map.Entry<Integer, String> > streamMap = convertMapToStream(map);
    Stream<Integer> streamKeys = convertKeysToStream(map);
    Stream<String> streamValues = convertValuesToStream(map);

    System.out.println("Map: " + map);
    System.out.println("convertMapToStream: " + Arrays.toString(streamMap.toArray()));
    System.out.println("convertKeysToStream: " + Arrays.toString(streamKeys.toArray()));
    System.out.println("convertValuesToStream: " + Arrays.toString(streamValues.toArray()));
  }

  public static <K, V> Stream<Entry<K, V>> convertMapToStream(Map<K, V> map){

    return map
        .entrySet()
        .stream();
  }

  public static <K, V> Stream<K> convertKeysToStream(Map<K, V> map){

    return map
        .keySet()
        .stream();
  }

  public static <K, V> Stream<V> convertValuesToStream(Map<K, V> map){

    return map
        .values()
        .stream();
  }
}
