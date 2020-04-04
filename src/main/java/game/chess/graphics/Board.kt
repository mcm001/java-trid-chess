package game.chess.graphics

import com.jme3.asset.AssetManager
import com.jme3.material.Material
import com.jme3.scene.Geometry
import com.jme3.scene.shape.Box
import com.jme3.scene.shape.Quad

val Number.degrees get() = Math.toRadians(toDouble()).toFloat()

object Board {

    lateinit var assetManager: AssetManager

    fun update() {
        geometry.rotate(1.degrees, 0f, 0f)
    }

    val geometry by lazy {
        Geometry("board", Box(1f, 0.1f, 1f)).apply {
            val material = Material(
                assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md"
            )
            this.material = material
        }
    }

}