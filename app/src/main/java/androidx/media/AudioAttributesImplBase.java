package androidx.media;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    @RestrictTo
    public int f4777a;

    /* renamed from: b */
    @RestrictTo
    public int f4778b;

    /* renamed from: c */
    @RestrictTo
    public int f4779c;

    /* renamed from: d */
    @RestrictTo
    public int f4780d;

    public static class Builder implements AudioAttributesImpl.Builder {

        /* renamed from: a */
        public int f4781a = 0;

        /* renamed from: b */
        public int f4782b = 0;

        /* renamed from: c */
        public int f4783c = 0;

        /* renamed from: d */
        public int f4784d = -1;

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        /* renamed from: A */
        public AudioAttributesImpl mo3286A() {
            return new AudioAttributesImplBase(this.f4782b, this.f4783c, this.f4781a, this.f4784d);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        /* renamed from: a */
        public AudioAttributesImpl.Builder mo3287a(int i2) {
            if (i2 == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.f4784d = i2;
            int i3 = 2;
            switch (i2) {
                case 0:
                    this.f4782b = 1;
                    break;
                case 1:
                    this.f4782b = 4;
                    break;
                case 2:
                    this.f4782b = 4;
                    break;
                case 3:
                    this.f4782b = 2;
                    break;
                case 4:
                    this.f4782b = 4;
                    break;
                case 5:
                    this.f4782b = 4;
                    break;
                case 6:
                    this.f4782b = 1;
                    this.f4783c |= 4;
                    break;
                case 7:
                    this.f4783c |= 1;
                    this.f4782b = 4;
                    break;
                case 8:
                    this.f4782b = 4;
                    break;
                case 9:
                    this.f4782b = 4;
                    break;
                case 10:
                    this.f4782b = 1;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i2 + " for AudioAttributesCompat");
                    break;
            }
            switch (i2) {
                case 0:
                case 6:
                    break;
                case 1:
                case 7:
                    i3 = 13;
                    break;
                case 2:
                    i3 = 6;
                    break;
                case 3:
                    i3 = 1;
                    break;
                case 4:
                    i3 = 4;
                    break;
                case 5:
                    i3 = 5;
                    break;
                case 8:
                    i3 = 3;
                    break;
                case 9:
                default:
                    i3 = 0;
                    break;
                case 10:
                    i3 = 11;
                    break;
            }
            this.f4781a = i3;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        /* renamed from: b */
        public AudioAttributesImpl.Builder mo3288b(int i2) {
            if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                this.f4782b = i2;
            } else {
                this.f4782b = 0;
            }
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @NonNull
        /* renamed from: c */
        public AudioAttributesImpl.Builder mo3289c(int i2) {
            switch (i2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f4781a = i2;
                    return this;
                case 16:
                    this.f4781a = 12;
                    return this;
                default:
                    this.f4781a = 0;
                    return this;
            }
        }
    }

    @RestrictTo
    public AudioAttributesImplBase() {
        this.f4777a = 0;
        this.f4778b = 0;
        this.f4779c = 0;
        this.f4780d = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    /* renamed from: a */
    public int mo3284a() {
        int i2 = this.f4780d;
        return i2 != -1 ? i2 : AudioAttributesCompat.m3282c(false, this.f4779c, this.f4777a);
    }

    @Override // androidx.media.AudioAttributesImpl
    @Nullable
    /* renamed from: b */
    public Object mo3285b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f4778b != audioAttributesImplBase.f4778b) {
            return false;
        }
        int i2 = this.f4779c;
        int i3 = audioAttributesImplBase.f4779c;
        int i4 = audioAttributesImplBase.f4780d;
        if (i4 == -1) {
            i4 = AudioAttributesCompat.m3282c(false, i3, audioAttributesImplBase.f4777a);
        }
        if (i4 == 6) {
            i3 |= 4;
        } else if (i4 == 7) {
            i3 |= 1;
        }
        return i2 == (i3 & 273) && this.f4777a == audioAttributesImplBase.f4777a && this.f4780d == audioAttributesImplBase.f4780d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4778b), Integer.valueOf(this.f4779c), Integer.valueOf(this.f4777a), Integer.valueOf(this.f4780d)});
    }

    @NonNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4780d != -1) {
            sb.append(" stream=");
            sb.append(this.f4780d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i2 = this.f4777a;
        int i3 = AudioAttributesCompat.f4771b;
        switch (i2) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = C0000a.m7d("unknown usage ", i2);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f4778b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4779c).toUpperCase());
        return sb.toString();
    }

    public AudioAttributesImplBase(int i2, int i3, int i4, int i5) {
        this.f4777a = 0;
        this.f4778b = 0;
        this.f4779c = 0;
        this.f4780d = -1;
        this.f4778b = i2;
        this.f4779c = i3;
        this.f4777a = i4;
        this.f4780d = i5;
    }
}
