package ft.fct.block;
/**
 * @author Maximilian Bloom
 */
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class skyBlock extends Block{

	public skyBlock(Material par1Material) {
		super(par1Material);
	}
	
	//supercalifragilisticexpialdidocious
	
	@Override
	public void registerBlockIcons(IIconRegister registerIcon) {
		blockIcon = registerIcon.registerIcon("fusioncraft:SkyBlock");
	}
	
	
	
}
