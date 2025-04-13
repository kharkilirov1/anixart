package androidx.media;

import android.text.TextUtils;
import androidx.core.util.ObjectsCompat;
import androidx.media.MediaSessionManager;

/* loaded from: classes.dex */
class MediaSessionManagerImplBase implements MediaSessionManager.MediaSessionManagerImpl {

    public static class RemoteUserInfoImplBase implements MediaSessionManager.RemoteUserInfoImpl {

        /* renamed from: a */
        public String f4873a;

        /* renamed from: b */
        public int f4874b;

        /* renamed from: c */
        public int f4875c;

        public RemoteUserInfoImplBase(String str, int i2, int i3) {
            this.f4873a = str;
            this.f4874b = i2;
            this.f4875c = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteUserInfoImplBase)) {
                return false;
            }
            RemoteUserInfoImplBase remoteUserInfoImplBase = (RemoteUserInfoImplBase) obj;
            return (this.f4874b < 0 || remoteUserInfoImplBase.f4874b < 0) ? TextUtils.equals(this.f4873a, remoteUserInfoImplBase.f4873a) && this.f4875c == remoteUserInfoImplBase.f4875c : TextUtils.equals(this.f4873a, remoteUserInfoImplBase.f4873a) && this.f4874b == remoteUserInfoImplBase.f4874b && this.f4875c == remoteUserInfoImplBase.f4875c;
        }

        public int hashCode() {
            return ObjectsCompat.m2023b(this.f4873a, Integer.valueOf(this.f4875c));
        }
    }

    static {
        boolean z = MediaSessionManager.f4871a;
    }
}
