package net.fabricmc.example

import net.fabricmc.api.ModInitializer

object ExampleMod extends ModInitializer {
    override def onInitialize(): Unit = {
        println("Hello Fabric world!")
    }
}