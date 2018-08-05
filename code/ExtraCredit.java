import java.util.*;

public class ExtraCredit {
    private int numbers[];
    private int indices[];

        public ExtraCredit() {}

        // Find the index position of values
        //   closest to zero and store them
        //   in indices
        public void findClosestToZero() {
            // ...

            //THIS LOOP FINDS THE NUMBER CLOSEST TO ZERO
            int min = this.numbers[0];
            int i;
            for(i=0; i < this.numbers.length-1; i++){
                if(Math.abs(min)>Math.abs(this.numbers[i+1])){
                    min = this.numbers[i+1];
                }
            }

            //THIS LOOP ADDS FINDS THE INDEX(S) OF THE NUMBER CLOSEST TO ZERO
            int j;
            for(j=0; j < this.numbers.length; j++){
                if(this.numbers[j]==min){
                    this.indices = new int[j]; //IS THIS HOW YOU ADD TO THE ARRAY?
                }
            }
        }

        public int[] getNumbers() {
            // ...
            return this.numbers;
        }

        public int[] getIndices() {
            // ...
            return this.indices;
        }

        // Randomly populate numbers with integer values
        //   from the entire range of int, including negative
        //   and positive values at random.
        // SIZE:  specificies the length of numbers
        //        and the number of random int values to generate.
        // RESTRICT:
        //   false - provides no restriction on the range of
        //           random numbers generated.
        //
        //   true  - restricts the range of random numbers
        //           generated to [-9, 9] (inclusive and
        //           between -9 and 9).
        public void populate( int size, boolean restrict ) {
            // ...
            int numbers[] = new int[size]; //PUT size in here
            Random rand = new Random();
            int p;
            for(p=0; p < numbers.length; p++){
                int numb = rand.nextInt();
                numbers[p] = numb;
            }
        }

        public void printClosestToZero() {
            // ...
            System.out.println("The length of the index length is " + this.indices.length);
            System.out.print("The index locations are ");
            int k;
            for(k=0; k < this.indices.length; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
