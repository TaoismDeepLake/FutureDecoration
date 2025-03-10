package com.momo.fd.blocks;

import com.momo.fd.blocks.blockBasic.*;
import com.momo.fd.blocks.blockBasic.decoration.*;
import com.momo.fd.blocks.blockBasic.decoration.ColorVariants.*;
import com.momo.fd.blocks.blockBasic.ore.LitOre;
import com.momo.fd.blocks.blockBasic.ore.NetherOre;
import com.momo.fd.blocks.blockBasic.ore.Ore;
import com.momo.fd.blocks.blockBasic.sign.StandingSign;
import com.momo.fd.blocks.blockBasic.sign.WallSign;
import com.momo.fd.blocks.blockBush.BerriesBush;
import com.momo.fd.blocks.blockBush.Flower;
import com.momo.fd.blocks.blockInteractive.*;
import com.momo.fd.blocks.blockMisc.DeepSlate;
import com.momo.fd.blocks.blockMisc.DeepSlateBricks;
import com.momo.fd.blocks.blockMisc.NewObsidian;
import com.momo.fd.blocks.blockBasic.PillarBlock;
import com.momo.fd.blocks.blockVariant.BlockVariantBase;
import com.momo.fd.blocks.blockVariant.StainedGlass;
import com.momo.fd.blocks.blockVariant.StainedGlassPane;
import com.momo.fd.blocks.blockVariant.WallVariant;
import com.momo.fd.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block WOOD_ACACIA = new Log("wood_acacia");
    public static final Block WOOD_BIRCH = new Log("wood_birch");
    public static final Block WOOD_DARK_OAK = new Log("wood_dark_oak");
    public static final Block WOOD_JUNGLE = new Log("wood_jungle");
    public static final Block WOOD_OAK = new Log("wood_oak");
    public static final Block WOOD_SPRUCE = new Log("wood_spruce");

    public static final Block STRIPPED_ACACIA = new Log("stripped_acacia");
    public static final Block STRIPPED_BIRCH = new Log("stripped_birch");
    public static final Block STRIPPED_DARK_OAK = new Log("stripped_dark_oak");
    public static final Block STRIPPED_JUNGLE = new Log("stripped_jungle");
    public static final Block STRIPPED_OAK = new Log("stripped_oak");
    public static final Block STRIPPED_SPRUCE = new Log("stripped_spruce");

    public static final Block STRIPPED_ACACIA_WOOD = new Log("stripped_acacia_wood");
    public static final Block STRIPPED_BIRCH_WOOD = new Log("stripped_birch_wood");
    public static final Block STRIPPED_DARK_OAK_WOOD = new Log("stripped_dark_oak_wood");
    public static final Block STRIPPED_JUNGLE_WOOD = new Log("stripped_jungle_wood");
    public static final Block STRIPPED_OAK_WOOD = new Log("stripped_oak_wood");
    public static final Block STRIPPED_SPRUCE_WOOD = new Log("stripped_spruce_wood");

	public static final Block CHARCOAL_BLOCK = new BurnableBlock("charcoal_block", 16000, Material.ROCK, MapColor.BLACK).setHardness(5.0F).setResistance(10.0F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

	public static final Block ROCK_BLOCK = new Rocks(8);
	public static final Block BASALT = new PillarBlock("basalt", Material.ROCK, MapColor.GRAY);
	public static final Block POLISHED_BASALT = new PillarBlock("polished_basalt", Material.ROCK, MapColor.GRAY);
	public static final Block DEEPSLATE = new DeepSlate();
	public static final Block DEEPSLATE_ROCK = new DeepSlateBricks(7);
	public static final Block SANDSTONE = new BlockVariantBase("sandstone", Material.ROCK, MapColor.SAND, 2).setHardness(2.0F).setResistance(0.8F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block NETHER_BLOCK = new NetherRocks( 12);

	public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.ROCK).setHardness(3.0F).setResistance(5.0F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static final Block ORE = new Ore(7);
	public static final Block DEEPSLATE_REDSTONE_ORE = new LitOre("deepslate_redstone_ore", false);
	public static final Block LIT_DEEPSLATE_REDSTONE_ORE = new LitOre("lit_deepslate_redstone_ore", true).setLightLevel(0.625F);
	public static final Block NETHER_ORE = new NetherOre(2);


	public static final Block CRYING_OBSIDIAN = new NewObsidian("crying_obsidian", Material.ROCK, MapColor.OBSIDIAN).setLightLevel(0.666666667F);

	public static final Block CLEAR_GLASS = new Glass("clear_glass");
	public static final Block STAINED_CLEAR_GLASS = new StainedGlass("stained_clear_glass", 16);
	public static final Block CLEAR_PANE = new GlassPane("clear_pane");
	public static final Block STAINED_CLEAR_GLASS_PANE = new StainedGlassPane("stained_clear_pane", 16);

    public static final Block RED_NETHER_BRICK_FENCE = new Fence("red_nether_brick_fence", Material.ROCK, MapColor.NETHERRACK);

	public static final Block STONE_STAIRS = new Stair("stone_stairs", Blocks.STONE, MapColor.STONE);
	public static final Block MOSSY_STONE_STAIRS = new Stair("mossy_stone_stairs", Blocks.MOSSY_COBBLESTONE, MapColor.STONE);
	public static final Block MOSSY_STONE_BRICK_STAIRS = new Stair("mossy_stone_brick_stairs", Blocks.STONEBRICK, MapColor.STONE);
	public static final Block SMOOTH_STONE_STAIRS = new Stair("smooth_stone_stairs", Blocks.STONE, MapColor.STONE);
	public static final Block STONE_TILES_STAIRS = new Stair("stone_tiles_stairs", Blocks.STONEBRICK, MapColor.STONE);

	public static final Block COBBLED_DEEPSLATE_STAIRS = new Stair("cobbled_deepslate_stairs", Blocks.STONE, MapColor.GRAY);
	public static final Block DEEPSLATE_STAIRS = new Stair("deepslate_stairs", Blocks.STONE, MapColor.GRAY);
	public static final Block POLISHED_DEEPSLATE_STAIRS = new Stair("polished_deepslate_stairs", Blocks.STONEBRICK, MapColor.GRAY);
	public static final Block DEEPSLATE_BRICKS_STAIRS = new Stair("deepslate_bricks_stairs", Blocks.STONEBRICK, MapColor.GRAY);
	public static final Block DEEPSLATE_TILES_STAIRS = new Stair("deepslate_tiles_stairs", Blocks.STONEBRICK, MapColor.GRAY);

	public static final Block ANDESITE_STAIRS = new Stair("andesite_stairs", Blocks.STONEBRICK, MapColor.STONE);
	public static final Block SMOOTH_ANDESITE_STAIRS = new Stair("smooth_andesite_stairs", Blocks.STONEBRICK, MapColor.STONE);
	public static final Block ANDESITE_BRICKS_STAIRS = new Stair("andesite_bricks_stairs", Blocks.STONEBRICK, MapColor.STONE);
	public static final Block DIORITE_STAIRS = new Stair("diorite_stairs", Blocks.QUARTZ_BLOCK, MapColor.QUARTZ);
	public static final Block SMOOTH_DIORITE_STAIRS = new Stair("smooth_diorite_stairs", Blocks.QUARTZ_BLOCK, MapColor.QUARTZ);
	public static final Block DIORITE_BRICKS_STAIRS = new Stair("diorite_bricks_stairs", Blocks.QUARTZ_BLOCK, MapColor.QUARTZ);
	public static final Block GRANITE_STAIRS = new Stair("granite_stairs", Blocks.RED_NETHER_BRICK, MapColor.DIRT);
	public static final Block SMOOTH_GRANITE_STAIRS = new Stair("smooth_granite_stairs", Blocks.RED_NETHER_BRICK, MapColor.DIRT);
	public static final Block GRANITE_BRICKS_STAIRS = new Stair("granite_bricks_stairs", Blocks.RED_NETHER_BRICK, MapColor.DIRT);

	public static final Block CUT_SANDSTONE_STAIRS = new Stair("cut_sandstone_stairs", Blocks.SANDSTONE, MapColor.SAND);
	public static final Block CUT_RED_SANDSTONE_STAIRS = new Stair("cut_red_sandstone_stairs", Blocks.RED_SANDSTONE, MapColor.RED);
	public static final Block SMOOTH_SANDSTONE_STAIRS = new Stair("smooth_sandstone_stairs", Blocks.SANDSTONE, MapColor.SAND);
	public static final Block SMOOTH_RED_SANDSTONE_STAIRS = new Stair("smooth_red_sandstone_stairs", Blocks.RED_SANDSTONE, MapColor.RED);

	public static final Block PRISMARINE_STAIRS = new Stair("prismarine_stairs", Blocks.PRISMARINE, MapColor.CYAN);
	public static final Block PRISMARINE_DARK_STAIRS = new Stair("prismarine_dark_stairs", Blocks.PRISMARINE, MapColor.DIAMOND);
	public static final Block PRISMARINE_BRICK_STAIRS = new Stair("prismarine_brick_stairs", Blocks.PRISMARINE, MapColor.DIAMOND);

	public static final Block RED_NETHER_BRICK_STAIRS = new Stair("red_nether_brick_stairs", Blocks.RED_NETHER_BRICK, MapColor.NETHERRACK);
	public static final Block BLACKSTONE_STAIRS = new Stair("blackstone_stairs", Blocks.STONE, MapColor.BLACK_STAINED_HARDENED_CLAY);
	public static final Block POLISHED_BLACKSTONE_STAIRS = new Stair("polished_blackstone_stairs", Blocks.STONEBRICK, MapColor.BLACK_STAINED_HARDENED_CLAY);
	public static final Block POLISHED_BLACKSTONE_BRICK_STAIRS = new Stair("polished_blackstone_brick_stairs", Blocks.STONEBRICK, MapColor.BLACK_STAINED_HARDENED_CLAY);
	public static final Block SMOOTH_QUARTZ_STAIRS = new Stair("smooth_quartz_stairs", Blocks.QUARTZ_BLOCK, MapColor.QUARTZ);
	public static final Block QUARTZ_BRICKS_STAIRS = new Stair("quartz_bricks_stairs", Blocks.QUARTZ_BLOCK, MapColor.QUARTZ);

	public static final Block END_STONE_BRICK_STAIRS = new Stair("end_stone_brick_stairs", Blocks.END_BRICKS, MapColor.SAND);

	public static final BlockSlab STONE_SLAB_DOUBLE = new Slab("stone_slab_double", MapColor.STONE);
	public static final BlockSlab STONE_SLAB = new Slab("stone_slab", MapColor.STONE, ModBlocks.STONE_SLAB_DOUBLE);
	public static final BlockSlab STONE_TILES_SLAB_DOUBLE = new Slab("stone_tiles_slab_double", MapColor.STONE);
	public static final BlockSlab STONE_TILES_SLAB = new Slab("stone_tiles_slab", MapColor.STONE, ModBlocks.STONE_TILES_SLAB_DOUBLE);
	public static final BlockSlab MOSSY_STONE_SLAB_DOUBLE = new Slab("mossy_stone_slab_double", MapColor.STONE);
	public static final BlockSlab MOSSY_STONE_SLAB = new Slab("mossy_stone_slab", MapColor.STONE, ModBlocks.MOSSY_STONE_SLAB_DOUBLE);
	public static final BlockSlab MOSSY_STONE_BRICK_SLAB_DOUBLE = new Slab("mossy_stone_brick_slab_double", MapColor.STONE);
	public static final BlockSlab MOSSY_STONE_BRICK_SLAB = new Slab("mossy_stone_brick_slab", MapColor.STONE, ModBlocks.MOSSY_STONE_BRICK_SLAB_DOUBLE);

	public static final BlockSlab COBBLED_DEEPSLATE_SLAB_DOUBLE = new Slab("cobbled_deepslate_slab_double", MapColor.GRAY);
	public static final BlockSlab COBBLED_DEEPSLATE_SLAB = new Slab("cobbled_deepslate_slab", MapColor.GRAY, ModBlocks.COBBLED_DEEPSLATE_SLAB_DOUBLE);
	public static final BlockSlab DEEPSLATE_SLAB_DOUBLE = new Slab("deepslate_slab_double", MapColor.GRAY);
	public static final BlockSlab DEEPSLATE_SLAB = new Slab("deepslate_slab", MapColor.GRAY, ModBlocks.DEEPSLATE_SLAB_DOUBLE);
	public static final BlockSlab POLISHED_DEEPSLATE_SLAB_DOUBLE = new Slab("polished_deepslate_slab_double", MapColor.GRAY);
	public static final BlockSlab POLISHED_DEEPSLATE_SLAB = new Slab("polished_deepslate_slab", MapColor.GRAY, ModBlocks.POLISHED_DEEPSLATE_SLAB_DOUBLE);
	public static final BlockSlab DEEPSLATE_BRICKS_SLAB_DOUBLE = new Slab("deepslate_bricks_slab_double", MapColor.GRAY);
	public static final BlockSlab DEEPSLATE_BRICKS_SLAB = new Slab("deepslate_bricks_slab", MapColor.GRAY, ModBlocks.DEEPSLATE_BRICKS_SLAB_DOUBLE);
	public static final BlockSlab DEEPSLATE_TILES_SLAB_DOUBLE = new Slab("deepslate_tiles_slab_double", MapColor.GRAY);
	public static final BlockSlab DEEPSLATE_TILES_SLAB = new Slab("deepslate_tiles_slab", MapColor.GRAY, ModBlocks.DEEPSLATE_TILES_SLAB_DOUBLE);

	public static final BlockSlab ANDESITE_SLAB_DOUBLE = new Slab("andesite_slab_double", MapColor.STONE);
	public static final BlockSlab ANDESITE_SLAB = new Slab("andesite_slab", MapColor.STONE, ModBlocks.ANDESITE_SLAB_DOUBLE);
	public static final BlockSlab SMOOTH_ANDESITE_SLAB_DOUBLE = new Slab("andesite_slab_smooth_double", MapColor.STONE);
	public static final BlockSlab SMOOTH_ANDESITE_SLAB = new Slab("andesite_slab_smooth", MapColor.STONE, ModBlocks.SMOOTH_ANDESITE_SLAB_DOUBLE);
	public static final BlockSlab ANDESITE_BRICKS_SLAB_DOUBLE = new Slab("andesite_bricks_slab_double", MapColor.STONE);
	public static final BlockSlab ANDESITE_BRICKS_SLAB = new Slab("andesite_bricks_slab", MapColor.STONE, ModBlocks.ANDESITE_BRICKS_SLAB_DOUBLE);
	public static final BlockSlab DIORITE_SLAB_DOUBLE = new Slab("diorite_slab_double", MapColor.QUARTZ);
	public static final BlockSlab DIORITE_SLAB = new Slab("diorite_slab", MapColor.QUARTZ, ModBlocks.DIORITE_SLAB_DOUBLE);
	public static final BlockSlab SMOOTH_DIORITE_SLAB_DOUBLE = new Slab("diorite_slab_smooth_double", MapColor.QUARTZ);
	public static final BlockSlab SMOOTH_DIORITE_SLAB = new Slab("diorite_slab_smooth", MapColor.QUARTZ, ModBlocks.SMOOTH_DIORITE_SLAB_DOUBLE);
	public static final BlockSlab DIORITE_BRICKS_SLAB_DOUBLE = new Slab("diorite_bricks_slab_double", MapColor.QUARTZ);
	public static final BlockSlab DIORITE_BRICKS_SLAB = new Slab("diorite_bricks_slab", MapColor.QUARTZ, ModBlocks.DIORITE_BRICKS_SLAB_DOUBLE);
	public static final BlockSlab GRANITE_SLAB_DOUBLE = new Slab("granite_slab_double", MapColor.DIRT);
	public static final BlockSlab GRANITE_SLAB = new Slab("granite_slab", MapColor.DIRT, ModBlocks.GRANITE_SLAB_DOUBLE);
	public static final BlockSlab SMOOTH_GRANITE_SLAB_DOUBLE = new Slab("granite_slab_smooth_double", MapColor.DIRT);
	public static final BlockSlab SMOOTH_GRANITE_SLAB = new Slab("granite_slab_smooth", MapColor.DIRT, ModBlocks.SMOOTH_GRANITE_SLAB_DOUBLE);
	public static final BlockSlab GRANITE_BRICKS_SLAB_DOUBLE = new Slab("granite_bricks_slab_double", MapColor.DIRT);
	public static final BlockSlab GRANITE_BRICKS_SLAB = new Slab("granite_bricks_slab", MapColor.DIRT, ModBlocks.GRANITE_BRICKS_SLAB_DOUBLE);

	public static final BlockSlab CUT_SANDSTONE_SLAB_DOUBLE = new Slab("cut_sandstone_slab_double", MapColor.SAND);
	public static final BlockSlab CUT_SANDSTONE_SLAB = new Slab("cut_sandstone_slab", MapColor.SAND, ModBlocks.CUT_SANDSTONE_SLAB_DOUBLE);
	public static final BlockSlab CUT_RED_SANDSTONE_SLAB_DOUBLE = new Slab("cut_red_sandstone_slab_double", MapColor.ADOBE);
	public static final BlockSlab CUT_RED_SANDSTONE_SLAB = new Slab("cut_red_sandstone_slab", MapColor.ADOBE, ModBlocks.CUT_RED_SANDSTONE_SLAB_DOUBLE);
	public static final BlockSlab SMOOTH_SANDSTONE_SLAB_DOUBLE = new Slab("smooth_sandstone_slab_double", MapColor.SAND);
	public static final BlockSlab SMOOTH_SANDSTONE_SLAB = new Slab("smooth_sandstone_slab", MapColor.SAND, ModBlocks.SMOOTH_SANDSTONE_SLAB_DOUBLE);
	public static final BlockSlab SMOOTH_RED_SANDSTONE_SLAB_DOUBLE = new Slab("smooth_red_sandstone_slab_double", MapColor.ADOBE);
	public static final BlockSlab SMOOTH_RED_SANDSTONE_SLAB = new Slab("smooth_red_sandstone_slab", MapColor.ADOBE, ModBlocks.SMOOTH_RED_SANDSTONE_SLAB_DOUBLE);

	public static final BlockSlab PRISMARINE_SLAB_DOUBLE = new Slab("prismarine_slab_double", MapColor.CYAN);
	public static final BlockSlab PRISMARINE_SLAB = new Slab("prismarine_slab", MapColor.CYAN, ModBlocks.PRISMARINE_SLAB_DOUBLE);
	public static final BlockSlab PRISMARINE_DRAK_SLAB_DOUBLE = new Slab("prismarine_dark_slab_double", MapColor.DIAMOND);
	public static final BlockSlab PRISMARINE_DRAK_SLAB = new Slab("prismarine_dark_slab", MapColor.DIAMOND, ModBlocks.PRISMARINE_DRAK_SLAB_DOUBLE);
	public static final BlockSlab PRISMARINE_BRICK_SLAB_DOUBLE = new Slab("prismarine_brick_slab_double", MapColor.DIAMOND);
	public static final BlockSlab PRISMARINE_BRICK_SLAB = new Slab("prismarine_brick_slab", MapColor.DIAMOND, ModBlocks.PRISMARINE_BRICK_SLAB_DOUBLE);

	public static final BlockSlab RED_NETHER_BRICK_SLAB_DOUBLE = new Slab("red_nether_brick_slab_double", MapColor.NETHERRACK);
	public static final BlockSlab RED_NETHER_BRICK_SLAB = new Slab("red_nether_brick_slab", MapColor.NETHERRACK, ModBlocks.RED_NETHER_BRICK_SLAB_DOUBLE);
	public static final BlockSlab BLACKSTONE_SLAB_DOUBLE = new Slab("blackstone_slab_double", MapColor.STONE);
	public static final BlockSlab BLACKSTONE_SLAB = new Slab("blackstone_slab", MapColor.STONE, ModBlocks.BLACKSTONE_SLAB_DOUBLE);
	public static final BlockSlab POLISHED_BLACKSTONE_SLAB_DOUBLE = new Slab("polished_blackstone_slab_double", MapColor.STONE);
	public static final BlockSlab POLISHED_BLACKSTONE_SLAB = new Slab("polished_blackstone_slab", MapColor.STONE, ModBlocks.POLISHED_BLACKSTONE_SLAB_DOUBLE);
	public static final BlockSlab BLACKSTONE_BRICK_SLAB_DOUBLE = new Slab("polished_blackstone_brick_slab_double", MapColor.STONE);
	public static final BlockSlab BLACKSTONE_BRICK_SLAB = new Slab("polished_blackstone_brick_slab", MapColor.STONE, ModBlocks.BLACKSTONE_BRICK_SLAB_DOUBLE);
	public static final BlockSlab SMOOTH_QUARTZ_SLAB_DOUBLE = new Slab("smooth_quartz_slab_double", MapColor.QUARTZ);
	public static final BlockSlab SMOOTH_QUARTZ_SLAB = new Slab("smooth_quartz_slab", MapColor.QUARTZ, ModBlocks.SMOOTH_QUARTZ_SLAB_DOUBLE);
	public static final BlockSlab QUARTZ_BRICK_SLAB_DOUBLE = new Slab("quartz_bricks_slab_double", MapColor.QUARTZ);
	public static final BlockSlab QUARTZ_BRICK_SLAB = new Slab("quartz_bricks_slab", MapColor.QUARTZ, ModBlocks.QUARTZ_BRICK_SLAB_DOUBLE);

	public static final BlockSlab END_STONE_BRICK_SLAB_DOUBLE = new Slab("end_stone_brick_slab_double", MapColor.SAND);
	public static final BlockSlab END_STONE_BRICK_SLAB = new Slab("end_stone_brick_slab", MapColor.SAND, ModBlocks.END_STONE_BRICK_SLAB_DOUBLE);

	public static final Block ACACIA_TRAPDOOR = new TrapDoor("acacia_trapdoor", Material.WOOD);
	public static final Block BIRCH_TRAPDOOR = new TrapDoor("birch_trapdoor", Material.WOOD);
	public static final Block DARK_OAK_TRAPDOOR = new TrapDoor("dark_oak_trapdoor", Material.WOOD);
	public static final Block JUNGLE_TRAPDOOR = new TrapDoor("jungle_trapdoor", Material.WOOD);
	public static final Block SPRUCE_TRAPDOOR = new TrapDoor("spruce_trapdoor", Material.WOOD);

	public static final Block ACACIA_PRESSURE_PLATE = new PressurePlate("acacia_pressure_plate", Material.WOOD, BlockPressurePlate.Sensitivity.EVERYTHING);
	public static final Block BIRCH_PRESSURE_PLATE = new PressurePlate("birch_pressure_plate", Material.WOOD, BlockPressurePlate.Sensitivity.EVERYTHING);
	public static final Block DRAK_OAK_PRESSURE_PLATE = new PressurePlate("dark_oak_pressure_plate", Material.WOOD, BlockPressurePlate.Sensitivity.EVERYTHING);
	public static final Block JUNGLE_PRESSURE_PLATE = new PressurePlate("jungle_pressure_plate", Material.WOOD, BlockPressurePlate.Sensitivity.EVERYTHING);
	public static final Block SPRUCE_PRESSURE_PLATE = new PressurePlate("spruce_pressure_plate", Material.WOOD, BlockPressurePlate.Sensitivity.EVERYTHING);
	public static final Block BLACKSTONE_PRESSURE_PLATE = new PressurePlate("blackstone_pressure_plate", Material.ROCK, BlockPressurePlate.Sensitivity.MOBS);

	public static final Block ACACIA_BUTTON = new Button("acacia_button", true);
	public static final Block BIRCH_BUTTON = new Button("birch_button", true);
	public static final Block DRAK_OAK_BUTTON = new Button("dark_oak_button", true);
	public static final Block JUNGLE_BUTTON = new Button("jungle_button", true);
	public static final Block SPRUCE_BUTTON = new Button("spruce_button", true);
	public static final Block BLACKSTONE_BUTTON = new Button("blackstone_button", false);

	public static final Block ACACIA_SIGN_STANDING = new StandingSign("acacia_sign_standing");
	public static final Block ACACIA_SIGN_WALL = new WallSign("acacia_sign_wall");
	public static final Block BIRCH_SIGN_STANDING = new StandingSign("birch_sign_standing");
	public static final Block BIRCH_SIGN_WALL = new WallSign("birch_sign_wall");
	public static final Block DARK_OAK_SIGN_STANDING = new StandingSign("dark_oak_sign_standing");
	public static final Block DARK_OAK_SIGN_WALL = new WallSign("dark_oak_sign_wall");
	public static final Block JUNGLE_SIGN_STANDING = new StandingSign("jungle_sign_standing");
	public static final Block JUNGLE_SIGN_WALL = new WallSign("jungle_sign_wall");
	public static final Block SPRUCE_SIGN_STANDING = new StandingSign("spruce_sign_standing");
	public static final Block SPRUCE_SIGN_WALL = new WallSign("spruce_sign_wall");

    public static final Block LILY_OF_THE_VALLEY = new Flower("lily_of_the_valley");
    public static final Block ROSE = new Flower("rose");
    public static final Block CORNFLOWER = new Flower("cornflower");
    public static final Block WITHER_ROSE = new Flower("wither_rose");
    public static final Block BERRY_BUSH = new BerriesBush("sweet_berry_bush");

	public static final Block GRINDSTONE = new Grindstone("grindstone");
	public static final Block BARREL = new Barrel("barrel");
	public static final Block COMPOSTER = new Composter("composter");
	public static final Block CAMPFIRE = new Campfire("campfire").setLightLevel(0.8F);
	public static final Block CAMPFIRE_OFF = new Campfire("campfire_off");
	public static final Block FLETCHING_TABLE = new BurnableBlock("fletching_table", 300, Material.WOOD, MapColor.SAND).setHardness(2.5F).setResistance(2.5F).setCreativeTab(CreativeTabs.DECORATIONS);
	public static final Block CARTOGRAPHY_TABLE = new BurnableBlock("cartography_table", 300, Material.WOOD, MapColor.BROWN).setHardness(2.5F).setResistance(2.5F).setCreativeTab(CreativeTabs.DECORATIONS);
	public static final Block SMITHING_TABLE = new BurnableBlock("smithing_table", 300, Material.WOOD, MapColor.BLACK).setHardness(2.5F).setResistance(2.5F).setCreativeTab(CreativeTabs.DECORATIONS);
	public static final Block LOOM = new DirectionalBlock("loom", 300, Material.WOOD, MapColor.WOOD).setHardness(2.5F).setResistance(2.5F).setCreativeTab(CreativeTabs.DECORATIONS);
	public static final Block LECTERN = new Lectern("lectern");
	public static final Block SMOKER = new Smoker("smoker");
	public static final Block BLAST_FURNACE = new BlastFurnace("blast_furnace");

	public static final Block IRON_CHAIN = new Chain("chain");
	public static final Block GOLD_CHAIN = new Chain("chain_gold");
	public static final Block IRON_LANTERN = new Lantern("iron_lantern");
	public static final Block GOLD_LANTERN = new Lantern("gold_lantern");
	public static final Block GOLD_BARS = new Bar("gold_bars", Material.IRON);
	public static final Block GOLD_TRAPDOOR = new TrapDoor("gold_trapdoor", Material.IRON);
	public static final Block GOLD_DOOR = new Door("gold_door");

	public static final Block CARPET = new Carpet(2);

	public static final Block STONE_WALL = new StoneWall(6);
	public static final Block STONEBRICK_WALL = new StoneBrickWall( 14);
	public static final Block STONEBRICK_WALL_II = new StoneBrickWall2(5);
	public static final Block SANDSTONE_WALL = new WallVariant("sandstone_wall", Material.ROCK, MapColor.SAND, 0.8F, 4.0F, SoundType.STONE, 6);
	public static final Block NETHER_WALL = new NetherWall(8);
	
	public static void init(){
		((Slab)STONE_SLAB_DOUBLE).setDropped(ModBlocks.STONE_SLAB);
		((Slab)STONE_TILES_SLAB_DOUBLE).setDropped(ModBlocks.STONE_TILES_SLAB);
		((Slab)MOSSY_STONE_SLAB_DOUBLE).setDropped(ModBlocks.MOSSY_STONE_SLAB);
		((Slab)MOSSY_STONE_BRICK_SLAB_DOUBLE).setDropped(ModBlocks.MOSSY_STONE_BRICK_SLAB);

		((Slab)ANDESITE_SLAB_DOUBLE).setDropped(ModBlocks.ANDESITE_SLAB);
		((Slab)SMOOTH_ANDESITE_SLAB_DOUBLE).setDropped(ModBlocks.SMOOTH_ANDESITE_SLAB);
		((Slab)ANDESITE_BRICKS_SLAB_DOUBLE).setDropped(ModBlocks.ANDESITE_BRICKS_SLAB);
		((Slab)DIORITE_SLAB_DOUBLE).setDropped(ModBlocks.DIORITE_SLAB);
		((Slab)SMOOTH_DIORITE_SLAB_DOUBLE).setDropped(ModBlocks.SMOOTH_DIORITE_SLAB);
		((Slab)DIORITE_BRICKS_SLAB_DOUBLE).setDropped(ModBlocks.DIORITE_BRICKS_SLAB);
		((Slab)GRANITE_SLAB_DOUBLE).setDropped(ModBlocks.GRANITE_SLAB);
		((Slab)SMOOTH_GRANITE_SLAB_DOUBLE).setDropped(ModBlocks.SMOOTH_GRANITE_SLAB);
		((Slab)GRANITE_BRICKS_SLAB_DOUBLE).setDropped(ModBlocks.GRANITE_BRICKS_SLAB);

		((Slab)COBBLED_DEEPSLATE_SLAB_DOUBLE).setDropped(ModBlocks.COBBLED_DEEPSLATE_SLAB);
		((Slab)DEEPSLATE_SLAB_DOUBLE).setDropped(ModBlocks.DEEPSLATE_SLAB);
		((Slab)POLISHED_DEEPSLATE_SLAB_DOUBLE).setDropped(ModBlocks.POLISHED_DEEPSLATE_SLAB);
		((Slab)DEEPSLATE_BRICKS_SLAB_DOUBLE).setDropped(ModBlocks.DEEPSLATE_BRICKS_SLAB);
		((Slab)DEEPSLATE_TILES_SLAB_DOUBLE).setDropped(ModBlocks.DEEPSLATE_TILES_SLAB);

		((Slab)CUT_SANDSTONE_SLAB_DOUBLE).setDropped(ModBlocks.CUT_SANDSTONE_SLAB);
		((Slab)CUT_RED_SANDSTONE_SLAB_DOUBLE).setDropped(ModBlocks.CUT_RED_SANDSTONE_SLAB);
		((Slab)SMOOTH_SANDSTONE_SLAB_DOUBLE).setDropped(ModBlocks.SMOOTH_SANDSTONE_SLAB);
		((Slab)SMOOTH_RED_SANDSTONE_SLAB_DOUBLE).setDropped(ModBlocks.SMOOTH_RED_SANDSTONE_SLAB);

		((Slab)PRISMARINE_SLAB_DOUBLE).setDropped(ModBlocks.PRISMARINE_SLAB);
		((Slab)PRISMARINE_DRAK_SLAB_DOUBLE).setDropped(ModBlocks.PRISMARINE_DRAK_SLAB);
		((Slab)PRISMARINE_BRICK_SLAB_DOUBLE).setDropped(ModBlocks.PRISMARINE_BRICK_SLAB);

		((Slab)RED_NETHER_BRICK_SLAB_DOUBLE).setDropped(ModBlocks.RED_NETHER_BRICK_SLAB);
		((Slab)BLACKSTONE_SLAB_DOUBLE).setDropped(ModBlocks.BLACKSTONE_SLAB);
		((Slab)POLISHED_BLACKSTONE_SLAB_DOUBLE).setDropped(ModBlocks.POLISHED_BLACKSTONE_SLAB);
		((Slab)BLACKSTONE_BRICK_SLAB_DOUBLE).setDropped(ModBlocks.BLACKSTONE_BRICK_SLAB);
		((Slab)SMOOTH_QUARTZ_SLAB_DOUBLE).setDropped(ModBlocks.SMOOTH_QUARTZ_SLAB);
		((Slab)QUARTZ_BRICK_SLAB_DOUBLE).setDropped(ModBlocks.QUARTZ_BRICK_SLAB);

		((Slab)END_STONE_BRICK_SLAB_DOUBLE).setDropped(ModBlocks.END_STONE_BRICK_SLAB);

		((StandingSign)ACACIA_SIGN_STANDING).setItemSign(ModItems.ACACIA_SIGN);
		((StandingSign)BIRCH_SIGN_STANDING).setItemSign(ModItems.BIRCH_SIGN);
		((StandingSign)DARK_OAK_SIGN_STANDING).setItemSign(ModItems.DARK_OAK_SIGN);
		((StandingSign)JUNGLE_SIGN_STANDING).setItemSign(ModItems.JUNGLE_SIGN);
		((StandingSign)SPRUCE_SIGN_STANDING).setItemSign(ModItems.SPRUCE_SIGN);

		((WallSign)ACACIA_SIGN_WALL).setItemSign(ModItems.ACACIA_SIGN);
		((WallSign)BIRCH_SIGN_WALL).setItemSign(ModItems.BIRCH_SIGN);
		((WallSign)DARK_OAK_SIGN_WALL).setItemSign(ModItems.DARK_OAK_SIGN);
		((WallSign)JUNGLE_SIGN_WALL).setItemSign(ModItems.JUNGLE_SIGN);
		((WallSign)SPRUCE_SIGN_WALL).setItemSign(ModItems.SPRUCE_SIGN);

		((Door)GOLD_DOOR).setItemDoor(ModItems.GOLD_DOOR);
	}

}
