package com.swiftsoft.anixartd.p015ui.logic.main.profile.videos;

import com.swiftsoft.anixartd.database.entity.ReleaseVideo;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileReleaseVideoAppealsUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/profile/videos/ProfileReleaseVideoAppealsUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileReleaseVideoAppealsUiLogic extends UiLogic {

    /* renamed from: b */
    public int f29222b;

    /* renamed from: c */
    @NotNull
    public List<ReleaseVideo> f29223c = new ArrayList();

    /* renamed from: d */
    public long f29224d;

    /* renamed from: e */
    public boolean f29225e;

    /* renamed from: a */
    public final void m15691a(@NotNull final ReleaseVideo releaseVideo) {
        List<ReleaseVideo> list = this.f29223c;
        int i2 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                if ((((ReleaseVideo) it.next()).getId() == releaseVideo.getId()) && (i3 = i3 + 1) < 0) {
                    CollectionsKt.m32021g0();
                    throw null;
                }
            }
            i2 = i3;
        }
        this.f29224d -= i2;
        CollectionsKt.m32005R(this.f29223c, new Function1<ReleaseVideo, Boolean>() { // from class: com.swiftsoft.anixartd.ui.logic.main.profile.videos.ProfileReleaseVideoAppealsUiLogic$removeReleaseVideoAppeal$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(ReleaseVideo releaseVideo2) {
                ReleaseVideo it2 = releaseVideo2;
                Intrinsics.m32179h(it2, "it");
                return Boolean.valueOf(it2.getId() == ReleaseVideo.this.getId());
            }
        });
    }
}
