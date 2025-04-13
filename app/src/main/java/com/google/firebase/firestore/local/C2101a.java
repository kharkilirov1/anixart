package com.google.firebase.firestore.local;

import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.util.Util;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.firestore.local.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2101a implements Comparator {

    /* renamed from: c */
    public static final /* synthetic */ C2101a f22825c = new C2101a(0);

    /* renamed from: d */
    public static final /* synthetic */ C2101a f22826d = new C2101a(1);

    /* renamed from: e */
    public static final /* synthetic */ C2101a f22827e = new C2101a(2);

    /* renamed from: f */
    public static final /* synthetic */ C2101a f22828f = new C2101a(3);

    /* renamed from: b */
    public final /* synthetic */ int f22829b;

    public /* synthetic */ C2101a(int i2) {
        this.f22829b = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f22829b) {
            case 0:
                DocumentReference documentReference = (DocumentReference) obj;
                DocumentReference documentReference2 = (DocumentReference) obj2;
                int compareTo = documentReference.f22780a.compareTo(documentReference2.f22780a);
                return compareTo != 0 ? compareTo : Util.m12499c(documentReference.f22781b, documentReference2.f22781b);
            case 1:
                DocumentReference documentReference3 = (DocumentReference) obj;
                DocumentReference documentReference4 = (DocumentReference) obj2;
                int m12499c = Util.m12499c(documentReference3.f22781b, documentReference4.f22781b);
                return m12499c != 0 ? m12499c : documentReference3.f22780a.compareTo(documentReference4.f22780a);
            case 2:
                Long l2 = (Long) obj2;
                int i2 = LruGarbageCollector.RollingSequenceNumberBuffer.f22788a;
                return l2.compareTo((Long) obj);
            default:
                return Util.m12499c(((MutationBatch) obj).f22896a, ((MutationBatch) obj2).f22896a);
        }
    }
}
