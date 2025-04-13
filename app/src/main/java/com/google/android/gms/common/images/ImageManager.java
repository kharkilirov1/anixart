package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class ImageManager {

    /* renamed from: a */
    public static final Object f15637a = new Object();

    /* renamed from: b */
    public static HashSet<Uri> f15638b = new HashSet<>();

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepName
    public final class ImageReceiver extends ResultReceiver {

        /* renamed from: b */
        public final /* synthetic */ ImageManager f15639b;

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i2, Bundle bundle) {
            ImageManager imageManager = this.f15639b;
            Object obj = ImageManager.f15637a;
            Objects.requireNonNull(imageManager);
            throw null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface OnImageLoadedListener {
    }
}
