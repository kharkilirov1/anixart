package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class LazyField extends LazyFieldLite {

    public static class LazyEntry<K> implements Map.Entry<K, Object> {

        /* renamed from: b */
        public Map.Entry<K, LazyField> f65675b;

        public LazyEntry(Map.Entry entry, C66971 c66971) {
            this.f65675b = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f65675b.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyField value = this.f65675b.getValue();
            if (value == null) {
                return null;
            }
            return value.m33331a();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (!(obj instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            LazyField value = this.f65675b.getValue();
            MessageLite messageLite = value.f65678b;
            value.f65678b = (MessageLite) obj;
            value.f65677a = true;
            return messageLite;
        }
    }

    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b */
        public Iterator<Map.Entry<K, Object>> f65676b;

        public LazyIterator(Iterator<Map.Entry<K, Object>> it) {
            this.f65676b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65676b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            Map.Entry<K, Object> next = this.f65676b.next();
            return next.getValue() instanceof LazyField ? new LazyEntry(next, null) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f65676b.remove();
        }
    }

    /* renamed from: a */
    public MessageLite m33331a() {
        if (this.f65678b == null) {
            synchronized (this) {
                if (this.f65678b == null) {
                    try {
                        this.f65678b = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.f65678b;
    }

    public boolean equals(Object obj) {
        return m33331a().equals(obj);
    }

    public int hashCode() {
        return m33331a().hashCode();
    }

    public String toString() {
        return m33331a().toString();
    }
}
