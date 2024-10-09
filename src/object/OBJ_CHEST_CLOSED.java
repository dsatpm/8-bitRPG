package object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_CHEST_CLOSED extends SuperObject {

    public OBJ_CHEST_CLOSED() {

        name = "chest_closed";

        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/chest-closed.png")));

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
