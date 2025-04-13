package com.google.android.exoplayer2.p009ui;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.ui.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1156b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f14319b;

    /* renamed from: c */
    public final /* synthetic */ Object f14320c;

    public /* synthetic */ RunnableC1156b(View view, int i2) {
        this.f14319b = i2;
        this.f14320c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14319b) {
            case 0:
                PlayerControlView playerControlView = (PlayerControlView) this.f14320c;
                int i2 = PlayerControlView.f14128g0;
                playerControlView.m7369m();
                break;
            case 1:
                ((PlayerControlView) this.f14320c).m7359c();
                break;
            default:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) this.f14320c;
                int i3 = DefaultTimeBar.f14086P;
                defaultTimeBar.m7351g(false);
                break;
        }
    }
}
