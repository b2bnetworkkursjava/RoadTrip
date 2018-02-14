package pl.b2bnetwork.domain;

import java.util.ArrayList;
import java.util.List;

public class RoadTrip {
    private String name;
    private List<SectionOfRoad> sections = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SectionOfRoad> getSections() {
        return sections;
    }

    public void setSections(List<SectionOfRoad> sections) {
        this.sections = sections;
    }
}
