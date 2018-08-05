import java.util.Random;

class ExtraCredit {
    private int numbers[];
    private int indices[];

    public ExtraCredit() {}

    // Method finding numbers closest to zero and their index
    public void findClosestToZero() {
        // Finding closest int to 0
        // declaring ints
        int min = numbers[0];
        int i;

        // start taking time lapse of code
        long start = System.nanoTime();

        // loop finding minimum value
        for(i=1; i < numbers.length; i++){
            if(Math.abs(numbers[i]) < Math.abs(min)){
                min = numbers[i];
            }
        }

        // Finding index of numbers from previous part
        // declaring variables
        int x = 0;
        // loop finding index values
        for (i = 0; i < numbers.length; i++) {
            if (Math.abs(min) == Math.abs(numbers[i])){
                indices[x] = i;
                x++;
            }
        }

        long finish = System.nanoTime();
        long time = finish - start;
        System.out.println("Start Time:  " + start);
        System.out.println("Finish Time:  " + finish);
        System.out.println("Elapsed Time In Nano-Secs:  " + time);
        System.out.println("Elapsed Time In Seconds:  " + (double)time / 1.0E9D);
        System.out.println();
    }

    // Method to get Numbers []
    public int[] getNumbers() {
        return this.numbers;
    }

    // Method to get Indices []
    public int[] getIndices() {
        return this.indices;
    }

    public void populate( int size, boolean restrict ) {
        // declaring variables
        this.numbers = new int[size];
        this.indices = new int[size];
        Random random = new Random();

        // If-statement for scenarios for different restrict
        if(restrict) {
            for (int i = 0; i < numbers.length; i++) {
                int num = (int) ((Math.random() * ((9 + 9) + 1)) - 9);
                numbers[i] = num;
            }

        }
        else {
            for (int i = 0; i < numbers.length; i++) {
                int number = random.nextInt();
                numbers[i] = number;
            }
        }
    }

    public void printClosestToZero() {
        // printing what the indices are
        System.out.print("The index locations are at: \n");
        // loop printing values of indices array
        int i;
        // checking if index of 1 is value of 0 or greater to determine
        // if it is populated with a valid index
        for(i=0; i < indices.length; i++){
            if(i == 0)
                System.out.println("numbers[" + indices[i] + "]: " + numbers[indices[i]]);
            else if(indices[i] != 0)
                System.out.println("numbers[" + indices[i] + "]: " + numbers[indices[i]]);
            else
                break;
        }
        System.out.println();
    }
}
