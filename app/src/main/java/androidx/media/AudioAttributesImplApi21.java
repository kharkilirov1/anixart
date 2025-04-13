package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImpl;
import p000a.C0000a;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    @RestrictTo
    public AudioAttributes f4774a;

    /* renamed from: b */
    @RestrictTo
    public int f4775b;

    @RequiresApi
    public static class Builder implements AudioAttributesImpl.Builder {

        /* renamed from: a */
        public final AudioAttributes.Builder f4776a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        /* renamed from: A */
        public AudioAttributesImpl mo3286A() {
            return new AudioAttributesImplApi21(this.f4776a.build());
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        /* renamed from: a */
        public AudioAttributesImpl.Builder mo3287a(int i2) {
            this.f4776a.setLegacyStreamType(i2);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        /* renamed from: b */
        public AudioAttributesImpl.Builder mo3288b(int i2) {
            this.f4776a.setContentType(i2);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Builder mo3289c(int i2) {
            if (i2 == 16) {
                i2 = 12;
            }
            this.f4776a.setUsage(i2);
            return this;
        }
    }

    @RestrictTo
    public AudioAttributesImplApi21() {
        this.f4775b = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    /* renamed from: a */
    public int mo3284a() {
        int i2 = this.f4775b;
        return i2 != -1 ? i2 : AudioAttributesCompat.m3282c(false, this.f4774a.getFlags(), this.f4774a.getUsage());
    }

    @Override // androidx.media.AudioAttributesImpl
    @Nullable
    /* renamed from: b */
    public Object mo3285b() {
        return this.f4774a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f4774a.equals(((AudioAttributesImplApi21) obj).f4774a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4774a.hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("AudioAttributesCompat: audioattributes=");
        m24u.append(this.f4774a);
        return m24u.toString();
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f4775b = -1;
        this.f4774a = audioAttributes;
        this.f4775b = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i2) {
        this.f4775b = -1;
        this.f4774a = audioAttributes;
        this.f4775b = i2;
    }
}
