package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/internal/Removed;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class Removed {

    /* renamed from: a */
    @JvmField
    @NotNull
    public final LockFreeLinkedListNode f68298a;

    public Removed(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f68298a = lockFreeLinkedListNode;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Removed[");
        m24u.append(this.f68298a);
        m24u.append(']');
        return m24u.toString();
    }
}
