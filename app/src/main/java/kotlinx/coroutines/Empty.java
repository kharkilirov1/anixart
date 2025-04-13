package kotlinx.coroutines;

import androidx.room.util.C0576a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/Empty;", "Lkotlinx/coroutines/Incomplete;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class Empty implements Incomplete {

    /* renamed from: b */
    public final boolean f66993b;

    public Empty(boolean z) {
        this.f66993b = z;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: a, reason: from getter */
    public boolean getF66993b() {
        return this.f66993b;
    }

    @Override // kotlinx.coroutines.Incomplete
    @Nullable
    /* renamed from: m */
    public NodeList getF67010b() {
        return null;
    }

    @NotNull
    public String toString() {
        return C0576a.m4118q(C0000a.m24u("Empty{"), this.f66993b ? "Active" : "New", '}');
    }
}
