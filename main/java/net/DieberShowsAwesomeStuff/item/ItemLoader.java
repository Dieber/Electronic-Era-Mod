package net.DieberShowsAwesomeStuff.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader
{
    public static Item electronCrystal = new ItemElectronCrystal();

    public ItemLoader(FMLPreInitializationEvent event)
    {
        register(electronCrystal, "electron_crystal");
        
    }

    private static void register(Item item, String name)
    {
        GameRegistry.registerItem(item, name);
    }
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(electronCrystal);
    }
    
    /*第一个参数是要被注册的物品。
	第二个参数是这个物品的Metadata。Metadata是一个用于区分同一个物品或方块的不同状态的数据，
	比如钟表的十六种状态、羊毛的十六种颜色，在后面的部分会讲到Metadata，默认为零就好了。
	第三个参数就是这个物品模型的资源位置了，资源位置是类ModelResourceLocation的一个实例，
	它用于描述一个模型，在后面我们还会比较常用到这个类的。*/
    @SideOnly(Side.CLIENT)
    /*@SideOnly注解的作用是注解这一方法、类等只作用于客户端或服务端。
         很明显，对于模型和材质的操作只会在客户端执行，所以我们同时要在ClientProxy中初始化：*/
    private static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                new ModelResourceLocation(GameRegistry.findUniqueIdentifierFor(item).toString(), "inventory"));
    }

    
    
}