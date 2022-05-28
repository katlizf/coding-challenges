// Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

// The output should be two capital letters with a dot separating them.

// It should look like this:

// Sam Harris => S.H

// patrick feeney => P.F


public class abbreviateName {

    public static String abbrevName(String name) {
      String[] arrOfStr = name.split(" ");
      String firstName = arrOfStr[0].toUpperCase();
      String lastName = arrOfStr[1].toUpperCase();
      char firstInitial = firstName.charAt(0);
      char lastInitial = lastName.charAt(0);
      String initials = firstInitial + "." + lastInitial;
      return initials;
    }
  }
