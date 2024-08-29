package com.hamza.airbnb.listing.application.dto;

import com.hamza.airbnb.listing.application.dto.sub.PictureDTO;
import com.hamza.airbnb.listing.application.dto.vo.PriceVO;
import com.hamza.airbnb.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO priceVO,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}
