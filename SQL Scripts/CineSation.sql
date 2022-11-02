CREATE TABLE person(
	IDNumber VARCHAR(13) PRIMARY KEY NOT NULL,
	Name VARCHAR(30), 
	Surname VARCHAR(30), 
	ContactNumber VARCHAR(10), 
        Date_of_birth DATE,
	Email VARCHAR(100) 
);

CREATE TABLE customer(
	cIDNumber VARCHAR(13) PRIMARY KEY NOT NULL,
	Points INT  DEFAULT 0,
	FOREIGN KEY (cIDNumber) REFERENCES person(IDNumber)
);


CREATE TABLE employee(
	eIDNumber VARCHAR(13) PRIMARY KEY NOT NULL,
	IsManager BOOLEAN,
	FOREIGN KEY (eIDNumber) REFERENCES person(IDNumber)
);

CREATE TABLE cinema(
	CinemaId INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	NumberOfSeats INT
);

CREATE TABLE seat(
	SeatID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	CinemaID INT NOT NULL,
	SeatRow VARCHAR(3),
	SeatNumber INT,
	FOREIGN KEY (CinemaID) REFERENCES cinema(CinemaId)
);


CREATE TABLE movie(
	MovieID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	Title VARCHAR(50),
	Director VARCHAR(70),
	Cast TEXT,
	Synopis TEXT,
	Duration INT,
	Genre VARCHAR(50)
);

CREATE TABLE ticket_type(
	TicketTypeID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	TicketType VARCHAR(30) ,
	TPrice FLOAT
);


CREATE TABLE screening(
	ScreeningID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	sDate DATE,
	sTime TIME,
	TicketTypeID INT NOT NULL,
	movieID INT NOT NULL,
	CinemaID INT NOT NULL,
	FOREIGN KEY (TicketTypeID) REFERENCES ticket_type(TicketTypeID),
	FOREIGN KEY (MovieID) REFERENCES movie(MovieID),
	FOREIGN KEY (CinemaID) REFERENCES cinema(CinemaId)
);

CREATE TABLE purchase(
	PurchaseID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	eIDNumber VARCHAR(13) NOT NULL,
	cIDNumber VARCHAR(13) NOT NULL,
	pDate DATE,
	TotalCost FLOAT,
	FOREIGN KEY (eIDNumber) REFERENCES employee(eIDNumber),
	FOREIGN KEY (cIDNumber) REFERENCES customer(cIDNumber)
);

CREATE TABLE ticket(
	TicketID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	ScreeningID INT NOT NULL,
	SeatID INT NOT NULL,
	PurchaseID INT NOT NULL,
	FOREIGN KEY (ScreeningID) REFERENCES screening(ScreeningID),
	FOREIGN KEY (SeatID) REFERENCES seat(SeatID),
	FOREIGN KEY (PurchaseID) REFERENCES purchase(PurchaseID)
);

CREATE TABLE snack(
	SnackID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	SnackName VARCHAR(30),
	SnackDisc TEXT,
	SnackPrice FLOAT
);

CREATE TABLE snack_purchase(
	SnackPID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	SnackID INT NOT NULL,
	Quantity INT,
	PurchaseID INT NOT NULL,
	FOREIGN KEY (SnackID) REFERENCES snack(SnackID),
	FOREIGN KEY (PurchaseID) REFERENCES purchase(PurchaseID)
);
