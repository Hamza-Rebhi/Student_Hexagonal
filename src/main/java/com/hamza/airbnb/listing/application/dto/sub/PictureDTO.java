package com.hamza.airbnb.listing.application.dto.sub;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
public record PictureDTO(
        @NotNull byte[] file,
        @NotNull String fileContentType,
        @NotNull boolean isCover
) {
}
