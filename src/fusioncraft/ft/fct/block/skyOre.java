package ft.fct.block;
/**
 * @author Maximilian Bloom
 */
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import ft.fct.common.FusionCraft;


public class skyOre extends Block{

	public skyOre(Material par1Material) {
		super(par1Material);
	}
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon("fusioncraft:skyOre");
	}
	public Item idDropped(int par1, Random par2Random,int par3){
		return FusionCraft.SkyDust;
	}
	@Override
	public int quantityDropped(Random par1Random){
		return 4;
	}

}
