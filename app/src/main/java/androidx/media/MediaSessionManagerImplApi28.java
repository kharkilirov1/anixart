package androidx.media;

import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;
import androidx.media.MediaSessionManagerImplBase;

@RequiresApi
/* loaded from: classes.dex */
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {

    @RequiresApi
    public static final class RemoteUserInfoImplApi28 extends MediaSessionManagerImplBase.RemoteUserInfoImplBase {
        public RemoteUserInfoImplApi28(String str, int i2, int i3) {
            super(str, i2, i3);
            new MediaSessionManager.RemoteUserInfo(str, i2, i3);
        }

        public RemoteUserInfoImplApi28(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        }
    }
}
