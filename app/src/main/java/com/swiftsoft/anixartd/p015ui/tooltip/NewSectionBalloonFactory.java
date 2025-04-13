package com.swiftsoft.anixartd.p015ui.tooltip;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAnimation;
import com.swiftsoft.anixartd.C2507R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NewSectionBalloonFactory.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/tooltip/NewSectionBalloonFactory;", "Lcom/skydoves/balloon/Balloon$Factory;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NewSectionBalloonFactory extends Balloon.Factory {
    @Override // com.skydoves.balloon.Balloon.Factory
    @NotNull
    /* renamed from: a */
    public Balloon mo13871a(@NotNull Context context, @Nullable LifecycleOwner lifecycleOwner) {
        Intrinsics.m32179h(context, "context");
        Balloon.Builder builder = new Balloon.Builder(context);
        builder.m13861d(10);
        builder.m13860c(ArrowOrientation.BOTTOM);
        builder.f24686l = 0.5f;
        builder.m13868k(8);
        builder.m13867j(8);
        builder.m13866i(8);
        builder.m13864g(12.0f);
        builder.m13865h(2);
        builder.m13870m(C2507R.string.tooltip_new_section_collection);
        builder.f24694t = 14.0f;
        builder.m13869l(C2507R.color.md_white_1000);
        builder.m13862e(C2507R.color.tooltip_background);
        builder.m13863f(BalloonAnimation.OVERSHOOT);
        builder.f24672I = false;
        builder.f24668E = builder.f24668E;
        return builder.m13858a();
    }
}
