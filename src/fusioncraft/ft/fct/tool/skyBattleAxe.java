package ft.fct.tool;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class skyBattleAxe extends ItemSword
{
	public skyBattleAxe(ToolMaterial par1ToolMaterial) {
		super(par1ToolMaterial);
	}

	//texture
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("FusionCraft:SkyBattleAxe");
	}



	//If it can be repaired
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return super.getIsRepairable(par1ItemStack, par2ItemStack) == true;
	}
}