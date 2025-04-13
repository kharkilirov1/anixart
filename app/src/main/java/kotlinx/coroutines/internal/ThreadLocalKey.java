package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadContext.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/internal/ThreadLocalKey;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/internal/ThreadLocalElement;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes3.dex */
public final /* data */ class ThreadLocalKey implements CoroutineContext.Key<ThreadLocalElement<?>> {
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreadLocalKey)) {
            return false;
        }
        Objects.requireNonNull((ThreadLocalKey) obj);
        return Intrinsics.m32174c(null, null);
    }

    public int hashCode() {
        throw null;
    }

    @NotNull
    public String toString() {
        return "ThreadLocalKey(threadLocal=null)";
    }
}
