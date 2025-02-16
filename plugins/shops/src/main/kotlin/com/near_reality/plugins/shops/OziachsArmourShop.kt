package com.near_reality.plugins.shops

import com.near_reality.scripts.shops.ShopScript
import com.zenyte.game.model.shop.*
import com.zenyte.game.model.shop.ShopPolicy
import com.zenyte.game.model.shop.ShopPolicy.*
import com.zenyte.game.model.shop.ShopCurrency
import com.zenyte.game.model.shop.ShopCurrency.*
import com.zenyte.game.item.ItemId
import com.zenyte.game.item.ItemId.*
import com.near_reality.game.content.universalshop.*
import com.near_reality.game.content.universalshop.UnivShopItem
import com.near_reality.game.content.universalshop.UnivShopItem.*

class OziachsArmourShop : ShopScript() {
    init {
        "Oziach's Armour"(153, ShopCurrency.BLOOD_MONEY, STOCK_ONLY) {
            TORVA_FULLHELM(100, 175000, 350000)
            VIRTUS_MASK(100, 165000, 320000)
            MASORI_MASK(100, 145000, 300000)
            JUSTICIAR_FACEGUARD(100, 15000, 35000)
            ANCESTRAL_HAT(100, 30000, 55000)
            INQUISITORS_GREAT_HELM(100, 7500, 15000)
            CRYSTAL_HELM(100, 35000, 50000)
            NEITIZNOT_FACEGUARD(100, 6000, 12500)
            TORVA_PLATEBODY(100, 200000, 300000)
            VIRTUS_ROBE_TOP(100, 175000, 350000)
            MASORI_BODY(100, 175000, 350000)
            JUSTICIAR_CHESTGUARD(100, 15000, 25000)
            ANCESTRAL_ROBE_TOP(100, 35000, 50000)
            INQUISITORS_HAUBERK(100, 10000, 20000)
            CRYSTAL_BODY(100, 35000, 85000)
            BANDOS_CHESTPLATE(100, 2500, 5000)
            TORVA_PLATELEGS(100, 200000, 300000)
            VIRTUS_ROBE_LEGS(100, 175000, 350000)
            MASORI_CHAPS(100, 175000, 350000)
            JUSTICIAR_LEGGUARDS(100, 15000, 25000)
            ANCESTRAL_ROBE_BOTTOM(100, 35000, 50000)
            INQUISITORS_PLATESKIRT(100, 10000, 20000)
            CRYSTAL_LEGS(100, 35000, 75000)
            BANDOS_TASSETS(100, 2500, 5000)
            PRIMORDIAL_BOOTS(100, 2500, 5000)
            ETERNAL_BOOTS(100, 2500, 5000)
            PEGASIAN_BOOTS(100, 2500, 5000)
            DRAGON_BOOTS(100, 50, 100)
            FIGHTER_TORSO(100, 50, 100)
            DRAGON_DEFENDER(100, 150, 250)
            ELITE_VOID_TOP(100, 4500, 7500)
            ELITE_VOID_ROBE(100, 4500, 7500)
            AMULET_OF_TORTURE(100, 4500, 5000)
            NECKLACE_OF_ANGUISH(100, 4500, 5000)
            AMULET_OF_FURY(100, 250, 500)
            AMULET_OF_BLOOD_FURY(100, 750, 1500)
            VENATOR_RING_28310(100, 17500, 90000)
            BELLATOR_RING_28316(100, 17500, 90000)
            MAGUS_RING_28313(100, 22500, 95000)
            ULTOR_RING_28307(100, 30000, 100000,)
        }
    }
}