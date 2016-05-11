import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Андрей on 11.05.2016.
 */
public class Controller {
    public static final String REGEX_FULL_NAME = "(?:[a-zA-z]+-?){1,}[a-zA-z]+";
    public static final String REGEX_NICKNAME = "[^\\[\\]\\|\\;,$<>\"\\s]+{5,}";
    public static final String REGEX_COMMENT = ".*";
    public static final String REGEX_HOME_CALL_NUMBER = "\\+380\\s*[0-9]{3,5}\\s*[0-9]{4,7}";
    public static final String REGEX_MOBILE_NUMBER = "\\+380\\s*[1-9]{2}\\s*[0-9]{8}";
    public static final String REGEX_EMAIL = "(?:\\w+[.-]?){0,}\\w+@(?:\\w+\\.){1,2}\\w+";
    public static final String REGEX_SKYPE = "[a-zA-z][a-zA-z0-9-_.]+";
    public static final String REGEX_INDEX = "[0-9]{5,6}";
    public static final String REGEX_CITY = "[a-zA-z]+-?[a-zA-z]+";
    public static final String REGEX_STREET = "(street|lane|area|avenue) [a-zA-z]+-?[a-zA-z]+";
    public static final String REGEX_NUMBER_HOME = "[0-9]{1,2}[-/a-zA-Z]?[0-9]{0,2}";
    public static final String REGEX_NUMBER_FLAT = "[0-9]+";
    public static final String REGEX_GROUP = "(FAMILY|WORK|FRIENDS)";

    String[] tmp = new String[17];
    int i = 0;

    Notebook notebook;
    View view;

    public Controller(Notebook notebook, View view) {
        this.notebook  = notebook;
        this.view = view;
    }

    public void addSubscriber(){
        String input = "";

        readAndCheck(view.INPUT_NAME,REGEX_FULL_NAME);
        readAndCheck(view.INPUT_SURNAME,REGEX_FULL_NAME);
        readAndCheck(view.INPUT_PATRONYMIC,REGEX_FULL_NAME);
        readAndCheck(view.INPUT_NICKNAME,REGEX_NICKNAME);
        readAndCheck(view.INPUT_COMMENT,REGEX_COMMENT);
        readAndCheck(view.INPUT_HOME_CALL_NUMBER,REGEX_HOME_CALL_NUMBER);
        readAndCheck(view.INPUT_MONILE_NUMBER,REGEX_MOBILE_NUMBER);
        readAndCheck(view.INPUT_EMAIL,REGEX_EMAIL);
        readAndCheck(view.INPUT_SKYPE,REGEX_SKYPE);
        readAndCheck(view.INPUT_INDEX,REGEX_INDEX);
        readAndCheck(view.INPUT_CITY,REGEX_CITY);
        readAndCheck(view.INPUT_STREET,REGEX_STREET);
        readAndCheck(view.INPUT_NUMBER_HOME,REGEX_NUMBER_HOME);
        readAndCheck(view.INPUT_NUMBER_FLAT,REGEX_NUMBER_FLAT);
        readAndCheck(view.INPUT_GROUP,REGEX_GROUP);
        notebook.writeToFields(tmp);
        view.printSubsciber();

    }

    public void readAndCheck (String message,String str){
        Scanner sc = new Scanner(System.in);
        Pattern lettersPattern;
        Matcher lettersMatcher;
        while(true) {
            view.printMessage(message);
            String input = sc.nextLine();
            lettersPattern = Pattern.compile(str);
            lettersMatcher = lettersPattern.matcher(input);
            if (lettersMatcher.matches()) {
                view.printMessage("TRUE");
                writeToArray(tmp, input);
                break;
            } else {
                view.printMessage("FAIL. Try Again");
            }
        }
    }

    public void writeToArray(String[] arr, String str){
        arr[i] = str;
        i++;
    }
}
