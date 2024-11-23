package dev.vrc;

import dev.vexide.hydrozoa.CompetitionRuntime;

public class Main {
    public static void main(String[] args) {
        CompetitionRuntime.start(Robot::new);
    }
}
