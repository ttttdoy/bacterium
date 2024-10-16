package com.ttttdoy.bacillus

import com.ttttdoy.bacillus.registry.Registry
import dev.architectury.event.events.common.LifecycleEvent

/**
 * Main common side mod object.
 */
object Bacillus {
    /**
     * Mod id for bacterium.
     */
    const val MOD_ID: String = "bacillus"

    /**
     * Main mod initializer.
     */
    @JvmStatic
    fun init() = Registry.registerAll()

    @JvmStatic
    fun initClient() {
        LifecycleEvent.SETUP.register {
//            BlockEntityRendererRegistry.register(ModBlockEntityTypes.BACTERIA_BLOCK_ENTITY.get()) { ctx -> BacteriaBlockRenderer(ctx) }
        }
    }
}
