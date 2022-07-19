package dev.demirtas.streamsschedule.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class ImmutableLiveStream {

    private final String id;
    private final String title;
    private final String description;
    private final String url;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;

    public ImmutableLiveStream(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableLiveStream that = (ImmutableLiveStream) o;
        return id.equals(that.id) && title.equals(that.title) && description.equals(that.description) && url.equals(that.url) && startDate.equals(that.startDate) && endDate.equals(that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, url, startDate, endDate);
    }


}
