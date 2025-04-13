package com.swiftsoft.anixartd.p015ui.logic.main.profile.vote;

import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseVoteUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/profile/vote/ProfileReleaseVoteUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileReleaseVoteUiLogic extends UiLogic {

    /* renamed from: b */
    public long f29241b;

    /* renamed from: c */
    public int f29242c;

    /* renamed from: d */
    public long f29243d;

    /* renamed from: g */
    public boolean f29246g;

    /* renamed from: i */
    public boolean f29248i;

    /* renamed from: e */
    public int f29244e = 1;

    /* renamed from: f */
    @NotNull
    public List<Release> f29245f = new ArrayList();

    /* renamed from: h */
    public boolean f29247h = true;

    /* compiled from: ProfileReleaseVoteUiLogic.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/profile/vote/ProfileReleaseVoteUiLogic$Companion;", "", "", "SORT_FIVE_STAR", "I", "SORT_FOUR_STAR", "SORT_NEW", "SORT_OLD", "SORT_ONE_STAR", "SORT_THREE_STAR", "SORT_TWO_STAR", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    public final void m15694a(@NotNull List<Release> releases) {
        Intrinsics.m32179h(releases, "releases");
        if (this.f29246g) {
            this.f29245f.addAll(releases);
            return;
        }
        if (this.f29246g) {
            this.f29245f.clear();
        }
        this.f29245f.addAll(releases);
        this.f29246g = true;
    }
}
