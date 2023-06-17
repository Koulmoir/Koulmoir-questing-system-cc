package com.Koulmoir.QuestingMod.item;
import com.Koulmoir.QuestingMod.QuestingMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, QuestingMod.MOD_ID);

    public static final RegistryObject<Item> QUESTBOOK = ITEMS.register("questbook",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.QUESTING_TAB)));

    public static final RegistryObject<Item> BOTTLEDSOUL = ITEMS.register("bottled_soul",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.QUESTING_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
