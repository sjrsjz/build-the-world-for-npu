package com.tf.npu.Blocks.G;

import com.tf.npu.Init.ModBlocks;
import com.tf.npu.Init.ModItems;
import com.tf.npu.NPU;
import com.tf.npu.interfaces.IHasModel;
import com.tf.npu.util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class G19 extends Block implements IHasModel{
    public static final AxisAlignedBB G19_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return G19_AABB;
    }
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
public G19(){
    super(Material.ROCK);
    setUnlocalizedName("g19");
    setRegistryName("npu:g19");
    setCreativeTab(NPU.MY_TAB1);
    ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    ModBlocks.BLOCKS.add(this);

}
@Override
    public void registryItemRender(){
    InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
}

}
