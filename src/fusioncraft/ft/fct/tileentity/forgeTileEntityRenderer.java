package ft.fct.tileentity;
/**
 * @author Maximilian Bloom
 */
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import ft.fct.render.ModelForge;

public class forgeTileEntityRenderer extends TileEntitySpecialRenderer{

	private static final ResourceLocation forge = new ResourceLocation("fusioncraft:textures/models/forge.png");
	private ModelForge model = new ModelForge();
	
	//public void renderForge(){
	//	this.model = new ModelForge();
	//}
	
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
			GL11.glTranslatef((float)x+0.5F,(float) y+1.5F,(float) z+0.5F);
			GL11.glRotatef(180, 0F, 0F, 1F);
			
			this.bindTexture(forge);
			
			GL11.glPushMatrix();
				this.model.renderModel(0.0625F);
			GL11.glPopMatrix();
			
		GL11.glPopMatrix();
	}
	
	

}