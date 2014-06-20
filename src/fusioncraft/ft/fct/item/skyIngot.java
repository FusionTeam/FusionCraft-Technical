package ft.fct.item;
/**
 * @author Maximilian Bloom
 */
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class skyIngot extends Item{

	public skyIngot(){}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("FusionCraft:SkyIngot");
	}

}
