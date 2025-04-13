package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelable;

@RestrictTo
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        VersionedParcelable versionedParcelable = audioAttributesCompat.f4772a;
        if (versionedParcel.mo4320j(1)) {
            versionedParcelable = versionedParcel.m4326p();
        }
        audioAttributesCompat.f4772a = (AudioAttributesImpl) versionedParcelable;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo4328r(false, false);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f4772a;
        versionedParcel.mo4327q(1);
        versionedParcel.m4335y(audioAttributesImpl);
    }
}
