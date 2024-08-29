package com.hamza.airbnb.listing.application.dto;

import com.hamza.airbnb.listing.application.dto.sub.DescriptionDTO;
import com.hamza.airbnb.listing.application.dto.sub.LandlordListingDTO;
import com.hamza.airbnb.listing.application.dto.sub.ListingInfoDTO;
import com.hamza.airbnb.listing.application.dto.sub.PictureDTO;
import com.hamza.airbnb.listing.application.dto.vo.PriceVO;
import com.hamza.airbnb.listing.domain.BookingCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DisplayListingDTO {
    private DescriptionDTO description;
    private List<PictureDTO> pictures;
    private ListingInfoDTO infos;
    private PriceVO price;
    private BookingCategory category;
    private String location;
    private LandlordListingDTO landlord;
}
