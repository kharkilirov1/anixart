package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractIterator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/collections/AbstractIterator;", "T", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public abstract class AbstractIterator<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public State f63112b = State.NotReady;

    /* renamed from: c */
    @Nullable
    public T f63113c;

    /* compiled from: AbstractIterator.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public abstract void mo16754a();

    /* renamed from: b */
    public final void m31903b() {
        this.f63112b = State.Done;
    }

    /* renamed from: c */
    public final void m31904c(T t) {
        this.f63113c = t;
        this.f63112b = State.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        State state = this.f63112b;
        State state2 = State.Failed;
        if (!(state != state2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            this.f63112b = state2;
            mo16754a();
            if (this.f63112b == State.Ready) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f63112b = State.NotReady;
        return this.f63113c;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
