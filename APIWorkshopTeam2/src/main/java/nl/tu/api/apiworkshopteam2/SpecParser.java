package nl.tu.api.apiworkshopteam2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:42
 */
class SpecParser {

	public SpecParser(){
               // String to be scanned to find the pattern.
            String line = "(and)(a)(b)";
            String pattern = "(.*)(\\d+)(.*)";

            // Create a Pattern object
            Pattern r = Pattern.compile(pattern);

            // Now create matcher object.
            Matcher m = r.matcher(line);
            if (m.find( )) {
               System.out.println("Found value: " + m.group(0) );
               System.out.println("Found value: " + m.group(1) );
               System.out.println("Found value: " + m.group(2) );
            } else {
               System.out.println("NO MATCH");
            }
	}

	public void finalize() throws Throwable {

	}
}//end SpecParser