
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftultimate.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecraftultimate.block.BlocpoliuriteBlock;
import net.mcreator.minecraftultimate.MinecraftUltimateNeoforgeMod;

public class MinecraftUltimateNeoforgeModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MinecraftUltimateNeoforgeMod.MODID);
	public static final DeferredHolder<Block, Block> BLOCPOLIURITE = REGISTRY.register("blocpoliurite", BlocpoliuriteBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
