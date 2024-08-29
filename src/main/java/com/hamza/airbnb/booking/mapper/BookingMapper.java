package com.hamza.airbnb.booking.mapper;

import com.hamza.airbnb.booking.application.dto.BookedDateDTO;
import com.hamza.airbnb.booking.application.dto.NewBookingDTO;
import com.hamza.airbnb.booking.domain.Booking;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
