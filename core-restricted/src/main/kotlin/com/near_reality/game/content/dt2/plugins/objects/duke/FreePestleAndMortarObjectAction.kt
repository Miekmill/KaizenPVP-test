package com.near_reality.game.content.dt2.plugins.objects.duke

import com.near_reality.game.content.dt2.area.DukeSucellusInstance
import com.zenyte.game.item.Item
import com.zenyte.game.item.ItemId
import com.zenyte.game.world.entity.player.Player
import com.zenyte.game.world.`object`.ObjectAction
import com.zenyte.game.world.`object`.WorldObject

class FreePestleAndMortarObjectAction: ObjectAction {
    override fun handleObjectAction(
        player: Player,
        `object`: WorldObject,
        name: String,
        optionId: Int,
        option: String
    ) {
        if(player.mapInstance is DukeSucellusInstance && !(player.mapInstance as DukeSucellusInstance).hasReceivedPestle) {
            player.sendMessage("You retrieve a pestle and mortar from the wall.")
            player.inventory.addOrDrop(Item(ItemId.PESTLE_AND_MORTAR, 1))
            (player.mapInstance as DukeSucellusInstance).hasReceivedPestle = true
        }else {
            player.sendMessage("I probably shouldn't be too greedy!")
        }
    }

    override fun getObjects() = arrayOf(47567)
}