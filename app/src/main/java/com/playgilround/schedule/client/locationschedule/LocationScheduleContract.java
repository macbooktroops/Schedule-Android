package com.playgilround.schedule.client.locationschedule;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.playgilround.schedule.client.base.BasePresenter;
import com.playgilround.schedule.client.base.BaseView;
import com.playgilround.schedule.client.model.LocationInfo;

import java.util.ArrayList;

/**
 * 19-02-18
 * MVP Pattern
 * Contract -> View와 Presenter에 대한 interface를 작성
 */
public interface LocationScheduleContract {

    interface View extends BaseView<Presenter> {

        //주변 반경, 핀 지도 관련 표시
        void setMapMarker(LatLng destMap);

        //검색 된 결과 지도 표시
        void setMapSearchConfirmed(String title, String snippet, LatLng currentMap, LatLng searchMap, int zoomLevel);
    }

    interface Presenter extends BasePresenter {

        // text로 장소 검색.
         void onSearchConfirmed(CharSequence text);

        // Google Map 준비 완료
        void setMapDisplay(double latitude, double longitude);

        ArrayList<LocationInfo> getLocationInfo();
    }
}
