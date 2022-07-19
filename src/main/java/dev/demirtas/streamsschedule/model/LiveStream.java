package dev.demirtas.streamsschedule.model;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

public record LiveStream(
        String id,
        @NotEmpty String name,
        String title,
        String description,
        LocalDateTime startDate,
        LocalDateTime endDate) {


}
