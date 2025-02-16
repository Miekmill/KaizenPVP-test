    package com.zenyte.game.world.region.area;

    import com.google.common.eventbus.Subscribe;
    import com.zenyte.game.content.skills.construction.CombatDummyNPC;
    import com.zenyte.game.world.World;
    import com.zenyte.game.world.entity.Location;
    import com.zenyte.game.world.entity.npc.NpcId;
    import com.zenyte.game.world.entity.player.Player;
    import com.zenyte.game.world.entity.player.SkillConstants;
    import com.zenyte.game.world.object.ObjectId;
    import com.zenyte.game.world.object.WorldObject;
    import com.zenyte.game.world.region.PolygonRegionArea;
    import com.zenyte.game.world.region.RSPolygon;
    import com.zenyte.game.world.region.area.plugins.DeathPlugin;
    import com.zenyte.game.world.region.area.plugins.RandomEventRestrictionPlugin;
    import com.zenyte.plugins.events.ServerLaunchEvent;

    /**
     * @author Kris | 02/05/2019 23:00
     * @see <a href="https://www.rune-server.ee/members/kris/">Rune-Server profile</a>
     */
    public class ClanWarsFFAArea extends PolygonRegionArea implements RandomEventRestrictionPlugin, DeathPlugin {

        @Subscribe
        public static void onServerLaunched(ServerLaunchEvent event) {
            World.spawnObject(new WorldObject(ObjectId.BANK_CHEST, 10, 0, new Location(3326, 4753)));
            World.spawnObject(new WorldObject(50081, 10, 0, new Location( 3324, 4754)));
            World.spawnObject(new WorldObject(24911, 10, 0, new Location( 3331, 4754)));
            World.spawnObject(new WorldObject(50082, 10, 0, new Location( 3091, 3485)));
            World.spawnObject(new WorldObject(31617, 10, 0, new Location( 3100, 3499)));
            World.spawnObject(new WorldObject(31617, 10, 0, new Location( 3100, 3498)));
            World.spawnObject(new WorldObject(50084, 10, 0, new Location( 3101, 3501)));
            World.spawnObject(new WorldObject(50085, 10, 0, new Location( 3101, 3495)));
            World.spawnObject(new WorldObject(50087, 10, 0, new Location( 3106, 3495)));
            World.spawnObject(new WorldObject(50089, 10, 0, new Location( 3113, 3498)));
            World.spawnObject(new WorldObject(50090, 10, 0, new Location( 3111, 3501)));
            World.spawnObject(new WorldObject(50093, 10, 0, new Location( 3105, 3503)));
            World.spawnObject(new WorldObject(50094, 10, 0, new Location( 3104, 3494)));
            World.spawnObject(new WorldObject(50095, 10, 0, new Location( 3108, 3501)));
            World.spawnObject(new WorldObject(50096, 10, 0, new Location( 3112, 3495)));
            World.spawnObject(new WorldObject(50081, 10, 0, new Location( 3084, 3484)));
            World.spawnObject(new WorldObject(50081, 10, 0, new Location( 3099, 3515)));
            World.spawnObject(new WorldObject(50092, 10, 0, new Location( 3093, 3509)));
            World.spawnObject(new WorldObject(50055, 10, 0, new Location( 3101, 3504)));
            World.spawnObject(new WorldObject(50056, 10, 0, new Location( 3104, 3504)));
            World.spawnObject(new WorldObject(50057, 10, 0, new Location( 3107, 3504)));
            World.spawnObject(new WorldObject(50058, 10, 0, new Location( 3110, 3504)));
            World.spawnObject(new WorldObject(50059, 10, 0, new Location( 3108, 3494)));
            World.spawnObject(new WorldObject(55000, 10, 0, new Location( 3102, 3485)));
            World.spawnObject(new WorldObject(41724, 10, 3, new Location( 3074, 3500)));
            World.spawnObject(new WorldObject(41728, 10, 0, new Location( 3078, 3495)));
            World.spawnObject(new WorldObject(24911, 10, 0, new Location( 3113, 3513)));
            World.spawnObject(new WorldObject(60000, 10, 2, new Location( 3105, 3508)));
            World.spawnObject(new WorldObject(38426, 10, 0, new Location( 3074, 3480)));
            World.spawnObject(new WorldObject(36582, 10, 1, new Location( 3105, 3506)));
            World.spawnObject(new WorldObject(23135, 10, 1, new Location( 3106, 3499)));
            World.spawnObject(new WorldObject(26645, 10, 1, new Location( 3098, 3486)));
        }
        @Override
        public RSPolygon[] polygons() {
            return new RSPolygon[] {
                    new RSPolygon(new int[][]{
                            { 3264, 4864 },
                            { 3264, 4736 },
                            { 3392, 4736 },
                            { 3392, 4864 }
                    })
            };
        }

        @Override
        public void enter(final Player player) {

        }

        @Override
        public void leave(final Player player, final boolean logout) {
            for (int i = 0; i < SkillConstants.SKILLS.length; i++) {
                if (player.getSkills().getLevel(i) < player.getSkills().getLevelForXp(i)) {
                    player.getSkills().setLevel(i, player.getSkills().getLevelForXp(i));
                }
            }
            player.blockIncomingHits();
            player.getCombatDefinitions().setSpecialEnergy(100);
            player.getVariables().setRunEnergy(100);
            player.getToxins().reset();
            player.getVariables().resetScheduled();
            player.getPrayerManager().deactivateActivePrayers();
            player.resetFreeze();
        }

        @Override
        public String name() {
            return "Clan Wars: FFA";
        }

        @Override
        public boolean isSafe() {
            return true;
        }

        @Override
        public String getDeathInformation() {
            return "Deaths within the free-for-all zone are always safe.";
        }

        @Override
        public Location getRespawnLocation() {
            return new Location(3361, 3156, 0);
        }
    }
