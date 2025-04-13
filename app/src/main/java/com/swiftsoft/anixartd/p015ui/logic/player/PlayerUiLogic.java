package com.swiftsoft.anixartd.p015ui.logic.player;

import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlayerUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/player/PlayerUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PlayerUiLogic extends UiLogic {

    /* renamed from: b */
    public Release f29374b;

    /* renamed from: c */
    @NotNull
    public List<Episode> f29375c = new ArrayList();

    /* renamed from: d */
    public int f29376d;

    /* renamed from: e */
    public int f29377e;

    @NotNull
    /* renamed from: a */
    public final Release m15711a() {
        Release release = this.f29374b;
        if (release != null) {
            return release;
        }
        Intrinsics.m32189r("release");
        throw null;
    }

    /* renamed from: b */
    public final boolean m15712b() {
        int i2 = this.f29377e;
        if (i2 != 1) {
            if (i2 != 2 || this.f29376d <= 0) {
                return false;
            }
        } else if (this.f29376d + 1 == this.f29375c.size()) {
            return false;
        }
        return true;
    }
}
