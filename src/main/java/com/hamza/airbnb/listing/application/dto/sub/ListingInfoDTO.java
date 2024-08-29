package com.hamza.airbnb.listing.application.dto.sub;

import com.hamza.airbnb.listing.application.dto.vo.BathsVO;
import com.hamza.airbnb.listing.application.dto.vo.BedroomsVO;
import com.hamza.airbnb.listing.application.dto.vo.BedsVO;
import com.hamza.airbnb.listing.application.dto.vo.GuestsVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


public record ListingInfoDTO(
        @NotNull @Valid GuestsVO guests,
        @NotNull @Valid BedroomsVO bedrooms,
        @NotNull @Valid BedsVO beds,
        @NotNull @Valid BathsVO baths) {
}

