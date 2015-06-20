package com.theoakteam.sunny_pc.oakicare.Sunny.DietActivity;

public class DietModel {

	int mDietId, profileId;
	String mDietName;
	String mDietTime;
	String mDietMenu;
	String mDietDate;

	public String getDietDate() {
		return mDietDate;
	}

	public void setDietDate(String mDietDate) {
		this.mDietDate = mDietDate;
	}

	public DietModel(String dietName, String dietTime, String dietMenu, String DietDate ) {
		super();

		mDietName = dietName;
		mDietTime = dietTime;
		mDietMenu = dietMenu;
		mDietDate= DietDate;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public int getDietId() {
		return mDietId;
	}

	public void setDietId(int dietId) {
		mDietId = dietId;
	}

	public String getDietName() {
		return mDietName;
	}

	public String getDietTime() {
		return mDietTime;
	}

	public String getDietMenu() {
		return mDietMenu;
	}

}
