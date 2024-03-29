package net.herbert.step5.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("cities")
public class City {
    @Id
    private String name;
    private String country;
    private String subcountry;
    private Integer geonameid;

    public City() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getSubcountry() {
        return subcountry;
    }
    public void setSubcountry(String subcountry) {
        this.subcountry = subcountry;
    }
    public Integer getGeonameid() {
        return geonameid;
    }
    public void setGeonameid(Integer geonameid) {
        this.geonameid = geonameid;
    }
}
