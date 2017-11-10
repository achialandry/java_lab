/**
 * Class to put up base information about models
 * @author Landry Achia
 *
 */

public class Model {
	
	private String firstName;
	private String lastName;
	private int modelHeight;
	private double modelWeight;
	private boolean canTravel;
	private boolean modelSmokes;
	private static String occupation = "modeling";
	
	private static final double POUND = 2.20462;
	private static final double KG_PER_POUND = 0.453592;
	private static final double CENTIMENTER_PER_INCH = 2.54;
	private static final int MAX_MODEL_HEIGHT = 84;
	private static final int MIN_MODEL_HEIGHT = 24;
	private static final int MAX_MODEL_WEIGHT = 280;
	private static final int MIN_MODEL_WEIGHT = 80;
	
	public static final int INCHES_PER_FOOT = 12;
	public static final int BASE_RATE_DOLLAR_PER_HOUR = 60;
	public static final int TALL_INCHES = 67;
	public static final double THIN_POUNDS = 140.0;
	public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
	public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
	public static final int SMOOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;
	
	
	
	
	/**
	 * No argument constructor
	 */
	public Model()
	{
		
	}
	
	/**
	 * Constructor two takes six arguments for the model
	 * @param firstName First Name of Model
	 * @param lastName Last Name of Model
	 * @param modelHeight Height of Model in 
	 * @param modelWeight for constructor that takes six parameters
	 * @param canTravel boolean to see  if model can travel
	 * @param modelSmokes boolean to see if model smokes
	 */
	public Model(String firstName, String lastName, int modelHeight, int modelWeight, boolean canTravel, boolean modelSmokes)
	{
		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setModelHeight(modelHeight);
		this.setModelWeight(modelWeight);
		this.setCanTravel(canTravel);
		this.setModelSmokes(modelSmokes);
			
		
	}
	
