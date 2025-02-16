package com.near_reality.plugins.shops

import com.near_reality.scripts.shops.ShopScript
import com.zenyte.game.item.ItemId.ABYSSAL_WHIP
import com.zenyte.game.item.ItemId.AHRIMS_ARMOUR_SET
import com.zenyte.game.item.ItemId.AMETHYST_ARROW
import com.zenyte.game.item.ItemId.AMULET_OF_FURY
import com.zenyte.game.item.ItemId.ANCIENT_HALO
import com.zenyte.game.item.ItemId.ANCIENT_MACE
import com.zenyte.game.item.ItemId.ANGLERFISH
import com.zenyte.game.item.ItemId.ANNAKARL_TELEPORT
import com.zenyte.game.item.ItemId.ANTIVENOM4_12913
import com.zenyte.game.item.ItemId.ARMADYL_GODSWORD
import com.zenyte.game.item.ItemId.ARMADYL_HALO
import com.zenyte.game.item.ItemId.BANDOS_HALO
import com.zenyte.game.item.ItemId.BARROWS_GLOVES
import com.zenyte.game.item.ItemId.BASTION_POTION4
import com.zenyte.game.item.ItemId.BLESSED_SPIRIT_SHIELD
import com.zenyte.game.item.ItemId.BLIGHTED_ANCIENT_ICE_SACK
import com.zenyte.game.item.ItemId.BLIGHTED_BIND_SACK
import com.zenyte.game.item.ItemId.BLIGHTED_ENTANGLE_SACK
import com.zenyte.game.item.ItemId.BLIGHTED_SURGE_SACK
import com.zenyte.game.item.ItemId.BLIGHTED_TELEPORT_SPELL_SACK
import com.zenyte.game.item.ItemId.BLIGHTED_VENGEANCE_SACK
import com.zenyte.game.item.ItemId.BLUE_DARK_BOW_PAINT
import com.zenyte.game.item.ItemId.BOLT_RACK
import com.zenyte.game.item.ItemId.BRASSICA_HALO
import com.zenyte.game.item.ItemId.BURNING_AMULET5
import com.zenyte.game.item.ItemId.BURNT_PAGE
import com.zenyte.game.item.ItemId.CARRALLANGAR_TELEPORT
import com.zenyte.game.item.ItemId.COOKED_KARAMBWAN
import com.zenyte.game.item.ItemId.CRYSTAL_SEED
import com.zenyte.game.item.ItemId.DAREEYAK_TELEPORT
import com.zenyte.game.item.ItemId.DHAROKS_ARMOUR_SET
import com.zenyte.game.item.ItemId.DIAMOND_DRAGON_BOLTS_E
import com.zenyte.game.item.ItemId.DRAGONSTONE_DRAGON_BOLTS_E
import com.zenyte.game.item.ItemId.DRAGON_ARROW
import com.zenyte.game.item.ItemId.DRAGON_BOOTS
import com.zenyte.game.item.ItemId.DRAGON_CROSSBOW
import com.zenyte.game.item.ItemId.DRAGON_DART
import com.zenyte.game.item.ItemId.DRAGON_JAVELIN
import com.zenyte.game.item.ItemId.DRAGON_KNIFE
import com.zenyte.game.item.ItemId.DRAGON_THROWNAXE
import com.zenyte.game.item.ItemId.FIGHTER_TORSO
import com.zenyte.game.item.ItemId.FROZEN_WHIP_MIX
import com.zenyte.game.item.ItemId.GHORROCK_TELEPORT
import com.zenyte.game.item.ItemId.ETERNAL_BOOTS
import com.zenyte.game.item.ItemId.ARMADYL_CROSSBOW
import com.zenyte.game.item.ItemId.MORRIGANS_THROWING_AXE
import com.zenyte.game.item.ItemId.GUTHIX_HALO
import com.zenyte.game.item.ItemId.INFINITY_BOOTS
import com.zenyte.game.item.ItemId.MORRIGANS_JAVELIN
import com.zenyte.game.item.ItemId.PRIMORDIAL_BOOTS
import com.zenyte.game.item.ItemId.PEGASIAN_BOOTS
import com.zenyte.game.item.ItemId.NECKLACE_OF_ANGUISH
import com.zenyte.game.item.ItemId.LOOTING_BAG
import com.zenyte.game.item.ItemId.MAGES_BOOK
import com.zenyte.game.item.ItemId.MAGIC_SHORTBOW_SCROLL
import com.zenyte.game.item.ItemId.MASTER_WAND
import com.zenyte.game.item.ItemId.OCCULT_NECKLACE
import com.zenyte.game.item.ItemId.OPAL_DRAGON_BOLTS_E
import com.zenyte.game.item.ItemId.AMULET_OF_TORTURE
import com.zenyte.game.item.ItemId.ABYSSAL_TENTACLE
import com.zenyte.game.item.ItemId.PVP_MYSTERY_BOX
import com.zenyte.game.item.ItemId.REVENANT_CAVE_TELEPORT
import com.zenyte.game.item.ItemId.RING_OF_WEALTH_SCROLL
import com.zenyte.game.item.ItemId.ROYAL_SEED_POD
import com.zenyte.game.item.ItemId.RUBY_DRAGON_BOLTS_E
import com.zenyte.game.item.ItemId.RUNE_POUCH
import com.zenyte.game.item.ItemId.SANFEW_SERUM4
import com.zenyte.game.item.ItemId.SARADOMINS_TEAR
import com.zenyte.game.item.ItemId.SARADOMIN_BREW4
import com.zenyte.game.item.ItemId.SARADOMIN_HALO
import com.zenyte.game.item.ItemId.SCROLL_OF_IMBUING
import com.zenyte.game.item.ItemId.GRANITE_MAUL
import com.zenyte.game.item.ItemId.SEREN_HALO
import com.zenyte.game.item.ItemId.ZAMORAK_GODSWORD
import com.zenyte.game.item.ItemId.SARADOMIN_GODSWORD
import com.zenyte.game.item.ItemId.SUPER_COMBAT_POTION4
import com.zenyte.game.item.ItemId.BANDOS_GODSWORD
import com.zenyte.game.item.ItemId.THREAD_OF_ELIDINIS
import com.zenyte.game.item.ItemId.TOME_OF_FIRE_EMPTY
import com.zenyte.game.item.ItemId.TOXIC_STAFF_UNCHARGED
import com.zenyte.game.item.ItemId.ANCIENT_GODSWORD
import com.zenyte.game.item.ItemId.BLADE_OF_SAELDOR_C
import com.zenyte.game.item.ItemId.DRAGON_CLAWS
import com.zenyte.game.item.ItemId.ELDER_MAUL
import com.zenyte.game.item.ItemId.ELIDINIS_WARD
import com.zenyte.game.item.ItemId.BOW_OF_FAERDHINEN_C
import com.zenyte.game.item.ItemId.ZAMORAK_HALO
import com.zenyte.game.item.ItemId.OSMUMTENS_FANG
import com.zenyte.game.model.shop.ShopCurrency
import com.zenyte.game.model.shop.ShopPolicy.STOCK_ONLY

