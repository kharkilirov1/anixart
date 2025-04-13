package com.google.firebase.firestore.core;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.DocumentSet;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ViewSnapshot {

    /* renamed from: a */
    public final Query f22753a;

    /* renamed from: b */
    public final DocumentSet f22754b;

    /* renamed from: c */
    public final DocumentSet f22755c;

    /* renamed from: d */
    public final List<DocumentViewChange> f22756d;

    /* renamed from: e */
    public final boolean f22757e;

    /* renamed from: f */
    public final ImmutableSortedSet<DocumentKey> f22758f;

    /* renamed from: g */
    public final boolean f22759g;

    /* renamed from: h */
    public boolean f22760h;

    public enum SyncState {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LOCAL,
        SYNCED
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewSnapshot)) {
            return false;
        }
        ViewSnapshot viewSnapshot = (ViewSnapshot) obj;
        if (this.f22757e == viewSnapshot.f22757e && this.f22759g == viewSnapshot.f22759g && this.f22760h == viewSnapshot.f22760h && this.f22753a.equals(viewSnapshot.f22753a) && this.f22758f.equals(viewSnapshot.f22758f) && this.f22754b.equals(viewSnapshot.f22754b) && this.f22755c.equals(viewSnapshot.f22755c)) {
            return this.f22756d.equals(viewSnapshot.f22756d);
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f22758f.hashCode() + ((this.f22756d.hashCode() + ((this.f22755c.hashCode() + ((this.f22754b.hashCode() + (this.f22753a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + (this.f22757e ? 1 : 0)) * 31) + (this.f22759g ? 1 : 0)) * 31) + (this.f22760h ? 1 : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ViewSnapshot(");
        m24u.append(this.f22753a);
        m24u.append(", ");
        m24u.append(this.f22754b);
        m24u.append(", ");
        m24u.append(this.f22755c);
        m24u.append(", ");
        m24u.append(this.f22756d);
        m24u.append(", isFromCache=");
        m24u.append(this.f22757e);
        m24u.append(", mutatedKeys=");
        m24u.append(this.f22758f.size());
        m24u.append(", didSyncStateChange=");
        m24u.append(this.f22759g);
        m24u.append(", excludesMetadataChanges=");
        m24u.append(this.f22760h);
        m24u.append(")");
        return m24u.toString();
    }
}
