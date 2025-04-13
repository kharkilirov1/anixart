package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import org.jetbrains.annotations.NotNull;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/NodeList;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/Incomplete;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class NodeList extends LockFreeLinkedListHead implements Incomplete {
    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: a */
    public boolean mo34039a() {
        return true;
    }

    @Override // kotlinx.coroutines.Incomplete
    @NotNull
    /* renamed from: m */
    public NodeList mo34040m() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return super.toString();
    }
}
