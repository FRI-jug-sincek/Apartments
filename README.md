# Apartments
Zahteve za namestitev:<br/>
  * Ukaz za dodajanje baze:<br/>
	docker run -d --name pg-apartments -e POSTGRES_USER=dbuser -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=apartments -p 5432:5432 postgres:13
