package com.swiftsoft.anixartd.p015ui.logic.main.profile.comments;

import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileCommentsTabUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/profile/comments/ProfileCommentsTabUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileCommentsTabUiLogic extends UiLogic {

    /* renamed from: b */
    public long f29185b;

    /* renamed from: d */
    public int f29187d;

    /* renamed from: e */
    public long f29188e;

    /* renamed from: i */
    public boolean f29192i;

    /* renamed from: j */
    public boolean f29193j;

    /* renamed from: c */
    @NotNull
    public String f29186c = "INNER_TAB_PROFILE_COMMENTS_RELEASE";

    /* renamed from: f */
    public int f29189f = 1;

    /* renamed from: g */
    @NotNull
    public List<ReleaseComment> f29190g = new ArrayList();

    /* renamed from: h */
    @NotNull
    public List<CollectionComment> f29191h = new ArrayList();

    /* renamed from: k */
    public boolean f29194k = true;

    /* compiled from: ProfileCommentsTabUiLogic.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/profile/comments/ProfileCommentsTabUiLogic$Companion;", "", "", "COMMENTS_COLLECTION", "I", "COMMENTS_RELEASE", "SORT_NEW", "SORT_OLD", "SORT_POPULAR", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    public final void m15687a() {
        this.f29187d = 0;
        this.f29190g.clear();
        this.f29191h.clear();
        this.f29192i = false;
        this.f29193j = false;
    }
}
