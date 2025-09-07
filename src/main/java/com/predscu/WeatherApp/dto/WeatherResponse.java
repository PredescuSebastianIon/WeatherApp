package com.predscu.WeatherApp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private Current current;

    @Getter @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Current {
        @JsonProperty("temp_c")
        private double tempC;
        @JsonProperty("feelslike_c")
        private double feelslikeC;
        private Condition condition;

        @Getter @Setter
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Condition {
            private String text;
            private String icon;
        }
    }
}
