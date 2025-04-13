package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    @RequiresApi
    public static class Builder extends AudioAttributesImplApi21.Builder {
        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        @NonNull
        /* renamed from: A */
        public AudioAttributesImpl mo3286A() {
            return new AudioAttributesImplApi26(this.f4776a.build());
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        @NonNull
        /* renamed from: c */
        public AudioAttributesImpl.Builder mo3289c(int i2) {
            this.f4776a.setUsage(i2);
            return this;
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder
        @NonNull
        /* renamed from: d */
        public AudioAttributesImplApi21.Builder mo3289c(int i2) {
            this.f4776a.setUsage(i2);
            return this;
        }
    }

    @RestrictTo
    public AudioAttributesImplApi26() {
    }

    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
