package pl.b2bnetwork.util;

import pl.b2bnetwork.domain.RoadTrip;
import pl.b2bnetwork.domain.SectionOfRoad;

import java.util.ArrayList;
import java.util.List;

public class RoadTripUtil {
    private List<RoadTrip> roads = new ArrayList();

    public List<RoadTrip> getRoads() {
        return roads;
    }

    public void setRoads(List<RoadTrip> roads) {
        this.roads = roads;
    }

    public int countRoadTripWhichAreUnderConstruction() {
        int licznik = 0;
        for (RoadTrip road : roads) {
            for (SectionOfRoad sectionOfRoad : road.getSections()) {
                if (sectionOfRoad.isUnderConstruction()) {
                    licznik++;
                }
            }
        }
        return licznik;
    }

    public boolean isAnyRoadUnderConstruction() {
        boolean isRoadUnderConstruction = false;
        for (RoadTrip road : roads) {
            for (SectionOfRoad sectionOfRoad : road.getSections()) {
                if (sectionOfRoad.isUnderConstruction()) {
                    isRoadUnderConstruction = true;
                }
            }
        }
        return isRoadUnderConstruction;
    }
}
