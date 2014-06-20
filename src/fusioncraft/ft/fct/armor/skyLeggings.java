package ft.fct.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
/**
 * @author Maximilian Bloom
 */
public class skyLeggings extends ItemArmor{

	public skyLeggings(ArmorMaterial par1ArmorMaterial,
			int par2, int par3) {
		super(par1ArmorMaterial, par2, par3);
	}
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("FusionCraft:SkyLeggings");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		return "FusionCraft:textures/models/armor/Sky_layer_2.png";
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

