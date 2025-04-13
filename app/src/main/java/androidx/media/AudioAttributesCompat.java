package androidx.media;

import android.os.Build;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000a.C0000a;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements VersionedParcelable {

    /* renamed from: b */
    public static final /* synthetic */ int f4771b = 0;

    /* renamed from: a */
    @RestrictTo
    public AudioAttributesImpl f4772a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AttributeContentType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AttributeUsage {
    }

    public static abstract class AudioManagerHidden {
    }

    public static class Builder {

        /* renamed from: a */
        public final AudioAttributesImpl.Builder f4773a;

        public Builder() {
            int i2 = AudioAttributesCompat.f4771b;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f4773a = new AudioAttributesImplApi26.Builder();
            } else {
                this.f4773a = new AudioAttributesImplApi21.Builder();
            }
        }

        /* renamed from: a */
        public AudioAttributesCompat m3283a() {
            return new AudioAttributesCompat(this.f4773a.mo3286A());
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    @RestrictTo
    public AudioAttributesCompat() {
    }

    /* renamed from: c */
    public static int m3282c(boolean z, int i2, int i3) {
        if ((i2 & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i2 & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i3) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (z) {
                    throw new IllegalArgumentException(C0000a.m8e("Unknown usage value ", i3, " in audio attributes"));
                }
                return 3;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f4772a;
        return audioAttributesImpl == null ? audioAttributesCompat.f4772a == null : audioAttributesImpl.equals(audioAttributesCompat.f4772a);
    }

    public int hashCode() {
        return this.f4772a.hashCode();
    }

    public String toString() {
        return this.f4772a.toString();
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f4772a = audioAttributesImpl;
    }
}
