package com.objectsandclasses;

public class VehicleAssignment {
		private int currentSpeed;
		private float currentDirection;
		private String customerName;

		private int vehicleIdentificationNumber;
		private int vehicleId;

		public static final String NORTH_DIRECTION="North";
		public static final String EAST_DIRECTION="East";
		public static final String WEST_DIRECTION="West";
		public static final String SOUTH_DIRECTION="South";
		
		private String direction=NORTH_DIRECTION;
		private static int highestIdentificationNumber;

		public static final int TURN_LEFT=-1;
		public static final int TURN_RIGHT=1;
		
		public VehicleAssignment() {
			vehicleIdentificationNumber=highestIdentificationNumber++;
		}

		public void VehicleAssignment(String ownerName) {
			this.setOwnerName(ownerName);
			vehicleIdentificationNumber=highestIdentificationNumber++;
		}

		public void changeSpeed(int newSpeed){
			if(newSpeed>=0){
				this.currentSpeed=newSpeed;
			}else{
				this.currentSpeed=0;
			}		
		}
		
		public void stop(){
			this.currentSpeed=0;
		}

		public void turn(float degreesToTurn ,int direction){
			if(TURN_LEFT==direction){
				this.currentDirection=degreesToTurn;
				this.setDirection(WEST_DIRECTION);
			}else if(TURN_RIGHT==direction)
			{
				this.currentDirection=degreesToTurn;
				this.setDirection(EAST_DIRECTION);
			}
			
		}
		public static int getHighestIdentificationNumber(){
			return highestIdentificationNumber;
		}
		
		public int getCurrentSpeed() {
			return currentSpeed;
		}
		public void setCurrentSpeed(int currentSpeed) {
			this.currentSpeed = currentSpeed;
		}

		public float getCurrentDirection() {
			return currentDirection;
		}
		public void setCurrentDirection(float currentDirection) {
			this.currentDirection = currentDirection;
		}

		public String getOwnerName() {
			return customerName;
		}
		public void setOwnerName(String ownerName) {
			this.customerName = ownerName;
		}

		public int getVehicleIdentificationNumber() {
			return vehicleIdentificationNumber;
		}
		public void setVehicleIdentificationNumber(int vehicleIdentificationNumber) {
			this.vehicleIdentificationNumber = vehicleIdentificationNumber;
		}

		public int getVehicleId() {
			return vehicleId;
		}
		public void setVehicleId(int vehicleId) {
			this.vehicleId = vehicleId;
		}
		@Override
		public String toString() {
			return "Vehicle [currentSpeed=" + currentSpeed + ", currentDirection="
					+ currentDirection + ", customerName=" + customerName
					+ ", vehicleIdentificationNumber="
					+ vehicleIdentificationNumber + ", vehicleId=" + vehicleId
					+ "]";
		}

		public String getDirection() {
			return direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}
}

