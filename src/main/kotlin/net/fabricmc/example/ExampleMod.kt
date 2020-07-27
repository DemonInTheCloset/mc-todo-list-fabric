package net.fabricmc.example

import net.fabricmc.api.ModInitializer
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

// For support join https://discord.gg/v6v4pMv

@Suppress("unused")
fun init() {
    // This code runs as soon as Minecraft is in a mod-load-ready state.
    // However, some things (like resources) may still be uninitialized.
    // Proceed with mild caution.

    println("Hello Fabric world!")
    TodoList().onInitialize()
}

class TodoList : ModInitializer {
    private var clipboard = ClipboardItem()

    override fun onInitialize() {
        Registry.register(Registry.ITEM, Identifier("todolist", "clipboard"), clipboard)
    }
}

class ClipboardItem : Item(Settings().group(ItemGroup.MISC).maxCount(1))