package net.DieberShowsAwesomeStuff.ElectronEra;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;


public class BlockDataOutput extends Block {
	Minecraft mc = Minecraft.getMinecraft();
	private SerialBean sB;
	DataSettingGui dataSettingGui = new DataSettingGui(mc.currentScreen);
	public BlockDataOutput(Material material) {	
	super(material);
	}



@Override
public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
{
    mc.displayGuiScreen(dataSettingGui);
    
    return false;
}

@Override
public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
{
	

	if(worldIn.isBlockIndirectlyGettingPowered(pos) == 15){
//		if(par1world.getBlockMetadata(par2+1, par3, par4)>12||
//		   par1world.getBlockMetadata(par2-1, par3, par4)>12||
//		   par1world.getBlockMetadata(par2, par3, par4+1)>12||
//		   par1world.getBlockMetadata(par2, par3, par4-1)>12){
//			sB.WritePort(""+neighborBlock.getBlockMetadata(pos.getX(),pos.getY(),pos.getZ()));
			sB.WritePort("Fuck You");
//			System.out.println(""+par1world.getBlockMetadata(par2+1, par3, par4));
//			
////	}else{
////			System.out.println(""+par1world.getBlockMetadata(par2+1, par3, par4));
////		}
		}
}


}
	
