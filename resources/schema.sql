create table movies (
	imdb_id varchar(30) not null,
	title varchar(255),
	movie_year int,
	primary key (imdb_id)
);

insert into movies(imdb_id,title, movie_year ) values('tt0114898', 'Waterworld', '1995');
insert into movies(imdb_id,title, movie_year ) values('tt0390617', 'Waterworld', '1997');
insert into movies(imdb_id,title, movie_year ) values('tt2761086', 'Swordquest: Waterworld', '1983');
insert into movies(imdb_id,title, movie_year ) values('tt5847056', 'Behind the Scenes of the Most Fascinating Waterworld on Earth: The Great Backwaters, Kerala.', '2014');
insert into movies(imdb_id,title, movie_year ) values('tt0298417', 'Louise''s Waterworld', '1997');
insert into movies(imdb_id,title, movie_year ) values('tt0381702', 'Louise''s Waterworld', '2001');

commit;