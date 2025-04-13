package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.MediaSessionManagerImplApi28;
import androidx.media.MediaSessionManagerImplBase;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MediaSessionManager {

    /* renamed from: a */
    public static final boolean f4871a = Log.isLoggable("MediaSessionManager", 3);

    public interface MediaSessionManagerImpl {
    }

    public interface RemoteUserInfoImpl {
    }

    public static final class RemoteUserInfo {

        /* renamed from: a */
        public RemoteUserInfoImpl f4872a;

        public RemoteUserInfo(@NonNull String str, int i2, int i3) {
            Objects.requireNonNull(str, "package shouldn't be null");
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.f4872a = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(str, i2, i3);
            } else {
                this.f4872a = new MediaSessionManagerImplBase.RemoteUserInfoImplBase(str, i2, i3);
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteUserInfo) {
                return this.f4872a.equals(((RemoteUserInfo) obj).f4872a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4872a.hashCode();
        }

        @RequiresApi
        @RestrictTo
        public RemoteUserInfo(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String packageName = remoteUserInfo.getPackageName();
            Objects.requireNonNull(packageName, "package shouldn't be null");
            if (!TextUtils.isEmpty(packageName)) {
                this.f4872a = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(remoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }
}
