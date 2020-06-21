DELETE FROM oauth_client_details;

INSERT INTO public.oauth_client_details (client_id, resource_ids, client_secret, scope, authorized_grant_types,
                                         web_server_redirect_uri, authorities, access_token_validity,
                                         refresh_token_validity, additional_information, autoapprove)
VALUES ('frontend', 'resources', '$2a$10$r0RFDmpneBVryx.ihHK9gu6FFJQi4nTxQUqzdSTvrPpaKZMxigqpy', 'read,write',
        'authorization_code,password', 'http://localhost:8081/oauth/login/client-app', 'ROLE_USER,ROLE_ADMIN', 1800,
        1800, '{}', 'true');