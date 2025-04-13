package com.swiftsoft.anixartd.p015ui.logic.main.collection;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/collection/CollectionUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionUiLogic extends UiLogic {

    /* renamed from: b */
    public Collection f28992b;

    /* renamed from: c */
    public long f28993c;

    /* renamed from: d */
    public int f28994d;

    /* renamed from: e */
    public long f28995e;

    /* renamed from: f */
    public long f28996f;

    /* renamed from: g */
    public long f28997g;

    /* renamed from: h */
    public long f28998h;

    /* renamed from: i */
    public long f28999i;

    /* renamed from: j */
    public long f29000j;

    /* renamed from: k */
    @NotNull
    public List<Release> f29001k = new ArrayList();

    /* renamed from: l */
    public boolean f29002l;

    /* renamed from: a */
    public final void m15674a() {
        this.f28994d = 0;
        this.f28995e = 0L;
        this.f29001k.clear();
        this.f29002l = false;
    }

    @NotNull
    /* renamed from: b */
    public final Collection m15675b() {
        Collection collection = this.f28992b;
        if (collection != null) {
            return collection;
        }
        Intrinsics.m32189r("collection");
        throw null;
    }

    /* renamed from: c */
    public final void m15676c(int i2, int i3) {
        if (i2 == 1) {
            this.f28996f += i3;
            return;
        }
        if (i2 == 2) {
            this.f28997g += i3;
            return;
        }
        if (i2 == 3) {
            this.f28998h += i3;
        } else if (i2 == 4) {
            this.f28999i += i3;
        } else {
            if (i2 != 5) {
                return;
            }
            this.f29000j += i3;
        }
    }
}
