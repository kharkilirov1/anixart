package kotlinx.coroutines.scheduling;

import kotlin.Metadata;

/* compiled from: Tasks.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/TaskContextImpl;", "Lkotlinx/coroutines/scheduling/TaskContext;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class TaskContextImpl implements TaskContext {

    /* renamed from: b */
    public final int f68358b;

    public TaskContextImpl(int i2) {
        this.f68358b = i2;
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    /* renamed from: h */
    public void mo34376h() {
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    /* renamed from: j, reason: from getter */
    public int getF68358b() {
        return this.f68358b;
    }
}
