package ft.fct.item;
/**
 * @author Maximilian Bloom
 */
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class skyRod extends Item{

	public skyRod() {}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("FusionCraft:SkyRod");
	}

}
