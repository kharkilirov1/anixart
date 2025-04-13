package com.swiftsoft.anixartd.p015ui.logic.main.release;

import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseCommentsRepliesUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/release/ReleaseCommentsRepliesUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseCommentsRepliesUiLogic extends UiLogic {

    /* renamed from: b */
    public long f29269b;

    /* renamed from: c */
    public long f29270c;

    /* renamed from: d */
    public boolean f29271d;

    /* renamed from: e */
    public boolean f29272e;

    /* renamed from: f */
    public ReleaseComment f29273f;

    /* renamed from: g */
    public int f29274g = 2;

    /* renamed from: h */
    @NotNull
    public List<ReleaseComment> f29275h = new ArrayList();

    /* renamed from: i */
    public boolean f29276i;

    /* renamed from: j */
    public long f29277j;

    /* renamed from: k */
    @Nullable
    public Profile f29278k;

    /* renamed from: l */
    public boolean f29279l;

    /* renamed from: a */
    public final void m15695a() {
        this.f29277j = 0L;
        this.f29278k = null;
        this.f29279l = false;
        this.f29275h.clear();
    }

    /* renamed from: b */
    public final boolean m15696b(@NotNull ReleaseComment releaseComment) {
        if (releaseComment.getId() == this.f29270c) {
            this.f29273f = releaseComment;
            return true;
        }
        Iterator<ReleaseComment> it = this.f29275h.iterator();
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
            this.f29275h.set(i2, releaseComment);
        }
        return i2 >= 0;
    }

    @Nullable
    /* renamed from: c */
    public final ReleaseComment m15697c(long j2) {
        Object obj;
        if (j2 == m15698d().getId()) {
            return m15698d();
        }
        Iterator<T> it = this.f29275h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ReleaseComment) obj).getId() == j2) {
                break;
            }
        }
        return (ReleaseComment) obj;
    }

    @NotNull
    /* renamed from: d */
    public final ReleaseComment m15698d() {
        ReleaseComment releaseComment = this.f29273f;
        if (releaseComment != null) {
            return releaseComment;
        }
        Intrinsics.m32189r("parentReleaseComment");
        throw null;
    }
}
