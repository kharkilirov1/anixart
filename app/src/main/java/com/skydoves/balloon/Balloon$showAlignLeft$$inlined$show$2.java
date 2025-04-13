package com.skydoves.balloon;

import android.view.View;
import android.widget.FrameLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Balloon.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, m31884d2 = {"<anonymous>", "", "run", "com/skydoves/balloon/Balloon$show$2"}, m31885k = 3, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class Balloon$showAlignLeft$$inlined$show$2 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Balloon f24628b;

    /* renamed from: c */
    public final /* synthetic */ View f24629c;

    /* renamed from: d */
    public final /* synthetic */ Balloon f24630d;

    /* renamed from: e */
    public final /* synthetic */ View f24631e;

    /* renamed from: f */
    public final /* synthetic */ int f24632f;

    /* renamed from: g */
    public final /* synthetic */ int f24633g;

    @Override // java.lang.Runnable
    public final void run() {
        this.f24628b.m13854r();
        this.f24628b.f24591b.f24742a.measure(0, 0);
        Balloon balloon = this.f24628b;
        balloon.f24592c.setWidth(balloon.m13850n());
        Balloon balloon2 = this.f24628b;
        balloon2.f24592c.setHeight(balloon2.m13849m());
        VectorTextView vectorTextView = this.f24628b.f24591b.f24746e;
        Intrinsics.m32178g(vectorTextView, "this.binding.balloonText");
        vectorTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Balloon.m13845i(this.f24628b, this.f24629c);
        this.f24628b.m13853q();
        Balloon.m13844h(this.f24628b);
        Balloon balloon3 = this.f24630d;
        balloon3.f24592c.showAsDropDown(this.f24631e, (-balloon3.m13850n()) + this.f24632f, ((-(this.f24630d.m13849m() / 2)) - (this.f24631e.getMeasuredHeight() / 2)) + this.f24633g);
    }
}
