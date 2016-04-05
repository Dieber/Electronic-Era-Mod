package net.DieberShowsAwesomeStuff.ElectronEra;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import gnu.io.*;
import java.io.*;
import java.util.Enumeration;

import net.DieberShowsAwesomeStuff.client.*;
import net.DieberShowsAwesomeStuff.common.*;
import net.DieberShowsAwesomeStuff.item.ItemElectronCrystal;

@Mod(modid = ElectronEra.MODID, name = ElectronEra.NAME, version = ElectronEra.VERSION, acceptedMinecraftVersions = "[1.8,)")

public class ElectronEra {

	
    public static final String MODID = "electronera";
    public static final String NAME = "Electron Era";
    public static final String VERSION = "0.0.1";
    
    
    @Instance(ElectronEra.MODID)
    public static ElectronEra instance;
    @SidedProxy(clientSide = "net.DieberShowsAwesomeStuff.client.ClientProxy", serverSide = "net.DieberShowsAwesomeStuff.common.CommonProxy")
    public static CommonProxy proxy;
//	static public Block electronCrystalBlock;
//	static public Item electronCrystal;
//	static public Block dataOutputBlock;
//	
//	public SerialBean sB;
	
	
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
//        c_proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
//        c_proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
 //       c_proxy.postInit(event);

    }
	
//	@EventHandler
//	public void preLoad(FMLPreInitializationEvent event)
//	{
//		electronCrystalBlock = new BlockElectronCrystalOre(Material.rock);
////		electronCrystalBlock.setBlockName();
//		electronCrystalBlock.setRegistryName("electronCrystalOre");
////		electronCrystalBlock.setBlockTextureName("electronera:electronCrystalOre");
//		electronCrystalBlock.setHardness(10.0f);
//		electronCrystalBlock.setResistance(10.0f);
//		electronCrystalBlock.setLightLevel(15.0f);
//		electronCrystalBlock.setHarvestLevel("electronera", 1);
//		electronCrystalBlock.setStepSound(Block.soundTypeStone);
//		electronCrystalBlock.setCreativeTab(CreativeTabs.tabBlock);
//		GameRegistry.registerBlock(electronCrystalBlock,"electronCrystalOre");
//		
//		
//		dataOutputBlock = new BlockDataOutput(Material.rock);
//		dataOutputBlock.setRegistryName("dataOutputBlock");
////		dataOutputBlock.setBlockTextureName("electronera:dataOutputBlock");
//		dataOutputBlock.setHardness(10.0f);
//		dataOutputBlock.setResistance(10.0f);
//		dataOutputBlock.setLightLevel(15.0f);
//		dataOutputBlock.setHardness(10.0f);
//		dataOutputBlock.setHarvestLevel("electronera", 1);
//		dataOutputBlock.setStepSound(Block.soundTypeStone);
//		dataOutputBlock.setCreativeTab(CreativeTabs.tabBlock);
//		GameRegistry.registerBlock(dataOutputBlock,"dataOutputBlock");
//		
//		
//
//		
//		
//		electronCrystal = new ItemElectronCrystal();
//		electronCrystal.setUnlocalizedName("electronCrystal");
////		electronCrystal.setTextureName("electronera:electronCrystal");
//		electronCrystal.setMaxStackSize(64);
//		electronCrystal.setCreativeTab(CreativeTabs.tabMaterials);
//		GameRegistry.registerItem(electronCrystal, "electronCrystal");
//		
//		sB = new SerialBean(7);
//		sB.Initialize();
//		sB.WritePort("dieber");
//	
//		
//		
//	}
//	 
//	@EventHandler
//	public void load(FMLInitializationEvent event)
//	{
//	}
//	 
//	@EventHandler
//	public void postLoad(FMLPostInitializationEvent event)
//	{
//	}
//	
//	
//	

	
}
