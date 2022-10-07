package com.tamanna.customlistview;

public class UserPojo {

    int img;
    String countryname;
    String capital;
    String population;
    String description;

    public UserPojo(int img, String countryname, String capital, String population, String description) {
        this.img = img;
        this.countryname = countryname;
        this.capital = capital;
        this.population = population;
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


