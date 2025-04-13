package com.swiftsoft.anixartd.p015ui.logic.main.collection;

import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectionCommentsRepliesUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/collection/CollectionCommentsRepliesUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionCommentsRepliesUiLogic extends UiLogic {

    /* renamed from: b */
    public long f28973b;

    /* renamed from: c */
    public long f28974c;

    /* renamed from: d */
    public boolean f28975d;

    /* renamed from: e */
    public boolean f28976e;

    /* renamed from: f */
    public CollectionComment f28977f;

    /* renamed from: g */
    public int f28978g = 2;

    /* renamed from: h */
    @NotNull
    public List<CollectionComment> f28979h = new ArrayList();

    /* renamed from: i */
    public boolean f28980i;

    /* renamed from: j */
    public long f28981j;

    /* renamed from: k */
    @Nullable
    public Profile f28982k;

    /* renamed from: l */
    public boolean f28983l;

    /* renamed from: a */
    public final void m15668a() {
        this.f28981j = 0L;
        this.f28982k = null;
        this.f28983l = false;
        this.f28979h.clear();
    }

    /* renamed from: b */
    public final boolean m15669b(@NotNull CollectionComment collectionComment) {
        if (collectionComment.getId() == this.f28974c) {
            this.f28977f = collectionComment;
            return true;
        }
        Iterator<CollectionComment> it = this.f28979h.iterator();
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
            this.f28979h.set(i2, collectionComment);
        }
        return i2 >= 0;
    }

    @Nullable
    /* renamed from: c */
    public final CollectionComment m15670c(long j2) {
        Object obj;
        if (j2 == m15671d().getId()) {
            return m15671d();
        }
        Iterator<T> it = this.f28979h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CollectionComment) obj).getId() == j2) {
                break;
            }
        }
        return (CollectionComment) obj;
    }

    @NotNull
    /* renamed from: d */
    public final CollectionComment m15671d() {
        CollectionComment collectionComment = this.f28977f;
        if (collectionComment != null) {
            return collectionComment;
        }
        Intrinsics.m32189r("parentCollectionComment");
        throw null;
    }
}
