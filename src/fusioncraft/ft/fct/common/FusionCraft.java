 package ft.fct.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import ft.fct.armor.skyBoots;
import ft.fct.armor.skyChestplate;
import ft.fct.armor.skyHelmet;
import ft.fct.armor.skyLeggings;
import ft.fct.block.cloudOre;
import ft.fct.block.forge;
import ft.fct.block.leadBlock;
import ft.fct.block.leadOre;
import ft.fct.block.skyBlock;
//import ft.fct.block.skyChest;
import ft.fct.block.skyOre;
import ft.fct.block.workedSkyBlock;
import ft.fct.item.cloudGem;
import ft.fct.item.hammer;
import ft.fct.item.leadIngot;
import ft.fct.item.pileSkyDust;
import ft.fct.item.skyDust;
import ft.fct.item.skyIngot;
import ft.fct.item.skyRod;
import ft.fct.item.workedSkyIngot;
import ft.fct.render.forgeTileEntity;
//import ft.fct.tileentity.skyChestTileEntity;
import ft.fct.tool.skyAxe;
import ft.fct.tool.skyBattleAxe;
import ft.fct.tool.skyBow;
import ft.fct.tool.skyPick;
import ft.fct.tool.skySpade;
import ft.fct.tool.skySword;
import ft.fct.worldGeneration.CloudOreWorldGeneration;
import ft.fct.worldGeneration.LeadOreWorldGeneration;
import ft.fct.worldGeneration.SkyOreWorldGeneration;

/**
 * @author Maximilian Bloom
 */

@Mod(modid = "fusioncraft", name = "FusionCraft Technical", version = "0.1.22")
public class FusionCraft{
	@Instance("fusionCraft")
	//public static skyChest instance;

	@SidedProxy(clientSide="ft.fct.client.FusionCraftClientProxy", serverSide="ft.fct.common.FusionCraftCommonProxy")
	public static FusionCraftCommonProxy proxy;

	/*@EventHandler 
	public void modsLoaded(FMLPostInitializationEvent event) {
		Object ob;
	     if (Loader.isModLoaded("FusionCraftArcane")) {
	            try {
	                       //do stuff

	                LogWrapper.log(Level.INFO, "FusionCraft Arcane is installed, adding integration", ob);

	            }catch (Exception e) {
	            	LogWrapper.log(Level.INFO, "FusionCraft Arcane is not installed", ob);
	            }
	      }
	}*/

