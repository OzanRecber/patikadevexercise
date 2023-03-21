-- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50),
-- birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);

-- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (name, birthday, email) values ('Raddie', '1998-02-15', 'rshimmin0@accuweather.com');
insert into employee (name, birthday, email) values ('Roseanna', '1973-10-12', 'rgrayson1@gmpg.org');
insert into employee (name, birthday, email) values ('Jule', '1980-07-09', 'jpoulden2@noaa.gov');
insert into employee (name, birthday, email) values ('Clementius', '1966-05-16', 'cvenus3@addthis.com');
insert into employee (name, birthday, email) values ('Davey', '1987-09-19', 'dtoplis4@booking.com');
insert into employee (name, birthday, email) values ('Corie', '1968-02-22', 'cminette5@seesaa.net');
insert into employee (name, birthday, email) values ('Bronson', '1978-06-13', 'bloyd6@icq.com');
insert into employee (name, birthday, email) values ('Belinda', '1985-07-19', 'btebbe7@globo.com');
insert into employee (name, birthday, email) values ('Elisha', '1969-04-02', 'epettecrew8@archive.org');
insert into employee (name, birthday, email) values ('Esma', '1977-04-03', 'esentance9@blogger.com');
insert into employee (name, birthday, email) values ('Jannel', '1972-03-16', 'jilyasova@nbcnews.com');
insert into employee (name, birthday, email) values ('Garik', '1965-08-09', 'gsouthardb@4shared.com');
insert into employee (name, birthday, email) values ('Leslie', '1980-06-17', 'lfilipczynskic@barnesandnoble.com');
insert into employee (name, birthday, email) values ('Jacquette', '1992-07-19', 'jbalnavesd@tmall.com');
insert into employee (name, birthday, email) values ('Violetta', '1971-04-23', 'vbromehede@marketwatch.com');
insert into employee (name, birthday, email) values ('Cicely', '1958-06-30', 'cgrundonf@dot.gov');
insert into employee (name, birthday, email) values ('Eal', '1981-08-28', 'egerog@parallels.com');
insert into employee (name, birthday, email) values ('Pace', '1972-01-04', 'pdossantosh@trellian.com');
insert into employee (name, birthday, email) values ('Brenden', '1958-05-20', 'bvandenveldei@acquirethisname.com');
insert into employee (name, birthday, email) values ('Cathrine', '1981-05-23', 'cdilliwayj@vkontakte.ru');
insert into employee (name, birthday, email) values ('Brandtr', '1984-05-17', 'bspadeckk@nsw.gov.au');
insert into employee (name, birthday, email) values ('Robbie', '1992-09-12', 'rcadel@wikia.com');
insert into employee (name, birthday, email) values ('Isabelita', '1990-10-06', 'icruisem@hao123.com');
insert into employee (name, birthday, email) values ('Nero', '1998-07-16', 'nrihan@usatoday.com');
insert into employee (name, birthday, email) values ('Rica', '1978-03-01', 'rsuttabyo@paginegialle.it');
insert into employee (name, birthday, email) values ('Sherrie', '1975-04-06', 'sleilp@geocities.com');
insert into employee (name, birthday, email) values ('Henri', '1977-09-03', 'hsutliffq@typepad.com');
insert into employee (name, birthday, email) values ('Valaria', '1988-03-24', 'vbertrandr@ibm.com');
insert into employee (name, birthday, email) values ('Tamas', '1994-05-04', 'treiners@chicagotribune.com');
insert into employee (name, birthday, email) values ('Piper', '1968-07-08', 'prossbrookt@cocolog-nifty.com');
insert into employee (name, birthday, email) values ('Kerrin', '1991-12-04', 'kroggeroneu@senate.gov');
insert into employee (name, birthday, email) values ('Fonsie', '1963-11-19', 'fmarlv@bbb.org');
insert into employee (name, birthday, email) values ('Perle', '1995-06-18', 'pkerrichw@1688.com');
insert into employee (name, birthday, email) values ('Woodie', '1958-03-15', 'wmantionex@github.io');
insert into employee (name, birthday, email) values ('Lion', '1997-07-21', 'llocardy@vk.com');
insert into employee (name, birthday, email) values ('Danni', '1967-11-11', 'dtwinez@usda.gov');
insert into employee (name, birthday, email) values ('Ekaterina', '1989-06-20', 'emcarte10@weebly.com');
insert into employee (name, birthday, email) values ('Kimmie', '1983-11-14', 'kdoughill11@uiuc.edu');
insert into employee (name, birthday, email) values ('Orsola', '1967-03-11', 'owoods12@springer.com');
insert into employee (name, birthday, email) values ('Bathsheba', '1959-03-30', 'breynalds13@rambler.ru');
insert into employee (name, birthday, email) values ('Robby', '1979-09-18', 'rendricci14@cloudflare.com');
insert into employee (name, birthday, email) values ('Rivalee', '1972-07-11', 'rbomfield15@umn.edu');
insert into employee (name, birthday, email) values ('Mal', '1989-12-22', 'mdigweed16@ameblo.jp');
insert into employee (name, birthday, email) values ('Elyssa', '1994-03-01', 'ecapnor17@vistaprint.com');
insert into employee (name, birthday, email) values ('Amby', '1967-11-02', 'aswaile18@goodreads.com');
insert into employee (name, birthday, email) values ('Remy', '1987-06-29', 'rmaytum19@blogger.com');
insert into employee (name, birthday, email) values ('Clarice', '1986-12-08', 'cdaldan1a@webnode.com');
insert into employee (name, birthday, email) values ('Janey', '1970-10-16', 'jtomet1b@nymag.com');
insert into employee (name, birthday, email) values ('Irene', '1959-06-13', 'ihannond1c@reuters.com');
insert into employee (name, birthday, email) values ('Sherye', '1955-01-03', 'srosiello1d@de.vu');

-- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee SET name = 'Ozan' WHERE id = 1;

UPDATE employee SET birthday = '1990-03-19' WHERE name = 'Ozan';

UPDATE employee SET email = 'ozan@recber.com' WHERE birthday = '1990-03-19';

UPDATE employee SET name = 'Ayşenur' WHERE id = 2;

UPDATE employee SET birthday = '1997-01-29' WHERE name = 'Ayşenur'
RETURNING *;

-- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE id = 50
RETURNING *;

DELETE FROM employee
WHERE name = 'Irene';

DELETE FROM employee
WHERE birthday < '1960-01-01';

DELETE FROM employee
WHERE name like 'J%';

DELETE FROM employee
WHERE id > 40;