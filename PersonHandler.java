
import java.util.ArrayList;
import java.util.List;
/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;
    public static String newline = System.getProperty("line.separator");
    //java has build in fuctionally known as property , 1 called line.operator
    //made new string called new line ....so we used line sperater.
    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop(Person[] personArray) {
        String result = "";
        int counter = 0;// assume there is a `counter` 
        while(counter < personArray.length) // while `counter` is less than length of array
        { // begin loop
            Person currentPerson = personArray[counter]; // use `counter` to identify the `current Person` in the array
            String stringRepresentation = currentPerson.toString(); // get `string Representation` of `currentPerson`
            result += stringRepresentation; // append `stringRepresentation` to `result` variable
            counter++;
        }// end loop
        // TEST NEEDS TO HAVE A AGURG OF A PERSON ARRAY
        // not sure why is printing string with comments in it

        return result.toString();
    }

    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for(int counter = 0;counter < personArray.length; counter++){        // use the above clauses to declare for-loop signature
            // begin loop
            Person currentPerson = personArray[counter];// use `counter` to identify the `current Person` in the array
            String stringRepresentation = currentPerson.toString();// get `string Representation` of `currentPerson`
            result += stringRepresentation;// append `stringRepresentation` to `result` variable
        }// end loop

        return result;
    }

    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        
            // use the above discoveries to declare for-each-loop signature
           for(Person currentPerson : personArray){ // begin loop
            String stringRepresentation = currentPerson.toString();// get `string Representation` of `currentPerson`
            result += stringRepresentation;// append `stringRepresentation` to `result` variable
        }// end loop

        return result;
    }

    public Person[] getPersonArray() {
        return personArray;
    }
}

