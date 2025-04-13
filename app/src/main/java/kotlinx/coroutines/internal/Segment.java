package kotlinx.coroutines.internal;

import com.fasterxml.jackson.core.util.TextBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.internal.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/internal/Segment;", "S", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class Segment<S extends Segment<S>> extends ConcurrentLinkedListNode<S> {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f68300d = AtomicIntegerFieldUpdater.newUpdater(Segment.class, "cleanedAndPointers");

    /* renamed from: c */
    public final long f68301c;

    @NotNull
    private volatile /* synthetic */ int cleanedAndPointers;

    public Segment(long j2, @Nullable S s, int i2) {
        super(s);
        this.f68301c = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    /* renamed from: c */
    public boolean mo34271c() {
        return this.cleanedAndPointers == mo34326h() && !m34272d();
    }

    /* renamed from: g */
    public final boolean m34325g() {
        return f68300d.addAndGet(this, -65536) == mo34326h() && !m34272d();
    }

    /* renamed from: h */
    public abstract int mo34326h();

    /* renamed from: i */
    public final boolean m34327i() {
        int i2;
        do {
            i2 = this.cleanedAndPointers;
            if (!(i2 != mo34326h() || m34272d())) {
                return false;
            }
        } while (!f68300d.compareAndSet(this, i2, TextBuffer.MAX_SEGMENT_LEN + i2));
        return true;
    }
}
