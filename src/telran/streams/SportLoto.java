package telran.streams;


import static telran.streams.StreamIntroductionMethods.getRandomArray;

import java.util.Arrays;

public class SportLoto {
	
	private static final int LENGTH = 7;
	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 49;

	public static void main(String[] args) {
		// TODO
		//printing out sportloto random numbers
		//application with command line mandatory arguments
		//first argument minimal inclusive value
		//second argument maximal inclusive value
		//third argument amount of the random numbers
		//Example: java -jar sportLoto 1 49 7
		// 3, 10, 49, 1, 40, 6, 7

		Arrays.stream(getRandomArray(MIN_VALUE, MAX_VALUE, LENGTH)).forEach(e -> System.out.print(e + " "));

		
		
		
//		IntStream.generate(() -> ThreadLocalRandom.current().nextInt(MIN_VALUE, MAX_VALUE + 1))
//        .distinct()
//        .limit(LENGTH)
//        .forEach(num -> System.out.print(num + " "));
	}

}
