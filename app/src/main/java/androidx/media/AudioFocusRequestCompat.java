package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import androidx.media.AudioAttributesCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public class AudioFocusRequestCompat {

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static AudioFocusRequest m3291a(int i2, AudioAttributes audioAttributes, boolean z, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i2).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    public static final class Builder {
    }

    public static class OnAudioFocusChangeListenerHandlerCompat implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 2782386) {
                return false;
            }
            throw null;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i2) {
            Message.obtain(null, 2782386, i2, 0);
            throw null;
        }
    }

    static {
        AudioAttributesCompat.Builder builder = new AudioAttributesCompat.Builder();
        builder.f4773a.mo3289c(1);
        builder.m3283a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioFocusRequestCompat)) {
            return false;
        }
        Objects.requireNonNull((AudioFocusRequestCompat) obj);
        return ObjectsCompat.m2022a(null, null) && ObjectsCompat.m2022a(null, null) && ObjectsCompat.m2022a(null, null);
    }

    public int hashCode() {
        return ObjectsCompat.m2023b(0, null, null, null, Boolean.FALSE);
    }
}
