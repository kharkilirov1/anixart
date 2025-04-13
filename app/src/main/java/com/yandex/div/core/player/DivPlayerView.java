package com.yandex.div.core.player;

import android.widget.FrameLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPlayerView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/player/DivPlayerView;", "Landroid/widget/FrameLayout;", "Lcom/yandex/div/core/player/DivVideoAttachable;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivPlayerView extends FrameLayout implements DivVideoAttachable {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DivPlayerView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
        /*
            r0 = this;
            r2 = 0
            r4 = r4 & 4
            if (r4 == 0) goto L8
            r3 = 2130968986(0x7f04019a, float:1.7546641E38)
        L8:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.m32179h(r1, r4)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.player.DivPlayerView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    @Nullable
    public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
        return null;
    }
}
