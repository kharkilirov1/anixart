package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
final class AudioFocusManager {

    /* renamed from: a */
    public final AudioManager f9432a;

    /* renamed from: b */
    public final AudioFocusListener f9433b;

    /* renamed from: c */
    @Nullable
    public PlayerControl f9434c;

    /* renamed from: d */
    @Nullable
    public AudioAttributes f9435d;

    /* renamed from: e */
    public int f9436e;

    /* renamed from: f */
    public int f9437f;

    /* renamed from: g */
    public float f9438g = 1.0f;

    /* renamed from: h */
    public AudioFocusRequest f9439h;

    public class AudioFocusListener implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: b */
        public final Handler f9440b;

        public AudioFocusListener(Handler handler) {
            this.f9440b = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i2) {
            this.f9440b.post(new Runnable() { // from class: com.google.android.exoplayer2.a
                @Override // java.lang.Runnable
                public final void run() {
                    AudioFocusManager.AudioFocusListener audioFocusListener = AudioFocusManager.AudioFocusListener.this;
                    int i3 = i2;
                    AudioFocusManager audioFocusManager = AudioFocusManager.this;
                    Objects.requireNonNull(audioFocusManager);
                    if (i3 == -3 || i3 == -2) {
                        if (i3 != -2) {
                            AudioAttributes audioAttributes = audioFocusManager.f9435d;
                            if (!(audioAttributes != null && audioAttributes.f10285b == 1)) {
                                audioFocusManager.m5628d(3);
                                return;
                            }
                        }
                        audioFocusManager.m5626b(0);
                        audioFocusManager.m5628d(2);
                        return;
                    }
                    if (i3 == -1) {
                        audioFocusManager.m5626b(-1);
                        audioFocusManager.m5625a();
                    } else if (i3 != 1) {
                        C0576a.m4123v(38, "Unknown focus change type: ", i3, "AudioFocusManager");
                    } else {
                        audioFocusManager.m5628d(1);
                        audioFocusManager.m5626b(1);
                    }
                }
            });
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    public interface PlayerControl {
        /* renamed from: i */
        void mo5630i(float f2);

        /* renamed from: j */
        void mo5631j(int i2);
    }

    public AudioFocusManager(Context context, Handler handler, PlayerControl playerControl) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f9432a = audioManager;
        this.f9434c = playerControl;
        this.f9433b = new AudioFocusListener(handler);
        this.f9436e = 0;
    }

    /* renamed from: a */
    public final void m5625a() {
        if (this.f9436e == 0) {
            return;
        }
        if (Util.f14736a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f9439h;
            if (audioFocusRequest != null) {
                this.f9432a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f9432a.abandonAudioFocus(this.f9433b);
        }
        m5628d(0);
    }

    /* renamed from: b */
    public final void m5626b(int i2) {
        PlayerControl playerControl = this.f9434c;
        if (playerControl != null) {
            playerControl.mo5631j(i2);
        }
    }

    /* renamed from: c */
    public void m5627c(@Nullable AudioAttributes audioAttributes) {
        if (Util.m7728a(this.f9435d, null)) {
            return;
        }
        this.f9435d = null;
        this.f9437f = 0;
    }

    /* renamed from: d */
    public final void m5628d(int i2) {
        if (this.f9436e == i2) {
            return;
        }
        this.f9436e = i2;
        float f2 = i2 == 3 ? 0.2f : 1.0f;
        if (this.f9438g == f2) {
            return;
        }
        this.f9438g = f2;
        PlayerControl playerControl = this.f9434c;
        if (playerControl != null) {
            playerControl.mo5630i(f2);
        }
    }

    /* renamed from: e */
    public int m5629e(boolean z, int i2) {
        int requestAudioFocus;
        int i3 = 1;
        if (i2 == 1 || this.f9437f != 1) {
            m5625a();
            return z ? 1 : -1;
        }
        if (!z) {
            return -1;
        }
        if (this.f9436e != 1) {
            if (Util.f14736a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f9439h;
                if (audioFocusRequest == null) {
                    AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f9437f) : new AudioFocusRequest.Builder(this.f9439h);
                    AudioAttributes audioAttributes = this.f9435d;
                    boolean z2 = audioAttributes != null && audioAttributes.f10285b == 1;
                    Objects.requireNonNull(audioAttributes);
                    this.f9439h = builder.setAudioAttributes(audioAttributes.m6108b()).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(this.f9433b).build();
                }
                requestAudioFocus = this.f9432a.requestAudioFocus(this.f9439h);
            } else {
                AudioManager audioManager = this.f9432a;
                AudioFocusListener audioFocusListener = this.f9433b;
                AudioAttributes audioAttributes2 = this.f9435d;
                Objects.requireNonNull(audioAttributes2);
                requestAudioFocus = audioManager.requestAudioFocus(audioFocusListener, Util.m7705D(audioAttributes2.f10287d), this.f9437f);
            }
            if (requestAudioFocus == 1) {
                m5628d(1);
            } else {
                m5628d(0);
                i3 = -1;
            }
        }
        return i3;
    }
}
