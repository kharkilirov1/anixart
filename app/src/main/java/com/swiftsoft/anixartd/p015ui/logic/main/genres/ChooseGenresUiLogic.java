package com.swiftsoft.anixartd.p015ui.logic.main.genres;

import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ChooseGenresUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/genres/ChooseGenresUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChooseGenresUiLogic extends UiLogic {

    /* renamed from: b */
    public String[] f29097b;

    /* renamed from: c */
    @NotNull
    public HashMap<Integer, String> f29098c = new HashMap<>();

    @NotNull
    /* renamed from: a */
    public final String[] m15683a() {
        String[] strArr = this.f29097b;
        if (strArr != null) {
            return strArr;
        }
        Intrinsics.m32189r("genres");
        throw null;
    }

    /* renamed from: b */
    public final boolean m15684b() {
        return this.f29098c.size() == m15683a().length;
    }
}
