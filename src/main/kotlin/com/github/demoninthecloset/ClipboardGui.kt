package com.github.demoninthecloset

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription
import io.github.cottonmc.cotton.gui.widget.WBox
import io.github.cottonmc.cotton.gui.widget.WButton
import io.github.cottonmc.cotton.gui.widget.WLabel
import io.github.cottonmc.cotton.gui.widget.WScrollPanel
import io.github.cottonmc.cotton.gui.widget.data.Axis
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment
import io.github.cottonmc.cotton.gui.widget.data.VerticalAlignment
import net.minecraft.text.LiteralText
import net.minecraft.text.TranslatableText

class ClipboardGui : LightweightGuiDescription() {
    private var root = WBox(Axis.VERTICAL)

    init {
        val panel = WScrollPanel(root)
        setRootPanel(panel)
        panel.setSize(256, 192)

        // Title of the window
        val title = WLabel(TranslatableText("item.todolist.clipboard"))

        // List of tasks
        val tasks = mutableListOf(
            WLabel(LiteralText("Task 1")),
            WLabel(LiteralText("Task 2")),
            WLabel(LiteralText("Task 3")),
            WLabel(LiteralText("Task 4"))
        )

        // Button to add new tasks
        val addTaskButton = WButton(TranslatableText("gui.todolist.add_task_button"))
        addTaskButton.setOnClick(this::addTask)

        root.add(title, 240, 20)
        for (label in tasks) root.add(label, 240, 20)
        root.add(addTaskButton, 100, 20)
    }

    private fun addTask() {
        println("Clicked")
    }
}