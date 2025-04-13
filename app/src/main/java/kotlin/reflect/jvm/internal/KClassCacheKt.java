package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.pcollections.HashPMap;

/* compiled from: kClassCache.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-reflect-api"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KClassCacheKt {

    /* renamed from: a */
    public static HashPMap<String, Object> f63475a;

    static {
        HashPMap hashPMap = HashPMap.f66525c;
        Intrinsics.m32175d(hashPMap, "HashPMap.empty<String, Any>()");
        f63475a = hashPMap;
    }
}
