package com.example.newproject.models;

public class VacationPreferences {
    private String name;
    private String keywords;
    private String destination;
    private String typeOfTravel;
    private String additionalFeatures;

    public VacationPreferences(String name, String keywords, String destination, String typeOfTravel, String additionalFeatures) {
        this.name = name;
        this.keywords = keywords;
        this.destination = destination;
        this.typeOfTravel = typeOfTravel;
        this.additionalFeatures = additionalFeatures;
    }
    private VacationPreferences(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTypeOfTravel() {
        return typeOfTravel;
    }

    public void setTypeOfTravel(String typeOfTravel) {
        this.typeOfTravel = typeOfTravel;
    }

    public String getAdditionalFeatures() {
        return additionalFeatures;
    }

    public void setAdditionalFeatures(String additionalFeatures) {
        this.additionalFeatures = additionalFeatures;
    }
}
