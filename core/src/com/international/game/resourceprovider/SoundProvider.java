package com.international.game.resourceprovider;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.utils.Disposable;

public class SoundProvider implements Disposable {

	private Sound die, hit, point, swooshing, wing;
	
	public void load() {
		die = Gdx.audio.newSound(Gdx.files.internal("sfx_die.mp3"));
		hit = Gdx.audio.newSound(Gdx.files.internal("sfx_hit.mp3"));
		point = Gdx.audio.newSound(Gdx.files.internal("sfx_point.mp3"));
		swooshing = Gdx.audio.newSound(Gdx.files.internal("sfx_swooshing.mp3"));
		wing = Gdx.audio.newSound(Gdx.files.internal("sfx_wing.mp3"));
	}
	
	public Sound playDieSound() {
		return die;
	}
	
	public Sound playPointSound() {
		return point;
	}
	
	public Sound playHitSound() {
		return hit;
	}
	
	public Sound playSwooshingSound() {
		return swooshing;
	}
	
	public Sound playWingSound() {
		return wing;
	}
	
	@Override
	public void dispose() {
		die.dispose();
		point.dispose();
		hit.dispose();
		swooshing.dispose();
		wing.dispose();
	}

}
