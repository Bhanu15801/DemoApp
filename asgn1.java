package Bhanu;

public class asgn1 {

	 protected int length_size, width_size, depth_size;
	 protected String colour, model;

	 /**
	  * @param length_size
	  * @param width_size
	  * @param depth_size
	  */
	 public asgn1(int length_size, int width_size, int depth_size, String colour, String model) {
	  this.length_size = length_size;
	  this.width_size = width_size;
	  this.depth_size = depth_size;
	  this.colour = colour;
	  this.model = model;
	 }

	 protected void setDimenssion(int length_size, int width_size, int depth_size) {
	  this.length_size = length_size;
	  this.width_size = width_size;
	  this.depth_size = depth_size;
	 }

	 public void setModel(String colour, String model) {
	  this.colour = colour;
	  this.model = model;
	 }
	}

	class Chair extends asgn1 {
	 String type;

	 public Chair(int length_size, int width_size, int depth_size, String colour, String model,String type) {
	  super(length_size, width_size, depth_size, colour, model);
	  // TODO Auto-generated constructor stub
	   this.type=type;
	 }

	 public String getType() {
	  return type;
	 }

	 public void setType(String type) {
	  this.type = type;
	 }

	 public int[] getvalue() {
	  int[] values = { length_size, width_size, depth_size };
	  return values;
	 }
	}

