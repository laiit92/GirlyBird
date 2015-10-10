package com.international.game.resourceprovider;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.utils.Disposable;

public class ImageProvider implements Disposable {
	
	private static final String GIRLYBIRD_ATLAS = "girlybird_texture.pack";
	
	private static final String BUTTON_LEADER_BOARD = "images/buttonleaderboard";
	private static final String BUTTON_PLAY = "images/buttonplay";
	private static final String BUTTON_RATE = "images/buttonrate";
	private static final String GAME_OVER = "images/gameover";
	private static final String GET_READY = "images/getready";
	private static final String GROUND = "images/ground";
	public static final String MEDALBRONZE = "images/medalbronze";
	public static final String MEDALGOLD = "images/medalgold";
	public static final String MEDALPALATINUM = "images/medalplatinum";
	public static final String MEDALSILVER = "images/medalsilver";
	private static final String NEW_BEST = "images/newbest";
	public static final String PIPE_BOTTOM = "images/pipebottom";
	public static final String PIPE_TOP = "images/pipetop";
	private static final String SCROCE_BOARD = "images/scoreboard";
	private static final String TAPTAP = "images/taptap";
	private static final String TITLE = "images/title";
	private static final String BACKGROUND = "background";
	
	private TextureAtlas atlas;
	
	private Texture background;
	
	public void load() {
		atlas = new TextureAtlas(new FileHandle(GIRLYBIRD_ATLAS));

		background = new Texture(Gdx.files.internal(BACKGROUND));
		
	}
	
	public AtlasRegion getButtonLeaderBoard() {
		return atlas.findRegion(BUTTON_LEADER_BOARD);
	}
	
	public AtlasRegion getButtonPlay() {
		return atlas.findRegion(BUTTON_PLAY);
	}
	
	public AtlasRegion getButtonRate() {
		return atlas.findRegion(BUTTON_RATE);
	}
	
	public AtlasRegion getGameOver() {
		return atlas.findRegion(GAME_OVER);
	}
	
	public AtlasRegion getGetReady() {
		return atlas.findRegion(GET_READY);
	}
	
	public AtlasRegion getGround() {
		return atlas.findRegion(GROUND);
	}
	
	public AtlasRegion getMedal(String type) {
		return atlas.findRegion(type);
	}
	
	public AtlasRegion getNewBest() {
		return atlas.findRegion(NEW_BEST);
	}
	
	public AtlasRegion getPipe(String type) {
		return atlas.findRegion(type);
	}
	
	public AtlasRegion getScoreBoard() {
		return atlas.findRegion(SCROCE_BOARD);
	}
	
	public AtlasRegion getTapTap() {
		return atlas.findRegion(TAPTAP);
	}
	
	public AtlasRegion getTitle() {
		return atlas.findRegion(TITLE);
	}
	
	public Texture getBackground() {
		return background;
	}
	
	@Override
	public void dispose() {
		atlas.dispose();		
	}
}
