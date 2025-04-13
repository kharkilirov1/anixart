package kotlin.p033io;

import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ReadWrite.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"kotlin/io/LinesSequence$iterator$1", "", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class LinesSequence$iterator$1 implements Iterator<String>, KMappedMarker {

    /* renamed from: b */
    public final /* synthetic */ LinesSequence f63277b;

    public LinesSequence$iterator$1(LinesSequence linesSequence) {
        this.f63277b = linesSequence;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Objects.requireNonNull(this.f63277b);
        throw null;
    }

    @Override // java.util.Iterator
    public String next() {
        hasNext();
        throw null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
