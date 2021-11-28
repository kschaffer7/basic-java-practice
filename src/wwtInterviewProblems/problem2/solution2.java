package wwtInterviewProblems.problem2;
//Say, an organization issues ID cards to its employees with unique ID codes. The ID code for an employee named Jigarius Caesar looks as follows: CAJI202002196.
//
//        Here’s how the ID code is derived:
//        CA: First 2 characters of the employee’s last name.
//        JI: First 2 characters of the employee’s first name.
//        2020: Full year of joining.
//        02: 2 digit representation of the month of joining.
//        19: Indicates that this is the 19th employee who joined in Feb 2020.
//        This will have at least 2 digits, starting with 01, 02, and so on.
//        6: The last digit is a verification digit which is computed as follows:
//        Take the numeric part of the ID code (without the verification digit).
//        Sum all digits in odd positions. Say this is O.
//        Sum all digits in even positions. Say this is E.
//        Difference between O & E. Say this is V.
//        If V is negative, ignore the sign, e.g., -6 is treated as 6. Say this is V.
//        If V is greater than 9, divide it by 10 and take the reminder. Say this is V.
//        V is the verification code.
//
//        CAJI202002196 # ID code
//        202002196 # Numeric part
//        20200219 # Ignoring verification digit
//        2 + 2 + 0 + 1 = 5 # Sum of odd position digits, i.e. O
//        0 + 0 + 2 + 9 = 11 # Sum of even position digits, i.e. E
//        5 - 11 = -6 # V = O - E
//        6 # Verification digit, ignoring sign
//
//        Write a command-line program in your preferred coding language that:
//        Allows the user to enter their First name, Last name and ID code.
//        Prints PASS if the ID code seems valid.
//        Prints INVESTIGATE otherwise.
//
//        function validateIdCode(firstName, lastName, idCode) {
//        // TODO: Implement function to validate!
//        return 'INVESTIGATE'
//        }
//
//        console.log(validateIdCode('Jigarius', 'Caesar', 'CAJI202002196'))

public class solution2 {
    public static void main (String[] args) {
        System.out.println(validateIdCode("Jigarius", "Caesar", "CAJI202002196"));
    }
    public static String validateIdCode(String firstName, String lastName, String idCode) {

        // make inputs lowercase to avoid faulty logic
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        idCode = idCode.toLowerCase();

        // Check to see if the first 2 characters of the last name match characters 1 & 2 in the id code
        boolean lastNameMatch = lastName.charAt(0) == idCode.charAt(0) &&  lastName.charAt(1) == idCode.charAt(1);
        // Check to see if the first 2 characters of the first name match characters 3 & 4 in the id code
        boolean firstNameMatch = firstName.charAt(0) == idCode.charAt(2) && firstName.charAt(1) == idCode.charAt(3);

        // Check the last ID code digit for verification
        // Capture the last digit in the ID Code as a verification digit
        int verificationCode = idCode.charAt(idCode.length() - 1);
        int verificationNum = Character.getNumericValue(verificationCode);
        // Calculate v (the value to check the verification digit) from the numeric part of the ID code (without the verification digit)
        // Sum all digits in odd positions. Say this is O.
        int o = 0;
        // Sum all digits in even positions. Say this is E.
        int e = 0;
        for (int i = 4; i < idCode.length() - 1; i++) {
            int number = Character.getNumericValue(idCode.charAt(i));
            if (i % 2 != 0) {
                o = o + number;
            } else {
                e = e + number;
            }
        }
        // Difference between O & E. Say this is V.
        int v = o - e;
        // If V is negative, ignore the sign, e.g., -6 is treated as 6. Say this is V
        v = Math.abs(v);
        // If V is greater than 9, divide it by 10 and take the reminder. Say this is V
        if (v > 9) {
            v = v % 10;
        }
        // Check to see if calculated verification number matches the one at the end of the ID code.
        boolean vMatch = verificationNum == v;

        // Prints PASS if the ID code seems valid.
        // Prints INVESTIGATE otherwise.
        if (lastNameMatch && firstNameMatch && vMatch) {
            return "PASS";
        } else {
            return "INVESTIGATE";
        }
    }
}


