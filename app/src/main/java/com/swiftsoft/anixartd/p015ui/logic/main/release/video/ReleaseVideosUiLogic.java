package com.swiftsoft.anixartd.p015ui.logic.main.release.video;

import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseStreamingPlatform;
import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoBlock;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseVideosUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/release/video/ReleaseVideosUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseVideosUiLogic extends UiLogic {

    /* renamed from: b */
    public long f29311b;

    /* renamed from: c */
    public int f29312c;

    /* renamed from: d */
    @Nullable
    public Release f29313d;

    /* renamed from: h */
    public boolean f29317h;

    /* renamed from: j */
    public boolean f29319j;

    /* renamed from: k */
    public boolean f29320k;

    /* renamed from: e */
    @NotNull
    public List<ReleaseVideo> f29314e = new ArrayList();

    /* renamed from: f */
    @NotNull
    public List<ReleaseVideoBlock> f29315f = new ArrayList();

    /* renamed from: g */
    @NotNull
    public List<ReleaseStreamingPlatform> f29316g = new ArrayList();

    /* renamed from: i */
    @NotNull
    public List<ReleaseVideo> f29318i = new ArrayList();
}
