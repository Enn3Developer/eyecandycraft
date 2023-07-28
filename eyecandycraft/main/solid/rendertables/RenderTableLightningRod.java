package eyecandycraft.main.solid.rendertables;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

import eyecandycraft.main.solid.models.ModelLightningRod;

public class RenderTableLightningRod extends TileEntitySpecialRenderer {
    private final ModelLightningRod LightningRod;

    public RenderTableLightningRod() {
        LightningRod = new ModelLightningRod();
    }

    public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float scale) {
        GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        bindTextureByName("/eyecandycraft/textures/LightningRod.png");
        LightningRod.render(null, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }
}