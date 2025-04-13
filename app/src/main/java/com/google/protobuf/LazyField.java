package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class LazyField extends LazyFieldLite {

    public static class LazyEntry<K> implements Map.Entry<K, Object> {

        /* renamed from: b */
        public Map.Entry<K, LazyField> f24245b;

        public LazyEntry(Map.Entry entry, C23801 c23801) {
            this.f24245b = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f24245b.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyField value = this.f24245b.getValue();
            if (value == null) {
                return null;
            }
            return value.m13466c();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (!(obj instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            LazyField value = this.f24245b.getValue();
            MessageLite messageLite = value.f24247a;
            value.f24248b = null;
            value.f24247a = (MessageLite) obj;
            return messageLite;
        }
    }

    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b */
        public Iterator<Map.Entry<K, Object>> f24246b;

        public LazyIterator(Iterator<Map.Entry<K, Object>> it) {
            this.f24246b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24246b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            Map.Entry<K, Object> next = this.f24246b.next();
            return next.getValue() instanceof LazyField ? new LazyEntry(next, null) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f24246b.remove();
        }
    }

    /* renamed from: c */
    public MessageLite m13466c() {
        return m13467a(null);
    }

    @Override // com.google.protobuf.LazyFieldLite
    public boolean equals(Object obj) {
        return m13466c().equals(obj);
    }

    @Override // com.google.protobuf.LazyFieldLite
    public int hashCode() {
        return m13466c().hashCode();
    }

    public String toString() {
        return m13466c().toString();
    }
}
