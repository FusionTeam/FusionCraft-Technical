package ft.fct.block;
/**
 * @author Maximilian Bloom
 */
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class leadBlock extends Block{

	public leadBlock(Material par1Material) {
		super(par1Material);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon("fusioncraft:LeadBlock");
	}

}
