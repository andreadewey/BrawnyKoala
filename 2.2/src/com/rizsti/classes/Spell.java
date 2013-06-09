package com.rizsti.classes;

import java.util.Map;

/**
 * A spell 
 * @author Andrea Dewey
 * Last Edited: May 2013
 *
 */
public class Spell {

	private String parseId;		//
	private String name; 		//The name of the spell
	private String school; 		//The school of the spell ie conjuration etc
	private Map<String,String> classes;	//The classes that can use the spell and the level it can be used at (class, level)
	private String range;		//The distance the spell will reach
	private String target; 		//Who the spell can hit
	private String components;//Casting components
	private String castingTime;	//The length of time it takes to cast the spell
	private String duration;	//The length of time the spell lasts
	private String spellResistanceEffect;	//The effect of the spell resistance
	private String savingThrow;	//The saving throw
	private String area;		//The area of effect
	private String flavourText;	//The flavour text of the spell
	private String description;	//The description of the spell
	private String damage;		//The damage the spell does if applicable
	
	private boolean spellResistance;	//Whether the spell is affected by spell resistance
	
	
	/**
	 * Blank constructor
	 */
	public Spell() {
		super();
		this.name = "";
		this.school = "";
		this.classes = null;
		this.range = "";
		this.target = "";
		this.area = "";
		this.components = null;
		this.castingTime = "";
		this.duration = "";
		this.spellResistance = false;
		this.spellResistanceEffect = "";
		this.savingThrow = "";
	}


	/**
	 * @param name
	 * @param school
	 * @param classes
	 * @param range
	 * @param target
	 * @param area
	 * @param components
	 * @param castingTime
	 * @param duration
	 * @param spellResistance
	 * @param spellResistanceEffect
	 * @param savingThrow
	 */
	public Spell(String parseId, String name, String school, Map<String, String> classes,
			String range, String target, String area, String components,
			String castingTime, String duration, boolean spellResistance,
			String spellResistanceEffect, String savingThrow) {
		super();
		this.setParseId(parseId);
		this.name = name;
		this.school = school;
		this.classes = classes;
		this.range = range;
		this.target = target;
		this.area = area;
		this.components = components;
		this.castingTime = castingTime;
		this.duration = duration;
		this.spellResistance = spellResistance;
		this.spellResistanceEffect = spellResistanceEffect;
		this.savingThrow = savingThrow;
	}

	


	/**
	 * @param name
	 * @param school
	 * @param classes
	 * @param range
	 * @param target
	 * @param components
	 * @param castingTime
	 * @param duration
	 * @param spellResistanceEffect
	 * @param savingThrow
	 * @param area
	 * @param flavourText
	 * @param description
	 * @param damage
	 * @param spellResistance
	 */
	public Spell(String name, String school, Map<String, String> classes,
			String range, String target, String components,
			String castingTime, String duration, String spellResistanceEffect,
			String savingThrow, String area, String flavourText,
			String description, String damage, boolean spellResistance) {
		super();
		this.name = name;
		this.school = school;
		this.classes = classes;
		this.range = range;
		this.target = target;
		this.components = components;
		this.castingTime = castingTime;
		this.duration = duration;
		this.spellResistanceEffect = spellResistanceEffect;
		this.savingThrow = savingThrow;
		this.area = area;
		this.flavourText = flavourText;
		this.description = description;
		this.damage = damage;
		this.spellResistance = spellResistance;
	}


	public String getParseId() {
		return parseId;
	}


	public void setParseId(String parseId) {
		this.parseId = parseId;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the school
	 */
	public String getschool() {
		return school;
	}


	/**
	 * @param school the school to set
	 */
	public void setschool(String school) {
		this.school = school;
	}

	/**
	 * @return the classes
	 */
	public Map<String, String> getClasses() {
		return classes;
	}

	/**
	 * @param classes the classes to set
	 */
	public void setClasses(Map<String, String> classes) {
		this.classes = classes;
	}

	/**
	 * @return the range
	 */
	public String getRange() {
		return range;
	}


	/**
	 * @param range the range to set
	 */
	public void setRange(String range) {
		this.range = range;
	}

	/**
	 * @return the target
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * @param target the target to set
	 */
	public void setTarget(String target) {
		this.target = target;
	}

	/**
	 * @return the components
	 */
	public String getComponents() {
		return components;
	}

	/**
	 * @param components the components to set
	 */
	public void setComponents(String components) {
		this.components = components;
	}

	/**
	 * @return the castingTime
	 */
	public String getCastingTime() {
		return castingTime;
	}

	/**
	 * @param castingTime the castingTime to set
	 */
	public void setCastingTime(String castingTime) {
		this.castingTime = castingTime;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * @return the spellResistanceEffect
	 */
	public String getSpellResistanceEffect() {
		return spellResistanceEffect;
	}

	/**
	 * @param spellResistanceEffect the spellResistanceEffect to set
	 */
	public void setSpellResistanceEffect(String spellResistanceEffect) {
		this.spellResistanceEffect = spellResistanceEffect;
	}

	/**
	 * @return the savingThrow
	 */
	public String getSavingThrow() {
		return savingThrow;
	}

	/**
	 * @param savingThrow the savingThrow to set
	 */
	public void setSavingThrow(String savingThrow) {
		this.savingThrow = savingThrow;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the spellResistance
	 */
	public boolean isSpellResistance() {
		return spellResistance;
	}

	/**
	 * @param spellResistance the spellResistance to set
	 */
	public void setSpellResistance(boolean spellResistance) {
		this.spellResistance = spellResistance;
	}


	/**
	 * @return the flavourText
	 */
	public String getFlavourText() {
		return flavourText;
	}


	/**
	 * @param flavourText the flavourText to set
	 */
	public void setFlavourText(String flavourText) {
		this.flavourText = flavourText;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the damage
	 */
	public String getDamage() {
		return damage;
	}


	/**
	 * @param damage the damage to set
	 */
	public void setDamage(String damage) {
		this.damage = damage;
	}

	
	
}
