package ru.surf.core.services.api;

import java.lang.System;

/**
 * Base interfaces for retrofit separate by HTTP methods
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005\u00a8\u0006\u0006"}, d2 = {"Lru/surf/core/services/api/CoreApi;", "Lru/surf/core/services/api/impl/ApiDelete;", "Lru/surf/core/services/api/impl/ApiGet;", "Lru/surf/core/services/api/impl/ApiPatch;", "Lru/surf/core/services/api/impl/ApiPost;", "Lru/surf/core/services/api/impl/ApiPut;", "core_debug"})
public abstract interface CoreApi extends ru.surf.core.services.api.impl.ApiDelete, ru.surf.core.services.api.impl.ApiGet, ru.surf.core.services.api.impl.ApiPatch, ru.surf.core.services.api.impl.ApiPost, ru.surf.core.services.api.impl.ApiPut {
}