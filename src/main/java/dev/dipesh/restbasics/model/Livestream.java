package dev.dipesh.restbasics.model;

import java.time.LocalDateTime;

public record Livestream(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate) {
    
}
