package edu.utsa.cs3443.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainScreenController {

    @FXML
    private VBox itemContainer;

    // This method runs automatically when the FXML is loaded
    @FXML
    public void initialize() {
        // Load the Transportation data by default
        loadCategoryData(getTransportationData());
    }

    // --- Button Click Handlers ---

    @FXML
    void handleTransportationButton(ActionEvent event) {
        System.out.println("Loading Transportation...");
        loadCategoryData(getTransportationData());
    }

    @FXML
    void handleFoodButton(ActionEvent event) {
        System.out.println("Loading Food...");
        loadCategoryData(getFoodData());
    }

    @FXML
    void handleSpotsButton(ActionEvent event) {
        System.out.println("Loading Spots...");
        loadCategoryData(getSpotsData());
    }

    // *** NEW BUTTON HANDLER FOR LODGING ***
    @FXML
    void handleLodgingButton(ActionEvent event) {
        System.out.println("Loading Lodging...");
        loadCategoryData(getLodgingData());
    }


    // --- Helper Method to Load Data ---

    /**
     * Clears the list and loads all items from the provided list.
     * @param items The list of InfoItem objects to display.
     */
    private void loadCategoryData(List<InfoItem> items) {
        // 1. Clear the old items from the list
        itemContainer.getChildren().clear();

        // 2. Loop through the new list of data
        for (InfoItem item : items) {
            try {
                // 3. Load the FXML template for each item
                FXMLLoader loader = new FXMLLoader(getClass().getResource("ItemView.fxml"));
                Pane itemPane = loader.load();

                // 4. Get the controller for that template
                ItemViewController controller = loader.getController();

                // 5. Pass the data to the controller
                controller.setData(item);

                // 6. Add the finished item to our VBox
                itemContainer.getChildren().add(itemPane);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    // --- Data "Models" ---
    // All data lists are now updated to match your Figma design

    private List<InfoItem> getTransportationData() {
        List<InfoItem> items = new ArrayList<>();

        items.add(new InfoItem(
                "VIA Metropolitan Transit",
                "San Antonio has a bus system in place that can take you across the city for just a couple of bucks. To Those who attend UTSA the VIA Bus service is free to students to help those who may have classes downtown.",
                "https://placehold.co/200x150/FF6347/FFFFFF?text=VIA+Bus"
        ));
        items.add(new InfoItem(
                "Roadrunner",
                "For those who are attending UTSA and are staying by a nearby apartment. The runner is a bus that go through several routes near the university and stop by apartments every 15 minutes from sunrise to sunset check out which route and what times are available to you.",
                "https://placehold.co/200x150/4682B4/FFFFFF?text=Roadrunner"
        ));
        items.add(new InfoItem(
                "E-Scooters",
                "Downtown there is much to see but also a lot of walking for those who are not the biggest fans of walking or maybe have been doing it too long you may want to try an e-scooter. While it does charge your card based on the distance you are traveling it does get you to your destination faster than your own 2 feet.",
                "https://placehold.co/200x150/32CD32/FFFFFF?text=Scooter"
        ));
        items.add(new InfoItem(
                "Ride Share",
                "One thing about San Antonio is that it is very vast and thus not very walkable (except downtown) so If none of the accommodations are to your liking above or you just cant wait for a bus, San Antonio much like other cities also has ride-share programs such as uber and lyft in place to help you get from a to b. ",
                "httpss://placehold.co/200x150/20B2AA/FFFFFF?text=Bird"
        ));

        return items;
    }

    private List<InfoItem> getFoodData() {
        List<InfoItem> items = new ArrayList<>();

        items.add(new InfoItem(
                "HEB",
                "Texas is proud of many things but the one above all is heb.  HEB is Texas grocery store founded in San Antonio and is the place for fresh produce and products located throughout the city branching about 5-10 minutes apart.",
                "https://placehold.co/200x150/E6002B/FFFFFF?text=HEB"
        ));
        items.add(new InfoItem(
                "Chester's Hamburgers",
                "Chester’s is a long-standing San Antonio burger spot known for its classic, made-to-order hamburgers and nostalgic diner feel. Founded in 1984, it’s become a local favorite for its fresh (never frozen) beef patties, house-baked buns, and hand-cut fries made daily.\n" +
                        "\n" +
                        "The menu focuses on quality and simplicity. Burgers, fries, wings, milkshakes, and a large beer selection are all served in a laid-back, retro atmosphere. Locals often describe Chester’s as one of the best burger joints in San Antonio, valued for its consistency and old-school charm.",
                "https://placehold.co/200x150/FFD700/000000?text=Burgers"
        ));
        items.add(new InfoItem(
                "Bill Miller BBQ",
                "Bill Miller Bar-B-Q (often just called Bill Miller’s) is a beloved Texas fast-food chain that specializes in barbecue and Southern-style comfort food. It’s a local favorite in San Antonio and across South Texas — kind of a hometown classic where people grab breakfast tacos, sweet tea, or a plate of smoked brisket and ribs.",
                "https://placehold.co/200x150/8B4513/FFFFFF?text=BBQ"
        ));
        items.add(new InfoItem(
                "Mama Margie's",
                "Mama Margie’s is a local Tex-Mex restaurant chain known for its 24-hour service, freshly made tortillas, and casual, family-friendly atmosphere. With several locations around San Antonio and nearby cities, it’s a popular spot for quick and affordable Mexican food any time of day.",
                "https://placehold.co/200x150/006400/FFFFFF?text=Italian"
        ));

        return items;
    }

    private List<InfoItem> getSpotsData() {
        List<InfoItem> items = new ArrayList<>();

        items.add(new InfoItem(
                "The San Antonio Japanese Tea Garden",
                "Originally a rock quarry, this stunning garden was transformed in the early 20th century into a tranquil, multi-level oasis. It features lush floral displays, stone archways, a picturesque waterfall, and winding stone paths that navigate you through a landscape of ponds filled with vibrant koi.",
                "https://placehold.co/200x150/228B22/FFFFFF?text=Tea+Garden"
        ));
        items.add(new InfoItem(
                "Six Flags Fiesta Texas",
                "A thrilling theme park set in a former rock quarry, offering dozens of roller coasters, water rides, and live shows with a unique Texan and Southwestern theme.",
                "https://placehold.co/200x150/FF4500/FFFFFF?text=Fiesta+Texas"
        ));
        items.add(new InfoItem(
                "The St. Mary's Strip",
                "his is the city's quintessential nightlife strip, known for its high energy and younger, local crowd. It's the go-to spot for live music and a more traditional \"going out\" experience.\n" +
                        "Vibe: Lively, loud, and eclectic with a collegiate and alternative feel.\n" +
                        "What you'll find: Live music venues, dive bars, dance clubs, and casual neighborhood hangouts.\n" +
                        "Notable Spots:\n" +
                        "The Lonesome Rose: Billed as the oldest honky-tonk on the St. Mary's Strip, it's a fantastic spot for live country music and a classic Texas experience.\n" +
                        "Brass Monkey: A popular, no-frills club known for its themed dance nights (especially 90s nights).\n" +
                        "Paper Tiger: A premier mid-sized venue for seeing live bands, from local acts to touring national artists.",
                "https://placehold.co/200x150/8A2BE2/FFFFFF?text=The+Strip"
        ));
        items.add(new InfoItem(
                "The San Antonio River Walk (Paseo del Rio)",
                "This world-famous urban waterway is the heart of the city. It's a vibrant network of walkways along the banks of the San Antonio River, lined with restaurants, shops, hotels, and bars, one level below the downtown streets. You can explore it on foot or take a narrated river cruise. ",
                "https://placehold.co/200x150/00BFFF/FFFFFF?text=River+Walk"
        ));

        return items;
    }

    // *** NEW DATA METHOD FOR LODGING ***
    private List<InfoItem> getLodgingData() {
        List<InfoItem> items = new ArrayList<>();

        items.add(new InfoItem(
                "UTSA",
                "With daily rates between $38.10 and $40.34, a full summer stay would cost approximately $3,429 to $3,630. This is a highly competitive price for a furnished, all-inclusive living space.\n" +
                        "All-inclusive pricing: Utilities, internet, and furniture are typically included.\n" +
                        "Safety: Campuses have their own police departments and secure entry to residence halls.\n" +
                        "Community: You'll be living among other students and interns.",
                "https://placehold.co/200x150/0C233S/FFFFFF?text=UTSA"
        ));
        items.add(new InfoItem(
                "Texas A&M San Antonio",
                "Their nightly rates range from $40 to $60, putting a 90-day stay between $3,600 and $5,400. The lower end of this range is also a very affordable option.\n" +
                        "All-inclusive pricing: Utilities, internet, and furniture are typically included.\n" +
                        "Safety: Campuses have their own police departments and secure entry to residence halls.\n" +
                        "Community: You'll be living among other students and interns.",
                "https://placehold.co/200x150/500000/FFFFFF?text=TAMU-SA"
        ));
        items.add(new InfoItem(
                "Hotels",
                "For those who prioritize convenience and don't want to worry about furnishings or utilities, an extended-stay hotel is a solid choice. While generally more expensive, they can be competitive, especially if you find a good weekly or monthly rate.\n" +
                        "Estimated Cost: Budget-friendly options like Extended Stay America or WoodSpring Suites can range from $1,200 to $2,000 per month ($3,600 to $6,000 for the summer).\n" +
                        "Where to Look: Check hotel websites directly for long-term stay discounts or use booking sites to compare options.\n" +
                        "Why it's a great option:\n" +
                        "No Hassle: Fully furnished with kitchenettes, and utilities are included.\n" +
                        "Privacy: You get your own private space without roommates.",
                "https://placehold.co/200x150/1E90FF/FFFFFF?text=Hotels"
        ));
        items.add(new InfoItem(
                "Sublet",
                "San Antonio is a major college city, and many students leave for the summer, creating a large market for sublets. You can often find a room in a fully furnished apartment for a fraction of the regular price.\n" +
                        "Estimated Cost: You can find summer sublets ranging from $500 to $800 per month ($1,500 to $2,400 for the summer), especially in areas around UTSA.\n" +
                        "Where to Look: Websites like Facebook Marketplace, Craigslist, and dedicated university housing groups are popular platforms for finding sublets.",
                "https://placehold.co/200x150/1E90FF/FFFFFF?text=Hotels"
        ));

        return items;
    }

}