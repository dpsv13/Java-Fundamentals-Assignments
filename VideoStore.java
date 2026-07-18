public class VideoStore {

    private Video[] store = new Video[10];
    private int count = 0;

    public void addVideo(String name) {
        if (count < store.length) {
            store[count] = new Video(name);
            count++;
            System.out.println("Video added successfully.");
        } else {
            System.out.println("Store is full.");
        }
    }

    public void doCheckout(String name) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {

                if (!store[i].getCheckout()) {
                    store[i].doCheckout();
                    System.out.println("Video checked out successfully.");
                } else {
                    System.out.println("Video is already checked out.");
                }
                return;
            }
        }

        System.out.println("Video not found.");
    }

    public void doReturn(String name) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doReturn();
                System.out.println("Video returned successfully.");
                return;
            }
        }

        System.out.println("Video not found.");
    }

    public void receiveRating(String name, int rating) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].receiveRating(rating);
                System.out.println("Rating updated.");
                return;
            }
        }

        System.out.println("Video not found.");
    }

    public void listInventory() {

        System.out.println("----------------------------------------------");
        System.out.printf("%-20s %-10s %-10s%n",
                "Video Name", "Rating", "Status");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < count; i++) {

            String status = store[i].getCheckout()
                    ? "Checked Out"
                    : "Available";

            System.out.printf("%-20s %-10d %-10s%n",
                    store[i].getName(),
                    store[i].getRating(),
                    status);
        }

        System.out.println("----------------------------------------------");
    }
}