package net.DieberShowsAwesomeStuff.block;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
	
	   public static Block electronCrystalOre = new BlockElectronCrystalOre();
	   public static Block dataOutput = new BlockDataOutput();
	   
	    public BlockLoader(FMLPreInitializationEvent event)
	    {
	        register(electronCrystalOre, "electron_crystal_ore");
	        register(dataOutput, "data_output");
	    	        
	    }

	    @SideOnly(Side.CLIENT)
	    public static void registerRenders()
	    {
	        registerRender(electronCrystalOre);
	        registerRender(dataOutput);
	    }

	    private static void register(Block block, String name)
	    {
	        GameRegistry.registerBlock(block, name);
	    }
	    @SideOnly(Side.CLIENT)
	    
	    private static void registerRender(Block block)
	    {
	        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
	                new ModelResourceLocation(GameRegistry.findUniqueIdentifierFor(block).toString(), "inventory"));
	    }

}
