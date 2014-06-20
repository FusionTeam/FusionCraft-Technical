package ft.fct.item;
/**
 * @author Maximilian Bloom
 */
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class leadIngot extends Item{

	public leadIngot() {}
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("FusionCraft:LeadIngot");
	}
}
