package org.jastec.challengemessage;

public class Message {

    private String text;
    private String recipeint;
    private int id;


    public Message(String text, String recipeint, int id) {
        this.text = text;
        this.recipeint = recipeint;
        this.id = id;
    }

    public void getDetails(){
        System.out.println("Contact Name: " + recipeint +
        "\nMessage: " + text + "" +
                "\nId: " + id);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRecipeint() {
        return recipeint;
    }

    public void setRecipeint(String recipeint) {
        this.recipeint = recipeint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
