package com.swiftsoft.anixartd.p015ui.logic.main.collection;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionCommentsUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/collection/CollectionCommentsUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionCommentsUiLogic extends UiLogic {

    /* renamed from: b */
    public long f28984b;

    /* renamed from: c */
    public Collection f28985c;

    /* renamed from: d */
    public int f28986d;

    /* renamed from: e */
    public int f28987e = 1;

    /* renamed from: f */
    @NotNull
    public List<CollectionComment> f28988f = new ArrayList();

    /* renamed from: g */
    public long f28989g;

    /* renamed from: h */
    public boolean f28990h;

    /* renamed from: i */
    public boolean f28991i;

    /* compiled from: CollectionCommentsUiLogic.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/collection/CollectionCommentsUiLogic$Companion;", "", "", "SORT_NEW", "I", "SORT_OLD", "SORT_POPULAR", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    public final void m15672a() {
        this.f28986d = 0;
        this.f28989g = 0L;
        this.f28990h = false;
        this.f28988f.clear();
    }

    /* renamed from: b */
    public final boolean m15673b(@NotNull CollectionComment collectionComment) {
        Iterator<CollectionComment> it = this.f28988f.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().getId() == collectionComment.getId()) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            Collection collection = this.f28985c;
            if (collection == null) {
                Intrinsics.m32189r("collection");
                throw null;
            }
            long j2 = this.f28989g - 1;
            this.f28989g = j2;
            collection.setCommentCount(j2);
            this.f28988f.remove(i2);
        }
        return i2 >= 0;
    }
}
