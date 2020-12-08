package com.Polymorphism.app;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.Polymorphism.model.Animal;
import com.Polymorphism.model.Chat;

public class Test {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub

		Chat chat1 = new Chat("LI", "B&W", 10, 11, 23, "belcaid");
		Animal chat2 = new Chat("LI", "B&W", 10, 11, 23, "belcaid");

//		chat1.ReadSound("\\sound-effects\\chat.wav", "chat");
		chat2.ReadSound("\\sound-effects\\chat.wav", "chat");
	}

}
