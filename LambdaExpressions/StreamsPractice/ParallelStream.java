package StreamsPractice;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {
        // A type of stream that enables paralle processing of elements
        // Allowing multiple threds to process parts of the stream simultaneously
        // This can significantlu improve performance for large data sets
        // workload is distributed across multiple threads

        // Parallel streams are most effective for CPU-intensive or large datasets where tasks are independent
        // They may add overhead for the imple tasks or small datasets
        





        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1,x->x+1).limit(2000).toList();
        // // x->factorial(x) --------- ParallelStream :: factorial
        List<Long> factorialList = list.stream().map(ParallelStream :: factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with sequential streams: " + (endTime - startTime) + "ms");





         startTime = System.currentTimeMillis();
        // List<Integer> list = Stream.iterate(1,x->x+1).limit(2000).toList();
        // x->factorial(x) --------- ParallelStream :: factorial
        factorialList = list.parallelStream().map(ParallelStream :: factorial).toList();
        // factorialList = list.parallelStream().map(ParallelStream :: factorial).sequential().toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel  streams: " + (endTime - startTime) + "ms");







        // Cummulative Sum
        // If u use parallel stream here ,
        // It will give u an unordered output
        // So use sequential stream

        // If u want to use parallelstream but want the output i sequentil stream way
        // Then use .sequential  after he itermedialte opeartions
        // factorialList = list.parallelStream().map(ParallelStream :: factorial).sequential().toList();
                                        // This is giving erro because
                                        // local variables in lambda expressions should be final or effectivelFinal
                                        // But if u declare the variables as final 
                                        //  Then u vant change the value of sum
                                        // So use the thread safe methods 
                                        // Like AtomicInteger sum = new AtomicInteger(0);
                                        //     List<Integer> numbers = Arrays.asList(1,2,3,4,5);
                                        //     int sum =0;
                                        //    List<Integer> cummulativeSum =  numbers.parallelStream().map(x->{
                                        //                     int i = x+ sum;
                                        //                     sum=i;
                                        //                     return i;
                                        //              }).toList();
                                        // }


        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        AtomicInteger sum = new AtomicInteger(0);
       List<Integer> cummulativeSum =  numbers.parallelStream().map(x->sum.addAndGet(x)).toList();
       System.out.println(cummulativeSum);
    }

    private static long factorial(int n){
        long result = 1;
        for(int i=2; i<=n; i++){
            result*=i;
        }
        return result;
    }
}
