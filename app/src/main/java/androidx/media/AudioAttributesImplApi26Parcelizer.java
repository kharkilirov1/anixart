package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f4774a = (AudioAttributes) versionedParcel.m4324n(audioAttributesImplApi26.f4774a, 1);
        audioAttributesImplApi26.f4775b = versionedParcel.m4322l(audioAttributesImplApi26.f4775b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.mo4328r(false, false);
        AudioAttributes audioAttributes = audioAttributesImplApi26.f4774a;
        versionedParcel.mo4327q(1);
        versionedParcel.mo4333w(audioAttributes);
        int i2 = audioAttributesImplApi26.f4775b;
        versionedParcel.mo4327q(2);
        versionedParcel.mo4332v(i2);
    }
}
