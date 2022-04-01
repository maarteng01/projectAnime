INSERT INTO ANIME (id, name, airings_date, end_date, rating) VALUES (nextval('ANIME_SEQ'), 'Attack On Titan', '2013-04-07', null, 8.53);
INSERT INTO ANIME (id, name, airings_date, end_date, rating) VALUES (nextval('ANIME_SEQ'), 'The Misfit Of Demon King Academy', '2020-07-04', '2020-09-26', 7.37);
INSERT INTO ANIME (id, name, airings_date, end_date, rating) VALUES (nextval('ANIME_SEQ'), 'Grand Blue', '2018-07-14', '2018-09-29', 8.43);
INSERT INTO ANIME (id, name, airings_date, end_date, rating) VALUES (nextval('ANIME_SEQ'), 'Tokyo Ghoul', '2014-07-04', '2018-12-25', 7.80);
INSERT INTO ANIME (id, name, airings_date, end_date, rating) VALUES (nextval('ANIME_SEQ'), 'My Dress-Up Darling', '2022-01-09', '2022-03-27', 8.46);
INSERT INTO ANIME (id, name, airings_date, end_date, rating) VALUES (nextval('ANIME_SEQ'), 'Naruto', '2002-10-03', '2007-02-08', 7.97);
INSERT INTO ANIME (id, name, airings_date, end_date, rating) VALUES (nextval('ANIME_SEQ'), 'One Piece', '1999-10-02', null, 8.63);
INSERT INTO ANIME (id, name, airings_date, end_date, rating) VALUES (nextval('ANIME_SEQ'), 'Re:ZERO -starting life in another world-', '2016-04-04', '2021-04-24', 8.25);
INSERT INTO ANIME (id, name, airings_date, end_date, rating) VALUES (nextval('ANIME_SEQ'), 'The Seven Deadly Sins', '2014-10-05', '2021-06-23', 7.72);
INSERT INTO ANIME (id, name, airings_date, end_date, rating) VALUES (nextval('ANIME_SEQ'), 'The God of High School', '2020-07-06', '2020-09-28', 7.07);
INSERT INTO ANIME (id, name, airings_date, end_date, rating) VALUES (nextval('ANIME_SEQ'), 'Baka and Test', '2010-01-07', '2010-04-01', 7.55);
INSERT INTO ANIME (id, name, airings_date, end_date, rating) VALUES (nextval('ANIME_SEQ'), 'Noblesse', '2016-02-04', '2020-12-31', 6.86);

INSERT INTO AUTHOR (id, first_name, last_name, age) VALUES (1, 'Hajime', 'Isayama', 35);
INSERT INTO AUTHOR (id, first_name, last_name, age) VALUES (2, 'Kaya', 'Haruka', 42);
INSERT INTO AUTHOR (id, first_name, last_name, age) VALUES (3, 'Kenji', 'Inoue', 0);
INSERT INTO AUTHOR (id, first_name, last_name, age) VALUES (4, 'Sui', 'Ishida', 35);
INSERT INTO AUTHOR (id, first_name, last_name, age) VALUES (5, 'Shinichi', 'Fukuda', 0);
INSERT INTO AUTHOR (id, first_name, last_name, age) VALUES (6, 'Masashi', 'Kishimoto', 47);
INSERT INTO AUTHOR (id, first_name, last_name, age) VALUES (7, 'Eiichiro', 'Oda', 47);
INSERT INTO AUTHOR (id, first_name, last_name, age) VALUES (8, 'Nagatsuki', 'Tappei', 35);
INSERT INTO AUTHOR (id, first_name, last_name, age) VALUES (9, 'Nakaba', 'Suzuki', 45);
INSERT INTO AUTHOR (id, first_name, last_name, age) VALUES (10, 'Yonje', 'Park', 40);

INSERT INTO MANGA (id, name, release_date, end_date) VALUES (1, 'Attack On Titan', '2009-09-09', '2021-04-09');
INSERT INTO MANGA (id, name, release_date, end_date) VALUES (2, 'The Misfit Of Demon King Academy', '2018-11-10', '2021-03-05');
INSERT INTO MANGA (id, name, release_date, end_date) VALUES (3, 'Grand Blue', '2014-04-07', '2022-03-07');
INSERT INTO MANGA (id, name, release_date, end_date) VALUES (4, 'Tokyo Ghoul', '2011-09-08', '2018-07-05');
INSERT INTO MANGA (id, name, release_date, end_date) VALUES (5, 'My Dress-Up Darling', '2018-11-24', '2022-03-25');
INSERT INTO MANGA (id, name, release_date, end_date) VALUES (6, 'Naruto', '1999-09-21', '2014-11-10');
INSERT INTO MANGA (id, name, release_date, end_date) VALUES (7, 'One Piece', '1997-07-19', null);
INSERT INTO MANGA (id, name, release_date, end_date) VALUES (8, 'Re:ZERO -starting life in another world-', '2014-10-23', '2017-07-23');
INSERT INTO MANGA (id, name, release_date, end_date) VALUES (9, 'The Seven Deadly Sins', '2012-10-10', '2020-03-25');
INSERT INTO MANGA (id, name, release_date, end_date) VALUES (10, 'The God of High School', '2021-04-08', null);
INSERT INTO MANGA (id, name, release_date, end_date) VALUES (11, 'Hunter x Hunter: Hisoka origin story', '2016-06-02', '2016-06-02');
INSERT INTO MANGA (id, name, release_date, end_date) VALUES (12, 'Noblesse', '2007-12-30', '2019-01-07');

