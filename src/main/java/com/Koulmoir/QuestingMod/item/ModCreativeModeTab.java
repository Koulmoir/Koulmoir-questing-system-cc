package com.Koulmoir.QuestingMod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab QUESTING_TAB = new CreativeModeTab("newlifegeneral") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.QUESTBOOK.get());
        }
    };
}
