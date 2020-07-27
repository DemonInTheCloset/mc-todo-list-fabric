package com.github.demoninthecloset

import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class TodoList : ModInitializer {
    private var clipboard = ClipboardItem()

    override fun onInitialize() {
        Registry.register(
            Registry.ITEM,
            Identifier("todolist", "clipboard"),
            clipboard
        )
    }
}