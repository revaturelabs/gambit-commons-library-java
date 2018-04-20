package com.revature.commons.test;

import com.revature.commons.dto.location.Location;
import com.revature.commons.dto.location.Room;
import com.revature.commons.dto.skill.Skill;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class TestHelper {
    public static Skill makeSkill() {
        return Skill.builder()
            .id(1)
            .name("Skill 1")
            .active(true)
            .build();
    }

    public static Set<Skill> makeSkills(Integer quantity) {
        Set<Skill> skills = new HashSet<>();
        IntStream.range(0, quantity).forEach(i -> {
            skills.add(Skill.builder()
                .id(i + 1)
                .name("Skill " + (i + 1))
                .active(true)
                .build());
        });
        return skills;
    }

    public static Location makeLocation() {
        Set<Room> rooms = new HashSet<>();
        rooms.add(makeRoom());
        return Location.builder()
            .id(1)
            .name("Location 1")
            .address("1 Anywhere Street")
            .city("Javaville")
            .state("NY")
            .rooms(rooms)
            .active(true)
            .build();
    }

    public static Set<Location> makeLocations(Integer quantity) {
        Set<Location> locations = new HashSet<>();
        IntStream.range(0, quantity).forEach(i -> {
            Integer id = i + 1;
            locations.add(Location.builder()
                .id(id)
                .name("Location " + id)
                .address(id + " Anywhere Street")
                .city("Javaville")
                .state("NY")
                .rooms(makeRooms(3))
                .active(true)
                .build());
        });
        return locations;
    }

    public static Room makeRoom() {
        return Room.builder()
            .id(1)
            .name("Room 1")
            .active(true)
            .build();
    }

    public static Set<Room> makeRooms(Integer quantity) {
        Set<Room> rooms = new HashSet<>();
        IntStream.range(0, quantity).forEach(i -> {
            Integer id = i + 1;
            rooms.add(Room.builder()
                .id(id)
                .name("Room " + id)
                .active(true)
                .build());
        });
        return rooms;
    }
}
