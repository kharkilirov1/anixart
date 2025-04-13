package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Job.kt */
@InternalCoroutinesApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/NonDisposableHandle;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/ChildHandle;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class NonDisposableHandle implements DisposableHandle, ChildHandle {

    /* renamed from: b */
    @NotNull
    public static final NonDisposableHandle f67044b = new NonDisposableHandle();

    @Override // kotlinx.coroutines.DisposableHandle
    /* renamed from: f */
    public void mo34038f() {
    }

    @Override // kotlinx.coroutines.ChildHandle
    @Nullable
    public Job getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.ChildHandle
    /* renamed from: l */
    public boolean mo33998l(@NotNull Throwable th) {
        return false;
    }

    @NotNull
    public String toString() {
        return "NonDisposableHandle";
    }
}
