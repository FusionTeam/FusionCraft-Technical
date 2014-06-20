package ft.fct.block;
/**
 * @author Maximilian Bloom
 */
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class leadOre extends Block{

	public leadOre(Material par1Material) {
		super(par1Material);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon("fusioncraft:LeadOre");
	}

}
