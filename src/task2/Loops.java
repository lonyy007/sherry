package task2;

public class Loops {

    public static void main(String[] args) {

        //create loop
        Loops loops = new Loops();
        
		//call printWords method
        loops.printWords(2);

    }

    //print main method
    public void printWords(int numberOfTimes) {
        //create for loop, numberOfTimes assign loop time
        for (int i = 0; i < numberOfTimes; i++) {
            //print "word"
            System.out.println("word");
        }
    }
}
