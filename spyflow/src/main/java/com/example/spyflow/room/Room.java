package com.example.spyflow.room;

import com.example.spyflow.user.User;

import java.util.HashSet;
import java.util.Set;

public class Room {
    private Long id;
    private String host;
    private Boolean hasStarted;
    private String spy;
    private Set<String> locations = new HashSet<>();
    private Set<User> participants = new HashSet<>();

    public Room() {
    }

    public Room(String host, Boolean hasStarted, Set<String> locations, Set<User> participants) {
        this.host = host;
        this.hasStarted = hasStarted;
        this.locations = locations;
        this.participants = participants;
    }

    public Room(Long id, String host, Boolean hasStarted, Set<String> locations, Set<User> participants) {
        this.id = id;
        this.host = host;
        this.hasStarted = hasStarted;
        this.locations = locations;
        this.participants = participants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Boolean getHasStarted() {
        return hasStarted;
    }

    public void setHasStarted(Boolean hasStarted) {
        this.hasStarted = hasStarted;
    }

    public String getSpy() {
        return spy;
    }

    public void setSpy(String spy) {
        this.spy = spy;
    }

    public Set<String> getLocations() {
        return locations;
    }

    public void setLocations(Set<String> locations) {
        this.locations = locations;
    }

    public Set<User> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<User> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", host='" + host + '\'' +
                ", hasStarted=" + hasStarted +
                ", spy='" + spy + '\'' +
                ", locations=" + locations +
                ", participants=" + participants +
                '}';
    }
}
