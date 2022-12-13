package ru.surf.users.services.api;

import java.lang.System;

/**
 * Base interfaces for retrofit separate by HTTP methods
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005\u00a8\u0006\u0006"}, d2 = {"Lru/surf/users/services/api/UsersApi;", "Lru/surf/core/services/api/impl/ApiDelete;", "Lru/surf/users/services/api/impl/ApiGet;", "Lru/surf/users/services/api/impl/ApiPatch;", "Lru/surf/users/services/api/impl/ApiPost;", "Lru/surf/users/services/api/impl/ApiPut;", "users_debug"})
public abstract interface UsersApi extends ru.surf.core.services.api.impl.ApiDelete, ru.surf.users.services.api.impl.ApiGet, ru.surf.users.services.api.impl.ApiPatch, ru.surf.users.services.api.impl.ApiPost, ru.surf.users.services.api.impl.ApiPut {
}