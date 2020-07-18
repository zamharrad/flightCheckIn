<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Reservation Details</title>
</head>
<body>
<h2>Flight Details :</h2>

Airlines : ${reservation.flight.operatingAirlines}<br/>
Flight Number : ${reservation.flight.flightNumber}<br/>
Arrival City : ${reservation.flight.arrivalCity}<br/>
Date Of Departure : ${reservation.flight.dateOfDeparture}<br/>
Departure City : ${reservation.flight.departureCity}<br/>
Estimated Departure Time : ${reservation.flight.estimatedDepartureTime}<br/>

<h2>Passenger Details :</h2>

First Name : ${reservation.passenger.firstName}<br/>
Last Name : ${reservation.passenger.lastName}<br/>
Email Address : ${reservation.passenger.email}<br/>
Mobile Number : ${reservation.passenger.phone}<br/>

<form action="completeCheckIn" method="post" >
Enter the number of bags You want to check In : <input type="text" name="numberOfBags" />
    <input type="hidden" value="${reservation.id}" name="reservationId"/>
    <input type="submit" value="Check In">
</form>
</body>
</html>