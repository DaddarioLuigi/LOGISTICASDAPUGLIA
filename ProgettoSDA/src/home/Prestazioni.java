package home;

public class Prestazioni {
    
    int id;
    String name,lname,gmail,yahoo,phone,country;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public Prestazioni(int id, String name, String lname, String gmail, String yahoo, String phone, String country) {
        this.id = id;
        this.name = name;
        this.lname = lname;
        this.gmail = gmail;
        this.yahoo = yahoo;
        this.phone = phone;
        this.country = country;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setYahoo(String yahoo) {
        this.yahoo = yahoo;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public String getGmail() {
        return gmail;
    }

    public String getYahoo() {
        return yahoo;
    }

    public String getPhone() {
        return phone;
    }
    
    
}

