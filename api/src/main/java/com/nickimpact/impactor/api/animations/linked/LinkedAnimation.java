package com.nickimpact.impactor.api.animations.linked;

import com.nickimpact.impactor.api.animations.Animation;

import java.util.Queue;

public interface LinkedAnimation {

	Queue<Animation> getAnimations();

	default void add(Animation animation) {
		this.getAnimations().add(animation);
	}

	default Animation peek() {
		return this.getAnimations().peek();
	}

	default Animation poll() {
		return this.getAnimations().poll();
	}
}
