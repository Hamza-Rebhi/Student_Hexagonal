package com.hamza.airbnb.listing.application.dto;

import com.hamza.airbnb.listing.application.dto.sub.DescriptionDTO;
import com.hamza.airbnb.listing.application.dto.sub.ListingInfoDTO;
import com.hamza.airbnb.listing.application.dto.sub.PictureDTO;
import com.hamza.airbnb.listing.application.dto.vo.PriceVO;
import com.hamza.airbnb.listing.domain.BookingCategory;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveListingDTO {
    @NotNull
    BookingCategory category;

    @NotNull String location;

    @NotNull @Valid
    ListingInfoDTO infos;

    @NotNull @Valid
    DescriptionDTO description;

    @NotNull @Valid
    PriceVO price;

    @NotNull
    List<PictureDTO> pictures;

}
