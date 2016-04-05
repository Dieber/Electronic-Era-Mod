package net.DieberShowsAwesomeStuff.common;

import net.DieberShowsAwesomeStuff.block.BlockLoader;
import net.DieberShowsAwesomeStuff.crafting.CraftingLoader;
import net.DieberShowsAwesomeStuff.creativetab.CreativeTabsLoader;
import net.DieberShowsAwesomeStuff.item.ItemLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        new ItemLoader(event);
        new BlockLoader(event);
        new CraftingLoader();
        new CreativeTabsLoader(event);
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
