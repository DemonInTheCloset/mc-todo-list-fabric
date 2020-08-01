package com.github.demoninthecloset

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription
import io.github.cottonmc.cotton.gui.widget.WGridPanel

class ClipboardGui : LightweightGuiDescription() {
    var root : WGridPanel = WGridPanel()

    init {
        setRootPanel(root)
        root.setSize(300, 200)
    }
}