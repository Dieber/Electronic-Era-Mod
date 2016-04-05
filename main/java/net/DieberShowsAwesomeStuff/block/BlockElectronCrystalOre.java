package net.DieberShowsAwesomeStuff.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;



public class BlockElectronCrystalOre extends Block{

	public BlockElectronCrystalOre() {
        super(Material.rock);
        this.setUnlocalizedName("electronCrystalOre");
        this.setHardness(10.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabBlock);

	}
	
}
