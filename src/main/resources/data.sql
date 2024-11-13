-- User 데이터 삽입
INSERT INTO user (id, nickname) VALUES (1, 'john_doe');
INSERT INTO user (id, nickname) VALUES (2, 'jane_smith');
INSERT INTO user (id, nickname) VALUES (3, 'alex_jones');
INSERT INTO user (id, nickname) VALUES (4, 'emily_davis');
INSERT INTO user (id, nickname) VALUES (5, 'michael_brown');

-- Post 데이터 삽입
INSERT INTO post (id, title, content, time, user_id) VALUES (1, 'Post 1', 'Content of post 1', '2024-11-13T10:00:00', 1);
INSERT INTO post (id, title, content, time, user_id) VALUES (2, 'Post 2', 'Content of post 2', '2024-11-13T11:00:00', 2);
INSERT INTO post (id, title, content, time, user_id) VALUES (3, 'Post 3', 'Content of post 3', '2024-11-13T12:00:00', 3);
INSERT INTO post (id, title, content, time, user_id) VALUES (4, 'Post 4', 'Content of post 4', '2024-11-13T13:00:00', 4);
INSERT INTO post (id, title, content, time, user_id) VALUES (5, 'Post 5', 'Content of post 5', '2024-11-13T14:00:00', 5);
INSERT INTO post (id, title, content, time, user_id) VALUES (6, 'Post 6', 'Content of post 6', '2024-11-13T15:00:00', 1);
INSERT INTO post (id, title, content, time, user_id) VALUES (7, 'Post 7', 'Content of post 7', '2024-11-13T16:00:00', 2);
INSERT INTO post (id, title, content, time, user_id) VALUES (8, 'Post 8', 'Content of post 8', '2024-11-13T17:00:00', 3);
INSERT INTO post (id, title, content, time, user_id) VALUES (9, 'Post 9', 'Content of post 9', '2024-11-13T18:00:00', 4);
INSERT INTO post (id, title, content, time, user_id) VALUES (10, 'Post 10', 'Content of post 10', '2024-11-13T19:00:00', 5);
