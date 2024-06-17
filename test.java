public class test {

    public static void main(String[] args) {
        // Details for the first individual
        String fullName1 = "Mathiuu Iguthu";
        String regNumber1 = "23/01942";
        String dateOfBirth1 = "03-07-2005";
        double averageScore1 = 85.5;
        char grade1 = 'A';

        // Details for the second individual
        String fullName2 = "Arnold Kahuro";
        String regNumber2 = "23/01959";
        String dateOfBirth2 = "11-23-2004";
        double averageScore2 = 78.3;
        char grade2 = 'B';

        // Display details for the first individual
        displayIndividualDetails(fullName1, regNumber1, dateOfBirth1, averageScore1, grade1);

        // Separator
        System.out.println("****************************************");

        // Display details for the second individual
        displayIndividualDetails(fullName2, regNumber2, dateOfBirth2, averageScore2, grade2);
    }

    // Method to display individual details
    private static void displayIndividualDetails(String fullName, String regNumber, String dateOfBirth, double averageScore, char grade) {
        System.out.println("Full Name: " + fullName);
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
    }
}

//Full Name: John Doe
//Registration Number: REG123456
//Date of Birth: 01-01-2000
//Average Score: 85.5
//Grade: A
//****************************************
//Full Name: Jane Smith
//Registration Number: REG654321
//Date of Birth: 02-02-2001
//Average Score: 78.3
//Grade: B

