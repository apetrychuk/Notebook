import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;

/**
 * Created by Андрей on 03.05.2016.
 */
public class Notebook {
    private String name;
    private String surname;
    private String patronymic;
    private String fio;
    private String nickname;
    private String comment;
    private String homeCallNumber;
    private String mobileCallNumber;
    private String email;
    private String skype;
    private String dateEntering;
    private String dateChanging;
    private String index;
    private String street;
    private String city;
    private String home;
    private String flat;
    private String mailAdress;
    private String adress;
    private Group group;

    View  view;

    public String getIndex() {
        return index;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getHome() {
        return home;
    }

    public String getFlat() {
        return flat;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public String getAdress() {
        return adress;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Notebook(View view) {
        this.view = view;
    }
    public Notebook(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        /*if (getName() != null)
            setDateEntering(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").toString());*/
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        /*if (getSurname() == null) {
            setDateChanging(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").toString());
        }*/
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        /*if (getPatronymic() == null) {
            setDateChanging(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").toString());
        }*/
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
        /*if (getFio() == null) {
            setDateChanging(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").toString());
        }*/
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
        /*if (getNickname() == null) {
            setDateChanging(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").toString());
        }*/
    }

    public String getComment() {
        return comment;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public void setMailAdress(String mailAdress) {
        this.mailAdress = mailAdress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setComment(String comment) {
        this.comment = comment;
        /*if (getComment() == null) {
            setDateChanging(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").toString());
        }*/
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
        /*if (getGroup() == null) {
            setDateChanging(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").toString());
        }*/
    }

    public String getHomeCallNumber() {
        return homeCallNumber;
    }

    public void setHomeCallNumber(String homeCallNumber) {
        this.homeCallNumber = homeCallNumber;
        /*if (getHomeCallNumber() == null) {
            setDateChanging(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").toString());
        }*/
    }

    public String getMobileCallNumber() {
        return mobileCallNumber;
    }

    public void setMobileCallNumber(String workCallNumber) {
        this.mobileCallNumber = workCallNumber;
        /*if (getMobileCallNumber() == null) {
            setDateChanging(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").toString());
        }*/
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        /*if (getEmail() == null) {
            setDateChanging(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").toString());
        }*/
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
        /*if (getSkype() == null) {
            setDateChanging(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").toString());
        }*/
    }

    public String getDateEntering() {
        return dateEntering;
    }

    public void setDateEntering(String dateEntering) {
        this.dateEntering = dateEntering;
        setDateChanging(new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm").toString());
    }

    public String getDateChanging() {
        return dateChanging;
    }

    public void setDateChanging(String dateChanging) {
        this.dateChanging = dateChanging;
    }

        public void writeToFields(String[] tmp){
            Date now = new Date();
            DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            setName(tmp[0]);
            setSurname(tmp[1]);
            setPatronymic(tmp[2]);
            setFio(getSurname() + " " + getName().toUpperCase().charAt(0) + ". " + getPatronymic().toUpperCase().charAt(0) + ".");
            setNickname(tmp[3]);
            setComment(tmp[4]);
            setHomeCallNumber(tmp[5]);
            setMobileCallNumber(tmp[6]);
            setEmail(tmp[7]);
            setSkype(tmp[8]);
            setIndex(tmp[9]);
            setCity(tmp[10]);
            setStreet(tmp[11]);
            setHome(tmp[12]);
            setFlat(tmp[13]);
            setAdress(getCity() + ", " + getStreet() + ", " + getHome() + ", " + getFlat() + ".");
            setMailAdress(getIndex() + ", " + getCity() + ", " + getStreet() + ", " + getHome() + ", " + getFlat() + ".");
            setGroup(Group.valueOf(tmp[14]));
            setDateEntering(formatter.format(now));
            setDateChanging(getDateEntering());
        }

}
