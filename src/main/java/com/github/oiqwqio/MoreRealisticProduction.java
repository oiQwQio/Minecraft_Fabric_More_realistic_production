package com.github.oiqwqio;

import com.github.oiqwqio.item.*;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreRealisticProduction implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("moreRealisticProduction");

	//注册物品
	public static final mortar i_mortar = Registry.register(
			Registries.ITEM, new Identifier("morerealisticproduction", "mortar"),
			new mortar(new FabricItemSettings().maxCount(1))
	);
	public static final hempRope i_hemp_rope = Registry.register(
			Registries.ITEM, new Identifier("morerealisticproduction", "hemp_rope"),
			new hempRope(new FabricItemSettings())
	);
	public static final hacksawBlades i_hacksaw_blades = Registry.register(
			Registries.ITEM, new Identifier("morerealisticproduction", "hacksaw_blades"),
			new hacksawBlades(new FabricItemSettings())
	);
	public static final flintSawBlades i_flint_saw_blades = Registry.register(
			Registries.ITEM, new Identifier("morerealisticproduction", "flint_saw_blades"),
			new flintSawBlades(new FabricItemSettings())
	);
	public static final pigIronSawBlades i_pig_iron_saw_blades = Registry.register(
			Registries.ITEM, new Identifier("morerealisticproduction", "pig_iron_saw_blades"),
			new pigIronSawBlades(new FabricItemSettings())
	);



	//加入物品堆
	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(i_mortar))
			.displayName(Text.translatable("itemGroup.morerealisticproduction.group_name"))
			.entries((context,entries)->{
				entries.add(i_mortar);
				entries.add(i_hemp_rope);
				entries.add(i_hacksaw_blades);
				entries.add(i_flint_saw_blades);
				entries.add(i_pig_iron_saw_blades);
			}).build();

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		Registry.register(
				Registries.ITEM_GROUP,
				new Identifier("morerealisticproduction", "group_name"),
				ITEM_GROUP
		);
	}
}