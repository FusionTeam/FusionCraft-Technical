package ft.fct.item;
/**
 * @author Maximilian Bloom
 */
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class skyDust extends Item{

	public skyDust() {}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("FusionCraft:SkyDust");
	}

}
