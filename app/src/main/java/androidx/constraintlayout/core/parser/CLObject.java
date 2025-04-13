package androidx.constraintlayout.core.parser;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    public class CLObjectIterator implements Iterator {

        /* renamed from: b */
        public CLObject f2086b;

        public CLObjectIterator(CLObject cLObject, CLObject cLObject2) {
            this.f2086b = cLObject2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Objects.requireNonNull(this.f2086b);
            throw null;
        }

        @Override // java.util.Iterator
        public Object next() {
            Objects.requireNonNull(this.f2086b);
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        return new CLObjectIterator(this, this);
    }
}
