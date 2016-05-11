/**
 * Created by Андрей on 04.05.2016.
 */
public class View {
    public static final String INPUT_NAME = "Input name of the subscriber";
    public static final String INPUT_PATRONYMIC = "Input Patronymik of the subscriber";
    public static final String INPUT_SURNAME = "Input Surname of the subscriber";
    public static final String INPUT_NICKNAME = "Input Nickname of the subscriber";
    public static final String INPUT_COMMENT = "Input Comment of the subscriber. Can be empty";
    public static final String INPUT_HOME_CALL_NUMBER = "Input Home Call Number of the subscriber. Example: +380 044 7784567";
    public static final String INPUT_MONILE_NUMBER = "Input Mobile Number of the subscriber. Example: +380 044 7784567";
    public static final String INPUT_EMAIL = "Input Email adress of the subscriber";
    public static final String INPUT_SKYPE = "Input login Skype of the subscriber";
    public static final String INPUT_GROUP = "Choose your Group of the subscriber from the list: FAMILY, WORK, FRIENDS.";
    public static final String INPUT_INDEX = "Input index of the subscriber";
    public static final String INPUT_CITY = "Input city of the subscriber";
    public static final String INPUT_STREET = "Input street of the subscriber. Format: street/lane/area/avenue Name of the street/lane/area/avenue";
    public static final String INPUT_NUMBER_HOME = "Input number of the home of the subscriber";
    public static final String INPUT_NUMBER_FLAT = "Input number of the flat of the subscriber";

    Notebook notebook;

    View(Notebook notebook){
        this.notebook = notebook;
    }
    public void printMessage(String str){
        System.out.println("" + str);
    }

    public void printEnum(Enum en){
        System.out.println(en);
    }

    public void printSubsciber(){
        StringBuilder buf = new StringBuilder(); // capacity = 16
        buf.append("========Абонент========\n")
                .append("Абонент\n")
                .append("FIO: " + notebook.getFio() + "\n")
                .append("Nickname: " + notebook.getNickname() + "\n")
                .append("Comment: " + notebook.getComment() + "\n")
                .append("GROUP: " + notebook.getGroup() + "\n")
                .append("Email: " + notebook.getEmail() + "\n")
                .append("Skype: " + notebook.getSkype() + "\n")
                .append("Adress: " + notebook.getAdress() + "\n")
                .append("Mail Adress: " + notebook.getMailAdress() + "\n")
                .append("Home call number: " + notebook.getHomeCallNumber() + "\n")
                .append("Mobile number: " + notebook.getMobileCallNumber() + "\n")
                .append("Data Entering: " + notebook.getDateEntering() + "\n")
                .append("Data Changing: " + notebook.getDateChanging() + "\n")
                .append("=======================");
        System.out.println(buf.toString());
    }
}
