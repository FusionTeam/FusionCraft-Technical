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

public class cloudOre extends Block{

	public cloudOre(Material par1Material) {
		super(par1Material);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon("fusioncraft:CloudOre");
	}

	public Item idDropped(int par1, Random par2Random,int par3){
		return FusionCraft.CloudGem;
	}
	@Override
	public int quantityDropped(Random par1Random){
		return 1;
	}

}
