package dev.axedent.pavement.tiles

import java.io.Serializable


interface Tile {
    val sizeLimit: TileSize

    fun render()
    fun getSettings(): Serializable
    fun setSettings(settings: Serializable)



    data class TileSize(
        val minWidth: Int,
        val maxWidth: Int,
        val minHeight: Int,
        val maxHeight: Int,
    )
}
