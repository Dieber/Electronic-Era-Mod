package net.DieberShowsAwesomeStuff.crafting;

import net.DieberShowsAwesomeStuff.block.BlockLoader;
import net.DieberShowsAwesomeStuff.item.ItemLoader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader
{
    public CraftingLoader()
    {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe()
    {
    	   GameRegistry.addRecipe(new ItemStack(ItemLoader.electronCrystal), new Object[]
    		        {
    		                "###", "#*#", "###", '#', Items.gold_ingot, '*', Items.egg
    		        });
	        GameRegistry.addRecipe(new ItemStack(BlockLoader.electronCrystalOre), new Object[]
	        {
	                "##", "##", '#', Blocks.vine
	        });
   //        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.vine, 4), BlockLoader.electronCrystalOre);
    }
//Loader是可以直接调用的。用作。
    private static void registerSmelting()
    {
        GameRegistry.addSmelting(BlockLoader.electronCrystalOre, new ItemStack(ItemLoader.electronCrystal), 0.5F);
    }

    private static void registerFuel()
    {
//        GameRegistry.registerFuelHandler(new IFuelHandler()
//        {
//            @Override
//            public int getBurnTime(ItemStack fuel)
//            {
//                return Items.diamond != fuel.getItem() ? 0 : 12800;
//            }
//        });
    }
    
    
    
    
    
    
    
}