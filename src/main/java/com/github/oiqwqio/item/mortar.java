package com.github.oiqwqio.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class mortar extends Item {
    public mortar(Settings settings){
        super(settings);
    }

    @Override
    public  void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        tooltip.add(Text.translatable("item.morerealisticproduction.mortar.tooltip"));
    }
}
