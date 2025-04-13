package androidx.window.layout;

import androidx.core.util.Consumer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.window.layout.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0687b implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ Channel f6810b;

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        Channel channel = this.f6810b;
        WindowLayoutInfo info = (WindowLayoutInfo) obj;
        Intrinsics.m32178g(info, "info");
        channel.mo34150D(info);
    }
}
