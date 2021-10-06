package com.timtaran.technozero.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class Laptop extends Block {
    public Laptop(){
        super(Properties.of(Material.HEAVY_METAL).instabreak());
    }

    @Override
    public ActionResultType use(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_, PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        if(!p_225533_2_.isClientSide) {
            p_225533_4_.sendMessage(new StringTextComponent("Слышь ебанат натрия ноут офнут чел ты..."), null);
            return ActionResultType.SUCCESS;
        }
            return ActionResultType.CONSUME;
    }
}