	/**
	 * Third constructor takes four parameters
	 * Model does not smoke and model can travel
	 * @param firstName First Name of Model
	 * @param lastName Last Name of Model
	 * @param modelHeight Height of Model in inches
	 * @param modelWeight Weight of Model in pounds
	 */
	public Model (String firstName, String lastName, int modelHeight, double modelWeight) 
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setModelHeight(modelHeight);
		this.setModelWeight(modelWeight);
		this.setCanTravel(true);
		this.setModelSmokes(false);
		
	}
	
	
	
	

	/**
	 * validates model First Name if it is between 3 to 20 char long
	 * @param firstName First Name of Model
	 */
	public final void setFirstName(String firstName) 
	{
		if((firstName!=null) && (!firstName.isEmpty()) && (firstName.length()>=3) && (firstName.length()<=20) ) 
		{
			this.firstName = firstName;
		}
	}
	
	
	/**
	 * 
	 * @return Model First Name
	 */
	
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 
	 * @return Model Last Name
	 */

	public String getLastName() {
		return lastName;
	}

	
	/**
	 * 
	 * @return Model Height
	 */
	public int getModelHeight() {
		return modelHeight;
	}

	/**
	 * 
	 * @return Model Weight
	 */
	public double getModelWeight() {
		return modelWeight;
	}

	/**
	 * 
	 * @return Boolean if Model Can travel
	 */
	public boolean isCanTravel() {
		return canTravel;
	}

	/**
	 * 
	 * @return Boolean If model smokes
	 */
	public boolean isModelSmokes() {
		return modelSmokes;
	}
	
	

	/**
	 * 
	 * @return occupation of all models
	 */
	public static String getOccupation() {
		return occupation;
	}

	/**
	 *  All models have unique occupation
	 * @param occupation of all models in this class
	 */
	public static void setOccupation(String occupation) {
		Model.occupation = occupation;
	}

	
	/**
	 * validates model Last Name if it is between 3 to 20 char long
	 * @param lastName Last Name of Model
	 */
	public final void setLastName(String lastName) 
	{
		if((lastName!=null) && (!lastName.isEmpty()) && (lastName.length()>=3) && (lastName.length()<=20) ) 
		{
			this.lastName = lastName;
		}
	}
	
	/**
	 * 
	 * @param canTravel  if Model can Travel
	 */
	public final void setCanTravel(boolean canTravel) 
	{
		this.canTravel = canTravel;
	}
	
	/**
	 * if  Model Smokes
	 * @param smokes if model smokes
	 */
	public final void setModelSmokes(boolean smokes) {
		this.modelSmokes = smokes;
	}
	
	/**
	 * model height in inches
	 * @param feet for each Model
	 * @param inches height for model in inches
	 */
	public final void setModelHeight(int feet, int inches ) 
	{
		int height = (feet * INCHES_PER_FOOT) + inches ;
		setModelHeight(height);
	}
	
	/**
	 * model to verify height
	 * @param height model height validation
	 */
	public final void setModelHeight(int height) {
		//validation
		if(height >=MIN_MODEL_HEIGHT && height <=MAX_MODEL_HEIGHT) {
			this.modelHeight = height;
		}
	}
	
	/**
	 * model weight in pounds
	 * @param kilograms of Model
	 */
	public final void setModelWeight(long kilograms) {
		setModelWeight(kilograms * POUND);
		
	}
	
	
	/**
	 * Model weight in pounds
	 * @param pounds model Model weight validation in pounds
	 */
	public final void setModelWeight(double pounds ) 
	{
         //validation
		if(pounds >=MIN_MODEL_WEIGHT && pounds <=MAX_MODEL_WEIGHT) {
			this.modelWeight = pounds;
		}
	}
	
	/**
	 * 
	 * @return model height in inches and feet with accompanying text "feet" and or "inche(s)"
	 */
	
	public String getHeightInFeetAndInches() {
		int heightFeet = this.modelHeight/INCHES_PER_FOOT;
		int heightInches = this.modelHeight % INCHES_PER_FOOT;
		String heightString = null;
		//verify if there's remainder and return value in feets only if theres none
		if(heightInches == 0 ) {
			heightString = heightFeet +" feets";
			
		} else if(heightInches ==1) {
			heightString =  heightFeet + "feets  " +  heightInches + "inch";
			
		}  else if (heightInches > 1) {
			heightString = heightFeet + "feets  " + heightInches + "inches";
		}
		
		return heightString;
		
	}
	
	
	/**
	 * get models height in centimetres
	 * @return model height in centimeter
	 */
	public int getHeightCentimetre() {
		int heightCentimetres =(int) Math.round(this.modelHeight * Model.CENTIMENTER_PER_INCH);
		return heightCentimetres;
		
	}
	
	/**
	 * Gives Models weight in Kg
	 * @return Model weight in Kg
	 */
	public long getWeightKg() {
		long result = Math.round(this.modelWeight * Model.KG_PER_POUND);
		return result;
	}
	
	
	/**
	 * prints all details for object accessor methods
	 */
	public void printDetails() {
		
		System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
		System.out.println("Height: " + this.getModelHeight() + " inches");
		System.out.println(" Weight: " + Math.round(this.getModelWeight()) + " pounds");
		
		if(this.isCanTravel() == true){
		System.out.println("Does travel ");
		}else{
		System.out.println("Does not travel ");
		}
		if(this.isModelSmokes() == true){
		System.out.println("Does smoke ");
		}else{
		System.out.println("Does not smoke ");
		}
		
	}
	
	/**
	 * calculates model per hour rate based on conditions of weight, height, canTravel, smokes
	 * @return amount of dollars due to model 
	 */
	
	public int calculatePayDollarsPerHour() {
		//initializing model pay from base dollar amount
		int payDollarAmount = Model.BASE_RATE_DOLLAR_PER_HOUR;
		
		if(this.modelHeight >= TALL_INCHES && this.modelWeight <= THIN_POUNDS) {
			payDollarAmount = payDollarAmount + TALL_THIN_BONUS_DOLLARS_PER_HOUR;
		}
		
		if(this.isCanTravel()) {
			payDollarAmount = payDollarAmount + TRAVEL_BONUS_DOLLARS_PER_HOUR;
		}
		
		if(this.isModelSmokes()) {
			payDollarAmount = payDollarAmount - SMOOKER_DEDUCTION_DOLLARS_PER_HOUR; 
		}
		
		return payDollarAmount;
	}
	
	
	/**
	 * Displays all models info on the screen 
	 */
	public void displayModelDetails() {
		System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
		System.out.println("Height: " + this.getHeightInFeetAndInches());
		System.out.println("Weight: " + this.getModelWeight() + " pounds");
		if(this.isCanTravel() == true){
			System.out.println("Travels: yep ");
			}else{
			System.out.println("Travels: nope ");
			}
			if(this.isModelSmokes() == true){
			System.out.println("Smokes: yep ");
			}else{
			System.out.println("Smokes: nope ");
			}
		System.out.println("Hourly Rate: " + "$" + this.calculatePayDollarsPerHour());
		
	}
	
	
	/**
	 * getting to display model details as per units
	 *@param metricUnits Overlaoded method with boolean to specify whether weight should be metric (kg, cm) or imperial (lb, inches)
	 */
	public void displayModelDetails(boolean metricUnits) {
		System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
		
		if (metricUnits == true) {
			System.out.println("Height: " + this.getHeightCentimetre() + " cm");
			System.out.println("Weight: " + this.getWeightKg() + " kg");
		}else {
			System.out.println("Height: " + this.getHeightInFeetAndInches());
			System.out.println("Weight: " + this.getModelWeight() + "pounds");
		}
		
		if(this.isCanTravel() == true){
			System.out.println("Travels: yep ");
			}else{
			System.out.println("Travels: nope ");
			}
			if(this.isModelSmokes() == true){
			System.out.println("Smokes: yep ");
			}else{
			System.out.println("Smokes: nope ");
			}
		System.out.println("Hourly Rate: " + "$" + this.calculatePayDollarsPerHour());
		
	}
}
