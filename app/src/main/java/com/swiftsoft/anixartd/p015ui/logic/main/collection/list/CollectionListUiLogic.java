package com.swiftsoft.anixartd.p015ui.logic.main.collection.list;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.p015ui.logic.Pagination;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionListUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/collection/list/CollectionListUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionListUiLogic extends UiLogic {

    /* renamed from: b */
    @NotNull
    public Pagination f29013b = new Pagination();

    /* renamed from: c */
    @NotNull
    public List<Collection> f29014c = new ArrayList();

    /* renamed from: d */
    public int f29015d = 1;

    /* renamed from: e */
    public int f29016e = Random.f63365b.mo32229d(2, 7);

    /* renamed from: f */
    public boolean f29017f;

    /* compiled from: CollectionListUiLogic.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/collection/list/CollectionListUiLogic$Companion;", "", "", "SORT_LEADERS", "I", "SORT_POPULAR_SEASON", "SORT_POPULAR_WEEK", "SORT_POPULAR_YEAR", "SORT_RANDOM", "SORT_RECENT", "WHERE_MORE_THAN_5_FAVORITE_COUNT", "WHERE_NONE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    public final void m15677a() {
        Pagination pagination = this.f29013b;
        pagination.f28951a = new Boolean[0];
        pagination.f28952b = 0;
        pagination.f28953c = 0;
        pagination.f28955e = false;
        this.f29014c.clear();
        if (this.f29016e == 6) {
            this.f29013b.f28953c = -1;
        }
    }

    /* renamed from: b */
    public final void m15678b(@NotNull final Collection collection) {
        CollectionsKt.m32005R(this.f29014c, new Function1<Collection, Boolean>() { // from class: com.swiftsoft.anixartd.ui.logic.main.collection.list.CollectionListUiLogic$removeCollection$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Collection collection2) {
                Collection it = collection2;
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it.getId() == Collection.this.getId());
            }
        });
    }
}
