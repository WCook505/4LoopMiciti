package edu.utsa.cs3443.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;

public class ItemViewController {

    @FXML
    private ImageView itemImage;

    @FXML
    private Label itemTitle;

    @FXML
    private Label itemParagraph;

    @FXML
    private Button itemButton;

    // We'll keep a reference to the item's data
    private InfoItem item;

    // This is the new, most important method!
    // It lets the MainScreenController pass data into this item.
    public void setData(InfoItem item) {
        this.item = item;

        // Set the data from the InfoItem object
        itemTitle.setText(item.getTitle());
        itemParagraph.setText(item.getParagraph());

        // Try to load the image
        try {
            // We'll use a placeholder if the image URL is "default"
            String url = item.getImageUrl().equals("default")
                    ? "https://placehold.co/200x150/e0e0e0/777?text=Image"
                    : item.getImageUrl();

            itemImage.setImage(new Image(url));
        } catch (Exception e) {
            System.out.println("Couldn't load image: " + e.getMessage());
            // Set a fallback placeholder if the URL is bad
            itemImage.setImage(new Image("https://placehold.co/200x150/e0e0e0/777?text=Image+Error"));
        }
    }


    @FXML
    private void handleButtonAction(ActionEvent event) {
        // Now the button can use the item's data
        System.out.println("Button clicked for: " + item.getTitle());
        itemParagraph.setText("You clicked the button for " + item.getTitle() + "!");
    }

    // The initialize() method is no longer needed here,
    // because setData() does all the work.
}