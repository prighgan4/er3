package manager;

public class VkMainManager {
    private BlockManager[] managers;

    public String generateRecord() {
        for (BlockManager manager : managers) {
            String block = manager.generateBlock();
        }
        return null;
    }
}




