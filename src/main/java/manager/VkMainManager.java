package manager;

public class VkMainManager {
    private BlockManager[] managers;

    public String generatePost() {
        for (BlockManager manager : managers) {
            String block = manager.generateBlock();

        }
        return null;
    }
}




