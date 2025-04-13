package com.swiftsoft.anixartd.p015ui.logic.main.collection.list;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionProfileListUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/collection/list/CollectionProfileListUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionProfileListUiLogic extends UiLogic {

    /* renamed from: b */
    public long f29019b;

    /* renamed from: c */
    public boolean f29020c;

    /* renamed from: d */
    public int f29021d;

    /* renamed from: e */
    @NotNull
    public List<Collection> f29022e = new ArrayList();

    /* renamed from: f */
    public long f29023f;

    /* renamed from: g */
    public boolean f29024g;

    /* renamed from: a */
    public final void m15679a(@NotNull final Collection collection) {
        List<Collection> list = this.f29022e;
        int i2 = 0;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                if ((((Collection) it.next()).getId() == collection.getId()) && (i3 = i3 + 1) < 0) {
                    CollectionsKt.m32021g0();
                    throw null;
                }
            }
            i2 = i3;
        }
        this.f29023f -= i2;
        CollectionsKt.m32005R(this.f29022e, new Function1<Collection, Boolean>() { // from class: com.swiftsoft.anixartd.ui.logic.main.collection.list.CollectionProfileListUiLogic$removeCollection$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Collection collection2) {
                Collection it2 = collection2;
                Intrinsics.m32179h(it2, "it");
                return Boolean.valueOf(it2.getId() == Collection.this.getId());
            }
        });
    }
}
