package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class VolumeProviderCompat {

    /* renamed from: androidx.media.VolumeProviderCompat$1 */
    class C04561 extends VolumeProvider {
        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i2) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i2) {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: androidx.media.VolumeProviderCompat$2 */
    class C04572 extends VolumeProvider {
        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i2) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i2) {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m3311a(VolumeProvider volumeProvider, int i2) {
            volumeProvider.setCurrentVolume(i2);
        }
    }

    public static abstract class Callback {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ControlType {
    }
}
