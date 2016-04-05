package net.DieberShowsAwesomeStuff.client;

import jline.internal.Log;
import net.DieberShowsAwesomeStuff.block.BlockLoader;
import net.DieberShowsAwesomeStuff.item.ItemLoader;

public class ItemRenderLoader
{
    public ItemRenderLoader()
    {
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
    }
}