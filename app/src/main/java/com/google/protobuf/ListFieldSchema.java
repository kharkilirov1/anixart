package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
abstract class ListFieldSchema {

    /* renamed from: a */
    public static final ListFieldSchema f24251a = new ListFieldSchemaFull(null);

    /* renamed from: b */
    public static final ListFieldSchema f24252b = new ListFieldSchemaLite(null);

    public static final class ListFieldSchemaFull extends ListFieldSchema {

        /* renamed from: c */
        public static final Class<?> f24253c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public ListFieldSchemaFull() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public static <L> List<L> m13480d(Object obj, long j2, int i2) {
            LazyStringArrayList lazyStringArrayList;
            List<L> list = (List) UnsafeUtil.m13691r(obj, j2);
            if (list.isEmpty()) {
                List<L> lazyStringArrayList2 = list instanceof LazyStringList ? new LazyStringArrayList(i2) : ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mo13144N(i2) : new ArrayList<>(i2);
                UnsafeUtil.f24390e.m13724v(obj, j2, lazyStringArrayList2);
                return lazyStringArrayList2;
            }
            if (f24253c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i2);
                arrayList.addAll(list);
                UnsafeUtil.f24390e.m13724v(obj, j2, arrayList);
                lazyStringArrayList = arrayList;
            } else {
                if (!(list instanceof UnmodifiableLazyStringList)) {
                    if (!(list instanceof PrimitiveNonBoxingCollection) || !(list instanceof Internal.ProtobufList)) {
                        return list;
                    }
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.mo12988j1()) {
                        return list;
                    }
                    Internal.ProtobufList mo13144N = protobufList.mo13144N(list.size() + i2);
                    UnsafeUtil.f24390e.m13724v(obj, j2, mo13144N);
                    return mo13144N;
                }
                LazyStringArrayList lazyStringArrayList3 = new LazyStringArrayList(list.size() + i2);
                lazyStringArrayList3.addAll(lazyStringArrayList3.size(), (UnmodifiableLazyStringList) list);
                UnsafeUtil.f24390e.m13724v(obj, j2, lazyStringArrayList3);
                lazyStringArrayList = lazyStringArrayList3;
            }
            return lazyStringArrayList;
        }

        @Override // com.google.protobuf.ListFieldSchema
        /* renamed from: a */
        public void mo13477a(Object obj, long j2) {
            Object unmodifiableList;
            List list = (List) UnsafeUtil.m13691r(obj, j2);
            if (list instanceof LazyStringList) {
                unmodifiableList = ((LazyStringList) list).mo13476n();
            } else {
                if (f24253c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.mo12988j1()) {
                        protobufList.mo12989q();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            UnsafeUtil.f24390e.m13724v(obj, j2, unmodifiableList);
        }

        @Override // com.google.protobuf.ListFieldSchema
        /* renamed from: b */
        public <E> void mo13478b(Object obj, Object obj2, long j2) {
            List list = (List) UnsafeUtil.m13691r(obj2, j2);
            List m13480d = m13480d(obj, j2, list.size());
            int size = m13480d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                m13480d.addAll(list);
            }
            if (size > 0) {
                list = m13480d;
            }
            UnsafeUtil.f24390e.m13724v(obj, j2, list);
        }

        @Override // com.google.protobuf.ListFieldSchema
        /* renamed from: c */
        public <L> List<L> mo13479c(Object obj, long j2) {
            return m13480d(obj, j2, 10);
        }

        public ListFieldSchemaFull(C23811 c23811) {
            super(null);
        }
    }

    public static final class ListFieldSchemaLite extends ListFieldSchema {
        public ListFieldSchemaLite() {
            super(null);
        }

        /* renamed from: d */
        public static <E> Internal.ProtobufList<E> m13481d(Object obj, long j2) {
            return (Internal.ProtobufList) UnsafeUtil.m13691r(obj, j2);
        }

        @Override // com.google.protobuf.ListFieldSchema
        /* renamed from: a */
        public void mo13477a(Object obj, long j2) {
            m13481d(obj, j2).mo12989q();
        }

        @Override // com.google.protobuf.ListFieldSchema
        /* renamed from: b */
        public <E> void mo13478b(Object obj, Object obj2, long j2) {
            Internal.ProtobufList m13481d = m13481d(obj, j2);
            Internal.ProtobufList m13481d2 = m13481d(obj2, j2);
            int size = m13481d.size();
            int size2 = m13481d2.size();
            if (size > 0 && size2 > 0) {
                if (!m13481d.mo12988j1()) {
                    m13481d = m13481d.mo13144N(size2 + size);
                }
                m13481d.addAll(m13481d2);
            }
            if (size > 0) {
                m13481d2 = m13481d;
            }
            UnsafeUtil.f24390e.m13724v(obj, j2, m13481d2);
        }

        @Override // com.google.protobuf.ListFieldSchema
        /* renamed from: c */
        public <L> List<L> mo13479c(Object obj, long j2) {
            Internal.ProtobufList m13481d = m13481d(obj, j2);
            if (m13481d.mo12988j1()) {
                return m13481d;
            }
            int size = m13481d.size();
            Internal.ProtobufList mo13144N = m13481d.mo13144N(size == 0 ? 10 : size * 2);
            UnsafeUtil.f24390e.m13724v(obj, j2, mo13144N);
            return mo13144N;
        }

        public ListFieldSchemaLite(C23811 c23811) {
            super(null);
        }
    }

    public ListFieldSchema() {
    }

    /* renamed from: a */
    public abstract void mo13477a(Object obj, long j2);

    /* renamed from: b */
    public abstract <L> void mo13478b(Object obj, Object obj2, long j2);

    /* renamed from: c */
    public abstract <L> List<L> mo13479c(Object obj, long j2);

    public ListFieldSchema(C23811 c23811) {
    }
}
