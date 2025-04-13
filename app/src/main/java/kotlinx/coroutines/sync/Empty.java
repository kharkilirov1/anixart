package kotlinx.coroutines.sync;

import androidx.room.util.C0576a;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: Mutex.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/sync/Empty;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class Empty {

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Object f68399a;

    public Empty(@NotNull Object obj) {
        this.f68399a = obj;
    }

    @NotNull
    public String toString() {
        return C0576a.m4117p(C0000a.m24u("Empty["), this.f68399a, ']');
    }
}
