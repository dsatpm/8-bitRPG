package main;

import object.OBJ_CHEST_CLOSED;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        gp.obj[0] = new OBJ_CHEST_CLOSED();
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;

        gp.obj[1] = new OBJ_CHEST_CLOSED();
        gp.obj[1].worldX = 37 * gp.tileSize;
        gp.obj[1].worldY = 22 * gp.tileSize;
    }
}
