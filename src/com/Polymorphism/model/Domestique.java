package com.Polymorphism.model;

public class Domestique extends Animal {
	private String owner;

	public Domestique(String name, String color, float height, float lenght, float weight, String owner) {
		super(name, color, height, lenght, weight);
		this.owner = owner;
	}

	public void play() {
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Domestique [owner=" + owner + ", toString()=" + super.toString() + "]";
	}

}
