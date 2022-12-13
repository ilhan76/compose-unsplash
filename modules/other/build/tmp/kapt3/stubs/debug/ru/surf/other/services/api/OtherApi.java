package ru.surf.other.services.api;

import java.lang.System;

/**
 * Base interfaces for retrofit separate by HTTP methods
 *
 * @author Vitaliy Zarubin
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005\u00a8\u0006\u0006"}, d2 = {"Lru/surf/other/services/api/OtherApi;", "Lru/surf/core/services/api/impl/ApiDelete;", "Lru/surf/other/services/api/impl/ApiGet;", "Lru/surf/other/services/api/impl/ApiPatch;", "Lru/surf/other/services/api/impl/ApiPost;", "Lru/surf/other/services/api/impl/ApiPut;", "other_debug"})
public abstract interface OtherApi extends ru.surf.core.services.api.impl.ApiDelete, ru.surf.other.services.api.impl.ApiGet, ru.surf.other.services.api.impl.ApiPatch, ru.surf.other.services.api.impl.ApiPost, ru.surf.other.services.api.impl.ApiPut {
}