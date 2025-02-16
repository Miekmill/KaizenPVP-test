package com.zenyte.game.world.entity.player;

import com.zenyte.game.item.Item;
enum UpgradableItems {


        // Weapon
        W0(UpgradeCategory.WEAPON, 13307, 50, new Item[]{new Item(995,1000000)}),




        // Armour
        A1(UpgradeCategory.ARMOUR, 13307, 50, new Item[]{new Item(995,1000000)}),



        // Jewellery
        J1(UpgradeCategory.JEWELLERY, 13307, 50, new Item[]{new Item(995,1000000)}),


        // Pets



        // OTHER
        M1(UpgradeCategory.MISC, 13307, 50, new Item[]{new Item(995,1000000)}),



        ;

        public transient final UpgradeCategory category;
        public final int id;
        public final int chance;
        public final Item[] required;

        UpgradableItems(UpgradeCategory category, int id, int chance, Item[] required) {
            this.category = category;
            this.id = id;
            this.chance = chance;
            this.required = required;
        }
    }