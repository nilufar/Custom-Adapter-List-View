package android.listview.parves.customadapter;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 11-7-16.
 */
public class Person {
    private String name;
    private String address;
    private String email;
    private int imgId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public Person(String name, String address, String email, int imgId) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.imgId = imgId;
    }

    public Person() {
    }
    public ArrayList<Person> getAllPerson(){
        ArrayList<Person> persons=new ArrayList<>();
        persons.add(new Person("Bill Gates","Kotowaly","yeasminnilo@gmail.com",R.drawable.jack));
        persons.add(new Person("Bill", "123", "bill@live.com", R.drawable.bill));
        persons.add(new Person("Jill", "123", "jack@live.com", R.drawable.jack));
        return persons;
    }
}
