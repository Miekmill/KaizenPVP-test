package com.zenyte.plugins.item;

import com.zenyte.game.world.entity.masks.Animation;
import com.zenyte.game.world.entity.player.Player;

public class Sigil_anim {
	public static void playAttuneAnimation(Player player) {
		Animation attuneAnimation = new Animation(6294); // Je animatie-ID
		int frameDelay = 100; // Oorspronkelijke vertraging tussen frames in milliseconden
		int speedFactor = 2; // Factor waarmee je de snelheid wilt verhogen

		// Verkort de vertraging tussen frames om de animatie te versnellen
		int newFrameDelay = frameDelay / speedFactor;


		player.setAnimation(attuneAnimation); // Zet de animatie voor de speler
	}
}

