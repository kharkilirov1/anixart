package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class tm1 extends ContentObserver {

    /* renamed from: a */
    private final Context f55153a;

    /* renamed from: b */
    private final AudioManager f55154b;

    /* renamed from: c */
    private final sl1 f55155c;

    /* renamed from: d */
    private final pm1 f55156d;

    /* renamed from: e */
    private float f55157e;

    public tm1(Handler handler, Context context, sl1 sl1Var, pm1 pm1Var) {
        super(handler);
        this.f55153a = context;
        this.f55154b = (AudioManager) context.getSystemService("audio");
        this.f55155c = sl1Var;
        this.f55156d = pm1Var;
    }

    /* renamed from: a */
    public final void m28690a() {
        int streamVolume = this.f55154b.getStreamVolume(3);
        int streamMaxVolume = this.f55154b.getStreamMaxVolume(3);
        Objects.requireNonNull(this.f55155c);
        float f2 = 1.0f;
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f2 = 0.0f;
        } else {
            float f3 = streamVolume / streamMaxVolume;
            if (f3 <= 1.0f) {
                f2 = f3;
            }
        }
        this.f55157e = f2;
        ((cn1) this.f55156d).m23492a(f2);
        this.f55153a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void m28691b() {
        this.f55153a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        int streamVolume = this.f55154b.getStreamVolume(3);
        int streamMaxVolume = this.f55154b.getStreamMaxVolume(3);
        Objects.requireNonNull(this.f55155c);
        float f2 = 1.0f;
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f2 = 0.0f;
        } else {
            float f3 = streamVolume / streamMaxVolume;
            if (f3 <= 1.0f) {
                f2 = f3;
            }
        }
        if (f2 != this.f55157e) {
            this.f55157e = f2;
            ((cn1) this.f55156d).m23492a(f2);
        }
    }
}
