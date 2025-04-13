package com.swiftsoft.anixartd.p015ui.logic.main.episodes;

import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.database.entity.episode.LastWatchedEpisode;
import com.swiftsoft.anixartd.database.entity.episode.Source;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EpisodesUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/episodes/EpisodesUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class EpisodesUiLogic extends UiLogic {

    /* renamed from: b */
    public long f29042b;

    /* renamed from: c */
    public Release f29043c;

    /* renamed from: d */
    @NotNull
    public String f29044d = "STATE_TYPES";

    /* renamed from: e */
    @NotNull
    public String f29045e = "";

    /* renamed from: f */
    public int f29046f = 1;

    /* renamed from: g */
    @NotNull
    public List<Type> f29047g = new ArrayList();

    /* renamed from: h */
    @NotNull
    public List<Source> f29048h = new ArrayList();

    /* renamed from: i */
    @NotNull
    public List<Episode> f29049i = new ArrayList();

    /* renamed from: j */
    public boolean f29050j;

    /* renamed from: k */
    public boolean f29051k;

    /* renamed from: l */
    public boolean f29052l;

    /* renamed from: m */
    public boolean f29053m;

    /* renamed from: n */
    public boolean f29054n;

    /* renamed from: o */
    @Nullable
    public Type f29055o;

    /* renamed from: p */
    @Nullable
    public Source f29056p;

    /* renamed from: q */
    @Nullable
    public Episode f29057q;

    /* renamed from: r */
    @Nullable
    public Episode f29058r;

    /* renamed from: s */
    @Nullable
    public LastWatchedEpisode f29059s;

    /* renamed from: t */
    public boolean f29060t;

    /* compiled from: EpisodesUiLogic.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/episodes/EpisodesUiLogic$Companion;", "", "", "ACTION_DOWNLOADER", "I", "", "ACTION_EPISODES", "Ljava/lang/String;", "ACTION_PLAYER", "ACTION_SOURCES", "ACTION_TYPES", "DOWNLOADER_EXTERNAL", "DOWNLOADER_NONE", "DOWNLOADER_SYSTEM", "PLAYER_EXTERNAL", "PLAYER_INTERNAL", "PLAYER_NONE", "PLAYER_WEB", "SORT_ASC", "SORT_DESC", "STATE_EPISODES", "STATE_SOURCES", "STATE_TYPES", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    public final void m15680a() {
        this.f29047g.clear();
        this.f29048h.clear();
        this.f29049i.clear();
    }

    @NotNull
    /* renamed from: b */
    public final Release m15681b() {
        Release release = this.f29043c;
        if (release != null) {
            return release;
        }
        Intrinsics.m32189r("release");
        throw null;
    }

    /* renamed from: c */
    public final void m15682c(@NotNull String str) {
        this.f29044d = str;
    }
}
