package com.google.firebase.firestore.model;

import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
/* loaded from: classes2.dex */
public abstract class FieldIndex {

    /* renamed from: a */
    public static final /* synthetic */ int f22852a = 0;

    @AutoValue
    public static abstract class IndexOffset implements Comparable<IndexOffset> {

        /* renamed from: b */
        public static final IndexOffset f22853b = new AutoValue_FieldIndex_IndexOffset(SnapshotVersion.f22878c, DocumentKey.m12440b(), -1);

        /* renamed from: b */
        public static IndexOffset m12444b(Document document) {
            return new AutoValue_FieldIndex_IndexOffset(document.mo12438b(), document.getKey(), -1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(IndexOffset indexOffset) {
            int compareTo = mo12422e().compareTo(indexOffset.mo12422e());
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = mo12420c().compareTo(indexOffset.mo12420c());
            return compareTo2 != 0 ? compareTo2 : Integer.compare(mo12421d(), indexOffset.mo12421d());
        }

        /* renamed from: c */
        public abstract DocumentKey mo12420c();

        /* renamed from: d */
        public abstract int mo12421d();

        /* renamed from: e */
        public abstract SnapshotVersion mo12422e();
    }

    @AutoValue
    public static abstract class IndexState {
        /* renamed from: a */
        public abstract IndexOffset mo12423a();

        /* renamed from: b */
        public abstract long mo12424b();
    }

    @AutoValue
    public static abstract class Segment implements Comparable<Segment> {

        public enum Kind {
            ASCENDING,
            DESCENDING,
            CONTAINS
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Segment segment) {
            int compareTo = mo12425b().compareTo(segment.mo12425b());
            return compareTo != 0 ? compareTo : mo12426c().compareTo(segment.mo12426c());
        }

        /* renamed from: b */
        public abstract FieldPath mo12425b();

        /* renamed from: c */
        public abstract Kind mo12426c();
    }

    static {
        new AutoValue_FieldIndex_IndexState(0L, IndexOffset.f22853b);
    }

    /* renamed from: a */
    public abstract String mo12417a();

    /* renamed from: b */
    public abstract int mo12418b();

    /* renamed from: c */
    public abstract List<Segment> mo12419c();
}
