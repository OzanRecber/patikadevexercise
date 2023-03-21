-- film tablosunda bulunan rental_rate sütunundaki değerlerin ortalaması nedir?
SELECT avg(rental_rate) FROM film;

-- film tablosunda bulunan filmlerden kaç tanesi 'C' karakteri ile başlar?
SELECT count(title) FROM film
WHERE title like 'C%';

-- film tablosunda bulunan filmlerden rental_rate değeri 0.99 a eşit olan en uzun (length) film kaç dakikadır?
SELECT max(length) FROM film
WHERE rental_rate = 0.99;

-- film tablosunda bulunan filmlerin uzunluğu 150 dakikadan büyük olanlarına ait
-- kaç farklı replacement_cost değeri vardır?
SELECT count(DISTINCT replacement_cost) FROM film
WHERE length > 150;