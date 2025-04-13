package com.swiftsoft.anixartd.p015ui.logic.main.release;

import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseCommentsUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/release/ReleaseCommentsUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseCommentsUiLogic extends UiLogic {

    /* renamed from: b */
    public long f29280b;

    /* renamed from: c */
    public Release f29281c;

    /* renamed from: d */
    public int f29282d;

    /* renamed from: e */
    public int f29283e = 1;

    /* renamed from: f */
    @NotNull
    public List<ReleaseComment> f29284f = new ArrayList();

    /* renamed from: g */
    public long f29285g;

    /* renamed from: h */
    public boolean f29286h;

    /* renamed from: i */
    public boolean f29287i;

    /* compiled from: ReleaseCommentsUiLogic.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/release/ReleaseCommentsUiLogic$Companion;", "", "", "SORT_NEW", "I", "SORT_OLD", "SORT_POPULAR", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    public final void m15699a() {
        this.f29282d = 0;
        this.f29285g = 0L;
        this.f29286h = false;
        this.f29284f.clear();
    }

    /* renamed from: b */
    public final boolean m15700b(@NotNull ReleaseComment releaseComment) {
        Iterator<ReleaseComment> it = this.f29284f.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().getId() == releaseComment.getId()) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            Release release = this.f29281c;
            if (release == null) {
                Intrinsics.m32189r("release");
                throw null;
            }
            long j2 = this.f29285g - 1;
            this.f29285g = j2;
            release.setCommentCount(j2);
            this.f29284f.remove(i2);
        }
        return i2 >= 0;
    }
}
