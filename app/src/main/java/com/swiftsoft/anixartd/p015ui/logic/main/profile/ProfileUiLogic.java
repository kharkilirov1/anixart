package com.swiftsoft.anixartd.p015ui.logic.main.profile;

import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.ProfileWatchDynamics;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.Role;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/profile/ProfileUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileUiLogic extends UiLogic {

    /* renamed from: b */
    public long f29173b;

    /* renamed from: c */
    public boolean f29174c;

    /* renamed from: d */
    public Profile f29175d;

    /* renamed from: e */
    @NotNull
    public List<ProfileWatchDynamics> f29176e = new ArrayList();

    /* renamed from: f */
    @NotNull
    public List<Release> f29177f = new ArrayList();

    /* renamed from: g */
    @NotNull
    public List<Release> f29178g = new ArrayList();

    /* renamed from: h */
    @NotNull
    public List<Role> f29179h = new ArrayList();

    /* renamed from: i */
    public boolean f29180i;

    /* renamed from: j */
    public boolean f29181j;

    /* renamed from: k */
    public boolean f29182k;

    /* renamed from: l */
    public boolean f29183l;

    /* renamed from: m */
    public boolean f29184m;

    @NotNull
    /* renamed from: a */
    public final Profile m15686a() {
        Profile profile = this.f29175d;
        if (profile != null) {
            return profile;
        }
        Intrinsics.m32189r("profile");
        throw null;
    }
}
