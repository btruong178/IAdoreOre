package io.github.btruong.iadoreore.items;

import io.github.btruong.iadoreore.IAdoreOre;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemIds {
    // Create a resource key for the Super Stick item.
    public static final ResourceKey<Item> SUPER_STICK = create("super_stick");
    
    // Create a resource key for an item with the given name.
    public static ResourceKey<Item> create(String name) {
        // Create the item key.
        return ResourceKey.create(Registries.ITEM, IAdoreOre.id(name));
    }
}
