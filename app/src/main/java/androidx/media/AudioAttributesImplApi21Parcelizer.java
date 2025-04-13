package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4774a = (AudioAttributes) versionedParcel.m4324n(audioAttributesImplApi21.f4774a, 1);
        audioAttributesImplApi21.f4775b = versionedParcel.m4322l(audioAttributesImplApi21.f4775b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.mo4328r(false, false);
        AudioAttributes audioAttributes = audioAttributesImplApi21.f4774a;
        versionedParcel.mo4327q(1);
        versionedParcel.mo4333w(audioAttributes);
        int i2 = audioAttributesImplApi21.f4775b;
        versionedParcel.mo4327q(2);
        versionedParcel.mo4332v(i2);
    }
}
