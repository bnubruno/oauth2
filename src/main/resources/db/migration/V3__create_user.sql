INSERT INTO users (id, username, email, password, activated)
VALUES ('f77cdd12-b360-11ea-90f3-8ffba44dc99b', 'admin', 'admin@admin.com',
        '$2a$10$r0RFDmpneBVryx.ihHK9gu6FFJQi4nTxQUqzdSTvrPpaKZMxigqpy', true);

INSERT INTO users_authority (id, authority)
VALUES ('f77cdd12-b360-11ea-90f3-8ffba44dc99b', 'ROLE_USER');

INSERT INTO users_authority (id, authority)
VALUES ('f77cdd12-b360-11ea-90f3-8ffba44dc99b', 'ROLE_ADMIN');

INSERT INTO users (id, username, email, password, activated)
VALUES ('ecd92500-b360-11ea-90f2-4f68855871cb', 'user', 'user@user.com',
        '$2a$10$r0RFDmpneBVryx.ihHK9gu6FFJQi4nTxQUqzdSTvrPpaKZMxigqpy',
        true);

INSERT INTO users_authority (id, authority)
VALUES ('ecd92500-b360-11ea-90f2-4f68855871cb', 'ROLE_USER');