INSERT INTO STUDIO (id, name, bio) VALUES (1, 'Wit Studio', 'Wit Studio, Inc. is a Japanese animation studio founded on June 1, 2012, by producers at Production I.G as a subsidiary of IG Port. It is headquartered in Musashino, Tokyo, with Production I.G producer George Wada as president and Tetsuya Nakatake, also a producer at Production I.G., as a director of the studio. The studio gained notability for producing the first three seasons of Attack on Titan.');
INSERT INTO STUDIO (id, name, bio) VALUES (2, 'MAPPA', 'MAPPA Co., Ltd. is a Japanese animation studio headquartered in Suginami, Tokyo. Founded in 2011 by Madhouse co-founder and producer Masao Maruyama, it has produced anime works including Kids on the Slope, Terror in Resonance, Yuri!!! on Ice, In This Corner of the World, Zombieland Saga, Dororo, Jujutsu Kaisen, and Attack on Titan: The Final Season. "MAPPA" is an acronym for (Maruyama Animation Produce Project Association).');
INSERT INTO STUDIO (id, name, bio) VALUES (3, 'Zero-G', 'Zero-G, Inc. is a Japanese animation studio founded in June 2011 by veteran anime director Hiroshi Negishi. The studio is located in Suginami, Tokyo. The studio is separate from Negishi''s prior studio Zero-G Room, which was established in 1991 and was later shut down in 2001 when it merged with Radix Ace Entertainment.');
INSERT INTO STUDIO (id, name, bio) VALUES (4, 'Pierrot', 'Pierrot Co., Ltd. is a Japanese animation studio established in May 1979 by former employees of both Tatsunoko Production and Mushi Production. Its headquarters are located in Mitaka, Tokyo. Pierrot is renowned for several worldwide popular anime series, such as Naruto, Bleach, Yu Yu Hakusho, Black Clover, Boruto: Naruto Next Generations, Tokyo Ghoul, and Great Teacher Onizuka."Piero" is a Japanese loanword for clown, adopted from the classical character of Pierrot.');
INSERT INTO STUDIO (id, name, bio) VALUES (5, 'CloverWorks', 'CloverWorks, Inc. is a Japanese animation studio that was rebranded from A-1 Pictures Kōenji Studio. It is a subsidiary of Sony Music Entertainment Japan''s anime production firm Aniplex.');
INSERT INTO STUDIO (id, name, bio) VALUES (6, 'Production I.G.', 'Production I.G, Inc. is a Japanese animation studio and production enterprise, founded on December 15, 1987, by Mitsuhisa Ishikawa and headquartered in Musashino, Tokyo, Japan. The letters I and G derive from the names of the company founders: producer Mitsuhisa Ishikawa and character designer Takayuki Goto.');
INSERT INTO STUDIO (id, name, bio) VALUES (7, 'Media Factory', 'Media Factory, formerly Media Factory, Inc. is a Japanese publisher and brand company of Kadokawa Future Publishing. It was founded on December 1, 1986, and its headquarters are situated in Shibuya, Tokyo. It is a subsidiary of Recruit Co., Ltd. Media Factory was possibly the first anime distributor to ask for sites to not link to fansub of any anime licensed by the company. On October 12, 2011, Media Factory was purchased by Kadokawa Corporation for ¥8,000,000,000.');
INSERT INTO STUDIO (id, name, bio) VALUES (8, 'Aniplex', 'Aniplex Inc. is a Japanese anime and music production company owned by Sony Music Entertainment Japan. Established in September 1995, Aniplex has been involved in the planning, production and distribution of several anime series, such as Fullmetal Alchemist, Sword Art Online, Puella Magi Madoka Magica, Demon Slayer: Kimetsu no Yaiba, Fate, the Monogatari series, Angel Beats!, The Promised Neverland, Rurouni Kenshin, and more.');
INSERT INTO STUDIO (id, name, bio) VALUES (9, 'Studio Deen', 'Studio Deen Co. Ltd. is a Japanese animation studio founded in 1975 by Sunrise producer Hiroshi Hasegawa and ex-Sunrise animators. The studio owns three subsidiaries: Danny Donghua, a Chinese sub-contracting studio; Megumi, a digital work sub-contracting studio; and Umidori, a 3DCG sub-contracting studio.');
INSERT INTO STUDIO (id, name, bio) VALUES (10, 'Silver Link', 'SILVER LINK., Inc. is a Japanese animation studio. It was founded by ex-Frontline animation producer Hayato Kaneko in December 2007 and is based in Tokyo.');
INSERT INTO STUDIO (id, name, bio) VALUES (11, 'White Fox', 'White Fox Co., Ltd., is a Japanese animation studio founded in April 2007 by Gaku Iwasa. The studio''s most successful productions include adaptations of Steins;Gate, and Re:Zero − Starting Life in Another World.');

INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (1, 1);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (2, 1);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (2, 10);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (3, 3);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (4, 4);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (4, 6);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (5, 5);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (6, 7);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (6, 12);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (7, 11);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (8, 2);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (8, 9);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (9, 9);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (10, 11);
INSERT INTO STUDIO_ANIMES (STUDIOS_ID, ANIMES_ID) VALUES (11, 8);