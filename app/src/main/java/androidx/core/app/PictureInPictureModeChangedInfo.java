package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class PictureInPictureModeChangedInfo {

    /* renamed from: a */
    public final boolean f3262a;

    public PictureInPictureModeChangedInfo(boolean z) {
        this.f3262a = z;
    }

    @RequiresApi
    public PictureInPictureModeChangedInfo(boolean z, @NonNull Configuration configuration) {
        this.f3262a = z;
    }
}
