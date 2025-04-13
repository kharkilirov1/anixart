package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/CompletionHandlerBase;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Incomplete;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class JobNode extends CompletionHandlerBase implements DisposableHandle, Incomplete {

    /* renamed from: e */
    public JobSupport f67022e;

    @NotNull
    /* renamed from: S */
    public final JobSupport m34074S() {
        JobSupport jobSupport = this.f67022e;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.m32189r("job");
        throw null;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: a */
    public boolean getF66993b() {
        return true;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    /* renamed from: f */
    public void mo34038f() {
        boolean z;
        JobSupport m34074S = m34074S();
        do {
            Object m34088a0 = m34074S.m34088a0();
            if (!(m34088a0 instanceof JobNode)) {
                if (!(m34088a0 instanceof Incomplete) || ((Incomplete) m34088a0).getF67030b() == null) {
                    return;
                }
                mo34192O();
                return;
            }
            if (m34088a0 != this) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.f67023b;
            Empty empty = JobSupportKt.f67042g;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(m34074S, m34088a0, empty)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(m34074S) != m34088a0) {
                    z = false;
                    break;
                }
            }
        } while (!z);
    }

    @Override // kotlinx.coroutines.Incomplete
    @Nullable
    /* renamed from: m */
    public NodeList getF67030b() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '@' + DebugStringsKt.m34023b(this) + "[job@" + DebugStringsKt.m34023b(m34074S()) + ']';
    }
}
