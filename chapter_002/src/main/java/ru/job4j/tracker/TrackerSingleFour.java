package ru.job4j.tracker;

import ru.job4j.tracker.Item;

public class TrackerSingleFour {

    private TrackerSingleFour() {
    }

    public static TrackerSingleFour getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingleFour INSTANCE = new TrackerSingleFour();
    }

    public static void main(String[] args) {
        TrackerSingleFour tracker = TrackerSingleFour.getInstance();
    }
}