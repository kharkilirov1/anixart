package androidx.core.util;

import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LruCache.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, m31884d2 = {"androidx/core/util/LruCacheKt$lruCache$4", "Landroid/util/LruCache;", "core-ktx_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$4 extends LruCache<Object, Object> {
    @Override // android.util.LruCache
    @Nullable
    public Object create(@NotNull Object key) {
        Intrinsics.m32179h(key, "key");
        throw null;
    }

    @Override // android.util.LruCache
    public void entryRemoved(boolean z, @NotNull Object key, @NotNull Object oldValue, @Nullable Object obj) {
        Intrinsics.m32179h(key, "key");
        Intrinsics.m32179h(oldValue, "oldValue");
        throw null;
    }

    @Override // android.util.LruCache
    public int sizeOf(@NotNull Object key, @NotNull Object value) {
        Intrinsics.m32179h(key, "key");
        Intrinsics.m32179h(value, "value");
        throw null;
    }
}
