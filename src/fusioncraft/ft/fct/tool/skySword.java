package ft.fct.tool;
/**
 * @author Maximilian Bloom
 */
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class skySword extends ItemSword{


	public skySword(ToolMaterial par1ToolMaterial) {
		super(par1ToolMaterial);
	}


	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("FusionCraft:SkySword");
	}

	@Override
	public EnumRarity getRarity(ItemStack par1itemStack){
		return EnumRarity.rare;
	}

	//If it can be repaired
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return super.getIsRepairable(par1ItemStack, par2ItemStack) == true;
	}
}
