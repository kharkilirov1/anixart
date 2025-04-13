package com.swiftsoft.anixartd.p015ui.logic.main.profile.friends;

import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileFriendsUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/profile/friends/ProfileFriendsUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileFriendsUiLogic extends UiLogic {

    /* renamed from: l */
    @NotNull
    public static final Companion f29199l = new Companion(null);

    /* renamed from: b */
    public long f29200b;

    /* renamed from: c */
    public int f29201c;

    /* renamed from: f */
    public long f29204f;

    /* renamed from: h */
    public long f29206h;

    /* renamed from: j */
    public long f29208j;

    /* renamed from: k */
    public boolean f29209k;

    /* renamed from: d */
    @NotNull
    public List<Profile> f29202d = new ArrayList();

    /* renamed from: e */
    @NotNull
    public List<Profile> f29203e = new ArrayList();

    /* renamed from: g */
    @NotNull
    public List<Profile> f29205g = new ArrayList();

    /* renamed from: i */
    @NotNull
    public List<Profile> f29207i = new ArrayList();

    /* compiled from: ProfileFriendsUiLogic.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/profile/friends/ProfileFriendsUiLogic$Companion;", "", "", "FRIEND", "I", "FRIEND_REQUEST_SENT", "IS_FRIEND", "IS_NOT_FRIEND", "OUT_FRIEND_REQUEST_SENT", "PENDING_FIRST_SECOND", "PENDING_SECOND_FIRST", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final int m15689a(long j2, long j3, @Nullable Integer num) {
            if (num == null) {
                return 0;
            }
            boolean z = true;
            if (num.intValue() == 2) {
                return 1;
            }
            boolean z2 = j2 < j3;
            boolean z3 = (num.intValue() == 0 && z2) || (num.intValue() == 1 && !z2);
            if ((num.intValue() != 1 || !z2) && (num.intValue() != 0 || z2)) {
                z = false;
            }
            if (z3) {
                return 2;
            }
            return z ? 3 : 0;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: a */
    public final void m15688a() {
        this.f29201c = 0;
        this.f29204f = 0L;
        this.f29206h = 0L;
        this.f29208j = 0L;
        this.f29202d.clear();
        this.f29203e.clear();
        this.f29205g.clear();
        this.f29207i.clear();
        this.f29209k = false;
    }
}
