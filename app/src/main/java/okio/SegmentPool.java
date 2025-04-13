package okio;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SegmentPool.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/SegmentPool;", "", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class SegmentPool {

    /* renamed from: b */
    public static final int f68801b;

    /* renamed from: c */
    public static final AtomicReference<Segment>[] f68802c;

    /* renamed from: d */
    public static final SegmentPool f68803d = new SegmentPool();

    /* renamed from: a */
    public static final Segment f68800a = new Segment(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f68801b = highestOneBit;
        AtomicReference<Segment>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference<>();
        }
        f68802c = atomicReferenceArr;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m34617b(@NotNull Segment segment) {
        AtomicReference<Segment> m34619a;
        Segment segment2;
        if (!(segment.f68798f == null && segment.f68799g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f68796d || (segment2 = (m34619a = f68803d.m34619a()).get()) == f68800a) {
            return;
        }
        int i2 = segment2 != null ? segment2.f68795c : 0;
        if (i2 >= 65536) {
            return;
        }
        segment.f68798f = segment2;
        segment.f68794b = 0;
        segment.f68795c = i2 + RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST;
        if (m34619a.compareAndSet(segment2, segment)) {
            return;
        }
        segment.f68798f = null;
    }

    @JvmStatic
    @NotNull
    /* renamed from: c */
    public static final Segment m34618c() {
        AtomicReference<Segment> m34619a = f68803d.m34619a();
        Segment segment = f68800a;
        Segment andSet = m34619a.getAndSet(segment);
        if (andSet == segment) {
            return new Segment();
        }
        if (andSet == null) {
            m34619a.set(null);
            return new Segment();
        }
        m34619a.set(andSet.f68798f);
        andSet.f68798f = null;
        andSet.f68795c = 0;
        return andSet;
    }

    /* renamed from: a */
    public final AtomicReference<Segment> m34619a() {
        Thread currentThread = Thread.currentThread();
        Intrinsics.m32178g(currentThread, "Thread.currentThread()");
        return f68802c[(int) (currentThread.getId() & (f68801b - 1))];
    }
}
