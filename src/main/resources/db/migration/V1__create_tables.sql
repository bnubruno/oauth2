CREATE TABLE IF NOT EXISTS users
(
    id               uuid        NOT NULL PRIMARY KEY,
    username         VARCHAR(50) NOT NULL,
    email            VARCHAR(50),
    password         VARCHAR(500),
    activated        BOOLEAN     DEFAULT FALSE,
    activationkey    VARCHAR(50) DEFAULT NULL,
    resetpasswordkey VARCHAR(50) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS authority
(
    name VARCHAR(50) NOT NULL PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS users_authority
(
    id        uuid        NOT NULL,
    authority VARCHAR(50) NOT NULL,
    FOREIGN KEY (id) REFERENCES users (id),
    FOREIGN KEY (authority) REFERENCES authority (name)
);

CREATE TABLE IF NOT EXISTS oauth_access_token
(
    token_id          VARCHAR(256) DEFAULT NULL,
    token             bytea,
    authentication_id VARCHAR(256) DEFAULT NULL,
    user_name         VARCHAR(256) DEFAULT NULL,
    client_id         VARCHAR(256) DEFAULT NULL,
    authentication    bytea,
    refresh_token     VARCHAR(256) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS oauth_refresh_token
(
    token_id       VARCHAR(256) DEFAULT NULL,
    token          bytea,
    authentication bytea
);

CREATE TABLE IF NOT EXISTS oauth_client_details
(
    client_id               VARCHAR(255) PRIMARY KEY,
    resource_ids            VARCHAR(255),
    client_secret           VARCHAR(255),
    scope                   VARCHAR(255),
    authorized_grant_types  VARCHAR(255),
    web_server_redirect_uri VARCHAR(255),
    authorities             VARCHAR(255),
    access_token_validity   INTEGER,
    refresh_token_validity  INTEGER,
    additional_information  VARCHAR(4096),
    autoapprove             VARCHAR(255)
);