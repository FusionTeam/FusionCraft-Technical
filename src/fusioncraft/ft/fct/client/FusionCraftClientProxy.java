package ft.fct.client;
/**
 * @author Maximilian Bloom
 */
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import ft.fct.common.BowRenderer;
import ft.fct.common.FusionCraft;
import ft.fct.common.FusionCraftCommonProxy;
import ft.fct.render.ItemRenderForge;
import ft.fct.render.forgeTileEntity;
import ft.fct.tileentity.forgeTileEntityRenderer;

public class FusionCraftClientProxy implements FusionCraftCommonProxy{

	//bowrenderer
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.registerItemRenderer(FusionCraft.SkyBow, new BowRenderer());
	}

	//modelrenderer
	@Override
	public void registerRenderForge(){
		TileEntitySpecialRenderer render = new forgeTileEntityRenderer();
		ClientRegistry.bindTileEntitySpecialRenderer(forgeTileEntity.class, new forgeTileEntityRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(FusionCraft.forge), new ItemRenderForge(render, new forgeTileEntity()));
	}

	@Override
	public void registerTileEntitySpecialRenderer() {
		
	}

	//Capes DOES NOT WORK try again later

	/**
	 * Adds a cape for just a single player
	 * @param username: The username of the player.
	 * @param url: The url of the cape image.
	 */
	/*
	public void addCape(String username, String url){
	 LogWrapper.log(Level.INFO, "addCape worked!");
	  ThreadDownloadImageData object = new ThreadDownloadImageData(url, null, null);
	  LogWrapper.log(Level.INFO, "Downloading cape worked!");
	  Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) object);
	  LogWrapper.log(Level.INFO, "Render function worked!");
	}
	 */
	/**
	 * Adds cape for a group of players from an array.
	 * @param group: Array of users to give the cape to.
	 * @param url: The url of the cape image.
	 */
	/*
	public void addGroupedCape(String[] group, String url)
	{
	  for (String username : group)
	  {
	   addCape(username, url);
	  }
	}

	public void addModderCapes() {

		String devcapeURL = "http://i.imgur.com/kjBPAbd.png";
		String[] devs = {"BlockeyCreeper", "legominernoah"};


		//addGroupedCape(devs, devcapeURL);
		//addCape("BlockeyCreeper", devcapeURL);

		String contribcapeURL = "http://i.imgur.com/Q8UbCuY.png";
		String[] contrib = {"Cloudface_MC", "hearthus", "ablazenicky"};


		//addGroupedCape(contrib, contribcapeURL);

		String betatestcapeURL = "http://i.imgur.com/lt9HCFX.png";
		String[] betatest = {"sniffbot"};


		//addGroupedCape(betatest, betatestcapeURL);

		ThreadDownloadImageData devcapeimage = new ThreadDownloadImageData(devcapeURL, null, null);
		for (String username : devs) {
		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) devcapeimage);
		}

		ThreadDownloadImageData contribcapeimage = new ThreadDownloadImageData(contribcapeURL, null, null);
		for (String username : contrib) {
		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) contribcapeimage);
		}

		ThreadDownloadImageData betatestcapeimage = new ThreadDownloadImageData(betatestcapeURL, null, null);
		for (String username : betatest) {
		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) betatestcapeimage);
		}

	}
	 */
}

