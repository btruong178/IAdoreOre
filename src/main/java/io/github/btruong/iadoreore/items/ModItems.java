package io.github.btruong.iadoreore.items;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    // Register the Super Stick item object
    public static final Item SUPER_STICK = register(
        ModItemIds.SUPER_STICK, 
        Item::new, 
        new Item.Properties()
    );
    // Register the item with the game.
    public static Item register(ResourceKey<Item> itemKey, 
        Function<Item.Properties, Item> itemFactory, 
        Item.Properties settings) {
            
        // Create the item instance and attach the item key to its settings.
        Item item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }
    // Initialize the items.
    public static void initialize() {}
}
