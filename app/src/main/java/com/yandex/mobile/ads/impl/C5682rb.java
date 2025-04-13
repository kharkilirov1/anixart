package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5246is;
import com.yandex.mobile.ads.impl.C5682rb;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.rb */
/* loaded from: classes3.dex */
final class C5682rb {

    /* renamed from: a */
    private final AudioManager f54244a;

    /* renamed from: b */
    private final a f54245b;

    /* renamed from: c */
    @Nullable
    private b f54246c;

    /* renamed from: d */
    @Nullable
    private C5481nb f54247d;

    /* renamed from: f */
    private int f54249f;

    /* renamed from: h */
    private AudioFocusRequest f54251h;

    /* renamed from: g */
    private float f54250g = 1.0f;

    /* renamed from: e */
    private int f54248e = 0;

    /* renamed from: com.yandex.mobile.ads.impl.rb$a */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        private final Handler f54252a;

        public a(Handler handler) {
            this.f54252a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m27894a(int i2) {
            C5682rb.m27889a(C5682rb.this, i2);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i2) {
            this.f54252a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.tp1
                @Override // java.lang.Runnable
                public final void run() {
                    C5682rb.a.this.m27894a(i2);
                }
            });
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rb$b */
    public interface b {
    }

    public C5682rb(Context context, Handler handler, b bVar) {
        this.f54244a = (AudioManager) C5220ia.m25469a((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f54246c = bVar;
        this.f54245b = new a(handler);
    }

    /* renamed from: a */
    public final int m27890a(boolean z, int i2) {
        int requestAudioFocus;
        if (i2 == 1 || this.f54249f != 1) {
            m27887a();
            return z ? 1 : -1;
        }
        if (z) {
            if (this.f54248e == 1) {
                return 1;
            }
            if (s91.f54530a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f54251h;
                if (audioFocusRequest == null) {
                    AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f54249f) : new AudioFocusRequest.Builder(this.f54251h);
                    C5481nb c5481nb = this.f54247d;
                    boolean z2 = c5481nb != null && c5481nb.f52894a == 1;
                    Objects.requireNonNull(c5481nb);
                    this.f54251h = builder.setAudioAttributes(c5481nb.m26831a().f52900a).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(this.f54245b).build();
                }
                requestAudioFocus = this.f54244a.requestAudioFocus(this.f54251h);
            } else {
                AudioManager audioManager = this.f54244a;
                a aVar = this.f54245b;
                C5481nb c5481nb2 = this.f54247d;
                Objects.requireNonNull(c5481nb2);
                requestAudioFocus = audioManager.requestAudioFocus(aVar, s91.m28125c(c5481nb2.f52896c), this.f54249f);
            }
            if (requestAudioFocus == 1) {
                m27888a(1);
                return 1;
            }
            m27888a(0);
        }
        return -1;
    }

    /* renamed from: b */
    public final float m27891b() {
        return this.f54250g;
    }

    /* renamed from: c */
    public final void m27892c() {
        this.f54246c = null;
        m27887a();
    }

    /* renamed from: d */
    public final void m27893d() {
        if (s91.m28112a(this.f54247d, (Object) null)) {
            return;
        }
        this.f54247d = null;
        this.f54249f = 0;
    }

    /* renamed from: a */
    private void m27887a() {
        if (this.f54248e == 0) {
            return;
        }
        if (s91.f54530a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f54251h;
            if (audioFocusRequest != null) {
                this.f54244a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f54244a.abandonAudioFocus(this.f54245b);
        }
        m27888a(0);
    }

    /* renamed from: a */
    private void m27888a(int i2) {
        if (this.f54248e == i2) {
            return;
        }
        this.f54248e = i2;
        float f2 = i2 == 3 ? 0.2f : 1.0f;
        if (this.f54250g == f2) {
            return;
        }
        this.f54250g = f2;
        b bVar = this.f54246c;
        if (bVar != null) {
            C5246is.m25650e(C5246is.this);
        }
    }

    /* renamed from: a */
    public static void m27889a(C5682rb c5682rb, int i2) {
        if (i2 == -3 || i2 == -2) {
            if (i2 != -2) {
                C5481nb c5481nb = c5682rb.f54247d;
                if (!(c5481nb != null && c5481nb.f52894a == 1)) {
                    c5682rb.m27888a(3);
                    return;
                }
            }
            b bVar = c5682rb.f54246c;
            if (bVar != null) {
                C5246is.b bVar2 = (C5246is.b) bVar;
                boolean playWhenReady = C5246is.this.getPlayWhenReady();
                C5246is.this.m25617a(0, C5246is.m25608a(playWhenReady, 0), playWhenReady);
            }
            c5682rb.m27888a(2);
            return;
        }
        if (i2 == -1) {
            b bVar3 = c5682rb.f54246c;
            if (bVar3 != null) {
                C5246is.b bVar4 = (C5246is.b) bVar3;
                boolean playWhenReady2 = C5246is.this.getPlayWhenReady();
                C5246is.this.m25617a(-1, C5246is.m25608a(playWhenReady2, -1), playWhenReady2);
            }
            c5682rb.m27887a();
            return;
        }
        if (i2 != 1) {
            Objects.requireNonNull(c5682rb);
            d90.m23842d("AudioFocusManager", "Unknown focus change type: " + i2);
            return;
        }
        c5682rb.m27888a(1);
        b bVar5 = c5682rb.f54246c;
        if (bVar5 != null) {
            C5246is.b bVar6 = (C5246is.b) bVar5;
            boolean playWhenReady3 = C5246is.this.getPlayWhenReady();
            C5246is.this.m25617a(1, C5246is.m25608a(playWhenReady3, 1), playWhenReady3);
        }
    }
}
