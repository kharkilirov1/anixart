package com.yandex.div.core.player;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div2.DivVideo;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DivVideoActionHandler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/player/DivVideoActionHandler;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivVideoActionHandler {

    /* compiled from: DivVideoActionHandler.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/core/player/DivVideoActionHandler$Companion;", "", "", "PAUSE_COMMAND", "Ljava/lang/String;", "START_COMMAND", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    @Inject
    public DivVideoActionHandler() {
    }

    /* renamed from: a */
    public final DivVideoView m16700a(ViewGroup viewGroup, String str) {
        DivVideoView m16700a;
        int childCount = viewGroup.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                return null;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof DivVideoView) {
                DivVideoView divVideoView = (DivVideoView) childAt;
                DivVideo div = divVideoView.getDiv();
                if (Intrinsics.m32174c(div != null ? div.f40706q : null, str)) {
                    return divVideoView;
                }
            }
            if ((childAt instanceof ViewGroup) && (m16700a = m16700a((ViewGroup) childAt, str)) != null) {
                return m16700a;
            }
            i2 = i3;
        }
    }
}
