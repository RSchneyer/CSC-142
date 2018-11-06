import java.io.*;
import java.util.*;



public class Assignment2Improved{
    public static void main(String [] args){
        //Initializing variables or whatever (boring stuff)
        System.out.println("HELLO WORLD!!!");
        FileInputStream inf = null;
        Scanner in = null;

       
        //I used ArrayLists b/c you don't need to give them a length when you create them
        //This means that the program should still work if there's not 25 students
        //It might not be the best way to do it, but it's the way I though of ¯\_(ツ)_/¯
        ArrayList<String> names = new ArrayList<String>(); //ArrayList of student names
        ArrayList<Double> testScoreAverages = new ArrayList<Double>(); //Array list of each students test score average (one val/student)
        int[] sumOfTestScores = {0,0,0,0}; //Not an array list because there's only ever 4 tests (one val/test)

        
        //Try to read file, throw error otherwise
        try{
            inf = new FileInputStream("initdata.txt");
        } catch(FileNotFoundException err){
            System.out.println("Critical error - could not open file");
            System.exit(1);
        }

        in = new Scanner(inf);
        //While we haven't reached the end of the file...
        while(in.hasNext()){
            System.out.println("Reading data...");
            //Boring index stuff to seperate names and scores
            String line = in.nextLine(); //Probably could have used nextInt(), but I forgot to and ran out of time
            int nameBreak = line.indexOf(' ');
            int scoresBreak = line.indexOf(' ', (nameBreak + 1));
            String scoresString = line.substring(scoresBreak+1);

            //Getting names and scores (Less boring)
            String studentName = line.substring(0, scoresBreak);
            int scores[] = returnScores(scoresString);
            double average = returnAverageTestScore(scores);
            
            //Add students name to ArrayList names & test average to ArrayList testScoreAverage
            names.add(studentName);
            testScoreAverages.add(average);
            //Update test score sums with latest students test scores
            sumOfTestScores = addTestScoresToSum(sumOfTestScores, scores);
            // System.out.println(studentName + " " + average + " " + grade); 
        }//End reading file
        System.out.println("All data read, closing file");
        //Close file and call method that creates the formatted text file
        in.close();
        writeDataToNewFile(names, testScoreAverages, sumOfTestScores);
    }

    public static int[] returnScores(String scores){
        //Returns an int array of the four scores
        int firstScoreEnd = scores.indexOf(' ');
        int firstScore = Integer.parseInt( scores.substring(0, firstScoreEnd) );

        int secondScoreEnd = scores.indexOf(' ', (firstScoreEnd+1));
        int secondScore = Integer.parseInt( scores.substring((firstScoreEnd+1),secondScoreEnd) );

        int thirdScoreEnd = scores.indexOf(' ', (secondScoreEnd+1));
        int thirdScore = Integer.parseInt( scores.substring((secondScoreEnd+1),thirdScoreEnd) );

        int fourthScore = Integer.parseInt( scores.substring((thirdScoreEnd+1)) );
        int scoresArray[] = {firstScore, secondScore, thirdScore, fourthScore};

        return scoresArray;
    }
    public static int[] addTestScoresToSum(int[] sumOfTestScores, int[] scores){
        //returns int array of sum of each test scores (for calculating class avg)
        int[] newSumOfTestScores = {0,0,0,0};
        newSumOfTestScores[0] = sumOfTestScores[0] + scores[0];
        newSumOfTestScores[1] = sumOfTestScores[1] + scores[1];
        newSumOfTestScores[2] = sumOfTestScores[2] + scores[2];
        newSumOfTestScores[3] = sumOfTestScores[3] + scores[3];
        
        return newSumOfTestScores;
    }
    public static double returnAverageTestScore(int[] scores){
        //Returns a double average of the scores array argument
        int sum = 0;
        double len = (double)scores.length;
        double avg;
        for(int val:scores){//For each val in scores
            sum+=val;
        }
        avg = sum/len;
        return avg;
    }
    public static String returnLetterGradeFromPercent(double percentage){
        //Returns a letter grade string based on a input percent double
        String grade = "ERROR";
        //Big long if/else chain because it was part of the requirements
        if(percentage >= 91.0 ){
            grade = "A";
        }
        else if(percentage < 91.0 && percentage >= 90.0){
            grade = "A-";
        }
        else if(percentage < 90.0 && percentage >= 89.0){
            grade = "B+";
        }
        else if(percentage < 89.0 && percentage >= 81.0){
            grade = "B";
        }
        else if(percentage < 81.0 && percentage >= 80.0){
            grade = "B-";
        }
        else if(percentage < 80.0 && percentage >= 79.0){
            grade = "C+";
        }
        else if(percentage < 79.0 && percentage >= 71.0){
            grade = "C";
        }
        else if(percentage < 71.0 && percentage >= 70.0){
            grade = "C-";
        }
        else if(percentage < 70.0 && percentage >= 69.0){
            grade = "D+";
        }
        else if(percentage < 69.0 && percentage >= 61.0){
            grade = "D";
        } 
        else if(percentage < 61.0 && percentage >= 60.0){
            grade = "D-";
        }
        else if(percentage < 60.0){
            grade = "F";
        }
        return grade;
    }
    public static void writeDataToNewFile(ArrayList<String> nameList, ArrayList<Double> testScoreAveragesPerStudent, int[] overallTestAverages){
        //Writes & formats data to formattedData.txt
        int studentCount = nameList.size();

        PrintWriter out = null;
        FileOutputStream fo = null;
        //try to create FileOutputStream, throw error otherwise
        try {
            fo = new FileOutputStream("formattedData.txt", true);
        } catch(FileNotFoundException e){
            System.out.println("Could not open file - exiting");
            System.exit(1);
        }
        out = new PrintWriter(fo);
        //Let the user know that we're writing stuff to a file
        System.out.println("Writing stuff to file");
        //Create header of Student Name, Test Score Average, and Letter Grade
        out.printf("%-30s %-30s %-30s\n", "Student Name", "Test Score Average", "Letter Grade");

        //For each student...
        for(int i=0; i<studentCount; i++){
            //Get the current student's name, test avg, and convert their test average to a letter grade
            String studentName = nameList.get(i);
            double percentage = testScoreAveragesPerStudent.get(i);
            String letterGrade = returnLetterGradeFromPercent(testScoreAveragesPerStudent.get(i));
            //Format and write the current student's info to the text file
            out.printf("%-30s %-30.1f %-30s\n", studentName, percentage, letterGrade);
        }
        //Array of length 4 that has the four averages for each test
        double[] testAverages = {(overallTestAverages[0]/(double)studentCount),(overallTestAverages[1]/(double)studentCount),(overallTestAverages[2]/(double)studentCount),(overallTestAverages[3]/(double)studentCount)};
        //Format and print the class' test score averages to the text file
        out.println("");
        out.println("Class Averages");
        out.printf("%-20s %-20s %-20s %-20s\n","Test 1","Test 2","Test 3","Test 4");
        out.printf("%-20.1f %-20.1f %-20.1f %-20.1f",testAverages[0],testAverages[1],testAverages[2],testAverages[3]);
        //Let the user know that we're done here and then close the file
        System.out.println("DONE!");
        out.close();
    }
}