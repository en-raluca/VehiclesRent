package model;

public enum Colour {
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    BLUE("Blue");


    private String colour;
    Colour(String colour){this.colour=colour;}
    public String getColour(){return colour;}

}
