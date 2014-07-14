package com.xaw4.craftcraft.blocks;

import com.xaw4.craftcraft.ModProperties;
import com.xaw4.craftcraft.creativetab.CraftCraftCreativeTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Xaw4 on 25.06.2014.
 */
public abstract class BlockCC extends Block {

    protected String name;

    protected BlockCC(String name) {
        super(Material.rock);
        this.name = name;
        this.setBlockName(name);
        this.setCreativeTab(CraftCraftCreativeTab.instance);
    }


    @Override
    public String getUnlocalizedName() {
        return "tile." + this.getFullName();
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(this.getFullName());
    }

    public String getName(){
        return this.name;
    }

    public String getFullName(){
        return ModProperties.MOD_ID + ":" + this.name;
    }
}
