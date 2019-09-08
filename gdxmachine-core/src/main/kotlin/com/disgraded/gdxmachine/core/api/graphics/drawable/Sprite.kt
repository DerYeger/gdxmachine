package com.disgraded.gdxmachine.core.api.graphics.drawable

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.disgraded.gdxmachine.core.api.graphics.utils.Color

open class Sprite : Drawable2D {

    private var textureRegion: TextureRegion
    private val colorMap = hashMapOf<Corner, Color>()

    init {
        colorMap[Corner.TOP_LEFT] = Color("#ffffff")
        colorMap[Corner.TOP_RIGHT] = Color("#ffffff")
        colorMap[Corner.BOTTOM_LEFT] = Color("#ffffff")
        colorMap[Corner.BOTTOM_RIGHT] = Color("#ffffff")
    }

    constructor(texture: Texture) {
        textureRegion = TextureRegion(texture)
    }

    constructor(textureRegion: TextureRegion) {
        this.textureRegion = textureRegion
    }

    override fun getType(): String = "sprite"

    fun setTexture(texture: Texture) {
        textureRegion = TextureRegion(texture)
    }

    fun setTexture(textureRegion: TextureRegion) {
        this.textureRegion = textureRegion
    }

    fun getTexture(): TextureRegion {
        return textureRegion
    }

    fun setColor(color: Color) {
        colorMap[Corner.TOP_LEFT] = color
        colorMap[Corner.TOP_RIGHT] = color
        colorMap[Corner.BOTTOM_LEFT] = color
        colorMap[Corner.BOTTOM_RIGHT] = color
    }

    fun setColor(corner: Corner, color: Color) {
        when(corner) {
            Corner.TOP_LEFT -> colorMap[Corner.TOP_LEFT] = color
            Corner.TOP_RIGHT -> colorMap[Corner.TOP_RIGHT] = color
            Corner.BOTTOM_LEFT -> colorMap[Corner.BOTTOM_LEFT] = color
            Corner.BOTTOM_RIGHT -> colorMap[Corner.BOTTOM_RIGHT] = color
        }
    }

    fun getColor(): Color {
        return colorMap[Corner.TOP_LEFT]!!
    }

    fun getColor(corner: Corner): Color {
        return when(corner) {
            Corner.TOP_LEFT -> colorMap[Corner.TOP_LEFT]!!
            Corner.TOP_RIGHT -> colorMap[Corner.TOP_RIGHT]!!
            Corner.BOTTOM_LEFT -> colorMap[Corner.BOTTOM_LEFT]!!
            Corner.BOTTOM_RIGHT -> colorMap[Corner.BOTTOM_RIGHT]!!
        }
    }
}