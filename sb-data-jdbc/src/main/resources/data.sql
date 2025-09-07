INSERT INTO USERS (EMAIL, NAME, GRAVATAR_URL, HASHED_PASSWORD, ACTIVE) VALUES
                                                                           ('cavin@example.com', 'Cavin', 'https://www.gravatar.com/avatar/abc123', 'hashedSecret', TRUE),
                                                                           ('alice@example.com', 'Alice', 'https://www.gravatar.com/avatar/def456', 'hashedSecret', FALSE);

INSERT INTO USER_ROLES (USER_ID, ROLE) VALUES
                                           (1, 'ADMIN'),
                                           (1, 'USER'),
                                           (2, 'INFO');