package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        //Predicate
        Predicate<Integer> isEven=x->x%2==0;
        System.out.println(isEven.test(21));

        //Function
        Function<Integer,Integer> doubleit=x->x*2;
        Function<Integer,Integer> tripleit=x->x*3;
        System.out.println(tripleit.compose(doubleit).apply(20));
        System.out.println(tripleit.andThen(doubleit).apply(10));

        Function<Integer,Integer> identity=Function.identity();
        Integer res=identity.apply(5);
        System.out.println(res);


        //Consumer
        Consumer<String> consumer1=x-> System.out.println(x);
        consumer1.accept("Atharva");


        List<Integer> list= Arrays.asList(1,2,3,4,6,3,33,22);
        Consumer<List<Integer>> consumerList=x->{
            for(var i:list){
                System.out.print(i+" ");
            }
        };
        consumerList.accept(list);
        System.out.println();

        //Supplier
        Supplier<String>supply=()->"Hello Coditas";
        System.out.println(supply.get());

        //Combined Example

        Predicate<Integer>predicate=x->x%2==0;
        Function<Integer,Integer> function=x->x*x;
        Consumer<Integer>consumer=x-> System.out.println(x);
        Supplier<Integer> supplier=()->4;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        //BiPredicate BiConsumer, BiFunction
        BiPredicate<Integer,Integer> isEvenn=(x,y)->((x+y)%2)==0;
        System.out.println(isEvenn.test(5,5));

        BiConsumer<Integer,String > biConsumer=(x,y)->{
            System.out.print(x+" ");
            System.out.println(y);
        };
        biConsumer.accept(1,"Atharva");

        BiFunction<String,String ,Integer> biFunction=(x,y)->(x+y).length();
        System.out.println(biFunction.apply("Atharva","Bhatkande"));

        List<String>

    }
}