	@EventHandler
	public void preInit(FMLInitializationEvent event){
		//registry
		GameRegistry.registerBlock(SkyOre, "skyOre");
		GameRegistry.registerBlock(LeadOre, "leadOre");
		GameRegistry.registerBlock(CloudOre, "cloudOre");
		GameRegistry.registerBlock(SkyBlock, "skyBlock");
		GameRegistry.registerBlock(WorkedSkyBlock, "workedSkyBlock");
		//GameRegistry.registerBlock(SkyChest, ItemBlock.class, "skyChest");
		GameRegistry.registerBlock(LeadBlock, "leadBlock");
		GameRegistry.registerBlock(forge, "forge");

		GameRegistry.registerItem(CloudGem, "CloudGem");
		GameRegistry.registerItem(LeadIngot, "LeadIngot");
		GameRegistry.registerItem(Hammer, "Hammer");
		GameRegistry.registerItem(WorkedSkyIngot, "WorkedSkyIngot");
		GameRegistry.registerItem(SkyBow, "SkyBow");
		GameRegistry.registerItem(SkyBoots, "SkyBoots");
		GameRegistry.registerItem(SkyLeggings, "SkyLeggings");
		GameRegistry.registerItem(SkyChestplate, "SkyChestplate");
		GameRegistry.registerItem(SkyHelmet, "SkyHelmet");
		GameRegistry.registerItem(PileSkyDust, "PileofSkyDust");
		GameRegistry.registerItem(SkyDust, "SkyDust");
		GameRegistry.registerItem(SkyRod, "SkyRod");
		GameRegistry.registerItem(SkyIngot, "SkyIngot");
		GameRegistry.registerItem(SkyBattleAxe, "SkyBattleAxe");
		GameRegistry.registerItem(SkySword, "SkySword");
		GameRegistry.registerItem(SkySpade, "SkySpade");

		GameRegistry.registerWorldGenerator(SkyGen, 0);
		GameRegistry.registerWorldGenerator(LeadGen, 0);
		GameRegistry.registerWorldGenerator(CloudGen, 0);

		//GameRegistry.registerTileEntity(skyChestTileEntity.class, "skyChestTileEntity");
		GameRegistry.registerTileEntity(forgeTileEntity.class, "forgeTileEntity");

		//names
		LanguageRegistry.addName(CloudGem, "Cloud Gem");
		LanguageRegistry.addName(CloudOre, "Cloud Ore");
		LanguageRegistry.addName(LeadOre, "Lead Ore");
		LanguageRegistry.addName(SkyBow, "Sky Bow");
		LanguageRegistry.addName(SkyHelmet, "Sky Helmet");
		LanguageRegistry.addName(SkyChestplate, "Sky Chestplate");
		LanguageRegistry.addName(SkyLeggings, "Sky Leggings");
		LanguageRegistry.addName(SkyBoots, "Sky Boots");
		LanguageRegistry.addName(SkyDust, "Sky Dust");
		LanguageRegistry.addName(SkyOre, "Sky Ore");
		LanguageRegistry.addName(SkyRod, "Sky Rod");
		LanguageRegistry.addName(SkyIngot, "Sky Ingot");
		LanguageRegistry.addName(SkySpade, "Sky Shovel");
		LanguageRegistry.addName(SkyPick, "Sky Pickaxe");
		LanguageRegistry.addName(SkyAxe, "Sky Axe");
		LanguageRegistry.addName(SkySword, "Sky Sword");
		LanguageRegistry.addName(SkyBattleAxe, "Sky Battle Axe");
		LanguageRegistry.addName(SkyBlock,"Sky Block");
		LanguageRegistry.addName(PileSkyDust,"Pile of Sky Dust");
		LanguageRegistry.addName(WorkedSkyIngot, "Worked Sky Ingot");
		LanguageRegistry.addName(WorkedSkyBlock, "Worked Sky Block");
		LanguageRegistry.addName(Hammer, "Hammer");
		LanguageRegistry.addName(LeadIngot, "Lead Ingot");
		LanguageRegistry.addName(LeadBlock, "Lead Block");
		LanguageRegistry.addName(forge, "Forge");
		//LanguageRegistry.addName(SkyChest, "Sky Chest");

		//recipes
		GameRegistry.addShapelessRecipe(new ItemStack(SkyIngot, 9), new ItemStack(SkyBlock));
		GameRegistry.addRecipe(new ItemStack(Hammer, 1), new Object[]{
			"XXX"," *X"," * ",'X', Items.iron_ingot, '*', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(Hammer, 1), new Object[]{
			"XXX","X* "," * ",'X', Items.iron_ingot, '*', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(SkyBow, 1), new Object[]{
			" X*","C *"," X*",'X', SkyRod, '*', Items.string,'C', CloudGem
		});
		GameRegistry.addRecipe(new ItemStack(PileSkyDust, 1), new Object[]{
			"   ","XXX","   ",'X', SkyDust
		});
		GameRegistry.addRecipe(new ItemStack(PileSkyDust, 1), new Object[]{
			"XXX","   ","   ",'X', SkyDust
		});
		GameRegistry.addRecipe(new ItemStack(PileSkyDust, 1), new Object[]{
			"   ","   ","XXX",'X', SkyDust
		});
		GameRegistry.addRecipe(new ItemStack(SkyBlock, 1), new Object[]{
			"XXX","XXX","XXX",'X', SkyIngot
		});

		GameRegistry.addSmelting(FusionCraft.LeadOre, new ItemStack(FusionCraft.LeadIngot,1,0), 5);
		GameRegistry.addSmelting(FusionCraft.SkyBlock, new ItemStack(FusionCraft.WorkedSkyBlock,1,0), 5);
		GameRegistry.addSmelting(FusionCraft.SkyIngot, new ItemStack(FusionCraft.WorkedSkyIngot,1,0), 5);
		GameRegistry.addSmelting(FusionCraft.PileSkyDust, new ItemStack(FusionCraft.SkyIngot,1,0), 5);
		GameRegistry.addRecipe(new ItemStack(SkyRod, 4), new Object[]{
			"X*X","X*X","   ",'X', SkyIngot , '*', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SkySword, 1), new Object[]{
			" X "," C "," * ",'X', SkyIngot , '*', SkyRod,'C',CloudGem
		});
		GameRegistry.addRecipe(new ItemStack(SkySpade, 1), new Object[]{
			" C "," X "," * ",'X', SkyIngot, '*', SkyRod,'C',CloudGem
		});
		GameRegistry.addRecipe(new ItemStack(SkyPick, 1), new Object[]{
			"XCX"," * "," * ",'X', SkyIngot, '*', SkyRod,'C',CloudGem
		});
		GameRegistry.addRecipe(new ItemStack(SkyAxe, 1), new Object[]{
			"CX ","X* "," * ",'X', SkyIngot, '*', SkyRod,'C',CloudGem
		});
		GameRegistry.addRecipe(new ItemStack(SkyBattleAxe, 1), new Object[]{
			"CXC","X*X"," * ",'X', SkyIngot, '*', SkyRod,'C',CloudGem
		});
		GameRegistry.addRecipe(new ItemStack(SkyRod, 4), new Object[]{
			"   ","X*X","X*X",'X', SkyIngot , '*', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(LeadBlock, 1), new Object[]{
			"XXX","XXX","XXX",'X', LeadIngot
		});
		GameRegistry.addRecipe(new ItemStack(forge, 1), new Object[]{
			"XZX","YYY","XYX", 'X', LeadIngot, 'Y', Items.iron_ingot, 'Z', Hammer
		});
		/*GameRegistry.addRecipe(new ItemStack(SkyChest, 1), new Object[]{
			"XWX","W W","XWX",'X', SkyIngot, 'W', Blocks.planks
		})*/

		//Armor
		GameRegistry.addRecipe(new ItemStack(SkyHelmet, 1), new Object[]{
			"XCX","X X","   ",'X', SkyIngot,'C',CloudGem
		});
		GameRegistry.addRecipe(new ItemStack(SkyHelmet, 1), new Object[]{
			"   ","XCX","X X",'X', SkyIngot,'C',CloudGem
		});
		GameRegistry.addRecipe(new ItemStack(SkyChestplate, 1), new Object[]{
			"X X","XCX","XCX",'X', SkyIngot,'C',CloudGem
		});
		GameRegistry.addRecipe(new ItemStack(SkyLeggings, 1), new Object[]{
			"XXX","C C","X X",'X', SkyIngot,'C',CloudGem
		});
		GameRegistry.addRecipe(new ItemStack(SkyBoots, 1), new Object[]{
			"   ","X X","C C",'X', SkyIngot,'C',CloudGem
		});
		GameRegistry.addRecipe(new ItemStack(SkyBoots, 1), new Object[]{
			"X X","C C","   ",'X', SkyIngot,'C',CloudGem
		});
		
		//renderers
		proxy.registerRenderForge();
		
	}

	@EventHandler
	public void load(FMLInitializationEvent event){

	}

	@EventHandler
	public void InitBowRendering(FMLInitializationEvent event){
		//The main initialization method
		proxy.registerRenderers();
	}

	//Blocks
	public static Block SkyOre;
	public static Block SkyBlock;
	public static Block WorkedSkyBlock;
	public static Block LeadOre;
	public static Block CloudOre;
	public static Block SkyChest;
	public static Block LeadBlock;
	public static Block forge;
	//Items
	public static Item CloudGem;
	public static Item LeadIngot;
	public static Item Hammer;
	public static Item PileSkyDust;
	public static Item SkyHelmet;
	public static Item SkyChestplate;
	public static Item SkyLeggings;
	public static Item SkyBoots;
	public static Item SkyBow;
	public static Item WorkedSkyIngot;
	public static Item SkyDust;
	public static Item SkySpade;
	public static Item SkyPick;
	public static Item SkyAxe;
	public static Item SkySword;
	public static Item SkyBattleAxe;
	public static Item SkyIngot;
	public static Item SkyRod;

	//materials
	public static ToolMaterial toolSky = EnumHelper.addToolMaterial("SKY", 3, 2048, 10.5F, 3, 17);
	public static ArmorMaterial armorSky = EnumHelper.addArmorMaterial("SKY", 2048, new int []{3, 8, 6, 2}, 17);
	//public static EnumToolMaterial toolExample = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);
	//public static EnumArmorMaterial armorExample = EnumHelper.addArmorMaterial(name, durability, reductionAmounts, enchantability

	//generation
	public static CloudOreWorldGeneration CloudGen = new CloudOreWorldGeneration();
	public static LeadOreWorldGeneration LeadGen = new LeadOreWorldGeneration();
	public static SkyOreWorldGeneration SkyGen = new SkyOreWorldGeneration();

	public FusionCraft() {

		SkySpade = new skySpade(toolSky).setUnlocalizedName("skySpade").setCreativeTab(CreativeTabs.tabTools);
		SkyPick = new skyPick(toolSky).setUnlocalizedName("skyPick").setCreativeTab(CreativeTabs.tabTools);
		SkyAxe = new skyAxe(toolSky).setUnlocalizedName("skyAxe").setCreativeTab(CreativeTabs.tabTools);
		SkySword = new skySword(toolSky).setUnlocalizedName("skySword");
		SkyBattleAxe = new skyBattleAxe(toolSky).setUnlocalizedName("skyBattleAxe").setCreativeTab(CreativeTabs.tabCombat);
		SkyIngot = new skyIngot().setUnlocalizedName("skyIngot").setCreativeTab(CreativeTabs.tabMaterials);
		SkyRod = new skyRod().setUnlocalizedName("skyRod").setCreativeTab(CreativeTabs.tabMaterials);
		SkyOre = new skyOre(Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("skyOre").setCreativeTab(CreativeTabs.tabBlock);
		SkyDust = new skyDust().setUnlocalizedName("skyDust").setCreativeTab(CreativeTabs.tabMaterials);
		SkyBlock = new skyBlock(Material.iron).setBlockName("skyBlock").setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(CreativeTabs.tabBlock);
		PileSkyDust = new pileSkyDust().setUnlocalizedName("pileSkyDust").setCreativeTab(CreativeTabs.tabMaterials);
		SkyHelmet = new skyHelmet(armorSky, RenderingRegistry.addNewArmourRendererPrefix("Sky"), 0).setUnlocalizedName("skyHelmet").setCreativeTab(CreativeTabs.tabCombat);
		SkyChestplate = new skyChestplate(armorSky, RenderingRegistry.addNewArmourRendererPrefix("Sky"), 1).setUnlocalizedName("skyChestplate").setCreativeTab(CreativeTabs.tabCombat);
		SkyLeggings = new skyLeggings(armorSky, RenderingRegistry.addNewArmourRendererPrefix("Sky"), 2).setUnlocalizedName("skyLeggings").setCreativeTab(CreativeTabs.tabCombat);
		SkyBoots = new skyBoots(armorSky, RenderingRegistry.addNewArmourRendererPrefix("Sky"), 3).setUnlocalizedName("skyBoots").setCreativeTab(CreativeTabs.tabCombat);
		SkyBow = new skyBow().setUnlocalizedName("skyBow").setCreativeTab(CreativeTabs.tabCombat);
		WorkedSkyIngot = new workedSkyIngot().setUnlocalizedName("workedSkyIngot").setCreativeTab(CreativeTabs.tabMaterials);
		WorkedSkyBlock = new workedSkyBlock(Material.iron).setBlockName("workedSkyBlock").setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(CreativeTabs.tabBlock);
		Hammer = new hammer().setUnlocalizedName("hammer").setCreativeTab(CreativeTabs.tabTools);
		LeadOre = new leadOre(Material.rock).setBlockName("leadOre").setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(CreativeTabs.tabBlock);
		LeadIngot = new leadIngot().setUnlocalizedName("leadIngot").setCreativeTab(CreativeTabs.tabMaterials);
		CloudOre = new cloudOre(Material.rock).setBlockName("cloudOre").setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setCreativeTab(CreativeTabs.tabBlock);
		CloudGem = new cloudGem().setUnlocalizedName("cloudGem").setCreativeTab(CreativeTabs.tabMaterials);
		//SkyChest = new skyChest(Material.wood).setBlockName("skyChest").setHardness(2.5F).setResistance(2.5F).setStepSound(Block.soundTypeWood).setCreativeTab(CreativeTabs.tabDecorations);
		LeadBlock = new leadBlock(Material.iron).setBlockName("leadBlock").setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(CreativeTabs.tabBlock);
		forge = new forge(Material.anvil).setBlockName("forge").setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(CreativeTabs.tabBlock);

	}
}
