package com.github.demoninthecloset

import net.fabricmc.api.ModInitializer
import net.minecraft.client.MinecraftClient
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Hand
import net.minecraft.util.Identifier
import net.minecraft.util.TypedActionResult
import net.minecraft.util.registry.Registry
import net.minecraft.world.World

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

class ClipboardItem : Item(Settings().group(ItemGroup.MISC).maxCount(1)) {
    override fun use(world: World?, user: PlayerEntity?, hand: Hand?): TypedActionResult<ItemStack> {
        MinecraftClient.getInstance().openScreen(Screen(Gui()))
        return super.use(world, user, hand)
    }
}