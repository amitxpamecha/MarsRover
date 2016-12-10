package com.amitpamecha.marsrover.model;

public enum Orientation {

	N("N") {
		@Override
		public Orientation getOrientationOnLeftTurn() {
			return W;
		}

		@Override
		public Orientation getOrientationOnRightTurn() {
			return E;
		}
	}, E("E") {
		@Override
		public Orientation getOrientationOnLeftTurn() {
			return N;
		}

		@Override
		public Orientation getOrientationOnRightTurn() {
			return S;
		}
	}, W("W") {
		@Override
		public Orientation getOrientationOnLeftTurn() {
			return S;
		}

		@Override
		public Orientation getOrientationOnRightTurn() {
			return N;
		}
	}, S("S") {
		@Override
		public Orientation getOrientationOnLeftTurn() {
			return E;
		}

		@Override
		public Orientation getOrientationOnRightTurn() {
			return W;
		}
	};

	private String orientation;

	Orientation(String orientation) {
		this.orientation = orientation;
	}

	public static Orientation fromValue(String str) {

		for (Orientation element : Orientation.values()) {
			if (element.toString().equals(str)) {
				return element;
			}
		}
		return null;
	}
	
	public abstract Orientation getOrientationOnLeftTurn();
	
	public abstract Orientation getOrientationOnRightTurn();

}
