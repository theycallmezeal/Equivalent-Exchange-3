package com.pahimar.ee3.block;

import com.pahimar.ee3.item.*;
import com.pahimar.ee3.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockEE chalk = new BlockChalk();
    public static final BlockEE alchemicalFuel = new BlockAlchemicalFuel();
    public static final BlockEE infusedCloth = new BlockInfusedCloth();
    public static final BlockEE infusedWood = new BlockInfusedWood();
    public static final BlockEE infusedPlank = new BlockInfusedPlank();
    public static final BlockEE alchemicalChest = new BlockAlchemicalChest();


    public static void init()
    {
        GameRegistry.registerBlock(chalk, "tile." + Names.Items.CHALK);
        GameRegistry.registerBlock(alchemicalFuel, ItemBlockAlchemicalFuel.class, "tile." + Names.Items.ALCHEMICAL_FUEL);
        GameRegistry.registerBlock(infusedCloth, ItemBlockInfusedCloth.class, "tile." + Names.Blocks.INFUSED_CLOTH);
        GameRegistry.registerBlock(infusedWood, ItemBlockInfusedWood.class, "tile." + Names.Blocks.INFUSED_WOOD);
        GameRegistry.registerBlock(infusedPlank, ItemBlockInfusedPlank.class, "tile." + Names.Blocks.INFUSED_PLANK);
        GameRegistry.registerBlock(alchemicalChest, ItemBlockAlchemicalChest.class, "tile." + Names.Blocks.ALCHEMICAL_CHEST);
    }
}
