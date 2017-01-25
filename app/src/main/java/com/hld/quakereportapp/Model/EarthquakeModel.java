package com.hld.quakereportapp.Model;

/**
 * Created by hilda on 25/01/2017.
 */

public class EarthquakeModel {
        private String mMagnitude;
        private String mLocation;
        private String mDate;

        public EarthquakeModel(String mMagnitude, String mLocation, String mDate) {
            this.mMagnitude = mMagnitude;
            this.mLocation = mLocation;
            this.mDate = mDate;
        }

        public String getmMagnitude() {
            return mMagnitude;
        }

        public void setmMagnitude(String mMagnitude) {
            this.mMagnitude = mMagnitude;
        }

        public String getmLocation() {
            return mLocation;
        }

        public void setmLocation(String mLocation) {
            this.mLocation = mLocation;
        }

        public String getmDate() {
            return mDate;
        }

        public void setmDate(String mDate) {
            this.mDate = mDate;
        }
}
