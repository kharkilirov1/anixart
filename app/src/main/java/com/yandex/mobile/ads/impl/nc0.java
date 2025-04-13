package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.nativeads.MediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class nc0 extends dg1<MediaView, jc0> {

    /* renamed from: b */
    @NotNull
    private final uc0 f52911b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(@NotNull MediaView mediaView, @NotNull C5101g2 adConfiguration) {
        super(mediaView);
        Intrinsics.m32179h(mediaView, "mediaView");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Context applicationContext = mediaView.getContext().getApplicationContext();
        Intrinsics.m32178g(applicationContext, "mediaView.context.applicationContext");
        this.f52911b = new uc0(applicationContext, adConfiguration);
    }

    /* renamed from: a */
    public abstract void mo22543a(@NotNull jc0 jc0Var);

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22389b(@NotNull final MediaView view, @NotNull jc0 value) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(value, "value");
        tg1.m28654a(view, new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.mobile.ads.impl.mp1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean m26842a;
                m26842a = nc0.m26842a(nc0.this, view);
                return m26842a;
            }
        });
    }

    @NotNull
    /* renamed from: c */
    public abstract int mo22545c();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m26842a(nc0 this$0, MediaView view) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(view, "$view");
        this$0.f52911b.m28983a(view, mc0.m26611a(this$0.mo22545c()));
        return false;
    }
}
