package com.zenyte.game.packet.out;

import com.zenyte.game.packet.GamePacketEncoder;
import com.zenyte.game.world.entity.player.LogLevel;
import com.zenyte.game.world.entity.player.Player;
import com.zenyte.net.game.ServerProt;
import com.zenyte.net.game.packet.GamePacketOut;
import org.jetbrains.annotations.NotNull;

/**
 * @author Tommeh | 28 jul. 2018 | 18:38:19
 * @see <a href="https://www.rune-server.ee/members/tommeh/">Rune-Server profile</a>}
 */
public final class MidiSong implements GamePacketEncoder {
    private final int song;

    @Override
    public void log(@NotNull final Player player) {
        log(player, "Song: " + song);
    }

    public MidiSong(int song) {
        this.song = song;
    }

    @Override
    public LogLevel level() {
        return LogLevel.LOW_PACKET;
    }

    @Override
    public GamePacketOut encode() {
        final GamePacketOut buffer = ServerProt.MIDI_SONG.gamePacketOut();
        buffer.writeShort(song);
        return buffer;
    }

}
