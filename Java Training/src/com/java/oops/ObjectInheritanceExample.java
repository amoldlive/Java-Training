package com.java.oops;

class ABC{
	private String name;
	private String color;
	private String modelId;
	private float avg;
	private boolean isMetal;
	
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

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	@Override
	public String toString() {
		return "ABC [name=" + name + ", color=" + color + ", modelId=" + modelId + ", avg=" + avg + ", isMetal="
				+ isMetal + "]";
	}

	
	
		
}

public class ObjectInheritanceExample {
	public static void main(String[] args) {
			
		ABC object=new ABC();
		object.setName("Rahul");
		System.out.println(object.toString());
	}
}
