package com.hamza.airbnb.listing.application;

import com.hamza.airbnb.listing.application.dto.sub.PictureDTO;
import com.hamza.airbnb.listing.domain.Listing;
import com.hamza.airbnb.listing.domain.ListingPicture;
import com.hamza.airbnb.listing.mapper.ListingPictureMapper;
import com.hamza.airbnb.listing.repository.ListingPictureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class PictureService {
    private final ListingPictureRepository listingPictureRepository;
    private final ListingPictureMapper listingPictureMapper;

    public List<PictureDTO> saveAll(List<PictureDTO> pictures, Listing listing) {
        Set<ListingPicture> listingPictures = listingPictureMapper.pictureDTOsToListingPictures(pictures);
        boolean isFirst = true;
        for (ListingPicture listingPicture : listingPictures) {
            listingPicture.setCover(isFirst);
            listingPicture.setListing(listing);
            isFirst = false;
            listingPictureRepository.saveAll(listingPictures);
        }
        return listingPictureMapper.listingPictureToPictureDTO(listingPictures.stream().toList());

    }
}
