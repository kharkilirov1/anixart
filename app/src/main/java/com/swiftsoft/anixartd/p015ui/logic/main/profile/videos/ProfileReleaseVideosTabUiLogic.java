package com.swiftsoft.anixartd.p015ui.logic.main.profile.videos;

import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseVideosTabUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/profile/videos/ProfileReleaseVideosTabUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileReleaseVideosTabUiLogic extends UiLogic {

    /* renamed from: b */
    public long f29227b;

    /* renamed from: d */
    public int f29229d;

    /* renamed from: e */
    public long f29230e;

    /* renamed from: f */
    public long f29231f;

    /* renamed from: j */
    public boolean f29235j;

    /* renamed from: k */
    public boolean f29236k;

    /* renamed from: c */
    @NotNull
    public String f29228c = "INNER_TAB_PROFILE_VIDEOS_ALL";

    /* renamed from: g */
    @NotNull
    public List<ReleaseVideo> f29232g = new ArrayList();

    /* renamed from: h */
    @NotNull
    public List<ReleaseVideo> f29233h = new ArrayList();

    /* renamed from: i */
    @NotNull
    public List<ReleaseVideo> f29234i = new ArrayList();

    /* renamed from: a */
    public final void m15692a() {
        this.f29229d = 0;
        this.f29232g.clear();
        this.f29233h.clear();
        this.f29234i.clear();
        this.f29235j = false;
        this.f29236k = false;
    }

    /* renamed from: b */
    public final void m15693b(@NotNull List<? extends ReleaseVideo> videoUploads, @NotNull List<? extends ReleaseVideo> videoAppeals) {
        Intrinsics.m32179h(videoUploads, "videoUploads");
        Intrinsics.m32179h(videoAppeals, "videoAppeals");
        if (this.f29236k) {
            this.f29233h.addAll(videoUploads);
            this.f29234i.addAll(videoAppeals);
            return;
        }
        if (this.f29236k) {
            this.f29233h.clear();
            this.f29234i.clear();
        }
        this.f29233h.addAll(videoUploads);
        this.f29234i.addAll(videoAppeals);
        this.f29236k = true;
    }
}
