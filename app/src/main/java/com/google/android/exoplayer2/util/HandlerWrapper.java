package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public interface HandlerWrapper {

    public interface Message {
        /* renamed from: a */
        void mo7577a();
    }

    /* renamed from: a */
    Message mo7566a(int i2, int i3, int i4);

    /* renamed from: b */
    boolean mo7567b(Runnable runnable);

    /* renamed from: c */
    Message mo7568c(int i2);

    /* renamed from: d */
    boolean mo7569d(Message message);

    /* renamed from: e */
    boolean mo7570e(int i2);

    /* renamed from: f */
    boolean mo7571f(int i2);

    /* renamed from: g */
    Message mo7572g(int i2, int i3, int i4, @Nullable Object obj);

    /* renamed from: h */
    boolean mo7573h(int i2, long j2);

    /* renamed from: i */
    void mo7574i(int i2);

    /* renamed from: j */
    Message mo7575j(int i2, @Nullable Object obj);

    /* renamed from: k */
    void mo7576k(@Nullable Object obj);
}
