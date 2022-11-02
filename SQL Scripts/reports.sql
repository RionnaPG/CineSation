SELECT name, surname, points, SUM(TotalCost) FROM person JOIN customer ON customer.cIDNumber=person.IDNumber JOIN purchase ON customer.cIDNumber=purchase.cIDNumber GROUP BY customer.cIDNumber ORDER BY SUM(TotalCost) DESC;
SELECT Title, sTime, Count(TicketID) FROM movie LEFT JOIN screening ON screening.movieID=movie.MovieID LEFT JOIN ticket ON ticket.ScreeningID=screening.ScreeningID GROUP BY movie.MovieID, sTime ORDER BY Count(TicketID) DESC;
SELECT Title, TicketType, Count(TicketID)*TPrice FROM movie LEFT JOIN screening ON screening.movieID=movie.MovieID LEFT JOIN ticket ON ticket.ScreeningID=screening.ScreeningID LEFT JOIN ticket_type ON screening.TicketTypeID=ticket_type.TicketTypeID GROUP BY movie.MovieID, ticket_type.TicketTypeID ORDER BY Count(TicketID)*TPrice DESC;

