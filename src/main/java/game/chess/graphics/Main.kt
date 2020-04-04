package game.chess.graphics

import com.jme3.app.SimpleApplication
import com.jme3.light.PointLight
import com.jme3.material.Material
import com.jme3.math.ColorRGBA
import com.jme3.math.Vector3f
import com.jme3.system.AppSettings


/** Sample 1 - how to get started with the most simple JME 3 application.
 * Display a blue 3D cube and view from all sides by
 * moving the mouse and pressing the WASD keys.  */
class Main : SimpleApplication() {
    override fun simpleInitApp() {
        Board.assetManager = assetManager

        rootNode.attachChild(Board.geometry)

        flyCam.moveSpeed = 10f

        val lampLight = PointLight()
        lampLight.color = ColorRGBA.Yellow
        lampLight.radius = 4f
        lampLight.position = Vector3f(0f, 0f, 0f)
        rootNode.addLight(lampLight)
    }

    override fun simpleUpdate(tpf: Float) {
        Board.update()
    }

}

fun main() {
    val app = Main()
    app.isShowSettings = false
    val settings = AppSettings(true)
    settings.isVSync = true
    app.setSettings(settings)
    app.start() // start the game
}