class BloodMoneyShop : ShopScript() {
    init {
        "Blood money Store"(290, ShopCurrency.BLOOD_MONEY, STOCK_ONLY) {
            PVP_MYSTERY_BOX(100, 10000, 20000, ironmanRestricted = false)
            OSMUMTENS_FANG(100, 25000, 50000, ironmanRestricted = true)
            BOW_OF_FAERDHINEN_C(100, 40000, 75000, ironmanRestricted = true)
            ELIDINIS_WARD(100, 25000, 50000, ironmanRestricted = true)
            ELDER_MAUL(100, 20000, 40000, ironmanRestricted = true)
            DRAGON_CLAWS(100, 15000, 30000, ironmanRestricted = true)
            BLADE_OF_SAELDOR_C(100, 12500, 25000, ironmanRestricted = true)
            TOXIC_STAFF_UNCHARGED(100, 3500, 5000, ironmanRestricted = true)
            ANCIENT_GODSWORD(100, 4000, 8000, ironmanRestricted = true)
            ARMADYL_GODSWORD(100, 1500, 5000, ironmanRestricted = true)
            BANDOS_GODSWORD(100, 500, 1000, ironmanRestricted = true)
            SARADOMIN_GODSWORD(100, 500, 1000, ironmanRestricted = true)
            ZAMORAK_GODSWORD(100, 500, 1000, ironmanRestricted = true)
            GRANITE_MAUL(100, 250, 500, ironmanRestricted = false)
            ABYSSAL_TENTACLE(100, 250, 500, ironmanRestricted = false)
            BLESSED_SPIRIT_SHIELD(100, 0, 200, ironmanRestricted = true)
            32149(100, 100, 200) // larrans booster
            32150(100, 75, 150) // gano booster
            32154(100, 150, 300) // blood money booster
            32166(100, 200, 400) // rev booster
            24187(100, 1300,2000, ironmanRestricted = false)
            MAGES_BOOK(100, 75, 200, ironmanRestricted = false)
            TOME_OF_FIRE_EMPTY(100, 250, 500, ironmanRestricted = true)
            BURNT_PAGE(1000, 1, 3, ironmanRestricted = true)
            OCCULT_NECKLACE(100, 1000, 1500, ironmanRestricted = true)
            AMULET_OF_FURY(100, 250, 500, ironmanRestricted = true)
            AMULET_OF_TORTURE(100, 4000, 8000)
            NECKLACE_OF_ANGUISH(100, 4000, 8000)
            DRAGON_BOOTS(100, 25, 75, ironmanRestricted = true)
            INFINITY_BOOTS(100, 150, 300, ironmanRestricted = false)
            MORRIGANS_THROWING_AXE(10000, 5, 10, ironmanRestricted = true)
            MORRIGANS_JAVELIN(10000, 25, 50, ironmanRestricted = true)
            ARMADYL_CROSSBOW(100, 2000, 3000)
            DRAGON_CROSSBOW(100, 500, 750, ironmanRestricted = true)
            DRAGON_KNIFE(100000, 0, 1, ironmanRestricted = false)
            DRAGON_THROWNAXE(100000, 0, 1, ironmanRestricted = false)
            DRAGON_JAVELIN(100000, 0, 1, ironmanRestricted = false)
            DRAGON_DART(100000, 1, 2, ironmanRestricted = false)
            ANCIENT_MACE(100, 50, 125, ironmanRestricted = true)
            DRAGONSTONE_DRAGON_BOLTS_E(100000, 0,1, ironmanRestricted = false)
            RUBY_DRAGON_BOLTS_E(100000, 0,1, ironmanRestricted = false)
            OPAL_DRAGON_BOLTS_E(100000, 0,1, ironmanRestricted = false)
            DIAMOND_DRAGON_BOLTS_E(100000, 0, 1, ironmanRestricted = false)
            DRAGON_ARROW(100000, 1,2, ironmanRestricted = false)
            AMETHYST_ARROW(100000, 0,1, ironmanRestricted = false)
            BOLT_RACK(100000, 0,1, ironmanRestricted = false)
            RING_OF_WEALTH_SCROLL(100, 75,150, ironmanRestricted = false)
            MAGIC_SHORTBOW_SCROLL(100, 100,200, ironmanRestricted = false)
            LOOTING_BAG(100, 20,40, ironmanRestricted = false)
            ROYAL_SEED_POD(1000, 100,300, ironmanRestricted = false)
            REVENANT_CAVE_TELEPORT(1000, 0,1, ironmanRestricted = false)
            BURNING_AMULET5(100, 0,1, ironmanRestricted = false)
            MASTER_WAND(100, 125,250, ironmanRestricted = false)
            SCROLL_OF_IMBUING(100, 150,300, ironmanRestricted = false)
            SARADOMINS_TEAR(100, 100, 200, ironmanRestricted = false)
            SARADOMIN_HALO(100, 125, 250, ironmanRestricted = false)
            GUTHIX_HALO(100, 125, 250, ironmanRestricted = false)
            ZAMORAK_HALO(100, 125, 250, ironmanRestricted = false)
            ARMADYL_HALO(100, 125, 250, ironmanRestricted = false)
            BANDOS_HALO(100, 125, 250, ironmanRestricted = false)
            SEREN_HALO(100, 125, 250, ironmanRestricted = false)
            ANCIENT_HALO(100, 125, 250, ironmanRestricted = false)
            BRASSICA_HALO(100, 125, 250, ironmanRestricted = false)
            THREAD_OF_ELIDINIS(100, 1750, 2000, ironmanRestricted = true)
            RUNE_POUCH(100, 200,400, ironmanRestricted = false)
            (SUPER_COMBAT_POTION4+1)(1000, 0,2, ironmanRestricted = true)
            (SARADOMIN_BREW4+1)(1000, 0,3, ironmanRestricted = true)
            (SANFEW_SERUM4+1)(1000, 0,2, ironmanRestricted = true)
            (ANTIVENOM4_12913+1)(1000, 0,3, ironmanRestricted = true)
            (BASTION_POTION4+1)(1000, 0,2, ironmanRestricted = true)
            (COOKED_KARAMBWAN+1)(1000, 0,1, ironmanRestricted = true)
            (ANGLERFISH+1)(1000, 0,2, ironmanRestricted = true)
        }
    }
}