package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/InactiveNodeList;", "Lkotlinx/coroutines/Incomplete;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class InactiveNodeList implements Incomplete {

    /* renamed from: b */
    @NotNull
    public final NodeList f67010b;

    public InactiveNodeList(@NotNull NodeList nodeList) {
        this.f67010b = nodeList;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: a */
    public boolean mo34039a() {
        return false;
    }

    @Override // kotlinx.coroutines.Incomplete
    @NotNull
    /* renamed from: m, reason: from getter */
    public NodeList getF67010b() {
        return this.f67010b;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }
}
