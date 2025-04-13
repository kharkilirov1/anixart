package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/JobImpl;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableJob;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class JobImpl extends JobSupport implements CompletableJob {

    /* renamed from: c */
    public final boolean f67021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobImpl(@Nullable Job job) {
        super(true);
        boolean z = true;
        m34090d0(job);
        ChildHandle m34087Z = m34087Z();
        ChildHandleNode childHandleNode = m34087Z instanceof ChildHandleNode ? (ChildHandleNode) m34087Z : null;
        JobSupport m34074S = childHandleNode == null ? null : childHandleNode.m34074S();
        if (m34074S != null) {
            while (!m34074S.getF67021c()) {
                ChildHandle m34087Z2 = m34074S.m34087Z();
                ChildHandleNode childHandleNode2 = m34087Z2 instanceof ChildHandleNode ? (ChildHandleNode) m34087Z2 : null;
                m34074S = childHandleNode2 == null ? null : childHandleNode2.m34074S();
                if (m34074S == null) {
                }
            }
            this.f67021c = z;
        }
        z = false;
        this.f67021c = z;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: V, reason: from getter */
    public boolean getF67021c() {
        return this.f67021c;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: W */
    public boolean mo34068W() {
        return true;
    }
}
