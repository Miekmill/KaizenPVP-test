package com.zenyte.game.packet.out;

import com.zenyte.game.packet.GamePacketEncoder;
import com.zenyte.game.world.entity.player.LogLevel;
import com.zenyte.game.world.entity.player.Player;
import com.zenyte.net.game.ServerProt;
import com.zenyte.net.game.packet.GamePacketOut;
import org.jetbrains.annotations.NotNull;

/**
 * @author Tommeh | 28 jul. 2018 | 18:06:14
 * @see <a href="https://www.rune-server.ee/members/tommeh/">Rune-Server profile</a>}
 */
public final class CamReset implements GamePacketEncoder {

	@Override
	public void log(@NotNull final Player player) {
		log(player, "");
	}

	@Override
	public GamePacketOut encode() {
		return ServerProt.CAM_RESET.gamePacketOut();
	}

	@Override
	public LogLevel level() {
		return LogLevel.HIGH_PACKET;
	}

}
