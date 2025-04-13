package io.grpc.util;

import io.grpc.ExperimentalApi;
import io.grpc.HandlerRegistry;
import io.grpc.ServerServiceDefinition;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes3.dex */
public final class MutableHandlerRegistry extends HandlerRegistry {

    /* renamed from: a */
    public final ConcurrentMap<String, ServerServiceDefinition> f59524a = new ConcurrentHashMap();
}
