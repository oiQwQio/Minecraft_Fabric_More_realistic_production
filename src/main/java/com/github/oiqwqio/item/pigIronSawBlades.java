package com.github.oiqwqio.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class pigIronSawBlades extends Item {
    public pigIronSawBlades(Settings settings){
        super(settings);
    }

    @Override
    public  void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        tooltip.add(Text.translatable("item.morerealisticproduction.pig_iron_saw_blades.tooltip"));
    }
}
