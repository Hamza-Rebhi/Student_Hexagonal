package com.hamza.airbnb.listing.application.dto;

import com.hamza.airbnb.listing.application.dto.vo.PriceVO;

import java.util.UUID;

public record ListingCreateBookingDTO(UUID listingPublicId,
                                        PriceVO price) {
}
