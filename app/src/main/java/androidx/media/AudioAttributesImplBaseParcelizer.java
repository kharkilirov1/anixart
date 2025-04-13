package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4777a = versionedParcel.m4322l(audioAttributesImplBase.f4777a, 1);
        audioAttributesImplBase.f4778b = versionedParcel.m4322l(audioAttributesImplBase.f4778b, 2);
        audioAttributesImplBase.f4779c = versionedParcel.m4322l(audioAttributesImplBase.f4779c, 3);
        audioAttributesImplBase.f4780d = versionedParcel.m4322l(audioAttributesImplBase.f4780d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.mo4328r(false, false);
        int i2 = audioAttributesImplBase.f4777a;
        versionedParcel.mo4327q(1);
        versionedParcel.mo4332v(i2);
        int i3 = audioAttributesImplBase.f4778b;
        versionedParcel.mo4327q(2);
        versionedParcel.mo4332v(i3);
        int i4 = audioAttributesImplBase.f4779c;
        versionedParcel.mo4327q(3);
        versionedParcel.mo4332v(i4);
        int i5 = audioAttributesImplBase.f4780d;
        versionedParcel.mo4327q(4);
        versionedParcel.mo4332v(i5);
    }
}
