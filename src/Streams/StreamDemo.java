package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //Traditional way
        List<Integer> numbers= Arrays.asList(1,2,5,2,4,6,8,4,88);
        int count=0;
        for(int i:numbers){
            if(i%2==0){
                count++;
            }
        }

        System.out.println(count);

        //Using streams
        System.out.println(numbers.stream().filter(x->x%2==0).count());

        //Creating Streams
        //1.Collections
        List<Integer>list=Arrays.asList(1,5,2,1,4,466,21);
        Stream<Integer>stream=list.stream();

        //2. From Arrays
        String[] arr = {"ath", "bhatkande", "deep"};
        Stream<String> stream1 = Arrays.stream(arr);

        //3. Streamof
        Stream<String>stream2=Stream.of("a","b","c","d");

        //4.Infinite stream
        Stream<Integer>stream3=Stream.generate(()->100);
        List<Integer>collected=Stream.iterate(1,x->x+1).limit(10).collect(Collectors.toList());
        collected.forEach(x-> System.out.print(x+" "));
    }
}
