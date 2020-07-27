package com.github.demoninthecloset

import net.minecraft.client.MinecraftClient
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

class ClipboardItem : Item(
    Settings().group(ItemGroup.MISC).maxCount(1)) {
    override fun use(world: World?, user: PlayerEntity?, hand: Hand?): TypedActionResult<ItemStack> {
        MinecraftClient.getInstance()
            .openScreen(Screen(Gui()))
        return super.use(world, user, hand)
    }
}