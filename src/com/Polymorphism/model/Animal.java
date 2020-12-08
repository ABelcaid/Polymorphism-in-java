package com.Polymorphism.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	private String name;
	private int age;
	private String gender;
	private String color;
	private float height;
	private float lenght;
	private float weight;

	public Animal(String name, String color, float height, float lenght, float weight) {
		super();
		this.name = name;
		this.color = color;
		this.height = height;
		this.lenght = lenght;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getLenght() {
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", gender=" + gender + ", color=" + color + ", height="
				+ height + ", lenght=" + lenght + ", weight=" + weight + "]";
	}

	public void eat() {
	};

	public void sleep() {
	};

	public void run() {
	};

	public void ReadSound(String paht, String effectSource)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		Path AbsolutePath = FileSystems.getDefault().getPath("").toAbsolutePath();
		String fullPath = AbsolutePath + paht;
		File file = new File(fullPath);

		AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
		System.out.println(effectSource + " sound is start ! ");
		System.out.println("s : " + clip.isActive());
		while (clip.isActive()) {
//System.out.println("hola "+effectSource);
		}
		clip.close();
		System.out.println(effectSource + " sound is end ! ");
	}

}
