package edu.utsa.cs3443.demo;

/*
 * This is a "model" class. It's just a simple container
 * to hold the data for one of your items.
 */
public class InfoItem {
    private String title;
    private String paragraph;
    private String imageUrl; // We'll use a URL or a file path for the image

    public InfoItem(String title, String paragraph, String imageUrl) {
        this.title = title;
        this.paragraph = paragraph;
        this.imageUrl = imageUrl;
    }

    // "Getters" so our controller can read this data
    public String getTitle() {
        return title;
    }

    public String getParagraph() {
        return paragraph;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
