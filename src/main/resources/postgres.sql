CREATE DATABASE testv1;
CREATE DATABASE testv2;

CREATE TABLE test_demo_user_tablev1 (
                                        id BIGSERIAL PRIMARY KEY,
                                        user_name VARCHAR(32) NOT NULL,
                                        email VARCHAR(128) NOT NULL,
                                        last_login TIMESTAMP NOT NULL
);

CREATE TABLE test_demo_user_tablev2 (
                                        id BIGSERIAL PRIMARY KEY,
                                        user_name VARCHAR(32) NOT NULL,
                                        email VARCHAR(128) NOT NULL,
                                        last_login TIMESTAMP NOT NULL
);

INSERT INTO test_demo_user_tablev1 (user_name, email, last_login) VALUES ('user1.v1', 'test1@gmail.com', '2019-11-12 12:10:56');
INSERT INTO test_demo_user_tablev1 (user_name, email, last_login) VALUES ('user2.v1', 'test2@gmail.com', '2019-11-13 14:10:56');

INSERT INTO test_demo_user_tablev2 (user_name, email, last_login) VALUES ('user1.v2', 'test3@gmail.com', '2019-12-12 12:10:56');
