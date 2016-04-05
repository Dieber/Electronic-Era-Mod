package net.DieberShowsAwesomeStuff.creativetab;

import net.DieberShowsAwesomeStuff.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader {
    public static CreativeTabs tabElectronEra;

    public CreativeTabsLoader(FMLPreInitializationEvent event)
    {
    	tabElectronEra = new CreativeTabs("tabElectronEra")
        {
            @Override
            public Item getTabIconItem()
            {
                return ItemLoader.electronCrystal;
            }
        };
        
        
    }
}
