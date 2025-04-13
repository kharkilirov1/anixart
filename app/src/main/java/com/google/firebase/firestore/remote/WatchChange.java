package com.google.firebase.firestore.remote;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.protobuf.ByteString;
import io.grpc.Status;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes2.dex */
public abstract class WatchChange {

    public static final class DocumentChange extends WatchChange {

        /* renamed from: a */
        public final List<Integer> f22981a;

        /* renamed from: b */
        public final List<Integer> f22982b;

        /* renamed from: c */
        public final DocumentKey f22983c;

        /* renamed from: d */
        @Nullable
        public final MutableDocument f22984d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || DocumentChange.class != obj.getClass()) {
                return false;
            }
            DocumentChange documentChange = (DocumentChange) obj;
            if (!this.f22981a.equals(documentChange.f22981a) || !this.f22982b.equals(documentChange.f22982b) || !this.f22983c.equals(documentChange.f22983c)) {
                return false;
            }
            MutableDocument mutableDocument = this.f22984d;
            MutableDocument mutableDocument2 = documentChange.f22984d;
            return mutableDocument != null ? mutableDocument.equals(mutableDocument2) : mutableDocument2 == null;
        }

        public int hashCode() {
            int hashCode = (this.f22983c.hashCode() + ((this.f22982b.hashCode() + (this.f22981a.hashCode() * 31)) * 31)) * 31;
            MutableDocument mutableDocument = this.f22984d;
            return hashCode + (mutableDocument != null ? mutableDocument.hashCode() : 0);
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("DocumentChange{updatedTargetIds=");
            m24u.append(this.f22981a);
            m24u.append(", removedTargetIds=");
            m24u.append(this.f22982b);
            m24u.append(", key=");
            m24u.append(this.f22983c);
            m24u.append(", newDocument=");
            m24u.append(this.f22984d);
            m24u.append('}');
            return m24u.toString();
        }
    }

    public static final class ExistenceFilterWatchChange extends WatchChange {

        /* renamed from: a */
        public final int f22985a;

        /* renamed from: b */
        public final ExistenceFilter f22986b;

        public String toString() {
            StringBuilder m24u = C0000a.m24u("ExistenceFilterWatchChange{targetId=");
            m24u.append(this.f22985a);
            m24u.append(", existenceFilter=");
            m24u.append(this.f22986b);
            m24u.append('}');
            return m24u.toString();
        }
    }

    public static final class WatchTargetChange extends WatchChange {

        /* renamed from: a */
        public final WatchTargetChangeType f22987a;

        /* renamed from: b */
        public final List<Integer> f22988b;

        /* renamed from: c */
        public final ByteString f22989c;

        /* renamed from: d */
        @Nullable
        public final Status f22990d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || WatchTargetChange.class != obj.getClass()) {
                return false;
            }
            WatchTargetChange watchTargetChange = (WatchTargetChange) obj;
            if (this.f22987a != watchTargetChange.f22987a || !this.f22988b.equals(watchTargetChange.f22988b) || !this.f22989c.equals(watchTargetChange.f22989c)) {
                return false;
            }
            Status status = this.f22990d;
            if (status == null) {
                return watchTargetChange.f22990d == null;
            }
            Status status2 = watchTargetChange.f22990d;
            return status2 != null && status.f58291a.equals(status2.f58291a);
        }

        public int hashCode() {
            int hashCode = (this.f22989c.hashCode() + ((this.f22988b.hashCode() + (this.f22987a.hashCode() * 31)) * 31)) * 31;
            Status status = this.f22990d;
            return hashCode + (status != null ? status.f58291a.hashCode() : 0);
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("WatchTargetChange{changeType=");
            m24u.append(this.f22987a);
            m24u.append(", targetIds=");
            return C0576a.m4119r(m24u, this.f22988b, '}');
        }
    }

    public enum WatchTargetChangeType {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }
}
