package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.Map;
import java.util.Set;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class RemoteEvent {

    /* renamed from: a */
    public final SnapshotVersion f22947a;

    /* renamed from: b */
    public final Map<Integer, TargetChange> f22948b;

    /* renamed from: c */
    public final Set<Integer> f22949c;

    /* renamed from: d */
    public final Map<DocumentKey, MutableDocument> f22950d;

    /* renamed from: e */
    public final Set<DocumentKey> f22951e;

    public String toString() {
        StringBuilder m24u = C0000a.m24u("RemoteEvent{snapshotVersion=");
        m24u.append(this.f22947a);
        m24u.append(", targetChanges=");
        m24u.append(this.f22948b);
        m24u.append(", targetMismatches=");
        m24u.append(this.f22949c);
        m24u.append(", documentUpdates=");
        m24u.append(this.f22950d);
        m24u.append(", resolvedLimboDocuments=");
        m24u.append(this.f22951e);
        m24u.append('}');
        return m24u.toString();
    }
}
