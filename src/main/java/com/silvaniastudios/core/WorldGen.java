package com.silvaniastudios.core;

import java.util.Arrays;
import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;

import com.silvaniastudios.core.blocks.BlockOre1;
import com.silvaniastudios.core.blocks.BlockOre2;
import com.silvaniastudios.core.config.AluminiumConfig;
import com.silvaniastudios.core.config.AmethystConfig;
import com.silvaniastudios.core.config.BlackstoneConfig;
import com.silvaniastudios.core.config.BluestoneConfig;
import com.silvaniastudios.core.config.ChromiumConfig;
import com.silvaniastudios.core.config.CobaltConfig;
import com.silvaniastudios.core.config.CopperConfig;
import com.silvaniastudios.core.config.CrystalConfig;
import com.silvaniastudios.core.config.DragiteConfig;
import com.silvaniastudios.core.config.FlariteConfig;
import com.silvaniastudios.core.config.FureniumConfig;
import com.silvaniastudios.core.config.LeadConfig;
import com.silvaniastudios.core.config.LithiumConfig;
import com.silvaniastudios.core.config.MagnesiumConfig;
import com.silvaniastudios.core.config.MerciliteConfig;
import com.silvaniastudios.core.config.MythianConfig;
import com.silvaniastudios.core.config.NickelConfig;
import com.silvaniastudios.core.config.PhosphorusConfig;
import com.silvaniastudios.core.config.PlatinumConfig;
import com.silvaniastudios.core.config.PlutoniumConfig;
import com.silvaniastudios.core.config.PurplestoneConfig;
import com.silvaniastudios.core.config.RubyConfig;
import com.silvaniastudios.core.config.SapphireConfig;
import com.silvaniastudios.core.config.SiliconConfig;
import com.silvaniastudios.core.config.SilvaniteConfig;
import com.silvaniastudios.core.config.SilverConfig;
import com.silvaniastudios.core.config.SulfurConfig;
import com.silvaniastudios.core.config.TinConfig;
import com.silvaniastudios.core.config.TitaniumConfig;
import com.silvaniastudios.core.config.TungstenConfig;
import com.silvaniastudios.core.config.UraniumConfig;
import com.silvaniastudios.core.config.VanillaCoalConfig;
import com.silvaniastudios.core.config.VanillaDiamondConfig;
import com.silvaniastudios.core.config.VanillaEmeraldConfig;
import com.silvaniastudios.core.config.VanillaGoldConfig;
import com.silvaniastudios.core.config.VanillaIronConfig;
import com.silvaniastudios.core.config.VanillaLapisLazuliConfig;
import com.silvaniastudios.core.config.VanillaNetherQuartzConfig;
import com.silvaniastudios.core.config.VanillaRedstoneConfig;
import com.silvaniastudios.core.config.ZincConfig;
import com.silvaniastudios.core.config._COreConfig;
import com.silvaniastudios.core.enums.EnumMaterialGen;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	WorldGenMinable copper;
	WorldGenMinable tin;
	WorldGenMinable zinc;
	WorldGenMinable nickel;
	WorldGenMinable silver;
	WorldGenMinable aluminium;
	WorldGenMinable titanium;
	WorldGenMinable chromium;
	WorldGenMinable silicon;
	WorldGenMinable cobalt;
	WorldGenMinable tungsten;
	WorldGenMinable lead;
	WorldGenMinable platinum;
	WorldGenMinable lithium;
	WorldGenMinable uranium;
	WorldGenMinable plutonium;
	
	WorldGenMinable ruby;
	WorldGenMinable sapphire;
	WorldGenMinable amethyst;
	WorldGenMinable crystal;
	WorldGenMinable magnesium;
	WorldGenMinable phosphorus;
	WorldGenMinable sulfur;
	WorldGenMinable silvanite;
	WorldGenMinable mercilite;
	WorldGenMinable mythian;
	WorldGenMinable dragite;
	WorldGenMinable flarite;
	WorldGenMinable furenium;
	WorldGenMinable blackstone;
	WorldGenMinable bluestone;
	WorldGenMinable purplestone;
	
	WorldGenMinable limestone;
	WorldGenMinable calcite;
	WorldGenMinable graphite;
	
	WorldGenMinable coal;
	WorldGenMinable iron;
	WorldGenMinable gold;
	WorldGenMinable diamond;
	WorldGenMinable lapis;
	WorldGenMinable redstone;
	WorldGenMinable emerald;
	WorldGenMinable quartz;
		
	BlockOre1 blockSet1 = ModBlocks.blockOre1;
	BlockOre2 blockSet2 = ModBlocks.blockOre2;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOres(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
	}
	
	private void generateOres(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		int dim = world.provider.getDimension();
		int copperVar = CopperConfig.worldgen.minVeinSize + random.nextInt(CopperConfig.worldgen.maxVeinSize-CopperConfig.worldgen.minVeinSize);
		int tinVar = TinConfig.worldgen.minVeinSize + random.nextInt(TinConfig.worldgen.maxVeinSize-TinConfig.worldgen.minVeinSize);
		int zincVar = ZincConfig.worldgen.minVeinSize + random.nextInt(ZincConfig.worldgen.maxVeinSize-ZincConfig.worldgen.minVeinSize);
		int nickelVar = NickelConfig.worldgen.minVeinSize + random.nextInt(NickelConfig.worldgen.maxVeinSize-NickelConfig.worldgen.minVeinSize);
		int silverVar = SilverConfig.worldgen.minVeinSize + random.nextInt(SilverConfig.worldgen.maxVeinSize-SilverConfig.worldgen.minVeinSize);
		int aluminiumVar = AluminiumConfig.worldgen.minVeinSize + random.nextInt(AluminiumConfig.worldgen.maxVeinSize-AluminiumConfig.worldgen.minVeinSize);
		int titaniumVar = TitaniumConfig.worldgen.minVeinSize + random.nextInt(TitaniumConfig.worldgen.maxVeinSize-TitaniumConfig.worldgen.minVeinSize);
		int chromiumVar = ChromiumConfig.worldgen.minVeinSize + random.nextInt(ChromiumConfig.worldgen.maxVeinSize-ChromiumConfig.worldgen.minVeinSize);
		int siliconVar = SiliconConfig.worldgen.minVeinSize + random.nextInt(SiliconConfig.worldgen.maxVeinSize-SiliconConfig.worldgen.minVeinSize);
		int cobaltVar = CobaltConfig.worldgen.minVeinSize + random.nextInt(CobaltConfig.worldgen.maxVeinSize-CobaltConfig.worldgen.minVeinSize);
		int tungstenVar = TungstenConfig.worldgen.minVeinSize + random.nextInt(TungstenConfig.worldgen.maxVeinSize-TungstenConfig.worldgen.minVeinSize);
		int leadVar = LeadConfig.worldgen.minVeinSize + random.nextInt(LeadConfig.worldgen.maxVeinSize-LeadConfig.worldgen.minVeinSize);
		int platinumVar = PlatinumConfig.worldgen.minVeinSize + random.nextInt(PlatinumConfig.worldgen.maxVeinSize-PlatinumConfig.worldgen.minVeinSize);
		int lithiumVar = LithiumConfig.worldgen.minVeinSize + random.nextInt(LithiumConfig.worldgen.maxVeinSize-LithiumConfig.worldgen.minVeinSize);
		int uraniumVar = UraniumConfig.worldgen.minVeinSize + random.nextInt(UraniumConfig.worldgen.maxVeinSize-UraniumConfig.worldgen.minVeinSize);
		int plutoniumVar = PlutoniumConfig.worldgen.minVeinSize + random.nextInt(PlutoniumConfig.worldgen.maxVeinSize-PlutoniumConfig.worldgen.minVeinSize);
		
		int rubyVar = RubyConfig.worldgen.minVeinSize + random.nextInt(RubyConfig.worldgen.maxVeinSize-RubyConfig.worldgen.minVeinSize);
		int sapphireVar = SapphireConfig.worldgen.minVeinSize + random.nextInt(SapphireConfig.worldgen.maxVeinSize-SapphireConfig.worldgen.minVeinSize);
		int amethystVar = AmethystConfig.worldgen.minVeinSize + random.nextInt(AmethystConfig.worldgen.maxVeinSize-AmethystConfig.worldgen.minVeinSize);
		int crystalVar = CrystalConfig.worldgen.minVeinSize + random.nextInt(CrystalConfig.worldgen.maxVeinSize-CrystalConfig.worldgen.minVeinSize);
		int magnesiumVar = MagnesiumConfig.worldgen.minVeinSize + random.nextInt(MagnesiumConfig.worldgen.maxVeinSize-MagnesiumConfig.worldgen.minVeinSize);
		int phosphorusVar = PhosphorusConfig.worldgen.minVeinSize + random.nextInt(PhosphorusConfig.worldgen.maxVeinSize-PhosphorusConfig.worldgen.minVeinSize);
		int sulfurVar = SulfurConfig.worldgen.minVeinSize + random.nextInt(SulfurConfig.worldgen.maxVeinSize-SulfurConfig.worldgen.minVeinSize);
		int silvaniteVar = SilvaniteConfig.worldgen.minVeinSize + random.nextInt(SilvaniteConfig.worldgen.maxVeinSize-SilvaniteConfig.worldgen.minVeinSize);
		int merciliteVar = MerciliteConfig.worldgen.minVeinSize + random.nextInt(MerciliteConfig.worldgen.maxVeinSize-MerciliteConfig.worldgen.minVeinSize);
		int mythianVar = MythianConfig.worldgen.minVeinSize + random.nextInt(MythianConfig.worldgen.maxVeinSize-MythianConfig.worldgen.minVeinSize);
		int dragiteVar = DragiteConfig.worldgen.minVeinSize + random.nextInt(DragiteConfig.worldgen.maxVeinSize-DragiteConfig.worldgen.minVeinSize);
		int flariteVar = FlariteConfig.worldgen.minVeinSize + random.nextInt(FlariteConfig.worldgen.maxVeinSize-FlariteConfig.worldgen.minVeinSize);
		int fureniumVar = FureniumConfig.worldgen.minVeinSize + random.nextInt(FureniumConfig.worldgen.maxVeinSize-FureniumConfig.worldgen.minVeinSize);
		int blackstoneVar = BlackstoneConfig.worldgen.minVeinSize + random.nextInt(BlackstoneConfig.worldgen.maxVeinSize-BlackstoneConfig.worldgen.minVeinSize);
		int bluestoneVar = BluestoneConfig.worldgen.minVeinSize + random.nextInt(BluestoneConfig.worldgen.maxVeinSize-BluestoneConfig.worldgen.minVeinSize);
		int purplestoneVar = PurplestoneConfig.worldgen.minVeinSize + random.nextInt(PurplestoneConfig.worldgen.maxVeinSize-PurplestoneConfig.worldgen.minVeinSize);

		copper = new WorldGenMinable(blockSet1.getStateFromMeta(0), copperVar);
		tin = new WorldGenMinable(blockSet1.getStateFromMeta(1), tinVar);
		zinc = new WorldGenMinable(blockSet1.getStateFromMeta(2), zincVar);
		nickel = new WorldGenMinable(blockSet1.getStateFromMeta(3), nickelVar);
		silver = new WorldGenMinable(blockSet1.getStateFromMeta(4), silverVar);
		aluminium = new WorldGenMinable(blockSet1.getStateFromMeta(5), aluminiumVar);
		titanium = new WorldGenMinable(blockSet1.getStateFromMeta(6), titaniumVar);
		chromium = new WorldGenMinable(blockSet1.getStateFromMeta(7), chromiumVar);
		silicon = new WorldGenMinable(blockSet1.getStateFromMeta(8), siliconVar);
		cobalt = new WorldGenMinable(blockSet1.getStateFromMeta(9), cobaltVar);
		tungsten = new WorldGenMinable(blockSet1.getStateFromMeta(10), tungstenVar);
		lead = new WorldGenMinable(blockSet1.getStateFromMeta(11), leadVar);
		platinum = new WorldGenMinable(blockSet1.getStateFromMeta(12), platinumVar);
		lithium = new WorldGenMinable(blockSet1.getStateFromMeta(13), lithiumVar);
		uranium = new WorldGenMinable(blockSet1.getStateFromMeta(14), uraniumVar);
		plutonium = new WorldGenMinable(blockSet1.getStateFromMeta(15), plutoniumVar);
		
		ruby = new WorldGenMinable(blockSet2.getStateFromMeta(0), rubyVar);
		sapphire = new WorldGenMinable(blockSet2.getStateFromMeta(1), sapphireVar);
		amethyst = new WorldGenMinable(blockSet2.getStateFromMeta(2), amethystVar);
		crystal = new WorldGenMinable(blockSet2.getStateFromMeta(3), crystalVar);
		magnesium = new WorldGenMinable(blockSet2.getStateFromMeta(4), magnesiumVar);
		phosphorus = new WorldGenMinable(blockSet2.getStateFromMeta(5), phosphorusVar);
		sulfur = new WorldGenMinable(blockSet2.getStateFromMeta(6), sulfurVar);
		silvanite = new WorldGenMinable(blockSet2.getStateFromMeta(7), silvaniteVar);
		mercilite = new WorldGenMinable(blockSet2.getStateFromMeta(8), merciliteVar);
		mythian = new WorldGenMinable(blockSet2.getStateFromMeta(9), mythianVar);
		dragite = new WorldGenMinable(blockSet2.getStateFromMeta(10), dragiteVar);
		flarite = new WorldGenMinable(blockSet2.getStateFromMeta(11), flariteVar);
		furenium = new WorldGenMinable(blockSet2.getStateFromMeta(12), fureniumVar);
		blackstone = new WorldGenMinable(blockSet2.getStateFromMeta(13), blackstoneVar);
		bluestone = new WorldGenMinable(blockSet2.getStateFromMeta(14), bluestoneVar);
		purplestone = new WorldGenMinable(blockSet2.getStateFromMeta(15), purplestoneVar);
		
		int coalVar = VanillaCoalConfig.worldgen.minVeinSize + random.nextInt(VanillaCoalConfig.worldgen.maxVeinSize-VanillaCoalConfig.worldgen.minVeinSize);
		int ironVar = VanillaIronConfig.worldgen.minVeinSize + random.nextInt(VanillaIronConfig.worldgen.maxVeinSize-VanillaIronConfig.worldgen.minVeinSize);
		int goldVar = VanillaGoldConfig.worldgen.minVeinSize + random.nextInt(VanillaGoldConfig.worldgen.maxVeinSize-VanillaGoldConfig.worldgen.minVeinSize);
		int diamondVar = VanillaDiamondConfig.worldgen.minVeinSize + random.nextInt(VanillaDiamondConfig.worldgen.maxVeinSize-VanillaDiamondConfig.worldgen.minVeinSize);
		int lapisVar = VanillaLapisLazuliConfig.worldgen.minVeinSize + random.nextInt(VanillaLapisLazuliConfig.worldgen.maxVeinSize-VanillaLapisLazuliConfig.worldgen.minVeinSize);
		int redstoneVar = VanillaRedstoneConfig.worldgen.minVeinSize + random.nextInt(VanillaRedstoneConfig.worldgen.maxVeinSize-VanillaRedstoneConfig.worldgen.minVeinSize);
		int emeraldVar = VanillaEmeraldConfig.worldgen.minVeinSize + random.nextInt(VanillaEmeraldConfig.worldgen.maxVeinSize-VanillaEmeraldConfig.worldgen.minVeinSize);
		int quartzVar = VanillaNetherQuartzConfig.worldgen.minVeinSize + random.nextInt(VanillaNetherQuartzConfig.worldgen.maxVeinSize-VanillaNetherQuartzConfig.worldgen.minVeinSize);
		
		coal = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(), coalVar);
		iron = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), ironVar);
		gold = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), goldVar);
		diamond = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(), diamondVar);
		lapis = new WorldGenMinable(Blocks.LAPIS_ORE.getDefaultState(), lapisVar);
		redstone = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(), redstoneVar);
		emerald = new WorldGenMinable(Blocks.EMERALD_ORE.getDefaultState(), emeraldVar);
		quartz = new WorldGenMinable(Blocks.QUARTZ_ORE.getDefaultState(), quartzVar);
		
		if (!ArrayUtils.contains(CopperConfig.worldgen.blacklistedDimensions, dim) && CopperConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.copper, copper, copperVar, world, random, chunkX * 16, chunkZ * 16, CopperConfig.worldgen.restrictBiomes, CopperConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(TinConfig.worldgen.blacklistedDimensions, dim) && TinConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.tin, tin, tinVar, world, random, chunkX * 16, chunkZ * 16, TinConfig.worldgen.restrictBiomes, TinConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(ZincConfig.worldgen.blacklistedDimensions, dim) && ZincConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.zinc, zinc, zincVar, world, random, chunkX * 16, chunkZ * 16, ZincConfig.worldgen.restrictBiomes, ZincConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(NickelConfig.worldgen.blacklistedDimensions, dim) && NickelConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.nickel, nickel, nickelVar, world, random, chunkX * 16, chunkZ * 16, NickelConfig.worldgen.restrictBiomes, NickelConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(SilverConfig.worldgen.blacklistedDimensions, dim) && SilverConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.silver, silver, silverVar, world, random, chunkX * 16, chunkZ * 16, SilverConfig.worldgen.restrictBiomes, SilverConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(AluminiumConfig.worldgen.blacklistedDimensions, dim) && AluminiumConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.aluminium, aluminium, aluminiumVar, world, random, chunkX * 16, chunkZ * 16, AluminiumConfig.worldgen.restrictBiomes, AluminiumConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(TitaniumConfig.worldgen.blacklistedDimensions, dim) && TitaniumConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.titanium, titanium, titaniumVar, world, random, chunkX * 16, chunkZ * 16, TitaniumConfig.worldgen.restrictBiomes, TitaniumConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(ChromiumConfig.worldgen.blacklistedDimensions, dim) && ChromiumConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.chromium, chromium, chromiumVar, world, random, chunkX * 16, chunkZ * 16, ChromiumConfig.worldgen.restrictBiomes, ChromiumConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(SiliconConfig.worldgen.blacklistedDimensions, dim) && SiliconConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.silicon, silicon, siliconVar, world, random, chunkX * 16, chunkZ * 16, SiliconConfig.worldgen.restrictBiomes, SiliconConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(CobaltConfig.worldgen.blacklistedDimensions, dim) && CobaltConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.cobalt, cobalt, cobaltVar, world, random, chunkX * 16, chunkZ * 16, CobaltConfig.worldgen.restrictBiomes, CobaltConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(TungstenConfig.worldgen.blacklistedDimensions, dim) && TungstenConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.tungsten, tungsten, tungstenVar, world, random, chunkX * 16, chunkZ * 16, TungstenConfig.worldgen.restrictBiomes, TungstenConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(LeadConfig.worldgen.blacklistedDimensions, dim) && LeadConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.lead, lead, leadVar, world, random, chunkX * 16, chunkZ * 16, LeadConfig.worldgen.restrictBiomes, LeadConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(PlatinumConfig.worldgen.blacklistedDimensions, dim) && PlatinumConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.platinum, platinum, platinumVar, world, random, chunkX * 16, chunkZ * 16, PlatinumConfig.worldgen.restrictBiomes, PlatinumConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(LithiumConfig.worldgen.blacklistedDimensions, dim) && LithiumConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.lithium, lithium, lithiumVar, world, random, chunkX * 16, chunkZ * 16, LithiumConfig.worldgen.restrictBiomes, LithiumConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(UraniumConfig.worldgen.blacklistedDimensions, dim) && UraniumConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.uranium, uranium, uraniumVar, world, random, chunkX * 16, chunkZ * 16, UraniumConfig.worldgen.restrictBiomes, UraniumConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(PlutoniumConfig.worldgen.blacklistedDimensions, dim) && PlutoniumConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.plutonium, plutonium, plutoniumVar, world, random, chunkX * 16, chunkZ * 16, PlutoniumConfig.worldgen.restrictBiomes, PlutoniumConfig.worldgen.allowedBiomes); }
		
		if (!ArrayUtils.contains(RubyConfig.worldgen.blacklistedDimensions, dim) && RubyConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.ruby, ruby, rubyVar, world, random, chunkX * 16, chunkZ * 16, RubyConfig.worldgen.restrictBiomes, RubyConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(SapphireConfig.worldgen.blacklistedDimensions, dim) && SapphireConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.sapphire, sapphire, sapphireVar, world, random, chunkX * 16, chunkZ * 16, SapphireConfig.worldgen.restrictBiomes, SapphireConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(AmethystConfig.worldgen.blacklistedDimensions, dim) && AmethystConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.amethyst, amethyst, amethystVar, world, random, chunkX * 16, chunkZ * 16, AmethystConfig.worldgen.restrictBiomes, AmethystConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(CrystalConfig.worldgen.blacklistedDimensions, dim) && CrystalConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.crystal, crystal, crystalVar, world, random, chunkX * 16, chunkZ * 16, CrystalConfig.worldgen.restrictBiomes, CrystalConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(MagnesiumConfig.worldgen.blacklistedDimensions, dim) && MagnesiumConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.magnesium, magnesium, magnesiumVar, world, random, chunkX * 16, chunkZ * 16, MagnesiumConfig.worldgen.restrictBiomes, MagnesiumConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(PhosphorusConfig.worldgen.blacklistedDimensions, dim) && PhosphorusConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.phosphorus, phosphorus, phosphorusVar, world, random, chunkX * 16, chunkZ * 16, PhosphorusConfig.worldgen.restrictBiomes, PhosphorusConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(SulfurConfig.worldgen.blacklistedDimensions, dim) && SulfurConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.sulfur, sulfur, sulfurVar, world, random, chunkX * 16, chunkZ * 16, SulfurConfig.worldgen.restrictBiomes, SulfurConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(SilvaniteConfig.worldgen.blacklistedDimensions, dim) && SilvaniteConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.silvanite, silvanite, silvaniteVar, world, random, chunkX * 16, chunkZ * 16, SilvaniteConfig.worldgen.restrictBiomes, SilvaniteConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(MerciliteConfig.worldgen.blacklistedDimensions, dim) && MerciliteConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.mercilite, mercilite, merciliteVar, world, random, chunkX * 16, chunkZ * 16, MerciliteConfig.worldgen.restrictBiomes, MerciliteConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(MythianConfig.worldgen.blacklistedDimensions, dim) && MythianConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.mythian, mythian, mythianVar, world, random, chunkX * 16, chunkZ * 16, MythianConfig.worldgen.restrictBiomes, MythianConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(DragiteConfig.worldgen.blacklistedDimensions, dim) && DragiteConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.dragite, dragite, dragiteVar, world, random, chunkX * 16, chunkZ * 16, DragiteConfig.worldgen.restrictBiomes, DragiteConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(FlariteConfig.worldgen.blacklistedDimensions, dim) && FlariteConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.flarite, flarite, flariteVar, world, random, chunkX * 16, chunkZ * 16, FlariteConfig.worldgen.restrictBiomes, FlariteConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(FureniumConfig.worldgen.blacklistedDimensions, dim) && FureniumConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.furenium, furenium, fureniumVar, world, random, chunkX * 16, chunkZ * 16, FureniumConfig.worldgen.restrictBiomes, FureniumConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(BlackstoneConfig.worldgen.blacklistedDimensions, dim) && BlackstoneConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.blackstone, blackstone, blackstoneVar, world, random, chunkX * 16, chunkZ * 16, BlackstoneConfig.worldgen.restrictBiomes, BlackstoneConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(BluestoneConfig.worldgen.blacklistedDimensions, dim) && BluestoneConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.bluestone, bluestone, bluestoneVar, world, random, chunkX * 16, chunkZ * 16, BluestoneConfig.worldgen.restrictBiomes, BluestoneConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(PurplestoneConfig.worldgen.blacklistedDimensions, dim) && PurplestoneConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.purplestone, purplestone, purplestoneVar, world, random, chunkX * 16, chunkZ * 16, PurplestoneConfig.worldgen.restrictBiomes, PurplestoneConfig.worldgen.allowedBiomes); }
	
		if (!ArrayUtils.contains(VanillaCoalConfig.worldgen.blacklistedDimensions, dim) && VanillaCoalConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.coal, coal, coalVar, world, random, chunkX * 16, chunkZ * 16, VanillaCoalConfig.worldgen.restrictBiomes, VanillaCoalConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(VanillaIronConfig.worldgen.blacklistedDimensions, dim) && VanillaIronConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.iron, iron, ironVar, world, random, chunkX * 16, chunkZ * 16, VanillaIronConfig.worldgen.restrictBiomes, VanillaIronConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(VanillaGoldConfig.worldgen.blacklistedDimensions, dim) && VanillaGoldConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.gold, gold, goldVar, world, random, chunkX * 16, chunkZ * 16, VanillaGoldConfig.worldgen.restrictBiomes, VanillaGoldConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(VanillaDiamondConfig.worldgen.blacklistedDimensions, dim) && VanillaDiamondConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.diamond, diamond, diamondVar, world, random, chunkX * 16, chunkZ * 16, VanillaDiamondConfig.worldgen.restrictBiomes, VanillaDiamondConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(VanillaLapisLazuliConfig.worldgen.blacklistedDimensions, dim) && VanillaLapisLazuliConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.lapis, lapis, lapisVar, world, random, chunkX * 16, chunkZ * 16, VanillaLapisLazuliConfig.worldgen.restrictBiomes, VanillaLapisLazuliConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(VanillaRedstoneConfig.worldgen.blacklistedDimensions, dim) && VanillaRedstoneConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.redstone, redstone, redstoneVar, world, random, chunkX * 16, chunkZ * 16, VanillaRedstoneConfig.worldgen.restrictBiomes, VanillaRedstoneConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(VanillaEmeraldConfig.worldgen.blacklistedDimensions, dim) && VanillaEmeraldConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.emerald, emerald, emeraldVar, world, random, chunkX * 16, chunkZ * 16, VanillaEmeraldConfig.worldgen.restrictBiomes, VanillaEmeraldConfig.worldgen.allowedBiomes); }
		if (!ArrayUtils.contains(VanillaNetherQuartzConfig.worldgen.blacklistedDimensions, dim) && VanillaNetherQuartzConfig.worldgen.worldGenEnabled) { addOreSpawn(EnumMaterialGen.quartz, quartz, quartzVar, world, random, chunkX * 16, chunkZ * 16, VanillaNetherQuartzConfig.worldgen.restrictBiomes, VanillaNetherQuartzConfig.worldgen.allowedBiomes); }
	}
		
	private void addOreSpawn(EnumMaterialGen ore, WorldGenMinable wgm, int veinSize, World world, Random random, int x, int z, boolean biomeRestrict, String[] allowedBiomes) {
		double modifier = 1.0;
		int dim = world.provider.getDimension();
		
		int vpc = ore.vpc();
		int minY = ore.minHeight();
		int maxY = ore.maxHeight();
		//TODO int chance = ore.veinChance();
		
		if (Arrays.asList(_COreConfig.genModifiers.dimension_list).contains(dim)) {
			int index = Arrays.asList(_COreConfig.genModifiers.dimension_list).indexOf(dim);
			modifier = _COreConfig.genModifiers.dimension_modifier[index];
			vpc = (int) Math.round(vpc*modifier);
			if (vpc <= 0) { vpc = 1; }
			if (vpc >= 64) { vpc = 64; }
			if (_COreConfig.genModifiers.dimension_fullheight[index]) {
				minY = 0;
				maxY = 255;
			}
		}
		
		int rangeY = maxY - minY;
		for (int i = 0; i < vpc; i++) {
			int genX = x + random.nextInt(16);
			int genY = minY + random.nextInt(rangeY);
			int genZ = z + random.nextInt(16);
			
			COre.debug(3, "adding " + veinSize + "x " + ore.name() + " at " + genX + ", " + genY + ", " + genZ + " (should be " + vpc + " veins per chunk)");
			BlockPos pos = new BlockPos(genX, genY, genZ);
			wgm.generate(world, random, pos);
		}
		/*assert (maxY > minY) : "The maximum Y must be greater than the Minimum Y";
	    assert (minY > 0) : "addOreSpawn: The Minimum Y must be greater than 0";
	    assert ((maxY < 256) && (maxY > 0)) : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
	    assert ((chance <= 100) && (chance >= 0)) : "addOreSpawn: The Chance must be between 0 and 100";
	    
		int rangeY = maxY - minY;
		int rnd = random.nextInt(100);
		
		if (wgm.equals(copper)) { COre.debug("TRYING TO ADD ORE SPAWN TO WORLD! RNG number: " + rnd + ", ORE CHANCE: " + chance); }
		
		if (biomeRestrict) {
			if (wgm.equals(copper)) { COre.debug("We are restricting biomes for this ore."); }
			int biome = Biome.getIdForBiome(world.getBiome(new BlockPos(x, 60, z)));
			for (int j = 0; j < allowedBiomes.length; j++) {
				if (biome != CoreUtils.biomeNameToID(allowedBiomes[j])) {
					if (wgm.equals(copper)) { COre.debug("The current biome isn't on the allowed biome list. Cancel it all!"); }
					return;
				} else { 
					if (wgm.equals(copper)) { COre.debug("It's ok, this is the right biome. I'll let you spawn."); }
				}
			}
		}

		COre.debug("Chance success! Adding ore spawn. Time to iterate!");
		for (int i = 0; i < vpc; i++) {
			if (wgm.equals(copper)) { COre.debug("ITERATING: " + i + " of " + vpc + "."); }

			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(rangeY), z + random.nextInt(16));
			
			wgm.generate(world, random, pos);
			
			if (wgm.equals(copper)) { COre.debug("Success! Generated an ore somewhere near " + x + ", " + z); }
		}*/
	}
}
