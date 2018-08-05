public class ExtraCreditMain {
        public static void main( String args[] ) {

            int i, numbers[];
            ExtraCredit ec = new ExtraCredit();

            System.out.println();

            System.out.println( "******* Scenario #1 *******" );
            System.out.println();
            ec.populate( 100000000, false );
            ec.findClosestToZero();
            ec.printClosestToZero();
            System.out.println();

            System.out.println( "******* Scenario #2 *******" );
            System.out.println();
            ec.populate( 5, true );
            ec.findClosestToZero();
            ec.printClosestToZero();

            System.out.println( "In this scenario, the numbers are..." );
            numbers = ec.getNumbers();
            for ( i = 0; i < numbers.length; i++ ) {
                System.out.println( "Numbers[" + i + "]:  " + numbers[i] );
            }

            System.out.println();
        }
    }
